
public class Compte {
	
	protected String proprietaire;
	protected int numero;
	protected double solde;
	
	/*constructor*/
	public Compte(String proprietaire, int numero, double solde) {
		this.proprietaire = proprietaire;
		this.numero = numero ; 
		this.solde = solde ; 	
	}
	
	public double deposer(double somme) {
		this.solde += somme;
		return this.solde;
	}
	
	public double retirer(double somme) {
		this.solde -= somme;
		return this.solde; /* return the new solde*/
	}
	
	public static void main(String[] args){
	  System.out.print("classe Compte !");
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}	
}
