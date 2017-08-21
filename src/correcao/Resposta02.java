package correcao;

import java.util.Scanner;

public class Resposta02 {
	public static String verificaTriangulo(double ladoA, double ladoB, double ladoC) {
		if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
			if (ladoA == ladoB && ladoB == ladoC) {
				return "Equilatero";
			} else {
				return "Isosceles";
			}
			// } else if (ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) {
		} else {
			return "Escaleno";
		}
	}

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			System.out.print("Entre com os dados do triangulo separando-os por espaço\nLados: ");
			System.out.println(verificaTriangulo(
					scan.nextDouble(), 
					scan.nextDouble(), 
					scan.nextDouble()));			
		}
	}
}
