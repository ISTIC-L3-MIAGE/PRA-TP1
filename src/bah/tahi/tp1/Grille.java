package bah.tahi.tp1;

public class Grille {

	int height, width;
	String[][] array;

	public Grille(int height, int width) {
		this.height = height;
		this.width = width;
		this.array = new String[height][width];
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public boolean correctCoords(int row, int column) {
		return row < height && column < width;
	}

	public String getCell(int row, int column) {
		// TODO: Corriger le assert
		assert this.correctCoords(row, column)
				: "On ne peut pas récuperer la cellule parce que les coordonnées n'existent pas";
		return array[row][column];
	}

	public void setCell(int row, int column, String string) {
		// TODO: Corriger le assert
		assert this.correctCoords(row, column)
				: "On ne peut pas modifier la cellule parce que les coordonnées n'existent pas";
		array[row][column] = string;
	}

	public String toString() {
		return "à faire";
	}
}
