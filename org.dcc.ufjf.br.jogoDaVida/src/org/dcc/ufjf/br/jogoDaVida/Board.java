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
				
	}

	public void print() {
		
	}
	
		
	
}
