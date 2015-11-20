package ar.com.uade.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
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

	@Override
	public List<Proveedor> listarProveedores() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Proveedor.class);
		
		return (List<Proveedor>) getHibernateTemplate().findByCriteria(criteria);
	}

}
