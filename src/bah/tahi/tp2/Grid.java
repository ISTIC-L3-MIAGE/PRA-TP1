package bah.tahi.tp2;

class Grid<T> {

	int height, width;
	T[][] array;

	public Grid(int height, int width) {
		this.height = height;
		this.width = width;
		this.array = (T[][]) new Object[height][width];
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

	public T getCell(int row, int column) throws RuntimeException {
		return array[row][column];
	}

	public void setCell(int row, int column, T string) throws RuntimeException {
		array[row][column] = string;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				result.append(array[i][j].toString());
				if (j < width - 1) {
					result.append(" | ");
				}
			}
			result.append("\n");
		}

		return result.toString();
	}
}
