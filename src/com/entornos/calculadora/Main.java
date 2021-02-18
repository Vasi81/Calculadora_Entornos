package com.entornos.calculadora;



public class Main {

	public static void main(String[] args) throws Exception {

		
		int operador1 = 12;
		int operador2 = 2;
		double operador3 = 0;
		double operador4 = 0;
		double operador5 = 0;
		
		
		//Clase Producto()
		
		Producto numEntero = new Producto();
		Producto numReal = new Producto();
		Producto potencia = new Producto();
		
		System.out.println("El resultado es: " + numEntero.metProductoEntero(operador1, operador2));
		
		System.out.println("El resultado es: " + numReal.metProductoReal(operador3, operador4));
		
		System.out.println("El resultado es: " + numReal.metProductoReal3(operador3, operador4, operador5));
		
		System.out.println("El resultado es: " + potencia.metProductoPotencia(operador1, operador2));
		
		// Clase Cociente

		Cociente c1 = new Cociente();
		
		// División de dos números enteros
		System.out.println(c1.cociente(operador1, operador2));
		
		// Inverso de un número
		System.out.println(c1.inverso(operador2));
		
		//raiz cuadrada de un número
		System.out.println(c1.raizCuadrada(operador1));



		//Clase Suma()
		//Enteros
		 
		Suma s1=new Suma();
		System.out.println(s1.sumar(operador1, operador2));
		
		System.out.println();
		System.out.println(Suma.acumuladorsuma);
		
		
		//Reales 2
		 
		Suma s2=new Suma();
		System.out.println(s2.sumar(operador3, operador4));
				
		System.out.println(s2.sumar(5.4));
		System.out.println(Suma.acumuladorsumareal);
				
		
		//Reales 3
		 
		Suma s3=new Suma();
		System.out.println(s3.sumar(operador3, operador4,operador5));
		
		System.out.println(s3.sumar(5.4));
		System.out.println(Suma.acumuladorsumareal);
		
		

	}

}
