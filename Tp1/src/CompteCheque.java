
public class CompteCheque extends Compte{
	
	private int numeroCarte ; 
	private double decouvertAutorisation; 	
	
    /*constructor*/	
	public CompteCheque(String proprietaire, int numero, int solde ,int numeroCarte, double decouvertAutorisation ) {
		super(proprietaire, numero, solde);
		this.numeroCarte = numeroCarte;
		this.decouvertAutorisation = decouvertAutorisation;	
	}
	
	/* implement this method using boolean type*/
	public void estADecouvert() {
		if (this.solde < decouvertAutorisation) {
			System.out.println("ce compte est a decouvert");
		} else {
			System.out.println("ce compte n est pas à decouvert ");
		}
	}
	public static void main(String[] args){
		  System.out.print("classe CompteCheque !");
	}
	public int getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	public double getDecouvertAutorisation() {
		return decouvertAutorisation;
	}
	public void setDecouvertAutorisation(double decouvertAutorisation) {
		this.decouvertAutorisation = decouvertAutorisation;
	}	
}
