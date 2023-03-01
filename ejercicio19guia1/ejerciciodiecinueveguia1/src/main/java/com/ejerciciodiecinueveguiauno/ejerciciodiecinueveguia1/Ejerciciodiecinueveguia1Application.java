/*19 - Escriba un programa que imprima los números del 1 al 100, que calcule la suma de todos los
números pares y la suma de todos los impares. */
package com.ejerciciodiecinueveguiauno.ejerciciodiecinueveguia1;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class Ejerciciodiecinueveguia1Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int sumaPar = 0;
		int sumaImpar = 0;
		for (int i = 1; i<=100 ; i++){
			System.out.println(i);
			if (i % 2 == 0){
				sumaPar += i;
			}else {
				sumaImpar += i;
			}
		}
		System.out.println("La suma de los número pares es "+ sumaPar);
		System.out.println("La suma de los número impares es "+ sumaImpar);

    }


}






