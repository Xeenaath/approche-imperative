package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };
		int max;
		if (array1.length <= array2.length) {
			max = array1.length;
		} else {
			max = array2.length;
		}
		int[] arraySomme = new int[max];

		for (int i = 1; i < max; i++) {
			arraySomme[i] = array1[i] + array2[i];
			System.out.println("Tableau somme à la case n°" + i + " : " + arraySomme[i]);
		}
	}

}
