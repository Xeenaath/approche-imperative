package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tab [] = new int[10];
		for (int i = 0; i < 10; i++) {
			tab[i] = i+1;
		}
		System.out.println("Première valeur du tableau :");
		System.out.println(tab[0]);
		System.out.println("Taille du tableau :");
		System.out.println(tab.length);
		System.out.println("Dernière valeur du tableau :");
		System.out.println(tab[tab.length-1]);
		System.out.println("Changement de valeur de l'élément index 4 :");
		System.out.println(tab[4]);
		tab[4] = 8;
		System.out.println(tab[4]);	
	}

}
