package ar.com.uade.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.uade.business.CambioBusiness;
import ar.com.uade.business.VentaBusiness;
import ar.com.uade.form.CambioForm;
import ar.com.uade.form.VentaForm;

public class VentaAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1881806532133304843L;
	private VentaBusiness venta;
	private CambioBusiness cambio;

	private List<VentaForm> ventasDelDia;
	private List<CambioForm> cambiosDelDia;

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
		ventasDelDia = venta.ventasDelDia();
		cambiosDelDia = cambio.cambiosDelDia();
		
		return SUCCESS;
	}

	public void setVenta(VentaBusiness venta) {
		this.venta = venta;
	}

	public void setCambio(CambioBusiness cambio) {
		this.cambio = cambio;
	}

	public List<VentaForm> getVentasDelDia() {
		return ventasDelDia;
	}

	public void setVentasDelDia(List<VentaForm> ventasDelDia) {
		this.ventasDelDia = ventasDelDia;
	}

	public List<CambioForm> getCambiosDelDia() {
		return cambiosDelDia;
	}

	public void setCambiosDelDia(List<CambioForm> cambiosDelDia) {
		this.cambiosDelDia = cambiosDelDia;
	}

}
