package de.noregs.minesweeper;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {

	@Test
	public void testIsMine() {
		Cell testCell = new Cell();
		assertTrue(testCell.isMine());
	}

	@Test
	public void testIsField() {
		Cell testCell = new Cell(false);
		assertFalse(testCell.isMine());

	}

    @Test
    public void testIsCovered() {
        Cell testCell = new Cell();

        assertTrue(testCell.isCovered());

    }
    
    @Test
    public void testIsUncovered() {
    	Cell testCell = new Cell();
    	testCell.setCover(false);
    	assertFalse(testCell.isCovered());
    	
    }

    @Test
    public void testGetNumberOfSurroundingMines() {
        Cell testCell = new Cell();

        assertEquals(0, testCell.getNumberOfSurroundingMines());

    }
}
