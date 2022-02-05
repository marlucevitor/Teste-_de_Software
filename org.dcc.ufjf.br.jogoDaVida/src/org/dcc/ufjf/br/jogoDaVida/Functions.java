package org.dcc.ufjf.br.jogoDaVida;

import java.util.Random;

public class Functions {
	public static final int LENGTH = 6;

	public boolean[][] updateBoard(boolean[][] b) {
		boolean board [][] = new boolean[LENGTH][LENGTH];
		copy(b, board);
		
		for (int row = 0; row < LENGTH; row++) {  
			for (int col = 0; col < LENGTH; col++) {
				//Qualquer célula viva com menos de dois vizinhos vivos morre de solidão.
				if(board[row][col] && numberOfNeighboursAlive(row, col, board) < 2) {
					System.out.println("Célula (" + row + ", " + col + ") morreu pois tem menos de 2 vizinhos vivos.");
					board[row][col] = false;
				}

                //Qualquer célula viva com mais de três vizinhos vivos morre de superpopulação.
                if(board[row][col] && numberOfNeighboursAlive(row, col, board) > 3) {
                	System.out.println("Célula (" + row + ", " + col + ") morreu pois tem mais de 3 vizinhos vivos.");
                	board[row][col] = false;
                }

                //Qualquer célula morta com exatamente três vizinhos vivos se torna uma célula viva.
                if(!board[row][col] && numberOfNeighboursAlive(row, col, board) == 3){
                	System.out.println("Célula (" + row + ", " + col + ") ressucitou pois tem exatamente 3 vizinhos vivos.");
                	board[row][col] = true;
                }
                
                //Qualquer célula com dois vizinhos vivos continua no mesmo estado para a próxima geração.
                if(numberOfNeighboursAlive(row, col, board) == 2){
                	System.out.println("Célula (" + row + ", " + col + ") continuou no mesmo estado pois tem exatamente 2 vizinhos vivos.");
                }
			}
		}
		
		return board;
	}
	
	public void copy(boolean[][] b1, boolean[][] b2){
		for(int i = 0; i < LENGTH; i++){
			for(int j = 0; j < LENGTH; j++){
				b2[i][j] = b1[i][j];
			}
		}
	}
	
	public int numberOfNeighboursAlive(int cellIdxLine, int cellIdxColumn, boolean[][] board) {
		int limitLeft = cellIdxColumn - 1 >= 0? cellIdxColumn - 1 : -1;
        int limitRight = cellIdxColumn + 1 < LENGTH? cellIdxColumn + 1 : -1;
        int limitBottom = cellIdxLine + 1 < LENGTH? cellIdxLine + 1 : -1;
        int limitTop = cellIdxLine - 1 >= 0? cellIdxLine - 1 : -1;
        
        int numberOfNeighboursAlive = 0;
        
        for (int row = 0; row < LENGTH; row++) {  
			for (int col = 0; col < LENGTH; col++) {
				
				if(row == cellIdxLine && col == cellIdxColumn)
                    continue;
				
				//Celula de quina
                if(limitLeft == -1 && limitTop == -1){
                    if((row <= limitBottom) && (col <= limitRight)){
                        //System.out.println(row, col);
                        if(board[row][col])
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }
                
                if(limitRight == -1 && limitTop == -1){
                    if((row <= limitBottom) && (col >= limitLeft)){
                        //System.out.println(row, col);
                        if(board[row][col])
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }
                
                if(limitLeft == -1  && limitBottom == -1){
                    if((row >= limitTop) && (col <= limitRight )){
                    	//System.out.println(row, col);
                    	if(board[row][col])
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }

                if(limitRight == -1 && limitBottom == -1){
                    if((row >= limitTop) && (col >= limitLeft)){
                    	//System.out.println(row, col);
                    	if(board[row][col])
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }
                
                //Celula de lado
                if(limitLeft == -1){
                    if((row <= limitBottom && row >= limitTop) && (col <= limitRight)){
                    	//System.out.println(row, col);
                    	if(board[row][col])
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }

                if(limitRight == -1){
                    if((row <= limitBottom && row >= limitTop) && (col >= limitLeft)){
                    	//System.out.println(row, col);
                    	if(board[row][col])
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }

                if(limitBottom == -1){
                    if((row >= limitTop) && (col >= limitLeft && col <= limitRight )){
                    	//System.out.println(row, col);
                    	if(board[row][col])
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }

                if(limitTop == -1){
                    if((row <= limitBottom) && (col >= limitLeft && col <= limitRight )){
                    	//System.out.println(row, col);
                    	if(board[row][col])
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }
                
                //Celula central
                if((row <= limitBottom && row >= limitTop) && (col >= limitLeft && col <= limitRight )){
                	if(board[row][col])
                        numberOfNeighboursAlive ++;
                }
			}
        }
		
		return numberOfNeighboursAlive;
	}

//	public boolean[][] createBoard() {
//		boolean board[][] = new boolean[LENGTH][LENGTH];
//		Random rd = new Random();
//		for (int i = 0; i < LENGTH; i++){
//			for(int j = 0; j < LENGTH; j++){
//				board[i][j] = rd.nextBoolean();
//			}
//		}
//		return board;
//	}
//	
//	public void printBoard(String s, boolean[][] board) {
//		System.out.println(s);
//		for (int row = 0; row < LENGTH; row++) { 
//			System.out.print("{");
//			for (int col = 0; col < LENGTH; col++) { 
//				//System.out.print((board[row][col]? 1 : 0) + " ");
//				System.out.print(board[row][col] + (col == 5? "}," : ", ")); 
//			}  
//			System.out.println(" ");
//		}  
//	}
}
