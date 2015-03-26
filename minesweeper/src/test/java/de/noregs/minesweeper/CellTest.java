package de.noregs.minesweeper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
		testCell.uncover();
		assertFalse(testCell.isCovered());
	}

	@Test
	public void testGetNumberOfSurroundingMines() {
		Cell testCell = new Cell();

		assertEquals(0, testCell.getNumberOfSurroundingMines());

	}

	@Test
	public void testGetNumberOfSurroundingMinesIfOneMinePresent() {

		Cell testCell = new Cell();
		testCell.setGhost(new Cell[] { new Cell() });

		assertEquals(1, testCell.getNumberOfSurroundingMines());

	}

	@Test
	public void testGetNumberOfSurroundingMinesIfTwoMinesPresent() {
		Cell testCell = new Cell();
		testCell.setGhost(new Cell[] { 
				new Cell(), 
				new Cell(), 
				new Cell(false) 
				});

		assertEquals(2, testCell.getNumberOfSurroundingMines());

	}

    @Test
	public void testUncoverSurroundingMinesIfNoMinesPresent() {
		Cell testCell = new Cell();
		Cell[] ghost = new Cell[8];
		for (int i = 0; i < ghost.length; i++) {
            ghost[i] = new Cell(false);
        }
		testCell.setGhost(ghost);
		
		testCell.uncover();
		for (Cell cell : testCell.getGhost()) {
            assertFalse(cell.isCovered());
        }
	}
}
