package com.entornos.calculadora;

/**
 * Esta clase implementa métodos relacionados con la operación matemática de
 * división de una calculadora. También implementa los métodos de calculo de
 * raiz cuadrada y número inverso
 * 
 * @author Vesselin Stanev
 * @version 1.0
 * @see Cociente
 * @since 22/01/2021
 * 
 */

public class Cociente {

	/**
	 * Valor de tipo entero, representa el operando 1
	 */
	private int operador1;
	/**
	 * Valor de tipo entero, representa el operando 2
	 */
	private int operador2;

	/**
	 * Valor de tipo real, representa el operando 1
	 */

	private double operador3;

	/**
	 * Valor de tipo real, representa el operando 2
	 */
	private double operador4;

	/**
	 * Valor númerico de tipo entero. El valor representa la solución de la
	 * operación.
	 */
	public int resultado1;

	/**
	 * Valor númerico de tipo real. El valor representa la solución de la operación.
	 */

	public double resultado2;

	// Constructores

	/**
	 * Metodo constructor sin parámetros. Crea el constructor para dividir 2 números
	 * enteros o 2 números reales. No devuelve ningun valor.
	 */
		public Cociente() {
		this.operador1 = 0;
		this.operador2 = 0;
		this.operador3 = 0;
		this.operador4 = 0;
	}
	

	public int getOperador1() {
		return operador1;
	}


	public void setOperador1(int operador1) {
		this.operador1 = operador1;
	}


	public int getOperador2() {
		return operador2;
	}


	public void setOperador2(int operador2) {
		this.operador2 = operador2;
	}


	public double getOperador3() {
		return operador3;
	}


	public void setOperador3(double operador3) {
		this.operador3 = operador3;
	}


	public double getOperador4() {
		return operador4;
	}


	public void setOperador4(double operador4) {
		this.operador4 = operador4;
	}


	/**
	 * Este metodo realiza la división de dos números enteros, tiene 2 parámetros de
	 * entrada (dividendo y divisor) y uno de salida que es la solución
	 * 
	 * @param operador1 valor númerico de tipo entero, representa el dividendo
	 * @param operador2 valor númerico de tipo entero, representa el divisor
	 * @return Devuelve un valor númerico de tipo entero.
	 * @exception Exception No se puede dividir entre cero
	 * @exception Exception Los operadores deben ser mayores que cero
	 */

	public int cociente(int operador1, int operador2) throws Exception {
		if (operador2 == 0)
			throw new Exception("No se puede dividir entre cero");

		if (operador1 < 0 || operador2 < 0)
			throw new Exception("Los operadores deben ser mayores que cero");

		else
			this.resultado1 = operador1 / operador2;
		return this.resultado1;

	}

	/**
	 * Este método realiza la división de dos números reales, tiene 2 parámetros de
	 * entrada (dividendo y divisor).
	 * 
	 * @param operador3 valor númerico de tipo real, representa el dividendo
	 * @param operador4 valor númerico de tipo real, representa el divisor
	 * @return Devuelve la división de los 2 números reales.
	 * @exception Exception No se puede dividir entre cero
	 * @exception Exception Los operadores deben ser mayores que cero
	 * 
	 * 
	 */
	public double cociente(double operador3, double operador4) throws Exception {

		if (operador4 == 0)
			throw new Exception("No se puede dividir entre cero");
		if (operador3 < 0 || operador4 < 0)
			throw new Exception("Los operadores deben ser mayores que cero");
		else
			this.resultado2 = operador3 / operador4;
		return this.resultado2;

	}

	/**
	 * El método inverso calcula el inverso multiplicativo de un número
	 * 
	 * @param operador3 valor númerico de tipo entero, representa el número cuyo
	 *                  inverso queremos calcular
	 * @return devuelve el inverso del número indicado
	 * @exception Exception El operador3 debe ser mayor que cero
	 */
	public double inverso(double operador3) throws Exception {
		if (operador3 <= 0)
			throw new Exception("El operador3 debe ser mayor que cero");
		else
			this.resultado2 = 1 / operador3;
		return this.resultado2;

	}

	/**
	 * El metodo raizCuadrada calcula la raiz cuadrada.
	 * 
	 * @param operador1 valor númerico de tipo entero
	 * @return devuelve la raiz cuadrada del número indicado.
	 * @exception Exception El operador1 debe ser mayor que cero
	 */
	public double raizCuadrada(int operador1) throws Exception {
		if (operador1 <= 0)
			throw new Exception("El operador1 debe ser mayor que cero");
		else
			this.resultado2 = Math.sqrt(operador1);
		return this.resultado2;
	}

}