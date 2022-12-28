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

		String log = "Escolha da Cpu: " + resCpu +"\n" + "Escolha do Jogador: " + resposta;

		JOptionPane.showMessageDialog(null, log);
		

//L�gica do ganhador

		switch(resposta) {

			case "Pedra": {

				if(resCpu.equalsIgnoreCase("Papel")){
					JOptionPane.showMessageDialog(null, "Voc� perdeu!");
				}
				else if(resCpu.equalsIgnoreCase("Pedra")){
					JOptionPane.showMessageDialog(null, "Deu empate!");
				}
				else{
					JOptionPane.showMessageDialog(null, "Parab�ns, voc� ganhou!");
				}
				break;
			}

			case "Papel": {

				if(resCpu.equalsIgnoreCase("Tesoura")){
					JOptionPane.showMessageDialog(null, "Voc� perdeu!");
				}
				else if(resCpu.equalsIgnoreCase("Papel")){
					JOptionPane.showMessageDialog(null, "Deu empate!");
				}
				else{
					JOptionPane.showMessageDialog(null, "Parab�ns, voc� ganhou!");
				}
				break;
			}

			case "Tesoura": {

				if(resCpu.equalsIgnoreCase("Pedra")){
					JOptionPane.showMessageDialog(null, "Voc� perdeu!");
				}
				else if(resCpu.equalsIgnoreCase("Tesoura")){
					JOptionPane.showMessageDialog(null, "Deu empate!");
				}
				else{
					JOptionPane.showMessageDialog(null, "Parab�ns, voc� ganhou!");
				}
				break;
			}

			default: {JOptionPane.showMessageDialog(null, "Isso não está no jogo!");}
		}



		/*if(resposta.equalsIgnoreCase("Pedra") && resCpu.equalsIgnoreCase("Papel")) {
			JOptionPane.showMessageDialog(null, "Voc� perdeu!");
			
		}
		
		
		
		else if(resposta.equalsIgnoreCase("Pedra") && resCpu.equalsIgnoreCase("Tesoura")) {
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
		}*/
	    
		
	}
	
	
}


