package de.noregs.minesweeper;


public class Cell {

	private boolean isMine = true;
	private boolean isCovered = true;
	private IGhost ghosts = new Ghost();

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
            for(Cell cell: ghosts.getCells()) {
                cell.uncover();
            }
    }

    public int getNumberOfSurroundingMines() {
		int result = 0;
		for (Cell cell : ghosts.getCells()) {
			if (cell.isMine()) {
                result++;
            }
		}
		return result;
	}


	public void setGhost(IGhost ghost) {
		this.ghosts = ghost;
	}

    public IGhost getGhost() {
        return ghosts;
    }
}
