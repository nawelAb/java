public class CompteEpargne extends Compte{

	private double taux;
	
	/*constructor*/
	public CompteEpargne(String proprietaire, int numero, int solde, double taux) {
		super(proprietaire, numero, solde);
		this.taux = taux;
	}
	
	public double calculInteret() {
		 this.solde= solde + solde*taux;
	     return solde;	
	}
	
	public double deposer(double somme) {
		this.solde += somme;
		return this.solde;
	}
	
	
	public static void main(String[] args){
		  System.out.print("classe CompteEpargne !");
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}	
}