/**
 * 
 */
package EXO1;
 
  
/*
 * classe pers 
 */
public class pers {
	
	private String job;
	private String name ; 
	private String prenom ; 
	private int age ; 
	
	
	/*
	 * constructeur de la classe perse, c'est une méthode possédant le même nom que la classe pouvant 
	 * prendre plusieurs paramètres.  
	 * le constructeur sert d'une identité pour la classe perse de cette façon nous pouvons appeler 
	 * le constructeur de cette classe dans d'autres classes et agir directement sur les variables
	 */
	public pers (String name, String prenom , int age , String job ) {
		this.name = name ; 
		this.prenom = prenom ; 
		this.age = age ; 
		this.job = job ; 
	
	}
	
	/*
	 * fonction permetant d'afficher en console l'enregistrement nom  prenom age  job 
	 */
	
	public void afficher () {
		System.out.println("name : "+name+" "+"prenom :"+prenom+" "+"age :"+age+" "+"job :"+job);
	}
	
	/*
	 * Getters And Setters 
	 */

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
