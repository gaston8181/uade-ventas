package ar.com.uade.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.uade.business.ProveedorBusiness;
import ar.com.uade.form.ProveedorForm;

public class ProveedorAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8566092324713160803L;
	private ProveedorBusiness proveedor;
	private ProveedorForm form;
	private List<ProveedorForm> proveedoresExistentes;

	@Override
	public String execute() throws Exception {
		System.out.println("Esto en proveedor");
		return SUCCESS;
	}

	public String cargarListaProveedores() {
		proveedoresExistentes = proveedor.listarProveedores();
		clearErrorsAndMessages();
		return SUCCESS;
	}

	public String altaProveedor() {
		if (!validar()) {
			return INPUT;
		}
		try {
			proveedor.altaProveedor(form);
			addActionMessage("Alta Exitosa!");
		} catch (Exception e) {
			addActionError("Ocurrio un error inesperado");
		}
		return SUCCESS;
	}

	public String bajaProveedor() {
		try {
			proveedor.bajaProveedor(form);
			proveedoresExistentes = proveedor.listarProveedores();
			addActionMessage("Baja Exitosa!");
		} catch (Exception e) {
			addActionError("Ocurrio un error inesperado");
		}

		return SUCCESS;
	}

	public String cargarProveedor() {
		form = proveedor.obtenerProveedor(form.getId());
		return SUCCESS;
	}

	public String modificarProveedor() {
		if (!validar()) {
			return INPUT;
		}

		try {
			proveedor.modificarProveedor(form);
			addActionMessage("Modificacion Exitosa!");
			proveedoresExistentes = proveedor.listarProveedores();
		} catch (Exception e) {
			addActionError("Ocurrio un error inesperado");
		}
		return SUCCESS;
	}

	private boolean validar() {
		boolean ok = true;
		if (this.form == null) {
			addActionError("Ocurrio un error inesperado, intente nuevamente!");
			ok = false;
		}
		if (this.form.getNombre() == null || this.form.getNombre().isEmpty()) {
			addFieldError("form.nombre", "Campo Obligatorio");
			ok = false;
		} else if (proveedor.proveedorExiste(form)) {
			addActionError("El proveedor ya existe");
			ok = false;
		}

		return ok;
	}

	public ProveedorBusiness getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorBusiness proveedor) {
		this.proveedor = proveedor;
	}

	public ProveedorForm getForm() {
		return form;
	}

	public void setForm(ProveedorForm form) {
		this.form = form;
	}

	public List<ProveedorForm> getProveedoresExistentes() {
		return proveedoresExistentes;
	}

	public void setProveedoresExistentes(List<ProveedorForm> proveedoresExistentes) {
		this.proveedoresExistentes = proveedoresExistentes;
	}
}
