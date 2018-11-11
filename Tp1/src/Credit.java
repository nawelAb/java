
public class Credit {
	protected int numCredit;
	protected double sommes;
	protected int taux;
	protected int dureeEnMois;
	protected double mensualite;
	protected int numCompte;
	protected double sommesRestante;
	
	/*constructor*/
	public Credit(int numCredit,double sommes, int taux, int dureeEnMois, double mensualite, int numCompte,double sommesRestante) {
		this.numCredit = numCredit;
		this.sommes = sommes;
		this.taux = taux;
		this.dureeEnMois = dureeEnMois;
		this.mensualite = mensualite;
		this.numCompte = numCompte;
		this.sommesRestante = sommesRestante;		
	}
	
	public double payerMensualite() {
		this.sommesRestante = this.mensualite;
		return this.sommesRestante;
	}
	public double payerAnticipation() {
		this.sommes = this.sommesRestante; 
		return this.sommes;
	}
	public static void main(String[] args){
		  System.out.print("classe Credit !");
	}
	public int getNumCredit() {
		return numCredit;
	}
	public void setNumCredit(int numCredit) {
		this.numCredit = numCredit;
	}
	public double getSommes() {
		return sommes;
	}
	public void setSommes(double sommes) {
		this.sommes = sommes;
	}
	public int getTaux() {
		return taux;
	}
	public void setTaux(int taux) {
		this.taux = taux;
	}
	public int getDureeEnMois() {
		return dureeEnMois;
	}
	public void setDureeEnMois(int dureeEnMois) {
		this.dureeEnMois = dureeEnMois;
	}
	public double getMensualite() {
		return mensualite;
	}
	public void setMensualite(double mensualite) {
		this.mensualite = mensualite;
	}
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public double getSommesRestante() {
		return sommesRestante;
	}
	public void setSommesRestante(double sommesRestante) {
		this.sommesRestante = sommesRestante;
	}
	
}
