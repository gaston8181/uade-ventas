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
		vendedoresExistentes = vendedor.listarVendedores();
		clearErrorsAndMessages();
		return SUCCESS;
	}

	public String altaVendedor() {
		try {
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

	public String modificarVendedor() {
		try {
			addActionMessage("Modificacion Exitosa!");
			vendedor.modificarVendedor(form);
			vendedoresExistentes = vendedor.listarVendedores();
		} catch (Exception e) {
			addActionError("Ocurrio un error inesperado, intente nuevamente!");
		}
		return SUCCESS;
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
