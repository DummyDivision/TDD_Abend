package de.noregs.minesweeper;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {

	@Test
	public void testIsMine() {
        Cell testCell = new Cell();
        assertTrue(testCell.IsMine());
	}



}
