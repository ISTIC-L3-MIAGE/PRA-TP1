package bah.tahi.tp1;

public abstract class AlexTesteur {

	public static void main(String[] args) {
		// test correctCoords()
		Grille g1 = new Grille(6, 3);
		// System.out.println(g1.correctCoords(2, 0)); // true
		// System.out.println(g1.correctCoords(3, 4)); // false

		// test correctCoords()
		String[][] tab = { { "a", "b", "c" }, { "d", "e", "f" } }; // height = 2 & width = 3
		g1.array = tab;

		System.out.println(g1.getCell(1, 0)); // d
		System.out.println(g1.getCell(0, 3)); // ERREUR

	}

}
