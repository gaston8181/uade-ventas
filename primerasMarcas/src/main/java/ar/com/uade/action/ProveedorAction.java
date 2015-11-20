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
		proveedor.altaProveedor(form);
		return SUCCESS;
	}

	public String bajaProveedor() {
		proveedor.bajaProveedor(form);
		return SUCCESS;
	}

	public String cargarProveedor() {
		form = proveedor.obtenerProveedor();
		return SUCCESS;
	}

	public String modificarProveedor() {
		proveedor.modificarProveedor(form);
		return SUCCESS;
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
