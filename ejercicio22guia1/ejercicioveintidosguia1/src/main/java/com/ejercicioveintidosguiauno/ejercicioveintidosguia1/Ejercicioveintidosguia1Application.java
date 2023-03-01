/* 22 - Escriba un programa que calcule la potencia entera positiva de un número dado por teclado. */

package com.ejercicioveintidosguiauno.ejercicioveintidosguia1;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicioveintidosguia1Application {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingresa la base del numero: ");
        int base = teclado.nextInt();

		System.out.println("Ingresa potencia: ");
        int potencia = teclado.nextInt();
		
		int resultado = base;
		for (int i = 1 ; i<potencia ; i++){
			resultado = resultado*base;
		}
		System.out.println(resultado);
	}

}
