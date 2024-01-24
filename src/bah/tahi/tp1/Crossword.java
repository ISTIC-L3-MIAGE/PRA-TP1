package bah.tahi.tp1;

public class Crossword {

	Grid solution, proposition, horizontal, vertical;

	public Crossword(int height, int width) {
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
		assert this.correctCoords(row, column) : "Erreur";
		return this.solution.getCell(row, column) == null;
	}

	public void setBlackSquare(int row, int column, boolean black) {
		if (black) {
			this.solution.setCell(row, column, null);
		} else {
			this.solution.setCell(row, column, " ");
		}
	}

	public char getSolution(int row, int column) {
		assert this.correctCoords(row, column) && !this.isBlackSquare(row, column) : "Erreur";
		return this.solution.getCell(row, column).charAt(0);
	}

	public void setSolution(int row, int column, char solution) {
		this.solution.setCell(row, column, String.valueOf(solution));
	}

	public char getProposition(int row, int column) {
		assert this.correctCoords(row, column) && !this.isBlackSquare(row, column) : "Erreur";
		return this.proposition.getCell(row, column).charAt(0);
	}

	public void setProposition(int row, int column, char solution) {
		this.proposition.setCell(row, column, String.valueOf(solution));
	}

	public String getDefinition(int row, int column, boolean horizontal) {
		assert this.correctCoords(row, column) && !this.isBlackSquare(row, column) : "Erreur";
		return horizontal ? this.horizontal.getCell(row, column) : this.vertical.getCell(row, column);
	}

	public void setDefinition(int row, int column, boolean horizontal, String definition) {
		if (horizontal) {
			this.horizontal.setCell(row, column, definition);
		} else {
			this.vertical.setCell(row, column, definition);
		}
	}
}
