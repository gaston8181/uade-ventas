package ar.com.uade.business;

import java.util.List;

import ar.com.uade.form.ColorForm;
import ar.com.uade.form.MarcaForm;
import ar.com.uade.form.ProductoForm;
import ar.com.uade.form.ProveedorForm;
import ar.com.uade.form.TalleForm;
import ar.com.uade.form.TipoProductoForm;

public interface ProductoBusiness {
	void altaProducto(ProductoForm form);

	void bajaProducto(Long id);

	void modificarProducto(ProductoForm form);

	void modificarStock(ProductoForm form);

	List<ProductoForm> consultarProductos(ProductoForm form);

	List<ColorForm> getColores();

	List<TipoProductoForm> getTiposProd();

	List<ProveedorForm> getProveedores();

	List<MarcaForm> getMarcas();

	List<TalleForm> getTalles();

	ProductoForm obtenerProducto(Long id);

	List<ProductoForm> listarProductos();

}
