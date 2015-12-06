package ar.com.uade.form;

import java.util.Date;

public class ReporteForm {
	// REPORTE ENTRE FECHAS
	private Date fechaInicio;
	private Date fechaFin;
	private Long id;
	private Long idMarca;
	private Long idColor;
	private Long idTalle;
	private Long idTipoProducto;

	// REPORTE GENERAL
	private int reporte;
	private Long semana;
	private Long mes;
	private Long anio;

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Long idMarca) {
		this.idMarca = idMarca;
	}

	public Long getIdColor() {
		return idColor;
	}

	public void setIdColor(Long idColor) {
		this.idColor = idColor;
	}

	public Long getIdTalle() {
		return idTalle;
	}

	public void setIdTalle(Long idTalle) {
		this.idTalle = idTalle;
	}

	public Long getIdTipoProducto() {
		return idTipoProducto;
	}

	public void setIdTipoProducto(Long idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public Long getSemana() {
		return semana;
	}

	public void setSemana(Long semana) {
		this.semana = semana;
	}

	public Long getMes() {
		return mes;
	}

	public void setMes(Long mes) {
		this.mes = mes;
	}

	public Long getAnio() {
		return anio;
	}

	public void setAnio(Long anio) {
		this.anio = anio;
	}

	public int getReporte() {
		return reporte;
	}

	public void setReporte(int reporte) {
		this.reporte = reporte;
	}
}
