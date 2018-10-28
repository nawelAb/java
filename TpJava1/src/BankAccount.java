public class BankAccount {
	protected String owner; 
	protected String number; 
	protected int solde; 
	protected int interest;
	
	public void deposit(int somme) {
		this.solde=solde+somme;
	}
	
	
	public static void main(String[] args) { 
	        System.out.println("hello world");
	 }
	
	
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}
}
