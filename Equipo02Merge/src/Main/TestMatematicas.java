package Main;

import java.util.Scanner;

public class TestMatematicas {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Proyecto del equipo 2");
		
		System.out.println("Introduce un número, te diré si es divisible por 3");
		int numero = sc.nextInt();
		System.out.println(Matematicas.esDivisiblePorTres(numero));
	}
}
