package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entrez 10 nombres :");
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		int max = nb;
		for (int i = 1; i < 10; i++) {
			nb = scanner.nextInt();
			if (nb > max) {
				max = nb;
			}
		}
		System.out.println("Le plus grand nombre est " + max);
		scanner.close();
	}

}
