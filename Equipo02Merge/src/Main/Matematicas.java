package Main;

import java.util.Scanner;


public class Matematicas {

	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}
	
	public static boolean esDivisiblePorTres(int numero) {
		return numero % 3 == 0;
	}

	public static boolean esDivisiblePorCinco(int numero) {
        return numero % 5 == 0;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Proyecto del equipo 2");
		Scanner scanner = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Menu de opciones:");
			System.out.println("1.-Verificar si un numero es par:");
			System.out.println("2.-Verificar si es divisble entre tres :");
			System.out.println("3.-Verificar si es divisible entre cinco :");
			System.out.println("4.- Salir");
			System.out.println("Seleccione una opción");
			opcion = scanner.nextInt();
			
			if (opcion >= 1 && opcion <= 3) {
				System.out.print("Ingrese un número:");
				int numero = scanner.nextInt();
				switch (opcion) {
					case 1: System.out.println("¿Es par? " + esPar(numero));
						break;
					case 2: System.out.println("Es divisible por tres?" + esDivisiblePorTres(numero));
						break;
					case 3: System.out.println("Es divisible por Cinco?" + esDivisiblePorCinco(numero));
						break;	
				}
			}
		} while (opcion != 4);
	}
}
