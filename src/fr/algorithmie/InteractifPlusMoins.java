package fr.algorithmie;

import java.util.*;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int)(Math.random()*100);
		System.out.println("Trouvez le nombre entre 1 et 100 :");
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		int coups = 1;
		while (nb != random) {
			if (nb > random) {
				System.out.println("C'est moins !");
			} else {
				System.out.println("C'est plus !");	
			}
			scanner = new Scanner(System.in);
			nb = scanner.nextInt();
			coups++;
		}
		System.out.println("Bravo ! Vous avez trouvé en " + coups + " coup(s)");
		scanner.close();
		
	}

}
