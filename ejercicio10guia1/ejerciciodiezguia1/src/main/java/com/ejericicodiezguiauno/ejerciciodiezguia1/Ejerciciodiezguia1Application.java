/*Escriba un algoritmo que permita determinar cuánto dinero ahorra una persona en un año si
considera que cada semana ahorra 15% de su sueldo. */
package com.ejericicodiezguiauno.ejerciciodiezguia1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class Ejerciciodiezguia1Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		System.out.println("¿Cual es su sueldo");
		int sueldo = teclado.nextInt();

		System.out.println("¿Cuanto porcentaje quiere ahorrar por semana?");
		Double porcentaje = teclado.nextDouble();
        Double transformacion = porcentaje / 100;

		Double valorPorSemana = sueldo/ 4.0;
		Double ahorroPorSemana = valorPorSemana * transformacion;
		Double ahorroAnual = ahorroPorSemana * 48;
		System.out.println("El ahorro anual es de: " + ahorroAnual);

	}

}
