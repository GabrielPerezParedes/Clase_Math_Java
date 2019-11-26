//Clase Math
package view;

public class Operations {

	public static void main(String[] args) {

		double raiz = Math.sqrt(9);
		//int raiz = (int)Math.sqrt(9); esta es la forma de hacer que una raiz puesa ser int
		
		System.out.println("La raiz es:" +raiz);

/*
 * 
 */
		double base = 5, exponente = 2;
		double resultado = Math.pow(base, exponente);
		 
		System.out.println("La elevacion es:" +resultado);
		
/*
 * 		
 */
		
		
		double numero = 4.56;
		double result = Math.round(numero);
		
		System.out.println("El redondeo es:" +result );
		
/*
 * 		
 */
		
		double num = Math.random();  
		
		System.out.println("El numero random es:" +num);



	}

}
