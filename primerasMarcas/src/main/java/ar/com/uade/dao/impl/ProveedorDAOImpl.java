package ar.com.uade.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.ProveedorDAO;
import ar.com.uade.dao.model.Proveedor;

public class ProveedorDAOImpl extends HibernateDaoSupport implements ProveedorDAO {

	@Override
	public void altaProveedor(Proveedor proveedor) {
		getHibernateTemplate().saveOrUpdate(proveedor);

	}

	@Override
	public void modificarProveedor(Proveedor proveedor) {
		getHibernateTemplate().saveOrUpdate(proveedor);

	}

	@Override
	public void bajaProveedor(Proveedor proveedor) {
		getHibernateTemplate().delete(proveedor);

	}

}
