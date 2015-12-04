package ar.com.uade.action;

import java.util.List;

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
	private List<ProductoForm> productosExistentes;

	@Override
	public String execute() throws Exception {
		form = new ProductoForm();
		System.out.println("Esto en producto");
		return SUCCESS;
	}

	public String cargarProductos() {
		productosExistentes = producto.listarProductos();
		return SUCCESS;
	}
	
	public String altaProducto() {
		try {
			producto.altaProducto(form);
			addActionMessage("Alta Exitosa!");
			form = new ProductoForm();
		} catch (Exception e) {
			addActionError("Ocurrio un error inesperado, intente nuevamente!");
		}
		return SUCCESS;
	}

	public String modificarProducto() throws Exception {
		producto.modificarProducto(form);
		form = new ProductoForm();
		return SUCCESS;
	}

	public String bajaProducto() {
		try {
			producto.bajaProducto(form.getId());
			addActionMessage("Baja Exitosa!");
		} catch (Exception e) {
			addActionError("Ocurrio un error inesperado, intente nuevamente!");
		}
		return SUCCESS;
	}

	public String buscarProducto() throws Exception {
		form = producto.obtenerProducto(form.getId());
		return SUCCESS;
	}

	public String cargarProducto() throws Exception {
		producto.modificarStock(form);
		form = new ProductoForm();
		return SUCCESS;
	}

	public String consultarProductos() {
		productosExistentes = producto.consultarProductos(form);
		return SUCCESS;
	}

	@Override
	public void prepare() throws Exception {
		combos = new CombosForm();
		combos.setColores(producto.getColores());
		combos.setProveedores(producto.getProveedores());
		combos.setTiposProductos(producto.getTiposProd());
		combos.setMarcas(producto.getMarcas());
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

	public List<ProductoForm> getProductosExistentes() {
		return productosExistentes;
	}

	public void setProductosExistentes(List<ProductoForm> productosExistentes) {
		this.productosExistentes = productosExistentes;
	}
}
