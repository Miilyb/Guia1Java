/* 8 -Escriba un programa que permita determinar el costo que tendrá el realizar una llamada
telefónica en base al tiempo que dura la llamada y su costo por segundo. */
package com.ejercicioochoguiauno.ejercicioochoguia1;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Ejercicioochoguia1Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		System.out.println("¿Cuantos minutos hablo?");
		int minutos = teclado.nextInt();
		System.out.println("Digame el costo por segundo");
		int valorSegundos = teclado.nextInt();

		int conversion = minutos * 60;
		int valorTotal = conversion * valorSegundos;
		System.out.println("el costo de esa llamda es de: " + valorTotal);
	}

}
