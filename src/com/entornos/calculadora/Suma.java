package com.entornos.calculadora;

/**
 * Clase para sumar entre uno y tres operandos.
 * Los operadores pueden ser números enteros o números reales
 * @author José Ignacio Gutiérrez
 * @version 1.0
 * @since 14-02-2021.
 */

public class Suma {
	
	/*
	 * Definimos los parametros para los contructores.
	 * operador1 entero.
	 * operador2 entero.
	 * operador3 real.
	 * operador4 real.
	 * operador5 real.
	*/
	
	/**
	* @see Suma
	*/
	private int operador1;
	private int operador2;
	private double operador3;
	private double operador4;
	private double operador5;

	/**
	* Variable para almacenar el resultado de las sumas de números enteros.
	* @see Suma
	*/
	//Para los acumuladores definimos dos variables , uno de tipo entero y otro de tipo real.
	public static int acumuladorsuma=0;
	
	/**
	* Variable para almacenar el resultado de las sumas de números reales.
	* @see Suma
	*/
	public static double acumuladorsumareal=0;
	
	
	//Constructores
	
			/**
			 * Constructor Suma.
			 * Crea el constructor para sumar dos números enteros , 
			 * sumar dos números reales ,
			 * sumar tres númeross reales.
			 * @see Suma
			 */
	
			public Suma() {
				this.operador1 = 0;
				this.operador2 = 0;
				this.operador3 = 0;
				this.operador4 = 0;
				this.operador5 = 0;
	
			}
			
				
			// Métodos
			/**
			 * Método sumar con dos operadores enteros.
			 * Almacenamos el valor calculado por el método sumar para luego incrementar por el "método sumar por un parámetro como entrada".
			 * 
			 * operador1 + operador2
			 * @param operador1
			 *            Valor numerico entero.
			 * @param operador2
			 *           Valor numerico entero.
			 * @return devuelve la suma de dos operadores enteros.
			 * 
			 * @exception   Exception
			 *		Los parámetros de entrada deben ser mayor de 0.
			 * 
			 * @see Suma
			 */
			
			public int sumar(int operador1,int operador2) throws Exception {
				int valor;
				this.operador1=operador1;
				this.operador2=operador2;
				
				//Validamos el valor para disparar la excepción.
				if (operador1 <= 0) {
		              throw new Exception("El operador1 debe ser mayor de 0");                                             
		          }
				if (operador2 <= 0) {
		              throw new Exception("El operador2 debe ser mayor de 0");                                             
		          }
				
				
				valor=this.operador1+this.operador2;
				
				//acumuladorsuma , almacena el valor calculado por el método para luego se pueda incrementar por el método sumar por un parámetro como entrada.
				acumuladorsuma=acumuladorsuma+valor;
				//Devolvemos el valor para el método.
				return valor;

			}
			
			
			/**
			 * Método sumar con dos operadores reales.
			 * Almacenamos el valor calculado por el mÃ©todo sumar para luego incrementar por el "mÃ©todo sumar por un parÃ¡metro como entrada".
			 * 
			 * operador1 + operador2 +operador3
			 * @param operador1
			 *            Valor numerico real.
			 * @param operador2
			 *           Valor numerico real.
			 * @return devuelve la suma de dos operadores reales.
			 * 
			 * @exception   Exception
			 *		Los parÃ¡metros de entrada deben ser mayor de 0.
			 * 
			 * @see Suma
			 */
			public double sumar(double operador1,double operador2) throws Exception {
				
				double valor;
				this.operador3=operador1;
				this.operador4=operador2;
				
				
				//Validamos el valor para disparar la excepción.
				if (operador1 <= 0) {
		              throw new Exception("El operador1 debe ser mayor de 0");                                             
		          }
				if (operador2 <= 0) {
		              throw new Exception("El operador2 debe ser mayor de 0");                                             
		          }
				
				valor=this.operador3+this.operador4 ;
				
				//acumuladorsumareal , almacena el valor calculado por el método para luego se pueda incrementar por el método sumar por un parámetro como entrada.
				acumuladorsumareal=acumuladorsumareal+valor;
				//Devolvemos el valor para el mÃ©todo.
				return valor;
			}
			
			
			
