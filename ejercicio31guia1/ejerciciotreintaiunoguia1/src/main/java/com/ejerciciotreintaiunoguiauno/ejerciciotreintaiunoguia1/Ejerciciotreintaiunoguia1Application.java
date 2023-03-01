/*31-Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó $10.000, el
segundo $20.000, el tercero $40.000 y así sucesivamente. Realice un algoritmo para determinar
cuánto debe pagar mensualmente y el total de lo que pagó después de los 20 meses. */

package com.ejerciciotreintaiunoguiauno.ejerciciotreintaiunoguia1;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejerciciotreintaiunoguia1Application {

	public static void main(String[] args) {
		
	int meses = 20;
	int totalPago = 0;
	int contador = 1;

	for (int i = 1; i <= meses ; i++){
		if (contador == 1){
			totalPago = totalPago + 10000;	
		}else if (contador == 2){
			totalPago = totalPago + 20000;	

		}else if (contador == 3){
			totalPago = totalPago + 40000;	
		}	
		contador = contador + 1;
		if (i%3 == 0){
			contador = 1;
		} 
	}
	System.out.println("el total a pagar es "+totalPago);
	}

}
