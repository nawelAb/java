import java.util.ArrayList;

public class Personne {
	protected String nom;
	protected String prenom;
	protected String dateNaissance;
	protected ArrayList<Compte> listCompte;/*changer le type utiliser liste*/
	/*this.comptes = new ArrayList<Compte>();*/
	
	/*constructor*/
	public Personne(String nom, String prenom, String dateNaissance) {/*, ArrayList<Compte> listCompte*/
		this.nom = nom ; 
		this.prenom = prenom ; 
		this.dateNaissance = dateNaissance;
		//this.listCompte = listCompte ;		
	}
	
	public void ajoutCompte() {
	
	}
	
	public void SupprimerCompte(int numeroCompte) {
		
		
	}
	

	
	public static void main(String[] args){
	  System.out.print("classe Personne !");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public ArrayList<Compte> getListCompte() {
		return listCompte;
	}

	public void setListCompte(ArrayList<Compte> listCompte) {
		this.listCompte = listCompte;
	}
	
}
