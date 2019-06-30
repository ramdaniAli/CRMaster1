/**
 * 
 */
package EXO4;

/**
 * class livre
 *
 */
public class Livre {
	
	private String titre; 
	private String autor;	
	private int id; 
	private int prix ;
	
 	
	
	/*
	 * constructeur de la classe livre
	 */
	public Livre (int id, String titre, String autor ,int prix) {
		
		this.id = id  ; 
		this.titre = titre ; 
		this.autor = autor ; 
		this.prix = prix ; 
 	}
	
	/*
	 * methode toString permetant de retourner les information sur un livre 
	 */
 	public String toString () {
		return "Le titre du livre : " + this.titre + " " + "l'auteur du livre : " + this.autor + " "+ "le prix du livre : " + this.prix+" "+"L'dentifiant du livre : "+this.id ;
	}
	
	/**
	 * Getters and Setters 
	 */

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}



 
	
	
	
	
	

}
