package ar.com.uade.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.ProveedorDAO;
import ar.com.uade.dao.model.Proveedor;

public class ProveedorDAOImpl extends HibernateDaoSupport implements ProveedorDAO {

	private static final String ESTADO = "estado";
	
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
		getHibernateTemplate().update(proveedor);

	}

	@Override
	public List<Proveedor> listarProveedores() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Proveedor.class);
		
		return (List<Proveedor>) getHibernateTemplate().findByCriteria(criteria);
	}
	

	@Override
	public List<Proveedor> listarProveedoresActivos() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Proveedor.class);
		criteria.add(Restrictions.eq(ESTADO, Proveedor.ACTIVO));
		return (List<Proveedor>) getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public Proveedor loadProveedor(Long id) {
		return getHibernateTemplate().load(Proveedor.class, id);
	}

}
