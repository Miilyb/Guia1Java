/*13. Escriba un programa que lea un número del teclado e imprima en pantalla si es par o impar. */

package com.ejerciciodoceguiauno.ejerciciodoceguia1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Ejerciciodoceguia1Application {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese un numero: ");
		int numeroIngresado = teclado.nextInt();

		if( numeroIngresado % 2 == 0 ){ 
			System.out.println("El numero ingresado es par");
	
		   } else {
			System.out.println("El numero ingresado es impar");
	
		   }

	}

}
