package ar.com.uade.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.VendedorDAO;
import ar.com.uade.dao.model.Vendedor;

public class VendedorDAOImpl extends HibernateDaoSupport implements VendedorDAO{

	@Override
	public void altaVendedor(Vendedor vendedor) {
		getHibernateTemplate().saveOrUpdate(vendedor);
		
	}

	@Override
	public void bajaVendedor(Vendedor vendedor) {
		getHibernateTemplate().update(vendedor);
		
	}

	@Override
	public void modificarVendedor(Vendedor vendedor) {
		getHibernateTemplate().saveOrUpdate(vendedor);
		
	}

	@Override
	public List<Vendedor> listarVendedores() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Vendedor.class);
		return (List<Vendedor>) getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public Vendedor loadVendedor(Long id) {
		return getHibernateTemplate().load(Vendedor.class, id);
		
	}

}
