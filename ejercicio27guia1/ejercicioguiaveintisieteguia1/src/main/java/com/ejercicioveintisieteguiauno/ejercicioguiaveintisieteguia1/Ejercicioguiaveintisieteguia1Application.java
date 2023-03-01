/*27 -El dueño de un estacionamiento le pide que escriba un programa que le permita determinar
cuánto debe cobrar por el uso del estacionamiento a sus clientes. Las tarifas que se tienen son
las siguientes: las dos primeras horas a $500 c/u; las siguientes tres a $400 c/u; las cinco
siguientes a $300 c/u y después de diez horas el costo por cada una es de $200. */


package com.ejercicioveintisieteguiauno.ejercicioguiaveintisieteguia1;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicioguiaveintisieteguia1Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		System.out.println("¿Cuántas horas estubo en el estacionamiento?");
		int horas = teclado.nextInt();

		int costo = 0;
		for (int i = 0 ; i < horas ; i++){
			if (i < 2){
				costo = costo + 500;
			}else if (i > 2 && i <= 5){
				costo = costo + 400;
			}else if (i > 5 && i <= 10){
				costo = costo + 300;
			}else {
				costo = costo + 200;
			}
		}
		System.out.println("El costo por estacionamiento es de: "+costo); 

	}

}
