package ar.com.uade.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ar.com.uade.business.CombosBusiness;
import ar.com.uade.business.ProductoBusiness;
import ar.com.uade.dao.ProductoDAO;
import ar.com.uade.dao.model.Producto;
import ar.com.uade.form.ColorForm;
import ar.com.uade.form.MarcaForm;
import ar.com.uade.form.ProductoForm;
import ar.com.uade.form.ProveedorForm;
import ar.com.uade.form.TalleForm;
import ar.com.uade.form.TipoProductoForm;

public class ProductoBusinessImpl implements ProductoBusiness {

	private CombosBusiness comboBusiness;
	private ProductoDAO productoDAO;

	@Transactional
	public void altaProducto(ProductoForm producto) {
		Producto p = new Producto(producto);
		productoDAO.altaProducto(p);

	}

	@Transactional
	public void bajaProducto(Long idBaja) {
		Producto producto = new Producto(idBaja);
		productoDAO.bajaProducto(producto);

	}

	@Transactional
	public void modificarProducto(ProductoForm form) {
		Producto producto = new Producto(form);
		productoDAO.modificarProducto(producto);

	}

	@Transactional
	public void modificarStock(ProductoForm form) {
		Producto producto = productoDAO.loadProducto(form.getId());
		producto.agregarStock(form.getAgregarStock());
		productoDAO.modificarProducto(producto);
	}

	@Transactional
	public List<ProductoForm> consultarProductos(ProductoForm form) {
		List<Producto> productos = productoDAO.listarProductos(form);
		List<ProductoForm> productosForm = new ArrayList<ProductoForm>();
		for (Producto producto : productos) {
			ProductoForm aux = crearView(producto);
			aux.setDescColor(producto.getColor().getDescripcion());
			aux.setDescMarca(producto.getMarca().getDescripcion());
			aux.setDescProducto(producto.getTipoProducto().getDescripcion());
			aux.setDescTalle(producto.getTalle().getDescripcion());
			productosForm.add(aux);
		}
		return productosForm;
	}

	@Override
	public List<ColorForm> getColores() {
		return comboBusiness.getColores();
	}

	@Override
	public List<TalleForm> getTalles() {
		return comboBusiness.getTalles();
	}

	@Override
	public List<TipoProductoForm> getTiposProd() {
		return comboBusiness.getTiposProd();
	}

	@Override
	public List<ProveedorForm> getProveedores() {
		return comboBusiness.getProveedores();
	}

	@Override
	public List<MarcaForm> getMarcas() {
		return comboBusiness.getMarcas();
	}

	@Transactional
	public ProductoForm obtenerProducto(Long id) {
		Producto producto = productoDAO.loadProducto(id);
		return crearView(producto);
	}

	@Transactional
	public List<ProductoForm> listarProductos() {
		List<Producto> productos = productoDAO.listarProductos();
		List<ProductoForm> productosForm = new ArrayList<ProductoForm>();
		for (Producto producto : productos) {
			ProductoForm aux = crearView(producto);
			aux.setDescColor(producto.getColor().getDescripcion());
			aux.setDescMarca(producto.getMarca().getDescripcion());
			aux.setDescProducto(producto.getTipoProducto().getDescripcion());
			aux.setDescTalle(producto.getTalle().getDescripcion());
			productosForm.add(aux);
		}
		return productosForm;
	}

	private ProductoForm crearView(Producto producto) {
		ProductoForm view = new ProductoForm();
		view.setDatoAdicional(producto.getDatoAdicional());
		view.setId(producto.getId());
		view.setIdColor(producto.getColor().getId());
		view.setIdMarca(producto.getMarca().getId());
		view.setIdProveedor(producto.getProveedor().getId());
		view.setIdTalle(producto.getTalle().getId());
		view.setIdTipoProducto(producto.getTipoProducto().getId());
		view.setPrecioCompra(producto.getPrecioCompra());
		view.setPrecioVenta(producto.getPrecioVenta());
		view.setStock(producto.getStock());
		return view;
	}

	public void setProductoDAO(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}

	public void setComboBusiness(CombosBusiness comboBusiness) {
		this.comboBusiness = comboBusiness;
	}

}