			/**
			 * Método sumar con tres operadores reales.
			 * Almacenamos el valor calculado por el método sumar para luego incrementar por el "método sumar por un parámetro como entrada".
			 * 
			 * operador1 + operador2 +operador3
			 * @param operador1
			 *            Valor numerico real.
			 * @param operador2
			 *           Valor numerico real.
			 * @param operador3
			 *           Valor numerico real.
			 * @return devuelve la suma de tres operadores reales.
			 * 
			 * @exception   Exception
			 *		Los parámetros de entrada deben ser mayor de 0.
			 * 
			 * @see Suma
			 */
			public double sumar(double operador1,double operador2,double operador3) throws Exception {
				
				double valor;
				this.operador3=operador1;
				this.operador4=operador2;
				this.operador5=operador3;
				
				//Validamos el valor para disparar la excepción.
				if (operador1 <= 0) {
		              throw new Exception("El operador1 debe ser mayor de 0");                                             
		          }
				if (operador2 <= 0) {
		              throw new Exception("El operador2 debe ser mayor de 0");                                             
		          }
				if (operador3 <= 0) {
		              throw new Exception("El operador3 debe ser mayor de 0");                                             
		          }
				
				valor=this.operador3+this.operador4 +this.operador5 ;
				//acumuladorsumareal , almacena el valor calculado por el método para luego se pueda incrementar por el método sumar por un parámetro como entrada.
				acumuladorsumareal=acumuladorsumareal+valor;
				//Devolvemos el valor para el método.
				return valor;
			}

			
			/**
			 * Método sumar con valor acumalado de tipo entero.
			 * Usamos el valor almacenado mediante el mÃ©todo sumar para incrementar el valor con el parÃ¡metro introducido.
			 * acumuladorsuma +operador1
			 * @param operador1
			 *            Valor numerico entero.
			 * @return devuelve la suma del acumulado mÃ¡s el nÃºmero entero.  
			 * 
			 * @exception Exception  
			 *		Los parÃ¡metros de entrada deben ser mayor de 0.
			 * 
			 * @see Suma
			 */
			public int sumar(int operador1) throws Exception {
				int valor;
				
				//Validamos el valor para disparar la excepciÃ³n.
				if (operador1 <= 0) {
		              throw new Exception("El operador1 debe ser mayor de 0");                                             
		          }
				valor=acumuladorsuma+operador1 ;
				//acumuladorsuma , almacena el valor calculado por el mÃ©todo para luego se pueda incrementar por el mÃ©todo sumar por un parÃ¡metro como entrada.
				acumuladorsuma=acumuladorsuma+valor;
				//Devolvemos el valor para el mÃ©todo.
				return valor;

			}
			
			
			/**
			 * Método sumar con valor acumalado de tipo real.
			 * Usamos el valor almacenado mediante el mÃ©todo sumar para incrementar el valor con el parÃ¡metro introducido.
			 * 
			 * acumuladorsumareal +operador1
			 * @param operador1
			 *            Valor numerico real.
			 * @return devuelve la suma del acumulado mÃ¡s el nÃºmero real.	   
			 * 
			 * @exception Exception  
			 *		Los parÃ¡metros de entrada deben ser mayor de 0.
			 * 
			 * @see Suma
			 */
			public double sumar(double operador1)  throws Exception{
				
				double valor;
				
				//Validamos el valor para disparar la excepciÃ³n.
				if (operador1 <= 0) {
		              throw new Exception("El operador1 debe ser mayor de 0");                                             
		          }
				valor=acumuladorsumareal+operador1;
				//acumuladorsumareal , almacena el valor calculado por el mÃ©todo para luego se pueda incrementar por el mÃ©todo sumar por un parÃ¡metro como entrada.
				acumuladorsumareal=acumuladorsumareal+valor;
				//Devolvemos el valor para el mÃ©todo.
				return valor;
			}
	
	
}
