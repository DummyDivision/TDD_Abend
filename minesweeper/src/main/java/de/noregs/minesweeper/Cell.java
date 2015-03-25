package de.noregs.minesweeper;

public class Cell {

    boolean isMine = true;

    public Cell(boolean isMine) {
        this.isMine = isMine;
    }

    public Cell() {
    }

    public boolean isMine() {
		return isMine;
	}

}
