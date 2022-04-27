package ar.com.redlink.sintaxis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PruebaTest {
	
	@Test
	public void testSumar() throws Exception {
		
		Prueba prueba = new Prueba(10);
		
		assertEquals(25, prueba.suma(15));
		
		assertTrue(prueba.suma(15) == 25);
	}
}
