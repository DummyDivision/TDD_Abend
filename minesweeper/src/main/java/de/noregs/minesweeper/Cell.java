package de.noregs.minesweeper;


public class Cell {

	boolean isMine = true;
	private boolean isCovered = true;
	private Cell[] ghosts;

	public Cell(boolean isMine) {
		this.isMine = isMine;
        this.ghosts = new Cell[0];
	}

	public Cell() {
		this.ghosts = new Cell[0];
	}

	public boolean isMine() {
		return isMine;
	}

	public boolean isCovered() {
		return isCovered;
	}

	public void setCover(boolean cover) {
        if(cover == false)
            for(Cell cell: ghosts){
                cell.setCover(false);
            }
		this.isCovered = cover;
	}

	public int getNumberOfSurroundingMines() {
		int result = 0;
		for (Cell cell : ghosts) {
			if (cell.isMine())
				result++;
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
