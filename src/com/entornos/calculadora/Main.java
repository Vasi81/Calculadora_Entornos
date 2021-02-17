package com.entornos.calculadora;



public class Main {

	public static void main(String[] args) throws ValorNoValido {

		
		int operador1 = 12;
		int operador2 = 2;
		double operador3 = 0;
		double operador4 = 0;
		double operador5 = 0;
		
		
		Producto numEntero = new Producto();
		Producto numReal = new Producto();
		Producto potencia = new Producto();
		
		System.out.println("El resultado es: " + numEntero.metProductoEntero(operador1, operador2));
		
		System.out.println("El resultado es: " + numReal.metProductoReal(operador3, operador4));
		
		System.out.println("El resultado es: " + numReal.metProductoReal3(operador3, operador4, operador5));
		
		System.out.println("El resultado es: " + potencia.metProductoPotencia(operador1, operador2));
		
		
        //Suma s1=new Suma();
        
        //System.out.println("El resultado es: " + s1.sumar(operador1, operador2));

        //Cociente c1=new Cociente();




        /*c1.cociente(8,2);
        System.out.println("El resultado es: " + c1.resultado1);


        c1.cociente(25.2,5);
        System.out.println("El resultado es: " + c1.resultado2);

        c1.inverso(25);
        System.out.println("El resultado es: " + c1.resultado2);


        c1.raizCuadrada(8);
        System.out.println("El resultado es: " + c1.resultado1);*/
		
        
	}

}
