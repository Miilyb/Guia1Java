/* 9-Escriba un algoritmo que permita para determinar cuánto pagará finalmente una persona por
un artículo, considerando que tiene un descuento de 20%, y debe pagar 15% de IVA. */
package com.ejercicionueveguia1.ejercicionueveguia1;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class Ejercicionueveguia1Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿valor inicial del producto?");
		int valorArticulo = teclado.nextInt();
		Double valorFinal = (valorArticulo * 0.8) * 1.15;
		System.out.println("El valor con los descuentos mas iVa es de: " + valorFinal);
	}

}
