package com.entornos.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.jupiter.api.Test;


import com.entornos.calculadora.Cociente;


public class TestCociente {

	@Test
	void TestCocienteentero() throws Exception {
		int operador1 = 12;
		int operador2 = 2;

		
		Cociente c1 = new Cociente();
		
		assertEquals(6,c1.cociente(operador1, operador2));
		System.out.println("Test cálculo cociente con números enteros fue correcto");
		
	}

	
	@Test
	void TestCocienteReal() throws Exception {
		double operador1 = 12.0;
		double operador2 = 2.0;

		
		Cociente c1 = new Cociente();
		
		assertEquals(6,c1.cociente(operador1, operador2),0.01);
		System.out.println("Test cálculo cociente con números reales fue correcto");
		
	}
	

	@Test
	void TestCocienteby0() throws Exception  {
		int operador1 = 12;
		int operador2 = 0;

		
		Cociente c1 = new Cociente();
		try {
			
			c1.cociente(operador1, operador2);
			fail("Esperamos una excepcion al dividir por 0 ,el operador2 no puede ser 0");
		}
		 catch (Exception expectedException) {
			 
			 System.out.println(expectedException.getMessage());
		 }
		
		System.out.println("Esperamos una excepcion al dividir por 0 ,el operador2 no puede ser 0");
		
	}
	
	
	@Test
	void TestInversoby0() throws Exception  {
		double operador1 = 0;
		Cociente c1 = new Cociente();
		try {
			
			c1.inverso(operador1);
			fail("Esperamos una excepcion ,El operador1 debe ser mayor que cero");
		}
		 catch (Exception expectedException) {
			 System.out.println(expectedException.getMessage());
		 }
		
		System.out.println("Esperamos una excepcion , El operador1 debe ser mayor que cero");
		
	}
	
	
	
	@Test
	void TestInverso() throws Exception {
		double operador1 = 0.5;
		int operador2 = 2;
		
		Cociente c1 = new Cociente();
		assertEquals(operador2,c1.inverso(operador1),0.01);
		System.out.println("Test cálculo Inverso fue correcto");
	}
	
	
	
	@Test
	void TestRaizCuadrada() throws Exception {
		double operador1 = 2;
		double operador2 = 1.4142135623730951;
		
		Cociente c1 = new Cociente();

		assertEquals(operador2,c1.raizCuadrada(operador1),0.01);
		System.out.println("Test cálculo raiz cuadra fue correcto");
		
	}
	

	
	
}
