package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		int min, temp;
		for (int i = 0; i < array.length; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] <= array[min]) {
					min = j;
				}
				;
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
