/*24 - Escriba un programa que solicite al usuario por teclado entre 1 y 10 e imprima su tabla de multiplicar. */
package com.ejercicioveinticuatroguiauno.ejercicioveinticuatroguia1;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicioveinticuatroguia1Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int num=0;
		while (num<1 || num>10){
			
			System.out.println("ingrese un numero entre 1 y 10: ");
			 num = teclado.nextInt();
			
			if (num<1 || num>10){
				System.out.println("El número está fuera de rango. Intente de nuevo, por favor.");
			}
		}
		for (int i = 1; i <= 10 ; i++){
			System.out.println(num * i);
	}

}
}
