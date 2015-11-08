package ar.com.uade.action;

import ar.com.uade.business.VentaBusiness;

import com.opensymphony.xwork2.ActionSupport;

public class VentaAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1881806532133304843L;
	private VentaBusiness venta;

	@Override
	public String execute() throws Exception {
		System.out.println("Esto en venta");
		return SUCCESS;
	}

	public String nuevaVenta() {
		venta.nuevaVenta();
		return SUCCESS;
	}

	public String gestionarCambio() {
		venta.gestionarCambio();
		return SUCCESS;
	}

	public String cerrarCaja() {
		venta.cerrarCaja();
		return SUCCESS;
	}

	public VentaBusiness getVenta() {
		return venta;
	}

	public void setVenta(VentaBusiness venta) {
		this.venta = venta;
	}

}
