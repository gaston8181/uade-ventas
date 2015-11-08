package ar.com.uade.action;

import ar.com.uade.business.VendedorBusiness;

import com.opensymphony.xwork2.ActionSupport;

public class VendedorAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7133807641107600555L;
	private VendedorBusiness vendedor;

	@Override
	public String execute() throws Exception {
		System.out.println("Esto en vendedor");
		return SUCCESS;
	}

	public String altaVendedor() {
		vendedor.altaVendedor();
		return SUCCESS;
	}

	public String bajaVendedor() {
		vendedor.bajaVendedor();
		return SUCCESS;
	}

	public String modificarVendedor() {
		vendedor.modificarVendedor();
		return SUCCESS;
	}

	public VendedorBusiness getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorBusiness vendedor) {
		this.vendedor = vendedor;
	}

}
