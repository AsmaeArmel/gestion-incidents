package local.tutos.tutorials1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_01_Clients")
public class Clients {

	@Id
	@Column(unique=true)
	private String CIN;
	private String NomClient;
	private String PrenomClient;
	private String AdresseClient;
	public Clients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clients(String cIN, String nomClient, String prenomClient, String adresseClient) {
		super();
		CIN = cIN;
		NomClient = nomClient;
		PrenomClient = prenomClient;
		AdresseClient = adresseClient;
	}
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
	}
	public String getNomClient() {
		return NomClient;
	}
	public void setNomClient(String nomClient) {
		NomClient = nomClient;
	}
	public String getPrenomClient() {
		return PrenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		PrenomClient = prenomClient;
	}
	public String getAdresseClient() {
		return AdresseClient;
	}
	public void setAdresseClient(String adresseClient) {
		AdresseClient = adresseClient;
	}
	
	
}
