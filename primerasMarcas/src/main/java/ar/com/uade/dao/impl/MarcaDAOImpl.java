package ar.com.uade.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.MarcaDAO;
import ar.com.uade.dao.model.Marca;

public class MarcaDAOImpl extends HibernateDaoSupport implements MarcaDAO {

	private static final String DESCRIPCION = "descripcion";

	@Override
	public List<Marca> listarMarcas() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Marca.class);
		criteria.addOrder(Order.asc(DESCRIPCION));
		return (List<Marca>) getHibernateTemplate().findByCriteria(criteria);
	}

}
