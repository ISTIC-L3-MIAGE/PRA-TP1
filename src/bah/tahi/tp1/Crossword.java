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
		return solution.getHeight();
	}

	public int getWidth() {
		return solution.getWidth();
	}

	public boolean correctCoords(int row, int column) {
		// Pourquoi ???
		return solution.correctCoords(row, column) || proposition.correctCoords(row, column)
				|| horizontal.correctCoords(row, column) || vertical.correctCoords(row, column);
	}

	public boolean isBlackSquare(int row, int column) {
		// à compléter
		return false;
	}

	public void setBlackSquare(int row, int column, boolean black) {
		// à compléter
	}

	public char getSolution(int row, int column) {
		// à compléter
		return 'a';
	}

	public void setSolution(int row, int column, char solution) {
		// à compléter
	}

	public char getProposition(int row, int column) {
		// à compléter
		return 'a';
	}

	public void setProposition(int row, int column, char solution) {
		// à compléter
	}

	public char getDefinition(int row, int column, boolean horizontal) {
		// à compléter
		return 'a';
	}

	public void setDefinition(int row, int column, boolean horizontal, String definition) {
		// à compléter
	}

}
