/*14. Escriba un programa que imprima los números del 100 al 1 de dos en dos. */

package com.ejerciciocatorceguia1.ejerciciocatorceguia1;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejerciciocatorceguia1Application {

	public static void main(String[] args) {
		
		for (int i  = 100;  i > 1; i-=2) {
			int numeros = i;
			System.out.println("Los numeros son: " + numeros);
			
		}

	}

}
