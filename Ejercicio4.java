package Tarea4;

import java.util.Scanner;

public class Ejercicio4 {
		/**
		 * Prev:
		 * Post:
		 */
	public static void main(String[] arg) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe un número");
		int n = entrada.nextInt();
		System.out.println("escribe otro númerooooooooo");
		int x = entrada.nextInt();	
		for (n = n + 1; n < x ; n++) {
		System.out.println("estos son los numeros entre los elegidos= " + n );
		}
	}
}
