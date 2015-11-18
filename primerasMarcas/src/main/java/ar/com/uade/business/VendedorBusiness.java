package ar.com.uade.business;

import ar.com.uade.form.VendedorForm;

public interface VendedorBusiness {
	void altaVendedor(VendedorForm form);

	void bajaVendedor(VendedorForm form);

	void modificarVendedor(VendedorForm form);
}
