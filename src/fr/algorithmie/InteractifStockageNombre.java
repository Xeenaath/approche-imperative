package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean test = true;
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[0];
		while(test) {
			System.out.println("Tapez 1 pour rajouter un nombre");
			System.out.println("Tapez 2 pour afficher le tableau");
			System.out.println("Tapez 3 pour quitter");
			int option = scanner.nextInt();
			if (option > 0 && option < 4) {
				switch (option) {
				case 1:
					int[] arrayCopy = array;
					array = new int[array.length+1];
					for (int i = 0; i < arrayCopy.length; i++) {
						array[i] = arrayCopy[i];
					}
					System.out.println("Rajoutez un nombre :");
					int nb = scanner.nextInt();
					array[array.length-1] = nb;
					break;
				case 2:
					System.out.println("Voici le contenu de votre tableau :");
					for (int i = 0; i < array.length-1; i++) {
						System.out.println(array[i]);
					}
					break;
				case 3 :
					test = false;
					break;	
				}
			}
		}
		scanner.close();


	}

}
