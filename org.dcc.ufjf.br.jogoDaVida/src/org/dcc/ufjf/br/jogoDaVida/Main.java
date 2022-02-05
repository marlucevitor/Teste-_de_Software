//package org.dcc.ufjf.br.jogoDaVida;
//
//import javax.swing.JOptionPane;
//
//public class Main {
//
//	public static void main(String[] args) {
//		
//		final int LENGTH = 6; 
//		Functions f = new Functions();
//		
//		boolean board[][] = f.createBoard();
//		boolean oldBoard[][] = new boolean [LENGTH][LENGTH]; 
//		f.copy(board, oldBoard);
//		
//		char option = 'n';
//
//		do {
//			String choice = JOptionPane.showInputDialog("Pressione 'n' para criar a nova geração ou 's' para sair !");
//			option = choice.charAt(0);
//			
//			if(option == 'n'){
//	            board = f.updateBoard(oldBoard);
//	            f.printBoard("Tabuleiro Antigo", oldBoard);
//	            f.printBoard("Tabuleiro Novo", board);
//	            	            
//	            f.copy(board, oldBoard);
//			}
//		}
//		while(option == 'n');
//		
//	}
//}