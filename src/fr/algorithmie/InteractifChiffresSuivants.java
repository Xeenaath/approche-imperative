package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre :");
		int nb = scanner.nextInt();
		System.out.println("Les 10 chiffres suivants de " + nb + " sont :");
		for (int i = 1; i < 11; i++) {
			System.out.println(nb+i);
		}
		scanner.close();
	}

}
