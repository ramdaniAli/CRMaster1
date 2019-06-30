import EXO5.euclidien;


/**
 * 
 */

 
/*
 * class testPerson exo 5 
 */
public class testEuclidien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * creation d'un tableau double 
		 */
		double [] A = {10, 5} ; 
		double [] B = {12, 7};
		
		
		/*
		 * creation d'un objet person avec comme parametre les points A et B 
		 */
		
		euclidien euclidien = new euclidien  (A[0], A[1], B[0], B[1]) ; 
		
		/*
		 * affichage des calculs sur les points A et B 
		 */
		euclidien.afficher();
		
		 
 		
	}

}
