package ar.edu.unlam;


import org.junit.Assert;
import org.junit.Test;

public class TestCerradura {

	@Test
	public void test() {
		
		Cerradura uno= new Cerradura(12345,1);
		uno.abrir(12346);
		Assert.assertFalse("Contrase�a incorrecta, intente nuevamente", false);
	}

}
