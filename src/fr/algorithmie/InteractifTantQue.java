package fr.algorithmie;

import java.util.*;

public class InteractifTantQue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb;
		boolean test = true;
		while (test) {
			System.out.println("Entrez un nombre entre 1 et 10 :");
			Scanner scanner = new Scanner(System.in);
			nb = scanner.nextInt();
			if (nb > 0 && nb < 11) {
				System.out.println("Voici votre nombre :");
				System.out.println(nb);
				test = false;
				scanner.close();
			}
		}
	}

}
