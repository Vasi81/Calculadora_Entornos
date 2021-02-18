package com.entornos.calculadora;

/**
 * Clase para sumar entre uno y tres operandos.
 * Los operadores pueden ser n�meros enteros o n�meros reales
 * @author Jos� Ignacio Guti�rrez
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
	* Variable para almacenar el resultado de las sumas de n�meros enteros.
	* @see Suma
	*/
	//Para los acumuladores definimos dos variables , uno de tipo entero y otro de tipo real.
	public static int acumuladorsuma=0;
	
	/**
	* Variable para almacenar el resultado de las sumas de n�meros reales.
	* @see Suma
	*/
	public static double acumuladorsumareal=0;
	
	
	//Constructores
	
			/**
			 * Constructor Suma.
			 * Crea el constructor para sumar dos n�meros enteros , 
			 * sumar dos n�meros reales ,
			 * sumar tres n�meross reales.
			 * @see Suma
			 */
	
			public Suma() {
				this.operador1 = 0;
				this.operador2 = 0;
				this.operador3 = 0;
				this.operador4 = 0;
				this.operador5 = 0;
	
			}
			
				
			// M�todos
			/**
			 * M�todo sumar con dos operadores enteros.
			 * Almacenamos el valor calculado por el m�todo sumar para luego incrementar por el "m�todo sumar por un par�metro como entrada".
			 * 
			 * operador1 + operador2
			 * @param operador1
			 *            Valor numerico entero.
			 * @param operador2
			 *           Valor numerico entero.
			 * @return devuelve la suma de dos operadores enteros.
			 * 
			 * @exception   Exception
			 *		Los par�metros de entrada deben ser mayor de 0.
			 * 
			 * @see Suma
			 */
			
			public int sumar(int operador1,int operador2) throws Exception {
				int valor;
				this.operador1=operador1;
				this.operador2=operador2;
				
				//Validamos el valor para disparar la excepci�n.
				if (operador1 <= 0) {
		              throw new Exception("El operador1 debe ser mayor de 0");                                             
		          }
				if (operador2 <= 0) {
		              throw new Exception("El operador2 debe ser mayor de 0");                                             
		          }
				
				
				valor=this.operador1+this.operador2;
				
				//acumuladorsuma , almacena el valor calculado por el m�todo para luego se pueda incrementar por el m�todo sumar por un par�metro como entrada.
				acumuladorsuma=acumuladorsuma+valor;
				//Devolvemos el valor para el m�todo.
				return valor;

			}
			
			
			/**
			 * M�todo sumar con dos operadores reales.
			 * Almacenamos el valor calculado por el método sumar para luego incrementar por el "método sumar por un parámetro como entrada".
			 * 
			 * operador1 + operador2 +operador3
			 * @param operador1
			 *            Valor numerico real.
			 * @param operador2
			 *           Valor numerico real.
			 * @return devuelve la suma de dos operadores reales.
			 * 
			 * @exception   Exception
			 *		Los parámetros de entrada deben ser mayor de 0.
			 * 
			 * @see Suma
			 */
			public double sumar(double operador1,double operador2) throws Exception {
				
				double valor;
				this.operador3=operador1;
				this.operador4=operador2;
				
				
				//Validamos el valor para disparar la excepci�n.
				if (operador1 <= 0) {
		              throw new Exception("El operador1 debe ser mayor de 0");                                             
		          }
				if (operador2 <= 0) {
		              throw new Exception("El operador2 debe ser mayor de 0");                                             
		          }
				
				valor=this.operador3+this.operador4 ;
				
				//acumuladorsumareal , almacena el valor calculado por el m�todo para luego se pueda incrementar por el m�todo sumar por un par�metro como entrada.
				acumuladorsumareal=acumuladorsumareal+valor;
				//Devolvemos el valor para el método.
				return valor;
			}
			
			
			
			/**
			 * M�todo sumar con tres operadores reales.
			 * Almacenamos el valor calculado por el m�todo sumar para luego incrementar por el "m�todo sumar por un par�metro como entrada".
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
			 *		Los par�metros de entrada deben ser mayor de 0.
			 * 
			 * @see Suma
			 */
			public double sumar(double operador1,double operador2,double operador3) throws Exception {
				
				double valor;
				this.operador3=operador1;
				this.operador4=operador2;
				this.operador5=operador3;
				
				//Validamos el valor para disparar la excepci�n.
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
				//acumuladorsumareal , almacena el valor calculado por el m�todo para luego se pueda incrementar por el m�todo sumar por un par�metro como entrada.
				acumuladorsumareal=acumuladorsumareal+valor;
				//Devolvemos el valor para el m�todo.
				return valor;
			}

			
			/**
			 * M�todo sumar con valor acumalado de tipo entero.
			 * Usamos el valor almacenado mediante el método sumar para incrementar el valor con el parámetro introducido.
			 * acumuladorsuma +operador1
			 * @param operador1
			 *            Valor numerico entero.
			 * @return devuelve la suma del acumulado más el número entero.  
			 * 
			 * @exception Exception  
			 *		Los parámetros de entrada deben ser mayor de 0.
			 * 
			 * @see Suma
			 */
			public int sumar(int operador1) throws Exception {
				int valor;
				
				//Validamos el valor para disparar la excepción.
				if (operador1 <= 0) {
		              throw new Exception("El operador1 debe ser mayor de 0");                                             
		          }
				valor=acumuladorsuma+operador1 ;
				//acumuladorsuma , almacena el valor calculado por el método para luego se pueda incrementar por el método sumar por un parámetro como entrada.
				acumuladorsuma=acumuladorsuma+valor;
				//Devolvemos el valor para el método.
				return valor;

			}
			
			
			/**
			 * M�todo sumar con valor acumalado de tipo real.
			 * Usamos el valor almacenado mediante el método sumar para incrementar el valor con el parámetro introducido.
			 * 
			 * acumuladorsumareal +operador1
			 * @param operador1
			 *            Valor numerico real.
			 * @return devuelve la suma del acumulado más el número real.	   
			 * 
			 * @exception Exception  
			 *		Los parámetros de entrada deben ser mayor de 0.
			 * 
			 * @see Suma
			 */
			public double sumar(double operador1)  throws Exception{
				
				double valor;
				
				//Validamos el valor para disparar la excepción.
				if (operador1 <= 0) {
		              throw new Exception("El operador1 debe ser mayor de 0");                                             
		          }
				valor=acumuladorsumareal+operador1;
				//acumuladorsumareal , almacena el valor calculado por el método para luego se pueda incrementar por el método sumar por un parámetro como entrada.
				acumuladorsumareal=acumuladorsumareal+valor;
				//Devolvemos el valor para el método.
				return valor;
			}
	
	
}
