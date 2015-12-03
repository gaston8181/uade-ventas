package ar.com.uade.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ar.com.uade.business.ColorBusiness;
import ar.com.uade.business.MarcaBusiness;
import ar.com.uade.business.ProductoBusiness;
import ar.com.uade.business.ProveedorBusiness;
import ar.com.uade.business.TipoProductoBusiness;
import ar.com.uade.dao.ProductoDAO;
import ar.com.uade.dao.model.Producto;
import ar.com.uade.form.ColorForm;
import ar.com.uade.form.MarcaForm;
import ar.com.uade.form.ProductoForm;
import ar.com.uade.form.ProveedorForm;
import ar.com.uade.form.TipoProductoForm;

public class ProductoBusinessImpl implements ProductoBusiness {
	
	private static final String SELECCIONAR = "--SELECCIONAR--";
	private ProveedorBusiness proveedorBusiness;
	private ColorBusiness colorBusiness;
	private TipoProductoBusiness tipoProductoBusiness;
	private MarcaBusiness marcaBusiness;
	private ProductoDAO productoDAO;

	@Transactional
	public void altaProducto(ProductoForm producto) {
		Producto p = new Producto(producto);
		productoDAO.altaProducto(p);

	}

	@Transactional
	public void bajaProducto() {
		Producto producto = new Producto();
		productoDAO.bajaProducto(producto);

	}

	@Transactional
	public void modificarProducto() {
		Producto producto = new Producto();
		productoDAO.modificarProducto(producto);

	}

	@Transactional
	public void modificarStock() {
		productoDAO.modificarStock();
	}

	@Override
	public void consultarProducto() {
		productoDAO.consultarProducto();

	}

	@Override
	public List<ColorForm> getColores() {
		List<ColorForm> lista = new ArrayList<ColorForm>();
		ColorForm seleccionar = new ColorForm();
		seleccionar.setId(0L);
		seleccionar.setDescripcion(SELECCIONAR);
		lista.add(seleccionar);
		lista.addAll(colorBusiness.listarColores());
		return lista;
	}

	@Override
	public List<TipoProductoForm> getTiposProd() {
		List<TipoProductoForm> lista = new ArrayList<TipoProductoForm>();
		TipoProductoForm seleccionar = new TipoProductoForm();
		seleccionar.setId(0L);
		seleccionar.setDescripcion(SELECCIONAR);
		lista.add(seleccionar);
		lista.addAll(tipoProductoBusiness.listarTipoProductos());
		return lista;
	}

	@Override
	public List<ProveedorForm> getProveedores() {
		List<ProveedorForm> lista = new ArrayList<ProveedorForm>();
		ProveedorForm seleccionar = new ProveedorForm();
		seleccionar.setId(0L);
		seleccionar.setNombre(SELECCIONAR);
		lista.add(seleccionar);
		lista.addAll(proveedorBusiness.listarProveedoresActivos());
		return lista;
	}

	@Override
	public List<MarcaForm> getMarcas() {
		List<MarcaForm> lista = new ArrayList<MarcaForm>();
		MarcaForm seleccionar = new MarcaForm();
		seleccionar.setId(0L);
		seleccionar.setDescripcion(SELECCIONAR);
		lista.add(seleccionar);
		lista.addAll(marcaBusiness.listarMarcas());
		return lista;
	}


	@Transactional
	public ProductoForm obtenerProducto(Long id) {
		Producto producto = productoDAO.loadProducto(id);
		return crearView(producto);
	}
	
	private ProductoForm crearView(Producto producto) {
		ProductoForm view = new ProductoForm();
		view.setDatoAdicional(producto.getDatoAdicional());
		view.setId(producto.getId());
		view.setIdColor(producto.getColor().getId());
		view.setIdMarca(producto.getMarca().getId());
		view.setIdProveedor(producto.getProveedor().getId());
		view.setIdTipoProducto(producto.getTipoProducto().getId());
		view.setPrecioCompra(producto.getPrecioCompra());
		view.setPrecioVenta(producto.getPrecioVenta());
		view.setStock(producto.getStock());
		return view;
	}

	public void setProductoDAO(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}

	public void setProveedorBusiness(ProveedorBusiness proveedorBusiness) {
		this.proveedorBusiness = proveedorBusiness;
	}

	public void setColorBusiness(ColorBusiness colorBusiness) {
		this.colorBusiness = colorBusiness;
	}

	public void setTipoProductoBusiness(TipoProductoBusiness tipoProductoBusiness) {
		this.tipoProductoBusiness = tipoProductoBusiness;
	}
	
	public void setMarcaBusiness(MarcaBusiness marcaBusiness) {
		this.marcaBusiness = marcaBusiness;
	}

}
