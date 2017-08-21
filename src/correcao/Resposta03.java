package correcao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Resposta03 {
	public static void main(String[] args) {

		Habitante habitante;

		// consideramos a lista como o cartão preenchido
		List<Habitante> habitantes = new ArrayList<Habitante>();

		// loop(repetição) de leitura dos dados dos habitantes
		for (;;) { // define um loop infinito
			habitante = new Habitante();

			try (Scanner scan = new Scanner(System.in)) {
				System.out.print("Informe a idade");
				habitante.setIdade(Integer.parseInt(scan.nextLine()));

				// condição de parada
				if (habitante.getIdade() == -1) {
					break;
				}
				
				System.out.print("Informe o sexo: ");
				habitante.setSexo(scan.nextLine());
				System.out.print("Informe a cor do cabelo");
				habitante.setCorCabelo(scan.nextLine());
				System.out.print("Informe a cor dos olhos");
				habitante.setCorOlhos(scan.nextLine());
			}


			habitantes.add(habitante);
		}
		
		System.out.println("Habitante com maior idade: " + verificaIdade(habitantes));
		System.out.println("Porcentagem de mulheres: " + sexoFeminino(habitantes));
	}
	
	public static int verificaIdade(List<Habitante> habitantes) {
		int idade = 0;
		for(int i = 0; i < habitantes.size() -1; i++) {
			for(int j = i; j < habitantes.size(); j++) {
				if(habitantes.get(i).getIdade() < habitantes.get(j).getIdade()) {
					idade = habitantes.get(j).getIdade();
				} else {
					idade = habitantes.get(j).getIdade();
				}
			}
		}
		return idade;
	}

	public static double sexoFeminino(List<Habitante> habitantes) {
		int cont = 0;
		
		for(Habitante habitante : habitantes) { // foreach
			if(habitante.getSexo().equals("feminino")) {
				if(habitante.getIdade() >= 18 && habitante.getIdade() <= 35) {
					if(habitante.getCorOlhos().equals("verde") && habitante.getCorCabelo().equals("loiros")) {
						cont++;
					}
				}
			}
		}
		return (double) cont/habitantes.size();
	}
}
