import java.util.Scanner;

import EXO4.Livre;

/**
 * 
 */


public class testLibraire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * utiles 
		 */
		int id = 0; 
		int i ;
		int prix;
		String livre ; 
		String autor;

		/*
		 * creation d'un objet de type Scanner
		 */
		Scanner clv ;
	
		/*
		 * creation de l'objet lib de type tableau de Livre 
		 */
  		Livre [] lib = new Livre [3];
   		/*
  		 * parcourir et remplir le tableau de livre 
  		 */
 		for ( i = 0 ; i < lib.length ; i ++)		{
 			/*
 			 * id autoIncrement
 			 */
 			id ++ ;
 			/*
 			 * initialisation du scanner
 			 */
 			clv = new Scanner(System.in);
 			
 			/*
 			 * remplissage sur console
 			 */
 			
 			System.out.println("set book : ");
 			livre = clv.nextLine();
  			
 			System.out.println("set autor : ");
 			autor = clv.nextLine();

 			System.out.println("set prix : ");
 			prix = clv.nextInt(); 
 			
 			lib[i]=new Livre(id, livre, autor, prix);
 			
 		}
  		/*
 		 * à chaque tour de boucle, la valeur courante du tableau est mise dans la variable book et affiche toute la librairie 
 		 */
 		for (Livre book : lib)  {
 			System.out.println(book.toString());
 		}
 		/*
 		 * une foi la librairie toute afficher 
 		 * on affiche le nombre d'enregistrement 
 		 */
 		System.out.println("le nombre de livres est de : " + lib.length);
 		
			 
	}

}
