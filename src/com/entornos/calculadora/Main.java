package com.entornos.calculadora;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int operador1;
		int operador2;
		
		double operador3;
		double operador4;
		double operador5;
		
		operador1=3;
		operador2=5;
		
		
		operador3=3.2;
		operador4=6.5;
		operador5=6.65;
		
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