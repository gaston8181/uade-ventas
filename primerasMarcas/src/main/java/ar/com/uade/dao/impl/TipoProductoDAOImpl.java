package ar.com.uade.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.TipoProductoDAO;
import ar.com.uade.dao.model.TipoProducto;

public class TipoProductoDAOImpl extends HibernateDaoSupport implements TipoProductoDAO{

	@Override
	public List<TipoProducto> listarTipoProductos() {
		DetachedCriteria criteria = DetachedCriteria.forClass(TipoProducto.class);
		return (List<TipoProducto>) getHibernateTemplate().findByCriteria(criteria);
	}

}
