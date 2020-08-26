package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		
		// TODO
		setUp2();
		assertEquals(CAPACIDAD,modelo.darTamano());
		
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
		setUp2();
		modelo.agregar("hola");
		assertEquals(CAPACIDAD*2,modelo.darCapacidad());
	}

	@Test
	public void testBuscar() {
		setUp2();
		// TODO Completar la prueba
		assertEquals(1,modelo.buscar(1));
		assertEquals(0,modelo.buscar(0));
		assertEquals(null , modelo.buscar(CAPACIDAD));
		assertEquals(null , modelo.buscar(CAPACIDAD+1));
		assertEquals(null, modelo.buscar(-1));
	}

	@Test
	public void testEliminar() {
		setUp2();
		// TODO Completar la prueba
		assertEquals(null, modelo.eliminar(CAPACIDAD));
		assertEquals(null, modelo.eliminar(-1));
		assertEquals(0,modelo.eliminar(0));
		assertEquals(CAPACIDAD-1,modelo.darTamano());
	
		
		
		
	}

}
