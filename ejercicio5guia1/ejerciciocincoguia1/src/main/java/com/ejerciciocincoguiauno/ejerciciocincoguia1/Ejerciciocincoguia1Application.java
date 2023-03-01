/*5 Escriba un programa que solicite al usuario 4 notas y calcule su promedio. */
package com.ejerciciocincoguiauno.ejerciciocincoguia1;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class Ejerciciocincoguia1Application {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese nota 1: ");
		Double nota1 = teclado.nextDouble();

		System.out.print("Ingrese nota 2: ");
		Double nota2 = teclado.nextDouble();

		System.out.print("Ingrese nota 3: ");
		Double nota3 = teclado.nextDouble();

		System.out.print("Ingrese nota 4: ");
		Double nota4 = teclado.nextDouble();
		
		Double promedio = (nota1 + nota2 + nota3+ nota4) / 4.0; 
		System.out.println("El promedio de las cuatro notas es de: " + promedio );
		}
		
	}


