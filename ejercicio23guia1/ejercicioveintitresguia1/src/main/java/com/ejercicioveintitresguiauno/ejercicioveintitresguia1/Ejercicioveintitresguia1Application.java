/* 23- Escriba un programa que determine si un número dado por teclado es o no primo.*/

package com.ejercicioveintitresguiauno.ejercicioveintitresguia1;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Ejercicioveintitresguia1Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese un numero");
		int num = teclado.nextInt();
		
		Boolean primo = false;
		if (num <= 1){
			primo = false;
		}
		for (int i = 2 ; i < num ; i++){
			if (num%i==0 && num!=i){
				primo = false;
				break;
			}else{
				primo = true;
			}
		}
		if (primo){
			System.out.println("El número es primo.");
		}else{
			System.out.println("El número no es primo.");
		
	}

}
}
