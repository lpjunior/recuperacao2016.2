package correcao;

import java.util.Scanner;

public class Resposta04 {
	public static void main(String[] args) {
		
		double saldoMedio;
		try(Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe");
			saldoMedio = scan.nextDouble();
		}
		
		if((saldoMedio >= 201) && (saldoMedio <= 400)){
			System.out.println("O saldo médio é: " + saldoMedio + " Seu valor de crédito é: " + (saldoMedio * 0.2));
		} else if((saldoMedio >= 401) && (saldoMedio <= 600)){
			System.out.println("O saldo médio é: " + saldoMedio + " Seu valor de crédito é: " + (saldoMedio * 0.3));
		} else if(saldoMedio >= 601){
			System.out.println("O saldo médio é: " + saldoMedio + " Seu valor de crédito é: " + (saldoMedio * 0.4));
		}else {
			System.out.println("Nenhum crédito disponível"); 
		}
	}
}
