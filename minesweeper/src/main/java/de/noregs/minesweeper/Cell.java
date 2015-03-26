package de.noregs.minesweeper;


public class Cell {

	private boolean isMine = true;
	private boolean isCovered = true;
	private Cell[] ghosts = new Cell[0];

    public void setMine(boolean isMine) {
        this.isMine = isMine;
    }

    public Cell(boolean isMine) {
		setMine(isMine);
	}

	public Cell() {
	}

	@Override
	public String toString() {
		return ".";
	}

	public boolean isMine() {
		return isMine;
	}

	public boolean isCovered() {
		return isCovered;
	}

	private void setCover(boolean isCovered) {
        this.isCovered = isCovered;
	}

    public void uncover() {
            setCover(false);
            for(Cell cell: ghosts) {
                cell.uncover();
            }
    }

    public int getNumberOfSurroundingMines() {
		int result = 0;
		for (Cell cell : ghosts) {
			if (cell.isMine()) {
                result++;
            }
		}
		return result;
	}


	public void setGhost(Cell[] ghost) {
		this.ghosts = ghost;
	}

    public Cell[] getGhost() {
        return ghosts;
    }
}
