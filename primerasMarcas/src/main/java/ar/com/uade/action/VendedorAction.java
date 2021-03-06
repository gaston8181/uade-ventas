package ar.com.uade.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.uade.business.VendedorBusiness;
import ar.com.uade.form.VendedorForm;

public class VendedorAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7133807641107600555L;
	private VendedorBusiness vendedor;
	private List<VendedorForm> vendedoresExistentes;
	private VendedorForm form;

	@Override
	public String execute() throws Exception {
		System.out.println("Esto en vendedor");
		clearErrorsAndMessages();
		return SUCCESS;
	}

	public String cargarListaVendedores() {
		try {
			vendedoresExistentes = vendedor.listarVendedores();
			clearErrorsAndMessages();
		} catch (Exception e) {
			addActionError("Ocurrio un error inesperado, intente nuevamente!");
		}
		return SUCCESS;
	}

	public String altaVendedor() {
		try {
			if (!validar(true)) {
				return INPUT;
			}
			vendedor.altaVendedor(form);
			addActionMessage("Alta Exitosa!");
		} catch (Exception e) {
			addActionError("Ocurrio un error inesperado, intente nuevamente!");
		}
		return SUCCESS;
	}

	public String bajaVendedor() {
		try {
			vendedor.bajaVendedor(form);
			vendedoresExistentes = vendedor.listarVendedores();
			addActionMessage("Baja Exitosa!");
		} catch (Exception e) {
			addActionError("Ocurrio un error inesperado, intente nuevamente!");
		}
		return SUCCESS;
	}

	public String cargarVendedor() {
		form = vendedor.obtenerVendedor(form.getLegajo());
		return SUCCESS;
	}

	public String modificarVendedor() {
		try {
			if (!validar(false)) {
				return INPUT;
			}
			vendedor.modificarVendedor(form);
			vendedoresExistentes = vendedor.listarVendedores();
			addActionMessage("Modificacion Exitosa!");
		} catch (Exception e) {
			addActionError("Ocurrio un error inesperado, intente nuevamente!");
		}
		return SUCCESS;
	}

	private boolean validar(boolean alta) {
		boolean ok = true;
		if (this.form == null) {
			addActionError("Ocurrio un error inesperado, intente nuevamente!");
			ok = false;
		}
		if (this.form.getNombre() == null || this.form.getNombre().isEmpty()) {
			addFieldError("form.nombre", "Campo Obligatorio");
			ok = false;
		}
		if (this.form.getApellido() == null || this.form.getApellido().isEmpty()) {
			addFieldError("form.apellido", "Campo Obligatorio");
			ok = false;
		}

		if (this.form.getDni() == null || this.form.getDni() == 0) {
			addFieldError("form.dni", "Campo Obligatorio");
			ok = false;
		}

		if (vendedor.vendedorExiste(form)) {
			addActionError("El vendedor ya existe");
			ok = false;
		}
		return ok;
	}

	public void setVendedor(VendedorBusiness vendedor) {
		this.vendedor = vendedor;
	}

	public VendedorForm getForm() {
		return form;
	}

	public void setForm(VendedorForm form) {
		this.form = form;
	}

	public List<VendedorForm> getVendedoresExistentes() {
		return vendedoresExistentes;
	}

	public void setVendedoresExistentes(List<VendedorForm> vendedoresExistentes) {
		this.vendedoresExistentes = vendedoresExistentes;
	}
}
