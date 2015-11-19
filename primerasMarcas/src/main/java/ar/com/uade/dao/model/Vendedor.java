package ar.com.uade.dao.model;

import java.io.Serializable;
import java.util.Date;

import ar.com.uade.form.VendedorForm;

public class Vendedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4930982618199740882L;
	private Long legajo;
	private String nombre;
	private String apellido;
	private Long dni;
	private Date fechaNac;
	private String telefono;
	private String domicilio;
	private Date fechaIngreso;
	private Date fechaBaja;

	public Vendedor() {
		
	}
	
	public Vendedor(Long legajo) {
		this.legajo = legajo;
	}
	public Vendedor(VendedorForm form) {
		this.nombre = form.getNombre();
		this.apellido = form.getApellido();
		this.dni = form.getDni();
		this.fechaNac = form.getFechaNac();
		this.telefono = form.getTelefono();
		this.domicilio = form.getDomicilio();
		this.fechaIngreso = form.getFechaIngreso();
	}

	public Long getLegajo() {
		return legajo;
	}

	public void setLegajo(Long legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

}
