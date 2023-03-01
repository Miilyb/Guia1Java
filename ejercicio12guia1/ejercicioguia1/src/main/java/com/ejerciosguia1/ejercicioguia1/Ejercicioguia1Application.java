/*12 - Escriba un programa que imprima en pantalla si un número dado por teclado es positivo,
negativo o cero. */

package com.ejerciosguia1.ejercicioguia1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Ejercicioguia1Application {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese un numero: ");
		int numeroIngresado = teclado.nextInt();

       if( numeroIngresado >= 1 ){ 
		System.out.println("El numero ingresado es positivo");

	   } else if ( numeroIngresado < 0){
		System.out.println("El numero ingresado es negativo");

	   } else {
		System.out.println("El numero ingresado es cero");

	   }

		
	}

}
