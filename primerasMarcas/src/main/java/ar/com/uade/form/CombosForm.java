package ar.com.uade.form;

import java.util.List;

public class CombosForm {
	private List<TipoProductoForm> tiposProductos;
	private List<ColorForm> colores;
	private List<ProveedorForm> proveedores;
	private List<MarcaForm> marcas;
	private List<TalleForm> talles;

	public List<TipoProductoForm> getTiposProductos() {
		return tiposProductos;
	}

	public void setTiposProductos(List<TipoProductoForm> tiposProductos) {
		this.tiposProductos = tiposProductos;
	}

	public List<ColorForm> getColores() {
		return colores;
	}

	public void setColores(List<ColorForm> colores) {
		this.colores = colores;
	}

	public List<ProveedorForm> getProveedores() {
		return proveedores;
	}

	public void setProveedores(List<ProveedorForm> proveedores) {
		this.proveedores = proveedores;
	}

	public List<MarcaForm> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<MarcaForm> marcas) {
		this.marcas = marcas;
	}

	public List<TalleForm> getTalles() {
		return talles;
	}

	public void setTalles(List<TalleForm> talles) {
		this.talles = talles;
	}
}
