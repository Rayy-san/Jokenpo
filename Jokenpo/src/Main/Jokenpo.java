package Main;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Jokenpo {
	

	public static void main(String[] args) {
		
		
//Entrada de dados
		String resposta = JOptionPane.showInputDialog("Pedra, Papel ou Tesoura?");
		
		System.out.println("Você: " + resposta + "\n");
		
//Jogada da CPU		
		List<String> opcoes = Arrays.asList("Pedra", "Papel", "Tesoura");
		String resCpu = opcoes.get(new Random().nextInt(opcoes.size()));
		System.out.println("CPU: " + resCpu + "\n");
		

//Lógica do ganhador

		
		if(resposta.equalsIgnoreCase("Pedra") && resCpu.equalsIgnoreCase("Papel")) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			
		} else if(resposta.equalsIgnoreCase("Pedra") && resCpu.equalsIgnoreCase("Tesoura")) {
			JOptionPane.showMessageDialog(null, "Parabéns, você ganhou!");
		}
		else if(resposta.equalsIgnoreCase("Papel") && resCpu.equalsIgnoreCase("Pedra")) {
			JOptionPane.showMessageDialog(null, "Parabéns, você ganhou!");
		}
		else if(resposta.equalsIgnoreCase("Papel") && resCpu.equalsIgnoreCase("Tesoura")) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
		}
		else if(resposta.equalsIgnoreCase("Tesoura") && resCpu.equalsIgnoreCase("Papel")) {
			JOptionPane.showMessageDialog(null, "Parabéns, você ganhou!");
			
		}else if(resposta.equalsIgnoreCase("Tesoura") && resCpu.equalsIgnoreCase("Pedra")) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			
		}else if(resposta.equalsIgnoreCase(resCpu)) {
			System.out.println("Empate!");
		}
		else {
			System.out.println("Isso não tá no jogo!");
		}
	    
		
	}
	
	
}


