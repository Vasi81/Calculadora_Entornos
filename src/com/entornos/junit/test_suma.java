package com.entornos.junit;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;
import com.entornos.calculadora.Suma;
class test_suma {
	


	@Test
	 void testSumaEnteros()throws Exception {		
		int operador1= 5;
		int operador2= 6;
		
		Suma s1 = new Suma();
		
		assertEquals(11,s1.sumar(operador1, operador2));
		System.out.println("Test cálculo suma con números enteros fue correcto");
		
	}
	
	
	
	
	@Test
	void testSumaReal() throws Exception {
		double operador3 = 3.0;
		double operador4 = 6.0;
		double operador5 = 1.0;

		
		Suma s1 = new Suma();
		

		assertEquals(10,s1.sumar(operador3, operador4,operador5),0);
		System.out.println("Test cálculo suma con números reales fue correcto");

	}
	

	
	@Test
	void testSumaRea() throws Exception {
		double operador6 = 6.5;
		double operador7 = 1.5;
		
		Suma s1 = new Suma();
		
		assertEquals(8,s1.sumar(operador6,operador7),0);
		System.out.println("Test cálculo suma con números reales fue correcto");
	}
	
	@Test
	void testUnicoEntero() throws Exception {
	
		int num=5;
		
		Suma s1 = new Suma();
		
		assertEquals(16,s1.sumar(num),0);
		System.out.println("Test cálculo suma con números reales fue correcto");
	}
	
	@Test
	void testUnicoReal() throws Exception {
	
		double num=1.0;
		
		Suma s1 = new Suma();
		
		System.out.println(Suma.acumuladorsumareal);
		
		assertEquals(11,s1.sumar(num),0);
		System.out.println("Test cálculo suma con números reales fue correcto");
}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
