/*4 -Escriba un algoritmo que permita calcular la edad de una persona según su año de
nacimiento. */

package com.ejerciciocuatroguiauno.ejerciciocuatroguia1;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejerciciocuatroguia1Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        System.out.print("¿En que año naciste");
		int anoNacimiento = teclado.nextInt();
		System.out.print("¿Cual es el año actual?");
		int anoActual = teclado.nextInt();
		int edad = anoActual - anoNacimiento;
		System.out.println("Tú tienes: " + edad + " años");

	}

}
