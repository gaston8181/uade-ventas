package ar.com.uade.business.impl;

import ar.com.uade.business.ProductoBusiness;
import ar.com.uade.dao.ProductoDAO;

public class ProductoBusinessImpl implements ProductoBusiness {
	private ProductoDAO productoDAO;

	public ProductoDAO getProductoDAO() {
		return productoDAO;
	}

	public void setProductoDAO(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}
}