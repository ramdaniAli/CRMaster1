/**
 * 
 */
package EXO5;


public class euclidien {
	
	/*
	 * initialisation de variables null 
	 * 
	 * 
	 */
	private double x1, x2, y1, y2; 
	
	
	/*
	 * construteur de la classe euclidien 
	 */
	public euclidien (double x1, double y1, double x2, double y2) {
		this.x1 = x1 ; 
		this.x2 = x2 ; 
		this.y1 = y1 ; 
		this.y2 = y2 ; 
	}
	/*
	 * creation d'une methode de type double retournant la distance entre deux point 
	 */
	public double distance () {
		
		/*
		 * la méthode pow de Math élève le premier argument à la puissance indiquée par le second.
		 */
		double x=Math.pow(x1-x2, 2);
		double y=Math.pow(y1-y2, 2);
		/*
		 * la méthode sqrt de Math calcule la racine carrée de son paramètre.
		 */
		return Math.sqrt(x+y);
		
	}
	
	/*
	 * fonction permetant de calcuer le perimetre 
	 */
	public double getPerimetre() {
		return (2 * 3.14 * Math.pow(this.distance(), 2));
	}
	/*
	 * fonction permetant de calculer la surface
	 */
	public double getSurface () {
		return (2 * 3.14 * Math.pow(this.distance() , 2) );
	}
	
	/*
	 * fonction permetant d'afficher le resulat des calculs au arrondis 
	 */
	public void afficher () {
		System.out.println("la distance euclidienne est de " + Math.rint(this.distance( ))+" perimetre = " + Math.rint(this.getPerimetre())	+ "  surface = " + Math.rint(this.getSurface()));
	}
	
 

}
