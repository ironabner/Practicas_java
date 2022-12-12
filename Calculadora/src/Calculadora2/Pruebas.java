package Calculadora2;


public class Pruebas {

	public static void main(String[] args) {
		Calculator calculadora = new Calculator();

		calculadora.performOperation(10.5);
		calculadora.performOperation("+");
		calculadora.performOperation(5.2);
		calculadora.performOperation("*");
		calculadora.performOperation(10);
		calculadora.performOperation("=");		
		calculadora.getResults();

	}

}