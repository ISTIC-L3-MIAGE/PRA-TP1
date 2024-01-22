package bah.tahi.tp1;

public class Grid {

	int height, width;
	String[][] array;

	public Grid(int height, int width) {
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
		return 0 <= row && row < height && 0 <= column && column < width;
	}

	public String getCell(int row, int column) {
		return array[row][column];
	}

	public void setCell(int row, int column, String string) {
		array[row][column] = string;
	}

	// à tester manuellement
	public String toString() {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				result.append(array[i][j]);
				if (j < width - 1) {
					result.append(" | ");
				}
			}

			if (i < height - 1) {
				result.append(" | ");
			}
		}

		return result.toString();
	}
}
