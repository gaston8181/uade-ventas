package ar.com.uade.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import ar.com.uade.business.ProductoBusiness;
import ar.com.uade.form.CombosForm;
import ar.com.uade.form.ProductoForm;

public class ProductoAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2659635650070882565L;

	private ProductoBusiness producto;
	private ProductoForm form; 
	private CombosForm combos;

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

	@Override
	public void prepare() throws Exception {
		combos = new CombosForm();
		combos.setColores(producto.getColores());
		combos.setProveedores(producto.getProveedores());
		combos.setTiposProductos(producto.getTiposProd());
	}

	public ProductoBusiness getProducto() {
		return producto;
	}

	public void setProducto(ProductoBusiness producto) {
		this.producto = producto;
	}

	public ProductoForm getForm() {
		return form;
	}

	public void setForm(ProductoForm form) {
		this.form = form;
	}

	public CombosForm getCombos() {
		return combos;
	}

	public void setCombos(CombosForm combos) {
		this.combos = combos;
	}
}
