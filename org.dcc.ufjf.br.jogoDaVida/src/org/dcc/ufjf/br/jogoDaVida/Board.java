package org.dcc.ufjf.br.jogoDaVida;

import java.util.Random;

public class Board {
	public static final int LENGTH = 6;  
	private Cell cells[][];

	public Board() {
		super();
		this.cells = new Cell[LENGTH][LENGTH];
		
		Random rd = new Random();
		for (int i = 0; i < LENGTH; i++){
			for(int j = 0; j < LENGTH; j++){
				this.cells[i][j] = new Cell(rd.nextBoolean());
			}
		}
	}
	
	public Board(Board originalBoard) {
		super();
		this.cells = new Cell[LENGTH][LENGTH];
		
		for (int i = 0; i < LENGTH; i++){
			for(int j = 0; j < LENGTH; j++){
				this.cells[i][j] = new Cell(originalBoard.getCell(i, j).getValue());
			}
		}
	}

	public Cell[][] getCells() {
		return cells;
	}

	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}
	
	public Cell getCell(int i, int j) {
		return this.cells[i][j];
	}

	public void setCell(int i, int j, Cell cell) {
		this.cells[i][j] = cell;
	}

	public void updateBoard() {
		for (int row = 0; row < LENGTH; row++) {  
			for (int col = 0; col < LENGTH; col++) {
				//Qualquer célula viva com menos de dois vizinhos vivos morre de solidão.
				if(this.cells[row][col].getValue() && numberOfNeighboursAlive(row, col) < 2) {
					System.out.println("Célula (" + row + ", " + col + ") morreu pois tem menos de 2 vizinhos vivos.");
					this.cells[row][col].setValue(false);
				}

                //Qualquer célula viva com mais de três vizinhos vivos morre de superpopulação.
                if(this.cells[row][col].getValue() && numberOfNeighboursAlive(row, col) > 3) {
                	System.out.println("Célula (" + row + ", " + col + ") morreu pois tem mais de 3 vizinhos vivos.");
					this.cells[row][col].setValue(false);
                }

                //Qualquer célula morta com exatamente três vizinhos vivos se torna uma célula viva.
                if(!this.cells[row][col].getValue() && numberOfNeighboursAlive(row, col) == 3){
                	System.out.println("Célula (" + row + ", " + col + ") ressucitou pois tem exatamente 3 vizinhos vivos.");
					this.cells[row][col].setValue(true);
                }
                
                //Qualquer célula com dois vizinhos vivos continua no mesmo estado para a próxima geração.
                if(numberOfNeighboursAlive(row, col) == 2){
                	System.out.println("Célula (" + row + ", " + col + ") continuou no mesmo estado pois tem exatamente 2 vizinhos vivos.");
                }
			}
		}
	}

	private int numberOfNeighboursAlive(int cellIdxLine, int cellIdxColumn) {
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
                        if(this.cells[row][col].getValue())
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }
                
                if(limitRight == -1 && limitTop == -1){
                    if((row <= limitBottom) && (col >= limitLeft)){
                        //System.out.println(row, col);
                        if(this.cells[row][col].getValue())
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }
                
                if(limitLeft == -1  && limitBottom == -1){
                    if((row >= limitTop) && (col <= limitRight )){
                    	//System.out.println(row, col);
                    	if(this.cells[row][col].getValue())
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }

                if(limitRight == -1 && limitBottom == -1){
                    if((row >= limitTop) && (col >= limitLeft)){
                    	//System.out.println(row, col);
                    	if(this.cells[row][col].getValue())
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }
                
                //Celula de lado
                if(limitLeft == -1){
                    if((row <= limitBottom && row >= limitTop) && (col <= limitRight)){
                    	//System.out.println(row, col);
                    	if(this.cells[row][col].getValue())
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }

                if(limitRight == -1){
                    if((row <= limitBottom && row >= limitTop) && (col >= limitLeft)){
                    	//System.out.println(row, col);
                    	if(this.cells[row][col].getValue())
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }

                if(limitBottom == -1){
                    if((row >= limitTop) && (col >= limitLeft && col <= limitRight )){
                    	//System.out.println(row, col);
                    	if(this.cells[row][col].getValue())
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }

                if(limitTop == -1){
                    if((row <= limitBottom) && (col >= limitLeft && col <= limitRight )){
                    	//System.out.println(row, col);
                    	if(this.cells[row][col].getValue())
                            numberOfNeighboursAlive ++;
                    }
                    continue;
                }
                
                //Celula central
                if((row <= limitBottom && row >= limitTop) && (col >= limitLeft && col <= limitRight )){
                	if(this.cells[row][col].getValue())
                        numberOfNeighboursAlive ++;
                }
			}
        }
		
		return numberOfNeighboursAlive;
	}

	public void print(String s) {
		System.out.println(s);
		for (int row = 0; row < LENGTH; row++) {  
			for (int col = 0; col < LENGTH; col++) { 
				System.out.print((this.cells[row][col].getValue()? 0 : 1) + " ");
			}  
			System.out.println(" ");
		}  
	}
	
		
	
}
