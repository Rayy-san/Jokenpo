package Main;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Jokenpo {
	

	public static void main(String[] args) {
		
		
//Entrada de dados
		String resposta = JOptionPane.showInputDialog("Pedra, Papel ou Tesoura?");
		
		System.out.println("Voc�: " + resposta + "\n");
		
//Jogada da CPU		
		List<String> opcoes = Arrays.asList("Pedra", "Papel", "Tesoura");
		String resCpu = opcoes.get(new Random().nextInt(opcoes.size()));
		System.out.println("CPU: " + resCpu + "\n");
		

//L�gica do ganhador

		
		if(resposta.equalsIgnoreCase("Pedra") && resCpu.equalsIgnoreCase("Papel")) {
			JOptionPane.showMessageDialog(null, "Voc� perdeu!");
			
		} else if(resposta.equalsIgnoreCase("Pedra") && resCpu.equalsIgnoreCase("Tesoura")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� ganhou!");
		}
		else if(resposta.equalsIgnoreCase("Papel") && resCpu.equalsIgnoreCase("Pedra")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� ganhou!");
		}
		else if(resposta.equalsIgnoreCase("Papel") && resCpu.equalsIgnoreCase("Tesoura")) {
			JOptionPane.showMessageDialog(null, "Voc� perdeu!");
		}
		else if(resposta.equalsIgnoreCase("Tesoura") && resCpu.equalsIgnoreCase("Papel")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� ganhou!");
			
		}else if(resposta.equalsIgnoreCase("Tesoura") && resCpu.equalsIgnoreCase("Pedra")) {
			JOptionPane.showMessageDialog(null, "Voc� perdeu!");
			
		}else if(resposta.equalsIgnoreCase(resCpu)) {
			System.out.println("Empate!");
		}
		else {
			System.out.println("Isso n�o t� no jogo!");
		}
	    
		
	}
	
	
}


