package client;

public class Client {

	String nom;
	String prenom;
	int reference;
	
	public Client(String nom, String prenom, int reference) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.reference = reference;
	}
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getReference() {
		return reference;
	}

	@Override
	public String toString() {
		return reference + ":" + nom + ":" + prenom;
	}
	
	
}
