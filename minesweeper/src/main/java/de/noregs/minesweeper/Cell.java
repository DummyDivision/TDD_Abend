package de.noregs.minesweeper;

public class Cell {

    boolean isMine = true;
    private boolean isCovered = true;

    public Cell(boolean isMine) {
        this.isMine = isMine;
    }

    public Cell() {
    }

    public boolean isMine() {
		return isMine;
	}

	public boolean isCovered() {
		return isCovered;
	}

    public void setCover(boolean cover) {
        this.isCovered = cover;
    }

}
