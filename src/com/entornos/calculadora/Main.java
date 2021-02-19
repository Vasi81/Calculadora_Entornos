package com.entornos.calculadora;



public class Main {

	public static void main(String[] args) throws Exception {

		
		int operador1 = 12;
		int operador2 = 2;
		double operador3 = 3;
		double operador4 = 2;
		double operador5 = 1;
		
		
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
		
		// Divisi�n de dos n�meros enteros
		System.out.println(c1.cociente(operador1, operador2));
		
		// Inverso de un n�mero
		System.out.println(c1.inverso(operador2));
		
		//raiz cuadrada de un n�mero
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
		
		
		//Clase Resta()
		Resta resta = new Resta(20);
		double res1,res3, memoria;
		int res2;
		res1 = resta.restaDosReales(5.3,2.8);
		res2 = resta.restaDosEnteros(5,3);
		res3 = resta.restaTresReales(6.1,2.2,1.5);
		resta.restaAcumulada(10);
		resta.restaAcumulada(5);
		resta.setMemoria(4);
		memoria = resta.getMemoria();
		System.out.println(res1 + " " + res2 + " " + res3 +" " + memoria);
		

	}

}
