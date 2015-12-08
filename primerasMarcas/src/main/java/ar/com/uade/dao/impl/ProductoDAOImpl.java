package ar.com.uade.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ar.com.uade.dao.ProductoDAO;
import ar.com.uade.dao.model.Producto;
import ar.com.uade.form.ProductoForm;

public class ProductoDAOImpl extends HibernateDaoSupport implements ProductoDAO {

	private static final String COLOR = "color.id";
	private static final String MARCA = "marca.id";
	private static final String TIPO_PRODUCTO = "tipoProducto.id";
	private static final String TALLE = "talle.id";
	private static final String ID = "id";

	@Override
	public void altaProducto(Producto producto) {
		getHibernateTemplate().saveOrUpdate(producto);

	}

	@Override
	public void bajaProducto(Producto producto) {
		getHibernateTemplate().delete(producto);

	}

	@Override
	public void modificarProducto(Producto producto) {
		getHibernateTemplate().saveOrUpdate(producto);

	}

	@Override
	public Producto loadProducto(Long id) {
		return getHibernateTemplate().load(Producto.class, id);
	}

	@Override
	public List<Producto> listarProductos() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Producto.class);
		return (List<Producto>) getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public List<Producto> listarProductos(ProductoForm form) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Producto.class);
		agregarRestrictions(criteria, COLOR, form.getIdColor());
		agregarRestrictions(criteria, MARCA, form.getIdMarca());
		agregarRestrictions(criteria, TIPO_PRODUCTO, form.getIdTipoProducto());
		agregarRestrictions(criteria, TALLE, form.getIdTalle());
		agregarRestrictions(criteria, ID, form.getId());
		return (List<Producto>) getHibernateTemplate().findByCriteria(criteria);
	}

	private void agregarRestrictions(DetachedCriteria criteria, String campo, Long valor) {
		if (valor != null && valor > 0) {
			criteria.add(Restrictions.eq(campo, valor));
		}
	}

	@Override
	public boolean codigoBarrasExiste(Long id) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Producto.class);
		criteria.add(Restrictions.eq(ID, id));
		List<Producto> existe = (List<Producto>) getHibernateTemplate().findByCriteria(criteria);
		return existe != null && !existe.isEmpty();
	}
}
