package correcao;

import java.util.Scanner;

public class Resposta01 {
	public static void main(String[] args) {

		String nomeVelha = "";
		String nomeNovo = "";
		String auxNome;

		int idadeVelha = 0;
		int idadeNovo = 100;
		int auxIdade;

		int cont = 0;

		try (Scanner scan = new Scanner(System.in)) {
			do {
				System.out.print("Informe o nome: ");
				auxNome = scan.nextLine();
				System.out.print("Informe a idade");
				auxIdade = Integer.parseInt(scan.nextLine());

				if (idadeNovo > auxIdade) {
					idadeNovo = auxIdade;
					nomeNovo = auxNome;
				} else if (idadeVelha < auxIdade) {
					idadeVelha = auxIdade;
					nomeVelha = auxNome;
				}

				cont++;
			} while (cont < 3);

			System.out.println("O nome da pessoa mais velha é: " + nomeVelha);
			System.out.println("O nome da pessoa mais nova é: " + nomeNovo);
		}
	}
}
