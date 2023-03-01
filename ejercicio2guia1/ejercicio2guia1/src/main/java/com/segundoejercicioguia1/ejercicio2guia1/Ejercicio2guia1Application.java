/* 2 Escriba un programa que permita calcular el área de un rectángulo. ¿Cómo modificaría su
programa para que ahora calcule el área de un cuadrado de igual medida al ancho del
rectángulo anterior? */

package com.segundoejercicioguia1.ejercicio2guia1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Ejercicio2guia1Application {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int opcion = 1;
		Double ancho;
		Double alto;
		while (opcion != 0){
      do{
          System.out.println("¿Que quieres saber?");
   		 System.out.println("Selecciona 1 si quieres saber el area de un cuadrado");
 		 System.out.println("Selecciona 2 si quieres saber el area de un rectangulo");
 		 System.out.println("Seleccione 0 para no hacer nada");
 		 System.out.println("Seleccione su opcion");
 		 opcion = teclado.nextInt();
	  }while (opcion < 0 || opcion > 2);

	  if (opcion == 1) {
		System.out.print("Ingrese ancho: ");
		ancho = teclado.nextDouble();
        Double areaCuadrado = ancho * ancho;
		System.out.println("El area del cuadrado es: " + areaCuadrado);

	  } else if (opcion ==2) {
		System.out.print("Ingrese ancho: ");
		ancho = teclado.nextDouble();
		System.out.print("Ingrese alto: ");
		alto = teclado.nextDouble();
		Double areaRectangulo = ancho * alto;
		System.out.println("El area del cuadrado es: " + areaRectangulo);

	  } else {
		System.out.println("Gracias! vuelva pronto ");
	  }

     }

	}

}
