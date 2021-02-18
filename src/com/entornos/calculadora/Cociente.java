package com.entornos.calculadora;

/**
 * Esta clase implementa m�todos relacionados con la operaci�n matem�tica de
 * divisi�n de una calculadora. Tambi�n implementa los m�todos de calculo de
 * raiz cuadrada y n�mero inverso
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
	 * Valor n�merico de tipo entero. El valor representa la soluci�n de la
	 * operaci�n.
	 */
	public int resultado1;

	/**
	 * Valor n�merico de tipo real. El valor representa la soluci�n de la operaci�n.
	 */

	public double resultado2;

	// Constructores

	/**
	 * Metodo constructor sin par�metros. Crea el constructor para dividir 2 n�meros
	 * enteros o 2 n�meros reales. No devuelve ningun valor.
	 */
		public Cociente() {
		this.operador1 = 0;
		this.operador2 = 0;
		this.operador3 = 0;
		this.operador4 = 0;
	}
	

	

	/**
	 * Este metodo realiza la divisi�n de dos n�meros enteros, tiene 2 par�metros de
	 * entrada (dividendo y divisor) y uno de salida que es la soluci�n
	 * 
	 * @param operador1 valor n�merico de tipo entero, representa el dividendo
	 * @param operador2 valor n�merico de tipo entero, representa el divisor
	 * @return Devuelve un valor n�merico de tipo entero.
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
	 * Este m�todo realiza la divisi�n de dos n�meros reales, tiene 2 par�metros de
	 * entrada (dividendo y divisor).
	 * 
	 * @param operador3 valor n�merico de tipo real, representa el dividendo
	 * @param operador4 valor n�merico de tipo real, representa el divisor
	 * @return Devuelve la divisi�n de los 2 n�meros reales.
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
	 * El m�todo inverso calcula el inverso multiplicativo de un n�mero
	 * 
	 * @param operador3 valor n�merico de tipo entero, representa el n�mero cuyo
	 *                  inverso queremos calcular
	 * @return devuelve el inverso del n�mero indicado
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
	 * @param operador1 valor n�merico de tipo entero
	 * @return devuelve la raiz cuadrada del n�mero indicado.
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