package ar.com.uade.form;

import java.util.Date;

public class ReporteEntreFechasForm {
	private Date fechaInicio;
	private Date fechaFin;
	private Long id;
	private Long idMarca;
	private Long idColor;
	private Long idTalle;

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

}
