package ar.com.uade.business.impl;

import ar.com.uade.business.ProductoBusiness;
import ar.com.uade.dao.ProductoDAO;

public class ProductoBusinessImpl implements ProductoBusiness {
	private ProductoDAO productoDAO;

	@Override
	public void altaProducto() {
		productoDAO.altaProducto();

	}

	@Override
	public void bajaProducto() {
		productoDAO.bajaProducto();

	}

	@Override
	public void modificarProducto() {
		productoDAO.modificarProducto();

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
