package de.noregs.minesweeper;

import static org.junit.Assert.*;

import org.junit.Test;

public class RulesTest {

	@Test
	public void test_isMine() {
		int cellIndex = 4;

        Cell testCell = new Cell();


        assertTrue(testCell.IsMine());
	}



}
