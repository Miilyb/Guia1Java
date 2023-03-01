/*15 - Escriba un programa que imprima todos los números pares entre 0 y 100. */
package com.ejericicoquinceguiauno.ejercicioquinceguia1;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
@SpringBootApplication
public class Ejercicioquinceguia1Application {

	public static void main(String[] args) {
		
        Scanner teclado = new Scanner(System.in);

        int opcion;
		int numero = 0;

        do{

         System.out.println("Pulse 1 para imprimir los números pares o" + " pulse 2 para imprimir los números impares: ");

            opcion = teclado.nextInt();

            if(opcion == 1){

                while(numero <= 100){

                    if(numero % 2 == 0){

                    System.out.println(numero);

                    }

                    numero++;

                }

            }

            if(opcion == 2){

                while(numero <= 100){

                    if(numero % 2 != 0) {

                    System.out.println(numero);

                    }

                    numero++;

                }

            }

        }while(opcion != 1 && opcion != 2);

    }


}





