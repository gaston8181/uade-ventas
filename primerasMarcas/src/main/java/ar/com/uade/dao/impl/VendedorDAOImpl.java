package ar.com.uade.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.VendedorDAO;
import ar.com.uade.dao.model.Vendedor;
import ar.com.uade.form.VendedorForm;

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

	@SuppressWarnings("unchecked")
	@Override
	public List<Vendedor> listarVendedores() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Vendedor.class);
		return (List<Vendedor>) getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public Vendedor loadVendedor(Long id) {
		return getHibernateTemplate().load(Vendedor.class, id);
		
	}

	@Override
	public boolean vendedorExiste(VendedorForm vendedor) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Vendedor.class);
		criteria.add(Restrictions.eq("nombre", vendedor.getNombre()));
		criteria.add(Restrictions.eq("apellido", vendedor.getApellido()));
		criteria.add(Restrictions.eq("dni", vendedor.getDni()));
		criteria.add(Restrictions.eq("fechaNac", vendedor.getFechaNac()));
		criteria.add(Restrictions.eq("telefono", vendedor.getTelefono()));
		criteria.add(Restrictions.eq("domicilio", vendedor.getDomicilio()));
		criteria.add(Restrictions.eq("fechaIngreso", vendedor.getFechaIngreso()));
		
		List<Vendedor> respuesta = (List<Vendedor>) getHibernateTemplate().findByCriteria(criteria);

		if(respuesta == null || respuesta.isEmpty()) {
			return false;
		} 
		
		return true;
	}

}
