package correcao;

import java.util.Random;

import javax.swing.JOptionPane;

public class Resposta05 {
	public static void main(String[] args) {
		
		int jogador;
		int computador;
		
		// Exibe mensagem de boas vindas ao jogador
		JOptionPane.showMessageDialog(null, "Bem vindo ao Jokenp� Senac!");
		// Resgata a resposta do jogador
		jogador = Integer.parseInt(JOptionPane.showInputDialog("Ecolha entre:\nPedra (0)\nPapel (1)\nTesoura (2)"));
		// Gera o valor random do computador
		computador = randInt(0, 2);
		
		JOptionPane.showMessageDialog(null, "Jogador: " + jogador + "\nComputador: " + computador, "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
		/*if(jogador == 0) {
			if(computador == 0)
				JOptionPane.showMessageDialog(null, "Empate", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
			if(computador == 1)
				JOptionPane.showMessageDialog(null, "Computador ganhou", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
			if(computador == 2)
				JOptionPane.showMessageDialog(null, "Jogador ganhou", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
			
		} else if(jogador == 1) {
			if(computador == 0)
			JOptionPane.showMessageDialog(null, "Jogador ganhou", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
			if(computador == 1)
				JOptionPane.showMessageDialog(null, "Empate", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
			if(computador == 2)
				JOptionPane.showMessageDialog(null, "Computador ganhou", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);		
			
		} else if(jogador == 2) {
			if(computador == 0)
				JOptionPane.showMessageDialog(null, "Computador ganhou", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
			if(computador == 1)
				JOptionPane.showMessageDialog(null, "Jogador ganhou", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);			
			if(computador == 2)
				JOptionPane.showMessageDialog(null, "Empate", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Op��o invalida", "Jokenp�", JOptionPane.WARNING_MESSAGE);
		}*/
		
		switch (jogador) {
			case 0:
				switch (computador) {
					case 0:
						JOptionPane.showMessageDialog(null, "Empate", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 1:
						JOptionPane.showMessageDialog(null, "Computador ganhou", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Jogador ganhou", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
						break;
				}
				break;
				
			case 1:
				switch (computador) {
				case 0:
					JOptionPane.showMessageDialog(null, "Jogador ganhou", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "Empate", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Computador ganhou", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
					break;
			}
				break;
			
			case 2:
				switch (computador) {
				case 0:
					JOptionPane.showMessageDialog(null, "Computador ganhou", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "Jogador ganhou", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Empate", "Jokenp�", JOptionPane.INFORMATION_MESSAGE);
					break;
			}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o invalida", "Jokenp�", JOptionPane.WARNING_MESSAGE);
				break;
		}
		
	}

	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
}
