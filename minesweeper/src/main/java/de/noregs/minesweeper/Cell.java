package de.noregs.minesweeper;

public class Cell {

    boolean isMine = true;
    private boolean isCovered = true;
    private Cell[] ghosts;

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

	public int getNumberOfSurroundingMines() {
		if (ghosts == null){
            return 0;
        }
        return 1;
	}

    public void setGhost(Cell[] ghost) {
        this.ghosts = ghost;
    }
}
