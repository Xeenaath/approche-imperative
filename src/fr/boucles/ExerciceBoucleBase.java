package fr.boucles;

public class ExerciceBoucleBase {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		switch (args[0]) {
			case "1":
				System.out.println("EXERCICE 1 \n\n");
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
				}
				break;
			case "2":
				System.out.println("EXERCICE 2 \n\n");
				for (int i = 0; i < 20; i++) {
					System.out.println("Nathan GIROT");
				}
				break;
			case "3":
				System.out.println("EXERCICE 3 \n\n");
				for (int i = 2; i <= 100; i+=2) {
					System.out.println(i);
				}
				break;
			case "4":
				System.out.println("\nEXERCICE 4 \n\n");
				for (int i = 1; i <= 99; i+=2) {
					System.out.println(i);
				}
			case "default":
				System.out.println("Pas d'exercice selectionné");
				break;		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
