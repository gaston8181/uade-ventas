package ar.com.uade.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.TalleDAO;
import ar.com.uade.dao.model.Talle;

public class TalleDAOImpl extends HibernateDaoSupport implements TalleDAO {

	private static final String DESCRIPCION = "descripcion";

	@Override
	public List<Talle> listarTalles() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Talle.class);
		criteria.addOrder(Order.asc(DESCRIPCION));
		return (List<Talle>) getHibernateTemplate().findByCriteria(criteria);
	}

}
