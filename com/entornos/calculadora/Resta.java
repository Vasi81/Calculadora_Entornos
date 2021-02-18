package com.entornos.calculadora;


/**
 * En esta clase representariamos tres restas de numeros reales y enteros.creariamos un acumulado,
 * el cual quiero restar tambien. 
 * @author pep22
 * @since 24-01-21
 * @version 2.0
 */
public class Resta {
	
/**
 * Creamos el esqueleto del objeto y inicializamos a cero 
 */
	private double memoria;
	public Resta(){
		this.memoria = 0;
/**
 * Creamos los atributos, constructores de las restas y acumulado para su posterior interaccion.
 * En el primer punto restamos dos nº reales, en el segundo dos numeros enteros y en el tercero tres
 * nº reales.
 * En el cuarto punto metemos el nº que queramos, pero luejo jugamos un poco para restar tambien
 * 		
 */
		
	}
	/**
	 * 
	 * @param hacemos referencia a memoria
	 */
	public Resta(double memoria) {
		this.memoria = memoria;
	}
	/**
	 * 
	 * @param parametro1 primer numero a restar
	 * @param parametro2 segundo numero que resta al primero
	 * @return valor real
	 */
	public double restaDosReales(double parametro1, double parametro2) {
		 return parametro1 - parametro2;
	}
	/**
	 * 
	 * @param parametro1 primer numero a restar
	 * @param parametro2 segundo numero que resta al primero
	 * @return valor entero
	 */
	public int restaDosEnteros(int parametro1, int parametro2) {
		return parametro1 - parametro2;
	}
	/**
	 * 
	 * @param parametro1 primer numero a restar
	 * @param parametro2 segundo numero que resta al primero
	 * @param parametro3 tercer numero que termina de restar
	 * @return valor real
	 */
	public double restaTresReales(double parametro1, double parametro2, double parametro3) {
		 return parametro1 - parametro2 - parametro3;
	}
	/**
	 * acumular y poder restar a la vez
	 * @param para poder ir restando
	 */
	public void restaAcumulada(double parametro) {
		 memoria -= parametro; 
	}
	/**
	 * Mostrar
	 * @return
	 */
	public double getMemoria () {
		return memoria;
	}
	/**
	 * Modificar
	 * @param memoria
	 */
	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	/**
	 * Aqui ya en el main con los metodos realizamos las restas como tal,metemos valores numericos y en acumulado a 20
	 * y le vamos restando 10, luego 5 y para finalizar le modificamos con set y metemos 4.Utilizamos get para que 
	 * muestre
	 * @param args
	 * @return resultados numericos reales
	 */
	public static void main(String[] args) {
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


        