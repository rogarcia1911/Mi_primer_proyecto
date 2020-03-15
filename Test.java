package com.islasfilipinas;

import java.util.Scanner;
import java.lang.Object;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		Alumno alumno1 = new Alumno("Lucia", "Garcia", 20, "685954234", "Luci@gmail.com", "ART001", "0058742A",
				"19/11/1994", 7);

		Alumno alumno2 = new Alumno("Antonio", "Fernandez", 22, "685954244", "Antonio@gmail.com", "ART002", "0058742B",
				"19/11/1394", 10);

		Alumno alumno3 = new Alumno("Antonio", "Fernandez", 22, "685954244", "Antonio@gmail.com", "ART002", "0058742B",
				"19/11/1394", 10);

		// METEMOS LAS NOTAS POR TECLADO
		
		//System.out.println("Introduce la nota del primer alumno");
		//alumno1.setNota(teclado.nextInt());
		//System.out.println("Introduce la nota del segundo alumno");
		//alumno2.setNota(teclado.nextInt());
		//System.out.println("Introduce la nota del tercer alumno");
		//alumno3.setNota(teclado.nextInt());

		// SACAMOS LA INFORMACION DE ALUMNOS
		
		System.out.println(alumno1.toString());
		System.out.println(alumno2.toString());
		System.out.println(alumno3.toString());

		// SACA EL RESULTADO DE LA COMPARACION
		System.out.println("El resultado de la comparación de datos sobre el alumno 2 y el alumno 3 es: ");
		System.out.println(alumno2.equals(alumno3));// TRUE;
	}

}
