package ebusiness.carvajal.sgtc.infraestructura.configuracion.conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionJPA {
    private static final String SGTC = "sgtc";
    private static EntityManagerFactory entityManagerFactory;

    public ConexionJPA(){Persistence.createEntityManagerFactory(SGTC);}
    public EntityManager createEntityManager(){return this.entityManagerFactory.createEntityManager();}
}