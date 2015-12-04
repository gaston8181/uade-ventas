package ar.com.uade.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.ProductoDAO;
import ar.com.uade.dao.model.Producto;

public class ProductoDAOImpl extends HibernateDaoSupport implements ProductoDAO {

	@Override
	public void altaProducto(Producto producto) {
		getHibernateTemplate().saveOrUpdate(producto);

	}

	@Override
	public void bajaProducto(Producto producto) {
		getHibernateTemplate().delete(producto);

	}

	@Override
	public void modificarProducto(Producto producto) {
		getHibernateTemplate().saveOrUpdate(producto);

	}

	@Override
	public void consultarProducto() {
		// TODO Auto-generated method stub

	}

	@Override
	public Producto loadProducto(Long id) {
		return getHibernateTemplate().load(Producto.class, id);
	}

}
