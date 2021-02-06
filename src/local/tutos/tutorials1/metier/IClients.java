package local.tutos.tutorials1.metier;

import java.util.List;

import local.tutos.tutorials1.entities.Clients;

public interface IClients {

	void save(Clients client);
	void update(String cin,Clients client);
	void delete(String cin);
	List<Clients> findAll();
	Clients findByCIN(String cin);
}
