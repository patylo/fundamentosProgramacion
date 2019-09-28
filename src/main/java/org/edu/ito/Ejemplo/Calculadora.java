package org.edu.ito.Ejemplo;
/*
 * clase para sumar, restar, multiplicar, dividir
 */
public class Calculadora {
	//variable para guardar resultado 
	private int resultado;
	
	
	/*metodo para sumar dos numeros 
	 * @param a b 
	 * @return resultado
	 * 
	 * 
	 */
	public int suma(int a, int b) {
		resultado = a + b;
		return resultado;
	}
	
	
	/*metodo para restar dos numeros 
	 * @param a b 
	 * @return resultado
	 * 
	 * 
	 */
	public int resta(int a, int b) {
		resultado = a - b;
		return resultado;
	}
	
	
	/*metodo para multiplicar dos numeros 
	 * @param a b 
	 * @return resultado
	 * 
	 * 
	 */
	public int multiplicacion(int a, int b) {
		resultado = a * b;
		return resultado;
	}
	
	
	/*metodo para dividir dos numeros 
	 * @param a b 
	 * @return resultado
	 * 
	 * 
	 */
	public int divicion(int a, int b) {
		resultado = a / b;
		return resultado;
	}
}
