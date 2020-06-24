package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {
	
	static boolean whoBegins() {
		boolean joueur;
		int random = (int)(Math.random()*2);
		if (random == 0) {
			System.out.println("Vous commencez � jouer");
			joueur = true;
		} else {
			System.out.println("Le Bot commence � jouer");
			joueur = false;
		}
		return joueur;
	}
	
	static int round(boolean joueur, Scanner scanner) {
		int nbBatons;
		System.out.println("-------------------------------------------------");
			if (joueur) {
				System.out.println("C'est � vous de jouer.");
				System.out.println("Combien de b�tons voulez-vous retirer ?");
				nbBatons = scanner.nextInt();
				while (nbBatons < 1 || nbBatons > 3) {
					System.out.println("Vous devez retirer entre 1 et  3 b�tons.");
					System.out.println("Combien de b�tons voulez-vous retirer ?");
					nbBatons = scanner.nextInt();
				}
			} else {
				System.out.println("C'est au tour du Bot");
				nbBatons = (int)(Math.random()*3) + 1;
			}
		return nbBatons;
	}
		
	static boolean isGameOver(int totalBatons, boolean joueur) {
		if (totalBatons <= 0) {
			System.out.println("Il n'y a plus aucun b�ton.");
			if (joueur) {
				System.out.println("Vous avez perdu :(");
			} else {
				System.out.println("Vous avez gagn� :D");
			}
			return true;
		} else {
			System.out.println("-------------------------------------------------");
			System.out.println("B�tons restants : " + totalBatons);
			return false;
		}
	}
	
	static void game(int totalBatons) {
		System.out.println("Nombre de b�tons total : " + totalBatons);
		System.out.println("-------------------------------------------------");
		boolean joueur = whoBegins();
		boolean test = true;
		int nbBatons;
		Scanner scanner = new Scanner(System.in);
		while (test) {
			nbBatons = round(joueur, scanner);
			totalBatons -= nbBatons;
			System.out.println("- " + nbBatons + " b�ton(s)");
			test = !isGameOver(totalBatons, joueur);
			joueur = !joueur; //changement de joueur
		}
		scanner.close();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game(21);
	}

}
