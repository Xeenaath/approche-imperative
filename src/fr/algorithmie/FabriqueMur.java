package fr.algorithmie;

public class FabriqueMur {

	public static boolean fabriqueMur(int nbSmall, int nbBig, int longueur) {
		boolean test = true;
		while (test && nbBig > 0) {
			if (longueur >= nbBig * 5) {
				longueur -= nbBig * 5;
				test = false;
			} else {
				nbBig--;
			}
		}
		test = true;
		while(test && nbSmall > 0) {
			if (longueur >= nbSmall) {
				longueur -= nbSmall;
				test = false;
			} else {
				nbSmall--;
			}
		}
		return (longueur == 0);
	}
	
	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriqueMur(nbSmall, nbBig, longueur) == b) {
				System.err.println("Test (" + nbSmall + ", " + nbBig + ", " +
						longueur + ") NON passant.");
		} else {
			System.out.println("OK !");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}
}
