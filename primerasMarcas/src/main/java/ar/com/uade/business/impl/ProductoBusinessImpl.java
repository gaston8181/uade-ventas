package ar.com.uade.business.impl;

import ar.com.uade.business.ProductoBusiness;
import ar.com.uade.dao.ProductoDAO;
import ar.com.uade.dao.model.Producto;

public class ProductoBusinessImpl implements ProductoBusiness {
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

	public ProductoDAO getProductoDAO() {
		return productoDAO;
	}

	public void setProductoDAO(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}

}
