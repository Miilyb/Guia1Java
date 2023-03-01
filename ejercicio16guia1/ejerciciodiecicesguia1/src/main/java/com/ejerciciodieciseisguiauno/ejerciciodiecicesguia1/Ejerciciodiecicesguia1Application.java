/*16 -Escriba un programa que imprima la suma de los 100 primeros números naturales. */

package com.ejerciciodieciseisguiauno.ejerciciodiecicesguia1;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejerciciodiecicesguia1Application {

	public static void main(String[] args) {
		int suma = 0;
        for(int i = 1; i <= 100; i++){
            suma = suma + i;
        }
        System.out.println(suma);
    }
}
	
