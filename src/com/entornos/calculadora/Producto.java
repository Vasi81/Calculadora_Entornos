package com.entornos.calculadora;


/**
 * Esta será la clase que utilizaremos para devolver el producto.
 * @author Daniel Pavónm Gómez
 * @version 1.0
 * @see Producto
 * @since 24/01/2021
 */
/**
 * 
 * @author Daniel Pavón Gómez
 * @version 1.0
 * @since 25/01/2021
 * 
 *
 */
public class Producto {
	
	
	/**
	 * Este método calculará el producto de dos números enteros dados.
	 * 
	 * @param operador1 Será el primer operador entero que utilizaremos en la operación.
	 * @param operador2 Será el segundo operador entero que utilizaremos en la operación.
	 * @return Devolverá el valor de la operación de dos números enteros realizada.
	 */
	public int metProductoEntero(int operador1, int operador2) {
		
		return operador1*operador2;
		
	}
	/**
	 * Este método calculará el producto de dos números reales dados.
	 * @param operador3 Será el primer operador real que utilizaremos en la operación.
	 * @param operador4 Será el segundo operador real que utilizaremos en la operación.
	 * @return Devolverá el valor de la operación de dos números reales realizada.
	 */
	public double metProductoReal(double operador3, double operador4) {
		
		return operador3*operador4;
		
	}
	/**
	 * 
	 * @param operador3 Será el primer operador real que utilizaremos en la operación.
	 * @param operador4 Será el segundo operador real que utilizaremos en la operación.
	 * @param operador5 Será el tercer operador real que utilizaremos en la operación.
	 * @return Devolverá el valor de la operacion de tres números reales realizada.
	 */
	public double metProductoReal3(double operador3, double operador4, double operador5) {
		return operador3*operador4*operador5;
	}
	
	/**
	 * Este método calculará el valor de una potencia.
	 * @param operador1 Será la base de la potencia que queremos calcular.
	 * @param operador2 Será el exponente al que queremos elevar la base.
	 * @return Devolverá el valor de la potencia calculada.
	 */
	/*public double metProductoPotencia(int operador1, int operador2) {
		return Math.pow(operador1, operador2);
	}*/
	
	public double metProductoPotencia(int operador1, int operador2) throws Exception {
		if (operador2 >= 15) {
			throw new Exception("El exponente es muy grande");   
		}
		return Math.pow(operador1, operador2);
	}


	
}
