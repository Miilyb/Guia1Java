/*21 - Escriba un programa que calcule el factorial de un número. */

package com.ejemploveintiunoguiauno.ejemploveintiunoguia1;
import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejemploveintiunoguia1Application {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un numero");
		int num = teclado.nextInt();
		
		int factorial = 1;
		for (int i = 1 ; i <= num ; i++){
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

}
