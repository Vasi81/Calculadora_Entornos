package com.entornos.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


import com.entornos.calculadora.Cociente;


public class TestCociente {

	@Test
	void testCociente() throws Exception {
		int operador1 = 12;
		int operador2 = 2;

		
		Cociente c1 = new Cociente();
		
		assertEquals(6,c1.cociente(operador1, operador2));
		System.out.println("Test cálculo cociente con números enteros fue correcto");
		
	}

	
	@Test
	void testCocienteReal() throws Exception {
		double operador1 = 12;
		double operador2 = 2;

		
		Cociente c1 = new Cociente();
		
		assertEquals(6,c1.cociente(operador1, operador2),0.01);
		System.out.println("Test cálculo cociente con números reales fue correcto");
		
	}
	

	@Test
	void testCocienteby0() throws Exception  {
		int operador1 = 12;
		int operador2 = 0;

		
		Cociente c1 = new Cociente();
		try {
			
			c1.cociente(operador1, operador2);
			fail("Esperamos una excepcion al dividir por 0 ,el operador2 no puede ser 0");
		}
		 catch (Exception expectedException) {
			 
		 }
		
		System.out.println("Esperamos una excepcion al dividir por 0 ,el operador2 no puede ser 0");
		
	}
	
	
	@Test
	void testInversoby0() throws Exception  {
		double operador1 = 0;
		int operador2 = 2;

		
		Cociente c1 = new Cociente();
		try {
			
			c1.inverso(operador1);
			fail("Esperamos una excepcion ,El operador1 debe ser mayor que cero");
		}
		 catch (Exception expectedException) {
			 
		 }
		
		System.out.println("Esperamos una excepcion , El operador1 debe ser mayor que cero");
		
	}
	
	
	
	@Test
	void testInverso() throws Exception {
		double operador1 = 0.5;
		int operador2 = 2;
		
		Cociente c1 = new Cociente();
		assertEquals(operador2,c1.inverso(operador1),0.01);
		System.out.println("Test cálculo Inverso fue correcto");
	}
	
	
	
	@Test
	void testRaizCuadrada() throws Exception {
		double operador1 = 2;
		double operador2 = 1.4142135623730951;
		
		Cociente c1 = new Cociente();

		assertEquals(operador2,c1.raizCuadrada(operador1),0.01);
		System.out.println("Test cálculo raiz cuadra fue correcto");
		
	}
	

	
	
}
