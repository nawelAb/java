import java.sql.*;

public class GestionBDD {
	  private static Connection connect = null;
	  private Statement statement = null;
	 
	  private String host = "jdbc:mysql://localhost:3306/comptebancaire?useSSL=false";
	  private String user = "root";
	  private String passwd = "";
	  
	  public static void main(String[] args)  {
	  	
	        GestionBDD gestionObj = new GestionBDD();	   	        
	        try {
	        	gestionObj.afficherPersonne();
	         	gestionObj.afficherCompte();
	         	gestionObj.afficherCredit();
	         	gestionObj.ajouterCompte();
	         	gestionObj.ajouterCompteCh();
	           	gestionObj.ajouterCompteEp();
	           	gestionObj.ajouterPersonne();
	           	gestionObj.ajouterCredit();
	         	
	        } catch (Exception e) {
				e.printStackTrace();
			}
	   }
	  public void afficherCredit() throws Exception {
			connect = DriverManager.getConnection(host, user, passwd);
			statement = connect.createStatement();
			 //les crédits associés à un compte chèque à partir de son numéro
			String reqSQL = "select * from credit where compte_id = 1";
			ResultSet rs = statement.executeQuery( reqSQL );
			while
			(rs.next()){
				System.out.println("\n debut de la ligne ");
				String sommes = rs.getString("sommes");
				System.out.println("sommes = " + sommes );
				String taux  = rs.getString("taux");
				System.out.println("taux = " + taux );
				String dureeEnMois = rs.getString("dureeEnMois");
				System.out.println("dureeEnMois = " + dureeEnMois);		
				String mensualite  = rs.getString("mensualite");
				System.out.println("mensualite = " + mensualite );
				String sommesRestante = rs.getString("sommesRestante");
				System.out.println("sommesRestante = " + sommesRestante );

				System.out.println(" fin de la ligne \n");
			}
			
		  
	  }
	 
	  
	  public void afficherPersonne() throws Exception {
		  	connect = DriverManager.getConnection(host, user, passwd);
		  	statement = connect.createStatement();
		  	ResultSet rs = null; 
		  
			String reqSQL = "select * from personne";
			rs = statement.executeQuery(reqSQL);
			while
			(rs.next()){
				System.out.println("\n debut de la ligne ");
				String firstName = rs.getString("firstName");
				System.out.println("firstName = " + firstName );
				String lastName  = rs.getString("lastName");
				System.out.println("lastName = " + lastName );
				String dateNaissance = rs.getString("dateNaissance");
				System.out.println("dateNaissance = " + dateNaissance );
				String listCompte = rs.getString("listCompte");	
				System.out.println("listCompte = " + listCompte );
				System.out.println("fin de la ligne \n");
			}
	  }
	  
	  public void afficherCompte() throws Exception {	
			connect = DriverManager.getConnection(host, user, passwd);
		  	statement = connect.createStatement();
		  	
	        // les comptes d’une personne donnée à partir de l’identifiant de la personne (numPersonne)
	            
			String reqSQL = "select * from compte where personne_id = 1";
			ResultSet rs = statement.executeQuery( reqSQL );
			while
			(rs.next()){
				System.out.println("\n debut de la ligne ");
				String proprietaire = rs.getString("proprietaire");
				System.out.println("proprietaire = " + proprietaire );
				String numero  = rs.getString("numero");
				System.out.println("numero = " + numero );
				String solde = rs.getString("solde");
				System.out.println("solde = " + solde);
				System.out.println(" fin de la ligne \n");
			}
	  }
	  
	 	  
	  public void ajouterPersonne() throws Exception {
		    connect = DriverManager.getConnection(host, user, passwd);
		  	statement = connect.createStatement();
		    
		  	// Ajouter une personne
		  	String sql1 = "INSERT INTO personne" + " VALUES (90,'naoual','abbou', '29-02-1992', 57)";
		  	statement.executeUpdate(sql1);		  
	  }
	  
	  public void ajouterCompteEp() throws Exception {
		    connect = DriverManager.getConnection(host, user, passwd);
		  	statement = connect.createStatement();
		  	
		  	// Ajouter un compte épargne
		  	String sql2 = "INSERT INTO compteepargne" + " VALUES (1,15)";
		  	statement.executeUpdate(sql2);		  
	  }
	  public void ajouterCompteCh() throws Exception {
		    connect = DriverManager.getConnection(host, user, passwd);
		  	statement = connect.createStatement();

		  	// Ajouter un compte chèque
		  	String sql3 = "INSERT INTO comptecheque" + " VALUES (1, 1234, 100)";
			statement.executeUpdate(sql3);			  
	  }
	  
	  public void ajouterCredit() throws Exception {	  
			connect = DriverManager.getConnection(host, user, passwd);
		  	statement = connect.createStatement();
		  	// Ajouter un crédit
		  	String sql4 = "INSERT INTO credit" + " VALUES (1, 1 , 500, 16, 8, 9, 1900)";		 
			statement.executeUpdate(sql4);	
	  }
	  
	  public void ajouterCompte() throws Exception{
			
		    connect = DriverManager.getConnection(host, user, passwd);
		  	statement = connect.createStatement();
		  	//ajouter un compte
		  	String sql5 = "INSERT INTO compte" + " VALUES (1, 1, 'abbou', 1222, 48000)";
			statement.executeUpdate(sql5);	
	  }	 
	  
	  //private ResultSet rs = null;
	  //private PreparedStatement preparedStatement = null;	
}
