package local.tutos.tutorials1.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
        	Configuration configuration =new Configuration().configure();
        	System.out.println("--------------- Bien Configurer -----------------");
            sessionFactory = configuration.buildSessionFactory();
            System.out.println("--------------- Bien Builder -----------------");
        } catch (Throwable ex) {
            System.err.println("Echec création SessionFactory" + ex.getMessage());
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
