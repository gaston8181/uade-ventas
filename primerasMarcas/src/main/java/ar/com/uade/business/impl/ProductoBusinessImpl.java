package ar.com.uade.business.impl;

import java.util.List;

import ar.com.uade.business.ColorBusiness;
import ar.com.uade.business.ProductoBusiness;
import ar.com.uade.business.ProveedorBusiness;
import ar.com.uade.business.TipoProductoBusiness;
import ar.com.uade.dao.ProductoDAO;
import ar.com.uade.dao.model.Producto;
import ar.com.uade.form.ColorForm;
import ar.com.uade.form.ProveedorForm;
import ar.com.uade.form.TipoProductoForm;

public class ProductoBusinessImpl implements ProductoBusiness {
	private ProveedorBusiness proveedorBusiness;
	private ColorBusiness colorBusiness;
	private TipoProductoBusiness tipoProductoBusiness;
	private ProductoDAO productoDAO;

	@Override
	public void altaProducto() {
		Producto producto = new Producto();
		productoDAO.altaProducto(producto);

	}

	@Override
	public void bajaProducto() {
		Producto producto = new Producto();
		productoDAO.bajaProducto(producto);

	}

	@Override
	public void modificarProducto() {
		Producto producto = new Producto();
		productoDAO.modificarProducto(producto);

	}

	@Override
	public void modificarStock() {
		productoDAO.modificarStock();
	}

	@Override
	public void consultarProducto() {
		productoDAO.consultarProducto();

	}

	@Override
	public List<ColorForm> getColores() {
		return colorBusiness.listarColores();
	}

	@Override
	public List<TipoProductoForm> getTiposProd() {
		return tipoProductoBusiness.listarTipoProductos();
	}

	@Override
	public List<ProveedorForm> getProveedores() {
		return proveedorBusiness.listarProveedoresActivos();
	}

	public void setProductoDAO(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}

	public void setProveedorBusiness(ProveedorBusiness proveedorBusiness) {
		this.proveedorBusiness = proveedorBusiness;
	}

	public void setColorBusiness(ColorBusiness colorBusiness) {
		this.colorBusiness = colorBusiness;
	}

	public void setTipoProductoBusiness(TipoProductoBusiness tipoProductoBusiness) {
		this.tipoProductoBusiness = tipoProductoBusiness;
	}
}
