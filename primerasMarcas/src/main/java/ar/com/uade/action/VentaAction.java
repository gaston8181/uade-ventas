package ar.com.uade.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.uade.business.CambioBusiness;
import ar.com.uade.business.VentaBusiness;
import ar.com.uade.form.CierreListaForm;

public class VentaAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1881806532133304843L;
	private VentaBusiness venta;
	private CambioBusiness cambio;

	// PARA CIERRE CAJA
	private List<CierreListaForm> operaciones;
	private int totalEfectivo;
	private int totalTarjeta;

	@Override
	public String execute() throws Exception {
		System.out.println("Esto en venta");
		return SUCCESS;
	}

	public String nuevaVenta() {
		// TODO Desarrollar NICO
		return SUCCESS;
	}

	public String gestionarCambio() {
		// TODO Desarrollar NICO
		return SUCCESS;
	}

	public String cerrarCaja() {
		operaciones = venta.ventasDelDia();
		operaciones.addAll(cambio.cambiosDelDia());

		totalEfectivo = venta.totalEfectivo() + cambio.totalEfectivo();
		totalTarjeta = venta.totalTarjeta() + cambio.totalTarjeta();

		return SUCCESS;
	}

	public void setVenta(VentaBusiness venta) {
		this.venta = venta;
	}

	public void setCambio(CambioBusiness cambio) {
		this.cambio = cambio;
	}

	public void setOperaciones(List<CierreListaForm> operaciones) {
		this.operaciones = operaciones;
	}

	public List<CierreListaForm> getOperaciones() {
		return operaciones;
	}

	public int getTotalEfectivo() {
		return totalEfectivo;
	}

	public void setTotalEfectivo(int totalEfectivo) {
		this.totalEfectivo = totalEfectivo;
	}

	public int getTotalTarjeta() {
		return totalTarjeta;
	}

	public void setTotalTarjeta(int totalTarjeta) {
		this.totalTarjeta = totalTarjeta;
	}

}
