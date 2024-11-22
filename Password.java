import java.security.SecureRandom;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		String min="abcdefghijklmnopqrstuvwxyz";
		String maj= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String nums= "0123456789";
		String symb= "?,;//\\!$£#&@";
		String chars= min + maj + nums + symb;
		
		Scanner entree= new Scanner(System.in);
		int length,types;
		
		System.out.println("Choisissez les types de caractères que vous désirez dans votre mot de de passe : ");
		System.out.println("Miniscules 1 \n Majuscules 2 \n Symboles 3 \n Chiffres 4 \n Tous les Caractères 5");
		types= entree.nextInt();
		if(types == 1) {
			do {
				System.out.println("Entrez la longueur désirée pour votre mot de passe (minimum 4 caractères) : ");
				length= entree.nextInt();
				if(length < 4) {
					System.out.println("La longueur doit être d'au moins 4 caractères pour inclure toutes les catégories.");
				}
			}while (length < 4);
			SecureRandom secu= new SecureRandom();
			StringBuilder passwd= new StringBuilder();
			for(int i=0; i<length; i++) {
				 int index = secu.nextInt(min.length()); // Renvoie l'index d'un élément aléatoire dans chars 
				    passwd.append(min.charAt(index)); // Ajoute le caractère correspondant à l'index renvoyé plus haut au mot de passe
			}
			entree.close();
			System.out.println("Mot de Passe : "+passwd);
		}
		if(types == 2) {
			do {
				System.out.println("Entrez la longueur désirée pour votre mot de passe (minimum 4 caractères) : ");
				length= entree.nextInt();
				if(length < 4) {
					System.out.println("La longueur doit être d'au moins 4 caractères pour inclure toutes les catégories.");
				}
			}while (length < 4);
			SecureRandom secu= new SecureRandom();
			StringBuilder passwd= new StringBuilder();
			for(int i=0; i<length; i++) {
				 int index = secu.nextInt(maj.length()); // Renvoie l'index d'un élément aléatoire dans chars 
				    passwd.append(maj.charAt(index)); // Ajoute le caractère correspondant à l'index renvoyé plus haut au mot de passe
			}
			entree.close();
			System.out.println("Mot de Passe : "+passwd);
		}
		if(types == 3) {
			do {
				System.out.println("Entrez la longueur désirée pour votre mot de passe (minimum 4 caractères) : ");
				length= entree.nextInt();
				if(length < 4) {
					System.out.println("La longueur doit être d'au moins 4 caractères pour inclure toutes les catégories.");
				}
			}while (length < 4);
			SecureRandom secu= new SecureRandom();
			StringBuilder passwd= new StringBuilder();
			for(int i=0; i<length; i++) {
				 int index = secu.nextInt(symb.length()); // Renvoie l'index d'un élément aléatoire dans chars 
				    passwd.append(symb.charAt(index)); // Ajoute le caractère correspondant à l'index renvoyé plus haut au mot de passe
			}
			entree.close();
			System.out.println("Mot de Passe : "+passwd);
		}
		if(types == 4) {
			do {
				System.out.println("Entrez la longueur désirée pour votre mot de passe (minimum 4 caractères) : ");
				length= entree.nextInt();
				if(length < 4) {
					System.out.println("La longueur doit être d'au moins 4 caractères pour inclure toutes les catégories.");
				}
			}while (length < 4);
			SecureRandom secu= new SecureRandom();
			StringBuilder passwd= new StringBuilder();
			for(int i=0; i<length; i++) {
				 int index = secu.nextInt(nums.length()); // Renvoie l'index d'un élément aléatoire dans chars 
				    passwd.append(nums.charAt(index)); // Ajoute le caractère correspondant à l'index renvoyé plus haut au mot de passe
			}
			entree.close();
			System.out.println("Mot de Passe : "+passwd);
		}
		
		
		if(types== 5) {
			do {
				System.out.println("Entrez la longueur désirée pour votre mot de passe (minimum 4 caractères) : ");
				length= entree.nextInt();
				if(length < 4) {
					System.out.println("La longueur doit être d'au moins 4 caractères pour inclure toutes les catégories.");
				}
			}while (length < 4);
			SecureRandom secu= new SecureRandom();
			StringBuilder passwd= new StringBuilder();
			for(int i=0; i<length; i++) {
				 int index = secu.nextInt(chars.length()); // Renvoie l'index d'un élément aléatoire dans chars 
				    passwd.append(chars.charAt(index)); // Ajoute le caractère correspondant à l'index renvoyé plus haut au mot de passe
			}
			entree.close();
			System.out.println("Mot de Passe : "+passwd);

		}
		
	}

}
