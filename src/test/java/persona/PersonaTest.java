package persona;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	Persona persona1;
	Persona persona2;
	Persona persona3;
	Persona persona4;
	Persona persona5;

	@BeforeEach
	void iniciar() {
		persona1 = new Persona("David", 25, 'H', 2000, 1.84);
		persona2 = new Persona("Manuela", 10, 'M', 1, 1.20);
		persona3 = new Persona("Nobinario", 25, 'Z', 80, 1.80);
		persona4 = new Persona();
		persona5 = new Persona("Javi",30,'M');
		

	}

	@AfterEach
	void finalizar() {
		persona1 = null;
		persona2 = null;
		persona3 = null;
		persona4 = null;
		persona5 = null;
	}

	@Test
	void testEdad() {
		// Prueba mayor de edad
		assertTrue(persona1.esMayorDeEdad());

		// Prueba menor de edad
		assertFalse(persona2.esMayorDeEdad());
	}
	
	//Test getters
	@Test
	void testGetterSetter() {
		persona1.setAltura(2.00);
		persona1.setEdad(10);
		persona1.setNombre("Prueba");
		persona1.setPeso(200);
		persona1.setSexo('M');
	}
	
	//Test calcularIMC
	@Test
	void testCalculaIMC() {
		assertEquals(persona1.calcularIMC(),persona1.SOBREPESO);
		assertEquals(persona2.calcularIMC(),persona2.INFRAPESO);
		assertEquals(persona3.calcularIMC(),persona3.PESO_IDEAL);
	}
	
	//Test toString
	@Test
	void testToString() {
		persona1.toString();
		persona2.toString();
	}
	
	
	
	

}
