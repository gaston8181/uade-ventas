package ar.com.uade.business;

import java.util.List;

import ar.com.uade.form.ColorForm;
import ar.com.uade.form.MarcaForm;
import ar.com.uade.form.ProductoForm;
import ar.com.uade.form.ProveedorForm;
import ar.com.uade.form.TipoProductoForm;

public interface ProductoBusiness {
	void altaProducto(ProductoForm form);

	void bajaProducto();

	void modificarProducto();

	void modificarStock();

	void consultarProducto();
	
	List<ColorForm> getColores();
	
	List<TipoProductoForm> getTiposProd();
	
	List<ProveedorForm> getProveedores();
	
	List<MarcaForm> getMarcas();
	
	ProductoForm obtenerProducto(Long id);

}
