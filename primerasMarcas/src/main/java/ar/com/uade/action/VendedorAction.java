package ar.com.uade.action;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.uade.business.VendedorBusiness;
import ar.com.uade.form.VendedorForm;

public class VendedorAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7133807641107600555L;
	private VendedorBusiness vendedor;
	private VendedorForm form;

	@Override
	public String execute() throws Exception {
		System.out.println("Esto en vendedor");
		return SUCCESS;
	}

	public String altaVendedor() {
		vendedor.altaVendedor(form);
		return SUCCESS;
	}

	public String bajaVendedor() {
		vendedor.bajaVendedor(form);
		return SUCCESS;
	}

	public String modificarVendedor() {
		vendedor.modificarVendedor(form);
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
}
