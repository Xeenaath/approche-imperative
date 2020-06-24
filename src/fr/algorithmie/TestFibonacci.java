package fr.algorithmie;

import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Donnez un rang N :");
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		if (nb == 0) {
			System.out.println(nb);
		} else {
			int a = 0;
			int b = 1;
			int c;
			for (int i = 1; i <=nb; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(a);
		}
		scanner.close();
		

	}

}
