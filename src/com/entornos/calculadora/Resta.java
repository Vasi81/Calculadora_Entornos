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
 * En el primer punto restamos dos n� reales, en el segundo dos numeros enteros y en el tercero tres
 * n� reales.
 * En el cuarto punto metemos el n� que queramos, pero luejo jugamos un poco para restar tambien
 * 		
 */
		
	}
	/**
	 * 
	 
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

	
    
	
	
}


        