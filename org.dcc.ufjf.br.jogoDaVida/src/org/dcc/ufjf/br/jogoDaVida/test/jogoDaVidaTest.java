package org.dcc.ufjf.br.jogoDaVida.test;

import org.junit.Assert;

import org.dcc.ufjf.br.jogoDaVida.Functions;
import org.junit.Test;

public class jogoDaVidaTest {

	@Test
	public void test() {
		Functions f = new Functions();
		boolean[][] entrada = {
			{false, true, false, true, false, false},
			{false, false, true, true, true, false},
			{false, false, true, false, true, true},
			{false, false, false, false, false, true},
			{false, true, false, false, false, true},
			{true, false, false, true, true, true}
		};
		
		boolean[][] saidaEsperada = {
			{false, false, true, false, false, false},
			{false, true, false, false, true, true},
			{false, false, false, false, false, true},
			{false, false, false, false, true, true},
			{false, false, false, true, false, false},
			{false, false, false, true, true, false}
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test2() {
		Functions f = new Functions();
		boolean[][] entrada = {
			{false, false, false, false, false, false},
			{false, true, true, true, false, false},
			{false, true, true, true, false, false},
			{false, true, true, true, false, false},
			{false, false, false, false, false, false},
			{false, false, false, false, false, false}
		};
		
		boolean[][] saidaEsperada = {
			{false, false, true, true, false, false},
			{false, false, false, false, false, false},
			{false, true, false, true, false, false},
			{false, true, false, false, false, false},
			{false, false, false, false, false, false},
			{false, false, false, false, false, false}
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
//	@Test
//	public void test3() {
//		Functions f = new Functions();
//		
//		for(int i=0; i<15; i++){
//			boolean[][] entrada = f.createBoard();
//			boolean[][] saidaEsperada = f.updateBoard(entrada);
//			
//			f.printBoard("entrada", entrada);
//			f.printBoard("saidaEsperada", saidaEsperada);
//			
//			Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
//		}
//	}
	
	@Test
	public void test3() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{true, false, false, true, false, true}, 
				{false, true, true, true, true, true}, 
				{true, true, true, true, true, false}, 
				{true, false, true, true, true, true}, 
				{true, true, true, false, true, false}, 
				{false, false, true, true, true, true}, 
		};
		
		boolean[][] saidaEsperada = {
				{false, false, false, true, false, true}, 
				{true, false, false, false, false, true}, 
				{true, false, true, false, false, true}, 
				{true, false, false, false, true, true}, 
				{true, false, true, false, false, false}, 
				{false, true, true, true, true, false}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test4() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{false, false, false, true, true, false}, 
				{false, false, true, true, false, false}, 
				{false, true, false, false, false, true}, 
				{false, true, true, true, false, false}, 
				{false, false, false, false, true, true}, 
				{true, false, true, true, false, false}, 
		};
		
		boolean[][] saidaEsperada = {
				{false, false, true, false, false, false}, 
				{false, true, false, false, false, false}, 
				{true, false, false, false, false, false}, 
				{false, true, true, true, true, true}, 
				{false, false, false, false, false, true}, 
				{false, false, false, false, false, false},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test5() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{true, true, true, false, true, false}, 
				{true, true, false, false, false, true}, 
				{false, true, false, true, true, true}, 
				{false, true, false, true, false, true}, 
				{false, true, false, false, true, false}, 
				{true, false, false, true, true, true}, 
		};
		
		boolean[][] saidaEsperada = {
				{true, false, false, false, false, false}, 
				{true, true, true, true, false, true}, 
				{false, false, false, false, false, true}, 
				{false, false, false, false, true, true}, 
				{false, false, false, false, false, false}, 
				{false, false, false, false, false, false}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test6() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{false, false, true, false, false, false}, 
				{false, true, false, true, false, true}, 
				{true, true, false, true, true, true}, 
				{true, true, false, true, true, false}, 
				{true, true, false, false, true, false}, 
				{true, true, false, false, false, true},
		};
		
		boolean[][] saidaEsperada = {
				{false, false, true, false, false, false}, 
				{true, false, false, true, false, true}, 
				{false, true, false, false, false, true}, 
				{false, true, false, true, true, true}, 
				{false, true, false, true, false, true}, 
				{true, true, true, false, true, true},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test7() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{false, true, false, true, true, true}, 
				{false, false, true, false, true, false}, 
				{false, true, false, false, false, false}, 
				{true, false, true, false, false, true}, 
				{false, false, false, true, false, false}, 
				{true, true, true, true, true, false}, 
		};
		
		boolean[][] saidaEsperada = {
				{false, false, false, true, true, true}, 
				{false, false, true, false, true, true}, 
				{false, true, true, false, true, false}, 
				{false, true, false, true, false, false}, 
				{true, false, false, false, true, false}, 
				{true, true, true, true, true, false},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test8() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{true, false, true, false, false, false}, 
				{true, false, true, false, false, false}, 
				{false, true, false, false, true, true}, 
				{false, true, false, true, true, false}, 
				{false, true, false, true, false, true}, 
				{false, true, false, false, true, false},
		};
		
		boolean[][] saidaEsperada = {
				{false, true, true, false, false, false}, 
				{true, false, true, true, true, true}, 
				{true, false, false, false, false, true}, 
				{true, true, false, true, false, false}, 
				{false, true, false, true, false, false}, 
				{false, false, false, false, false, false}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test9() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{false, false, false, false, true, true}, 
				{false, true, false, false, true, false}, 
				{true, true, true, true, true, true}, 
				{false, true, false, true, false, true}, 
				{true, false, true, false, false, true}, 
				{false, false, false, true, false, true},
		};
		
		boolean[][] saidaEsperada = {
				{false, false, false, false, true, true}, 
				{true, false, true, false, false, false}, 
				{true, false, false, true, false, false}, 
				{true, false, true, true, false, false}, 
				{false, true, false, true, false, false}, 
				{false, false, true, true, true, false},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test10() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{true, true, true, true, false, false}, 
				{false, true, false, true, false, true}, 
				{true, false, true, false, false, true}, 
				{true, true, true, false, true, false}, 
				{false, false, false, true, true, false}, 
				{false, false, true, true, true, false},
		};
		
		boolean[][] saidaEsperada = {
				{true, true, false, false, false, false}, 
				{false, false, true, true, true, true}, 
				{true, false, false, false, false, true}, 
				{true, true, true, false, true, true}, 
				{false, false, false, false, false, true}, 
				{false, false, false, false, false, false},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test11() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{true, true, false, false, false, true}, 
				{false, true, false, true, false, false}, 
				{true, true, false, false, false, true}, 
				{false, false, true, false, false, false}, 
				{true, true, false, true, false, false}, 
				{true, true, false, true, true, true}, 
		};
		
		boolean[][] saidaEsperada = {
				{true, true, true, false, false, false}, 
				{false, false, false, false, false, false}, 
				{false, false, false, false, false, false}, 
				{false, true, true, false, false, false}, 
				{false, false, false, true, false, false}, 
				{false, false, false, true, true, false},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test12() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{true, false, false, false, false, false}, 
				{false, false, true, false, true, true}, 
				{false, true, true, false, true, true}, 
				{true, false, true, true, false, false}, 
				{false, false, true, true, true, false}, 
				{false, false, true, false, false, false}, 
		};
		
		boolean[][] saidaEsperada = {
				{false, false, false, false, false, false}, 
				{false, true, true, false, true, true}, 
				{true, false, false, false, false, true}, 
				{false, true, false, true, false, false}, 
				{false, true, false, true, true, false}, 
				{false, false, true, true, true, false}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test13() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{false, true, true, false, false, true}, 
				{true, true, true, true, true, false}, 
				{false, true, true, false, true, true}, 
				{false, true, true, true, true, true}, 
				{true, true, false, true, true, false}, 
				{false, false, true, true, false, true}, 
		};
		
		boolean[][] saidaEsperada = {
				{true, false, true, false, true, true}, 
				{true, false, false, false, false, false}, 
				{true, false, true, false, false, true}, 
				{false, false, false, false, false, true}, 
				{false, false, true, false, true, true}, 
				{false, false, true, true, false, true}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test14() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{true, true, true, false, false, false}, 
				{true, true, true, false, false, false}, 
				{true, false, false, true, false, false}, 
				{false, false, true, true, false, true}, 
				{true, false, true, true, true, false}, 
				{false, false, true, false, true, true}, 
		};
		
		boolean[][] saidaEsperada = {
				{true, false, true, false, false, false}, 
				{true, false, true, true, false, false}, 
				{false, true, false, false, true, false}, 
				{false, false, false, false, false, true}, 
				{false, false, true, false, true, false}, 
				{false, false, false, true, true, true},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test15() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{false, true, false, true, true, true}, 
				{true, false, false, false, true, false}, 
				{true, true, true, true, true, false}, 
				{false, false, true, false, true, false}, 
				{false, false, false, true, false, true}, 
				{true, true, true, false, false, false},
		};
		
		boolean[][] saidaEsperada = {
				{false, false, false, true, true, true}, 
				{true, false, false, false, false, true}, 
				{true, false, true, false, true, true}, 
				{false, true, true, false, false, true}, 
				{true, false, false, true, true, true}, 
				{true, true, true, true, false, false},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test16() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{true, false, true, true, false, true}, 
				{true, false, true, false, false, true}, 
				{false, true, true, true, true, false}, 
				{true, false, true, true, false, false}, 
				{false, false, true, false, true, false}, 
				{false, true, true, false, false, true}, 
		};
		
		boolean[][] saidaEsperada = {
				{false, true, true, true, true, true}, 
				{true, false, false, false, false, true}, 
				{true, false, true, false, true, false}, 
				{false, false, true, false, false, false}, 
				{false, false, true, false, false, false}, 
				{false, true, true, false, false, false}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
	@Test
	public void test17() {
		Functions f = new Functions();
		boolean[][] entrada = {
				{false, true, false, true, false, false}, 
				{false, false, false, false, false, true}, 
				{false, false, true, true, true, true}, 
				{true, false, true, true, false, false}, 
				{false, false, true, true, false, true}, 
				{false, true, false, true, false, false}, 
		};
		
		boolean[][] saidaEsperada = {
				{false, false, false, false, false, false}, 
				{false, false, false, true, false, true}, 
				{false, true, false, false, false, false}, 
				{false, true, false, true, true, false}, 
				{false, true, false, true, false, false}, 
				{false, false, true, true, false, false}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.updateBoard(entrada));
	}
	
}
