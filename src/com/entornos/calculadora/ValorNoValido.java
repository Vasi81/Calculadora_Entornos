package com.entornos.calculadora;
	
	public class ValorNoValido extends Exception {
	private static final long serialVersionUID = 1L;
	int operador1;
	int operador2;
	int resultado1;
	double operador3;
	double operador4;
	double resultado2;

	public ValorNoValido() {
	}

	public ValorNoValido(String cadena) {
		super(cadena);

	}
   

	public int cociente(int operador1, int operador2) throws ValorNoValido {
		if (operador2 == 0)
			throw new ValorNoValido("No se puede dividir entre cero");

		if (operador1 < 0 || operador2 < 0)
			throw new ValorNoValido("Los operadores deben ser mayores que cero");

		else
			this.resultado1 = operador1 / operador2;
		return this.resultado1;
	}

	public double cociente(double operador3, double operador4) throws ValorNoValido {

		if (operador4 == 0)
			throw new ValorNoValido("No se puede dividir entre cero");
		if (operador3 < 0 || operador4 < 0)
			throw new ValorNoValido("Los operadores deben ser mayores que cero");
		else
			this.resultado2 = operador3 / operador4;
		return this.resultado2;

	}

	public double inverso(double operador3) throws ValorNoValido {
		if (operador3 <= 0)
			throw new ValorNoValido("El operador3 debe ser mayor que cero");
		else
			this.resultado2 = 1 / operador3;
		return this.resultado2;

	}

	public int raizCuadrada(int operador1) throws ValorNoValido {
		if (operador1 <= 0)
			throw new ValorNoValido("El operador1 debe ser mayor que cero");
		else
			this.resultado1 = (int) Math.sqrt(operador1);
		return this.resultado1;
	}
	}