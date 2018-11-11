
public class Main {

	public static void main(String[] args){
		  System.out.print("classe Personne !");
		  // classe Personne
		  Personne personne1 = new Personne("user1", "user1", "29/02/1992");
		  Compte compte1 = new Compte("compte1", 122, 1200);
		  Compte compte2 = new Compte("compte2", 123, 1200);
		  personne1.ajouterCompte(compte1);
		  personne1.ajouterCompte(compte2);
		  //personne1.supprimerCompte(compte1.numero);
		  
		  System.out.print("affichage donnees d une personne \n");
		  System.out.print("nom " + personne1.nom + "\n");
		  System.out.print("prenom " + personne1.prenom + "\n");
		  System.out.print("date de naissance " + personne1.dateNaissance + "\n");
		  System.out.print("compte " + personne1.getListCompte() + "\n");
		 
	
		  //classe Compte
		  System.out.print("affichage donnees d un compte \n");
		  
		  Compte compte3 = new Compte("compte3", 155, 1300);
		
		  System.out.print("slode avant depot " + compte3.solde + "\n");
		  compte3.deposer(500);
		  System.out.print("slode apres depot " + compte3.solde + "\n");
	
		  System.out.print("slode avant retret " + compte3.solde + "\n");
		  compte3.retirer(400);
		  System.out.print("slode apres retret " + compte3.solde + "\n");
	
		  // classe CompteCheque
		  CompteCheque compteCheq = new CompteCheque("compte1", 122, 1200, 1555, 1000);
		  compteCheq.estADecouvert();
		  
		  //Classe CompteEpargne 
		  CompteEpargne compteEp = new CompteEpargne("compte1", 122, 1200, 5);
		  double taux = compteEp.calculInteret();
		  System.out.println("taux d interet = " + taux + "\n");
		  
		  System.out.print("slode avant depot " + compteEp.solde + "\n");
		  compteEp.deposer(600);
		  System.out.print("slode apres depot " + compteEp.solde + "\n");
		
		  // classe credit 
		  System.out.println("affichage donnees d une personne \n");
		  
		  Credit credit1 = new Credit(1111, 1000, 5, 12, 22, 122, 500); 
		  System.out.println("numCredit " + credit1.numCredit );
		  System.out.println("numCompte " + credit1.numCompte );
		  System.out.println("dureeEnMois " + credit1.dureeEnMois );
		  System.out.println("mensualite " + credit1.mensualite );
		  System.out.println("sommes " + credit1.sommes );
		  System.out.println("sommesRestante " + credit1.sommesRestante );
		  System.out.println("taux " + credit1.taux);
		  
		  System.out.println("payerMensulite = " + credit1.payerMensualite());
		  System.out.println("payerAnticipation = " + credit1.payerAnticipation());
		  
	}
}
