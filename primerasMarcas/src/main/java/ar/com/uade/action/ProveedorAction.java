package ar.com.uade.action;

import ar.com.uade.business.ProveedorBusiness;

import com.opensymphony.xwork2.ActionSupport;

public class ProveedorAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8566092324713160803L;
	private ProveedorBusiness proveedor;

	@Override
	public String execute() throws Exception {
		System.out.println("Esto en proveedor");
		return SUCCESS;
	}

	public String altaProveedor() {
		proveedor.altaProveedor();
		return SUCCESS;
	}

	public String bajaProveedor() {
		proveedor.bajaProveedor();
		return SUCCESS;
	}

	public String modificarProveedor() {
		proveedor.modificarProveedor();
		return SUCCESS;
	}

	public ProveedorBusiness getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorBusiness proveedor) {
		this.proveedor = proveedor;
	}

}
