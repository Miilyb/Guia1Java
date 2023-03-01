/*20 - Escriba un programa que permita contar cuántos números múltiplos de 3 hay entre dos
extremos dados por el usuario. */

package com.ejercicioveinteguiauno.ejercicioveinteguia1;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicioveinteguia1Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese numero inicial de comienzo");
		int inicio =teclado.nextInt();

		System.out.println("Ingrese numero final de termino");
		int fin = teclado.nextInt();

 		int contador = 0;

		for (int i = inicio ; i <= fin ; i++){
			if (i % 3 == 0){
				System.out.println(i);
				contador++;	
			}
		}
		System.out.println(contador);
	}

}
