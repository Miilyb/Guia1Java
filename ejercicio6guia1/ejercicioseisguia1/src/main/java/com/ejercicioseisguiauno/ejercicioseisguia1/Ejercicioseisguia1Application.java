/* 6- Escriba un programa que permita conocer el sueldo semanal de un trabajador en base a las
horas que trabaja y el valor por hora ($H/H) que recibe. */

package com.ejercicioseisguiauno.ejercicioseisguia1;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Ejercicioseisguia1Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        System.out.println("¿Cuantas horas trabajo?");
		int horas = teclado.nextInt();
		System.out.println("¿Valor de su hora trabajada?");
		int valor = teclado.nextInt();
           
		int sueldosemanal = horas * valor;
		System.out.println("El sueldo segun las horas trabajadas es de: " + sueldosemanal);


	}

}
