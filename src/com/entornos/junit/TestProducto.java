package com.entornos.junit;

import static org.junit.Assert.assertArrayEquals;


import com.entornos.calculadora.Producto;



public class TestProducto {
	
	@Test
	public void testProductoEnteros()throws Exception{
		
		int operador1= 7;
		int operador2= 5;
		
		Producto numEntero = new Producto();
		
		assertEquals(35,numEntero.metProductoEntero(operador1, operador2));
		System.out.println ("El test del cálculo del producto de dos números enteros es correcto ");
		
	}
		
		@Test
		public void testProductoDosReales() throws Exception {
			double operador3 = 7;
			double operador4 = 5;
			
			Producto numReal = new Producto();
			
			assertEquals(35, numReal.metProductoReal(operador3, operador4),0.01);
			
			System.out.println("El test del cálculo del producto de dos números reales es correcto");
		}
		
		@Test
		public void testProductoTresReales()throws Exception{
			
			double operador3=7;
			double operdor4=5;
			double operador5=9;
			
			Producto tresReales=new Producto();
			
			assertEquals(315,tresReales.metProductoReal3(operador3, operdor4, operador5), 0.01);
			
			System.out.println("El test del cálculo del producto de 3 números reales es correcto");
			
		}
		
		@Test
		public void testPotencia()throws Exception{
			int operador1=7;
			int operador2=16;
			
			Producto potencia = new Producto();
			try {
				
				potencia.metProductoPotencia(operador1, operador2);
				fail("Esperamos que nos de una excepcion, el operador2 debe ser menor que 15");
			}
			 catch (Exception expectedException) {
				 
			 }
			System.out.println("El test de la operación del cálculo de potencia es correcto");
			
			
		}
		
	}


