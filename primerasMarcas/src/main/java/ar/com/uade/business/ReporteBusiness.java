package ar.com.uade.business;

import java.util.List;

import ar.com.uade.form.ColorForm;
import ar.com.uade.form.MarcaForm;
import ar.com.uade.form.TalleForm;
import ar.com.uade.form.TipoProductoForm;

public interface ReporteBusiness {
	void reporteSemanal();
	
	void reporteMensual();
	
	void reporteAnual();
	
	void reporteEntreDosFechas();

	List<ColorForm> getColores();

	List<TipoProductoForm> getTiposProd();

	List<MarcaForm> getMarcas();

	List<TalleForm> getTalles();

}
