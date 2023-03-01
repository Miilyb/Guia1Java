/*26 - La fábricas “Aplaplac” produce artículos con claves (1, 2, 3, 4, 5 y 6). Escriba un programa que
permita calcular los precios de venta, de acuerdo a las siguientes reglas:
• Costo de producción = materia prima + mano de obra + gastos de fabricación.
• Precio de venta = costo de producción + 45 % de costo de producción.
• El costo de la mano de obra se obtiene de la siguiente forma: para los productos con clave
3 o 4 se carga 75 % del costo de la materia prima; para los que tienen clave 1 y 5 se carga
80 %, y para los que tienen clave 2 o 6, 85 %.
Para calcular el gasto de fabricación se considera que si el artículo que se va a producir tiene
claves 2 o 5, este gasto representa 30 % sobre el costo de la materia prima; si las claves son 3 o
6, representa 35 %; si las claves son 1 o 4, representa 28 %. La materia prima tiene el mismo
costo para cualquier clave. */

package com.ejercicioveintiseisguiauno.ejercicioventiseisguia1;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicioventiseisguia1Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		Double materiaPrima = 0.0;
		Double manoDeObra = 0.0;
		Double gastosFabricacion = 0.0;
		Double costoProduccion = materiaPrima + manoDeObra + gastosFabricacion;
		Double precioVenta = costoProduccion + costoProduccion*0.45;
		Double clave = 0.0;
		
		while (clave<1 || clave>5){
			System.out.println("Ingrese el número de clave del producto (de 1 a 6):");
		     clave = teclado.nextDouble();

			if (clave<1 || clave>5){
				System.out.println("El número está fuera de rango. Intente de nuevo, por favor.");
			}
		}

		System.out.println("Ingrese el valor de la materia prima.");
		materiaPrima = teclado.nextDouble();

		if (clave == 3 || clave == 4){
			manoDeObra = materiaPrima*0.75;
		}else if (clave == 1 || clave == 5){
			manoDeObra = materiaPrima*0.8;
		}else if (clave == 2 || clave == 6){
			manoDeObra= materiaPrima*0.85;
		}
		
		if (clave == 2 || clave == 5){
			gastosFabricacion = materiaPrima*0.3;
		}else if (clave == 3 || clave == 6){
			gastosFabricacion = materiaPrima*0.35;
		}else if (clave == 1 || clave == 4){
			gastosFabricacion = materiaPrima*0.28;
		}

		System.out.println("El precio de venta es " + precioVenta);




	}

}
