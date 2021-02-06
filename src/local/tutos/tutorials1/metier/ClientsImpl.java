package local.tutos.tutorials1.metier;

import java.util.List;

import org.hibernate.query.Query;

import org.hibernate.Session;

import local.tutos.tutorials1.entities.Clients;
import local.tutos.tutorials1.util.HibernateUtil;

public class ClientsImpl implements IClients {

	private static HibernateUtil hibernateUtil;
	@Override
	public void save(Clients client) {
		// TODO Auto-generated method stub
		Session session=hibernateUtil.getSessionFactory().getCurrentSession();
		try
		{
			session.beginTransaction();
			session.save(client);
		}catch(Exception ex)
		{
			session.getTransaction().rollback();
			ex.printStackTrace();
		}
		session.getTransaction().commit();
	}

	@Override
	public void update(String cin, Clients client) {
		Clients clients=findByCIN(cin);
		Session session=hibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		client.setCIN(cin);
		session.update(client);
		session.getTransaction().commit();
	}

	@Override
	public void delete(String cin) {
		// Appele de la methode Rechercher par CIN 
		// La methode renvoi un client s'il est trouver sinon Lance une Exception Non Surveiller (Runtime)
		Clients client=findByCIN(cin);
		Session session=hibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(client);
		session.getTransaction().commit();
	}

	@Override
	public List<Clients> findAll() {
		List<Clients> listClient=null;
		Session session=hibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query=session.createQuery("Select c from Clients c");
		listClient=query.list();
		session.getTransaction().commit();
		return listClient;
	}

	@Override
	public Clients findByCIN(String cin) {
		Session session=hibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Object o=session.get(Clients.class, cin);
		if(o==null) throw new RuntimeException("Client Introuvable ");
		session.getTransaction().commit();
		return (Clients) o;
	}

}
