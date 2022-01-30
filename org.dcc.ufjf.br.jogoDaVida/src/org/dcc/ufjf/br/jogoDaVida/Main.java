package org.dcc.ufjf.br.jogoDaVida;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Board board = new Board();
		Board oldBoard = new Board(board);
		char option = 'n';

		do {
			String choice = JOptionPane.showInputDialog("Pressione 'n' para criar a nova geração ou 's' para sair !");
			option = choice.charAt(0);
			
			if(option == 'n'){
	            board.updateBoard();
	            oldBoard.print("Tabuleiro Antigo");
	            board.print("Tabuleiro Novo");
			}
		}
		while(option == 'n');
	}

}
