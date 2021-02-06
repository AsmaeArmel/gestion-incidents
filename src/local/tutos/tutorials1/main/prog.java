package local.tutos.tutorials1.main;

import local.tutos.tutorials1.entities.Clients;
import local.tutos.tutorials1.metier.ClientsImpl;
import local.tutos.tutorials1.metier.IClients;

public class prog {

	private static IClients metier;
	public static void main(String[] args) {
		metier=new ClientsImpl();
		
		// J'ai oubliée de metre update pour mettre a jour la base de donnée non pas la recreer a nouveau :)
		// Ajouter un nouveau Client 
//		Clients c1=new Clients("AB12789", "Jemhour", "Mehdi", "Salé");
//		Clients c2=new Clients("AC87989", "Client2", "Prenom", "Fés");
//		Clients c3=new Clients("AD72667", "Client3", "Prenom", "Tanger");
//		Clients c4=new Clients("AE57632", "Client4", "Prenom", "Rabat");
//		Clients c5=new Clients("AF76628", "Client5", "Prenom", "Casa");
//		Clients c6=new Clients("A782657", "Client_Test", "Prenom_Test", "Erreur");
//		
//		metier.save(c1);
//		metier.save(c2);
//		metier.save(c3);
//		metier.save(c4);
//		metier.save(c5);
//		metier.save(c6);
		
		// Lister Les clients dans la base de donnée
		
//		// Modifier un Client n'existe pas 
//		metier.update("YU65489", new Clients("AC78225", "Client", "Eroner", "None"));
//		
		// Modifier un CLient Exist
		//metier.update("AF76628", new Clients("AF76628", "Client 5", "Prenom 5", "CasaBlanca"));
		for(Clients c:metier.findAll())
		{
			System.out.println("CIN\t"+c.getCIN()+" - Nom\t"+c.getNomClient()+" - Prenom\t"+c.getPrenomClient()+" - Adresse\t"+c.getAdresseClient());
		}
		
		// Supprimer Un CLient n'existe pas 
		
	//metier.delete("KJ78154");
//
		// Supprimer Un CLient Existe
		metier.delete("A782657");
		
		for(Clients c:metier.findAll())
		{
			System.out.println("CIN\t"+c.getCIN()+" - Nom\t"+c.getNomClient()+" - Prenom\t"+c.getPrenomClient()+" - Adresse\t"+c.getAdresseClient());
		}
		
	}
}
