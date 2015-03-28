package de.noregs.minesweeper;

public class Ghost implements IGhost {

	private Cell[] cells = new Cell[0];

	public Cell[] getCells() {
		return cells;
	}

	public void setCells(Cell[] cells) {
		this.cells = cells;
	}

}
