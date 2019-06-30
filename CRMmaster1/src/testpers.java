/**
 * 
 */


import java.util.Scanner;

import EXO1.pers;

/*
 * class testpers exo 1 
 */
public class testpers {

	/**
	 * @param args
	 * 
	 * methode main chaque programme a une methode main par laquelle commence le programme 
	 *
	 */
	
	public static void main(String[] args) {

		/*
		 * creation d'un objet de type Scanner
		 */
		@SuppressWarnings("resource")
		Scanner clv = new Scanner (System.in) ;
 		
		/*
		 * initialisation des variables null 
		 * ne retourne rien 
		 */
		String name  = null ; 
		String prenom = null ; 
		String job = null ; 
		int age = 0 ; 
		
		/*
		 * creation d'un objet de type pers 
		 * ceration d'une nouvelle personne aggoun 
		 */
		pers aggoun = new pers (name , prenom, age, job) ; 
		
		/*
		 * on apelle la methode set pour donner une valeur  aux variables 
		 * et grace a la methode nexLine et nextInt de scanner on vas pouvoir modifier les variables 
		 * sur la console 
		 */
		System.out.print("set Nom : " );
		aggoun.setName(clv.nextLine());
		
		System.out.print("set Prenom : ");
		aggoun.setPrenom(clv.nextLine());
	
		System.out.print("set Job : ");
		aggoun.setJob(clv.nextLine());
		
		System.out.print("set age : ");
		aggoun.setAge(clv.nextInt());
		
		/*
		 * fermeture du scanner 
		 */
 		clv.close();
	 
		/*
		 * afficher les modifiation sur console 
		 */
		aggoun.afficher();
		
		 
		
		
		
		
		

	}

}
