package ar.com.uade.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.ColorDAO;
import ar.com.uade.dao.model.Color;

public class ColorDAOImpl extends HibernateDaoSupport implements ColorDAO{

	@Override
	public List<Color> listarColores() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Color.class);
		
		return (List<Color>) getHibernateTemplate().findByCriteria(criteria);
	}

}
