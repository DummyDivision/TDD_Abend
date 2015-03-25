package de.noregs.minesweeper;

import static org.junit.Assert.*;

import org.junit.Test;

public class RulesTest {

	@Test
	public void testUncoverCellYieldsInteger() {
		int cellIndex = 4;
		assertTrue(Rules.uncoverCell(cellIndex) instanceof Integer);
	}

}
