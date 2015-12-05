package ar.com.uade.business;

import java.util.List;

import ar.com.uade.form.ColorForm;
import ar.com.uade.form.MarcaForm;
import ar.com.uade.form.ProveedorForm;
import ar.com.uade.form.TalleForm;
import ar.com.uade.form.TipoProductoForm;

public interface CombosBusiness {
	List<ColorForm> getColores();

	List<TipoProductoForm> getTiposProd();

	List<ProveedorForm> getProveedores();

	List<MarcaForm> getMarcas();

	List<TalleForm> getTalles();

}