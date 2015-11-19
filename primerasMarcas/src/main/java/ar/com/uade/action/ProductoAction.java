package ar.com.uade.action;

import ar.com.uade.business.ProductoBusiness;

import com.opensymphony.xwork2.ActionSupport;

public class ProductoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2659635650070882565L;

	private ProductoBusiness producto;

	@Override
	public String execute() throws Exception {
		System.out.println("Esto en producto");
		return SUCCESS;
	}

	public String altaProducto() {
		try {
			producto.altaProducto();
			addActionMessage("Alta Exitosa!");
		} catch (Exception e) {
			addActionError("Ocurrio un error inesperado, intente nuevamente!");
		}
		return SUCCESS;
	}

	public String bajaProducto() {
		try {
		producto.bajaProducto();
		addActionMessage("Baja Exitosa!");
		} catch (Exception e) {
			addActionError("Ocurrio un error inesperado, intente nuevamente!");
		}
		return SUCCESS;
	}

	public String cargarProducto() {
		producto.modificarStock();
		return SUCCESS;
	}

	public String consultarProducto() {
		producto.consultarProducto();
		return SUCCESS;
	}

	public ProductoBusiness getProducto() {
		return producto;
	}

	public void setProducto(ProductoBusiness producto) {
		this.producto = producto;
	}

}
