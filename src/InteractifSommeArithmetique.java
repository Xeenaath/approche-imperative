import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre :");
		int nb = scanner.nextInt();
		int somme = 0;
		for (int i = 1; i <= nb; i++) {
			somme += i;
		}
		System.out.println("La somme arithmetique de " + nb + " vaut : " + somme);
		scanner.close();
	}

}
