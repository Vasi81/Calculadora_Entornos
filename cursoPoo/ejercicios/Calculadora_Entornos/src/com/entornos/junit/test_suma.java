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
		double operador3 = 5.5;
		double operador4 = 6.5;
		double operador5 = 1.1;

		
		Suma s1 = new Suma();
		

		assertEquals(13.1,s1.sumar(operador3, operador4,operador5),0);
		System.out.println("Test cálculo suma con números reales fue correcto");

	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
