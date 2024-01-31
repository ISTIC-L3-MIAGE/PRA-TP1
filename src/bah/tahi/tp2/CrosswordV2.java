package bah.tahi.tp2;

public class CrosswordV2 {

	Grid<CrosswordSquare> square;

	public CrosswordV2(int height, int width) {
		this.solution = new Grid(height, width);
		this.proposition = new Grid(height, width);
		this.horizontal = new Grid(height, width);
		this.vertical = new Grid(height, width);
	}

	public int getHeight() {
		return this.solution.getHeight();
	}

	public int getWidth() {
		return this.solution.getWidth();
	}

	public boolean correctCoords(int row, int column) {
		return this.solution.correctCoords(row, column);
	}

	public boolean isBlackSquare(int row, int column) {
		if (this.correctCoords(row, column)) {
			return this.solution.getCell(row, column) == null;
		} else {
			throw new RuntimeException();
		}
	}

	public void setBlackSquare(int row, int column, boolean black) {
		if (this.correctCoords(row, column)) {
			if (black) {
				this.solution.setCell(row, column, null);
			} else {
				this.solution.setCell(row, column, " ");
			}
		} else {
			throw new RuntimeException();
		}

	}

	public char getSolution(int row, int column) throws RuntimeException {
		if (this.correctCoords(row, column) && !this.isBlackSquare(row, column)) {
			return this.solution.getCell(row, column).charAt(0);
		} else {
			throw new RuntimeException();
		}

	}

	public void setSolution(int row, int column, char solution) throws RuntimeException {
		if (this.correctCoords(row, column) && !this.isBlackSquare(row, column)) {
			this.solution.setCell(row, column, String.valueOf(solution));
		} else {
			throw new RuntimeException();
		}
	}

	public char getProposition(int row, int column) throws RuntimeException {
		if (this.correctCoords(row, column) && !this.isBlackSquare(row, column)) {
			return this.proposition.getCell(row, column).charAt(0);
		} else {
			throw new RuntimeException();
		}
	}

	public void setProposition(int row, int column, char solution) {
		if (this.correctCoords(row, column) && !this.isBlackSquare(row, column)) {
			this.proposition.setCell(row, column, String.valueOf(solution));
		} else {
			throw new RuntimeException();
		}
	}

	public String getDefinition(int row, int column, boolean horizontal) throws RuntimeException {
		if (this.correctCoords(row, column) && !this.isBlackSquare(row, column)) {
			return horizontal ? this.horizontal.getCell(row, column) : this.vertical.getCell(row, column);
		} else {
			throw new RuntimeException();
		}
	}

	public void setDefinition(int row, int column, boolean horizontal, String definition) {
		if (this.correctCoords(row, column) && !this.isBlackSquare(row, column)) {
			if (horizontal) {
				this.horizontal.setCell(row, column, definition);
			} else {
				this.vertical.setCell(row, column, definition);
			}
		} else {
			throw new RuntimeException();
		}
	}
}
