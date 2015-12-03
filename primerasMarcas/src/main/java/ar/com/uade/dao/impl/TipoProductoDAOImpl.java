package ar.com.uade.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.TipoProductoDAO;
import ar.com.uade.dao.model.TipoProducto;

public class TipoProductoDAOImpl extends HibernateDaoSupport implements TipoProductoDAO{

	private static final String DESCRIPCION = "descripcion";
	private static final String TALLE = "talle";
	
	@Override
	public List<TipoProducto> listarTipoProductos() {
		DetachedCriteria criteria = DetachedCriteria.forClass(TipoProducto.class);
		criteria.addOrder(Order.asc(DESCRIPCION));
		criteria.addOrder(Order.asc(TALLE));
		return (List<TipoProducto>) getHibernateTemplate().findByCriteria(criteria);
	}

}
