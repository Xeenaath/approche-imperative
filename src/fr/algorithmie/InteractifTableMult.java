package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb;
		boolean test = true;
		while (test) {
			System.out.println("Entrez un nombre compris entre 1 et 10 :");
			Scanner scanner = new Scanner(System.in);
			nb = scanner.nextInt();
			if (nb > 0 && nb < 11) {
				System.out.println("Voici la table de multiplication de " + nb);
				for (int i = 1; i < 11; i++) {
					System.out.println(nb*i);
				}
				test = false;
				scanner.close();
			}
		}
	}

}
