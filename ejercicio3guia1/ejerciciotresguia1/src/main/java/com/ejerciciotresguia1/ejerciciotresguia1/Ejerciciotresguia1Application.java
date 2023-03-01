/* 3 - Escriba un programa que, dada una cantidad de dinero en pesos chilenos ingresada por
teclado, calcule la cantidad de dólares que se pueden comprar. */


package com.ejerciciotresguia1.ejerciciotresguia1;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Ejerciciotresguia1Application {

	public static void main(String[] args) {
    
		Scanner teclado = new Scanner (System.in);
		System.out.print("¿Cuanto dinero en CLP tiene para cambiar?");
		Double dinero = teclado.nextDouble();
        Double conversion = dinero / 833.64;
        System.out.println("Con esa cantidad de dinero " + dinero + " CLP" + " le alcanza para:" + conversion + " USD");

	}

}
