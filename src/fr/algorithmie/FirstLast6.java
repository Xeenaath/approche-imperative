package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 6};
		boolean test1 = (array1.length > 0 && array1[array1.length-1] == 6);
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		boolean test2 = (array2.length > 0 && array2[array2.length-1] == 6);
		System.out.println(test1);
		System.out.println(test2);
	}
}
