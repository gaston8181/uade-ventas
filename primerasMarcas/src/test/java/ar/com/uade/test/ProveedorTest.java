package ar.com.uade.test;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.uade.business.ProveedorBusiness;

public class ProveedorTest {

	private static ApplicationContext applicationContext;
	private static ProveedorBusiness proveedorBusiness;

	@BeforeClass
	public static void beforeClass() {
		applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		proveedorBusiness = applicationContext.getBean("proveedor.business",
				ProveedorBusiness.class);
		System.out.println("--------");
	}

	@Test
	public void test() {
		proveedorBusiness.altaProveedor();
		fail("Not yet implemented");
	}

}
