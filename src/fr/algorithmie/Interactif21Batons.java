package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {
	
	static boolean whoBegins() {
		boolean joueur;
		int random = (int)(Math.random()*2);
		if (random == 0) {
			System.out.println("Vous commencez à jouer");
			joueur = true;
		} else {
			System.out.println("Le Bot commence à jouer");
			joueur = false;
		}
		return joueur;
	}
	
	static int round(boolean joueur, Scanner scanner) {
		int nbBatons;
		System.out.println("-------------------------------------------------");
			if (joueur) {
				System.out.println("C'est à vous de jouer.");
				System.out.println("Combien de bâtons voulez-vous retirer ?");
				nbBatons = scanner.nextInt();
				while (nbBatons < 1 || nbBatons > 3) {
					System.out.println("Vous devez retirer entre 1 et  3 bâtons.");
					System.out.println("Combien de bâtons voulez-vous retirer ?");
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
			System.out.println("Il n'y a plus aucun bâton.");
			if (joueur) {
				System.out.println("Vous avez perdu :(");
			} else {
				System.out.println("Vous avez gagné :D");
			}
			return true;
		} else {
			System.out.println("-------------------------------------------------");
			System.out.println("Bâtons restants : " + totalBatons);
			return false;
		}
	}
	
	static void game(int totalBatons) {
		System.out.println("Nombre de bâtons total : " + totalBatons);
		System.out.println("-------------------------------------------------");
		boolean joueur = whoBegins();
		boolean test = true;
		int nbBatons;
		Scanner scanner = new Scanner(System.in);
		while (test) {
			nbBatons = round(joueur, scanner);
			totalBatons -= nbBatons;
			System.out.println("- " + nbBatons + " bâton(s)");
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
