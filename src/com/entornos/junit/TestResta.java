package com.entornos.junit;

import static org.junit.jupiter.api.Assertions.*;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import com.entornos.calculadora.Cociente;
import com.entornos.calculadora.Resta;


public class TestResta {

	@Test
	void testRestaDosEnteros() throws Exception {
		int operador1 = 5;
		int operador2 = 4;
		
		Resta r1 = new Resta();
		
		assertEquals(1,r1.restaDosEnteros(operador1, operador2));
		System.out.println("Test cálculo con números enteros fue correcto");
	}
	
@Test
	void testRestaDosReales() throws Exception {
		double operador1 = 10;
		double operador2 = 5;
		
		Resta r1 = new Resta();
		
		assertEquals(5,r1.restaDosReales(operador1, operador2),0.01);
		System.out.println("Test cálculo resta de dos números reales completado correctamente.");
}

@Test
	void testRestaTresReales() throws Exception {
	
		double operador1 = 9;
		double operador2 = 2;
		double operador3 = 5;
	
		Resta r1 = new Resta();
		assertEquals(2,r1.restaTresReales(operador1, operador2, operador3),0.01);
		System.out.println("La resta de Tres reales ha funcionado correctamente");
}
	
	@Test
	void testRestaAcumulada() throws Exception {
		
		double operador1 = 4;
		double operador2 = 3;
		double operador3 = 1;
		double laResta = operador1 - operador2;

		
		Resta r1 = new Resta();
		r1.setMemoria(laResta);
		
		assertEquals(0.0,r1.restaAcumulada(operador3),0.01);
		System.out.println("La resta acumulada ha funcionado correctamente.");
		
	}
}