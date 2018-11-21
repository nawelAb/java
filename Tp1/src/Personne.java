import java.util.ArrayList;

public class Personne {
	protected String nom;
	protected String prenom;
	protected String dateNaissance;
	private ArrayList<Compte> listCompte;
	
	/*constructor*/
	public Personne(String nom, String prenom, String dateNaissance) {
		this.nom = nom ; 
		this.prenom = prenom ; 
		this.dateNaissance = dateNaissance;
		this.listCompte = new ArrayList<Compte>();		
	}
	
	public void ajouterCompte(Compte nouveaucompte) {
		this.listCompte.add(nouveaucompte);	
	}
	
	public void supprimerCompte(int numeroCompte) {
		int i ; 
		for (i=0; i < listCompte.size(); i++){
			if (listCompte.get(i).numero == numeroCompte){
				listCompte.remove(i);
				break;
			}			
		}	
	}
		
	

	/*this.comptes = new ArrayList<Compte>();*/
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
