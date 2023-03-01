/*7 - Escriba un programa que permita determinar cuánto cobra un pintor por pintar una cantidad
dada de metros cuadrados, a partir del costo ingresado por el usuario. */

package com.ejerciciosieteguia1.ejerciciosieteguia1;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejerciciosieteguia1Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        System.out.println("¿Cuantos metros pinto?");
		int metros = teclado.nextInt();
		System.out.println("¿Cuantos cobra por metro?");
		int valor = teclado.nextInt();

        int total = metros * valor;
		System.out.println("El total que cobra por "+ metros + " metros es de " + valor);

	}

}
