package ar.com.uade.dao.impl;

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
		getHibernateTemplate().delete(vendedor);
		
	}

	@Override
	public void modificarVendedor(Vendedor vendedor) {
		getHibernateTemplate().saveOrUpdate(vendedor);
		
	}

}
