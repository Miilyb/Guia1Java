/*25-El consultorio del Dr. Homero Simpson tiene como política cobrar la consulta con base en el
número de cita, de la siguiente forma: las tres primeras citas a $200.000 c/u; las siguientes dos
citas a $150.000 c/u; las tres siguientes citas a $100.000 c/u y las restantes a $50.000 c/u,
mientras dure el tratamiento.
Escriba un programa que permita determinar cuánto pagará un paciente por una cita y
cuánto pagará un paciente por el total de su tratamiento, dado un número de citas. */

package com.ejercicioveinticincoguiauno.ejercicioveinticincoguia1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.util.ArrayList;



@SpringBootApplication
public class Ejercicioveinticincoguia1Application {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in); 
		
		System.out.println("Numero de consultas");
		int numCita = teclado.nextInt();
		System.out.println("¿que numero de consulta desea saber");
		int numConsulta = teclado.nextInt();
		
		
		ArrayList <Integer> valoresCita = new ArrayList<Integer>(); 
		
		for (int i = 1; i <= numCita; i++){
			if (i <= 3){
				valoresCita.add(200000);
			}else if (i <= 5){
				valoresCita.add(150000);
			}else if (i <= 8){
				valoresCita.add(100000);
			}else{
				valoresCita.add(50000);
			}
		}
		int totalTratamiento = 0;
		for (int i = 0 ; i < valoresCita.size() ; i++){
			totalTratamiento += valoresCita.get(i);
		}
		System.out.println("La cita consultado es igual a "+valoresCita.get(numConsulta-1));
		System.out.println("El costo total del tratamiento es "+totalTratamiento);
	}
}