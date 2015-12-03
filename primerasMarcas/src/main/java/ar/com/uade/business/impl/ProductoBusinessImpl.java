package ar.com.uade.business.impl;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public void altaProducto(ProductoForm producto) {
		Producto p = new Producto();
		productoDAO.altaProducto(p);

	}

	@Override
	public void bajaProducto() {
		Producto producto = new Producto();
		productoDAO.bajaProducto(producto);

	}

	@Override
	public void modificarProducto() {
		Producto producto = new Producto();
		productoDAO.modificarProducto(producto);

	}

	@Override
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
