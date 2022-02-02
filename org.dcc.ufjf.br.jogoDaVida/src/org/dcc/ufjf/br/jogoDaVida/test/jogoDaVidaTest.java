package org.dcc.ufjf.br.jogoDaVida.test;

import org.junit.Assert;

import org.dcc.ufjf.br.jogoDaVida.Functions;
import org.junit.Test;

public class jogoDaVidaTest {

	/* ENTRADA
	0 1 0 1 0 0  
	0 0 1 1 1 0  
	0 0 1 0 1 1  
	0 0 0 0 0 1  
	0 1 0 0 0 1  
	1 0 0 1 1 1 
	*/
	/* SAÍDA ESPERADA
	0 0 1 0 0 0  
	0 1 0 0 1 1  
	0 0 0 0 0 1  
	0 0 0 0 1 1  
	0 0 0 1 0 0  
	0 0 0 1 1 0
	*/
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

}
