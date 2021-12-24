package ebusiness.carvajal.sgtc.infraestructura.configuracion.sistema;

import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioCliente;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioTarjeta;
import ebusiness.carvajal.sgtc.infraestructura.configuracion.conexion.ConexionJPA;
import ebusiness.carvajal.sgtc.infraestructura.persistencia.repositorio.RepositorioClientePersistente;
import ebusiness.carvajal.sgtc.infraestructura.persistencia.repositorio.RepositorioTarjetaPersistente;

import javax.persistence.EntityManager;

public class SistemaDePersistencia {
    private final EntityManager entityManager;

    public SistemaDePersistencia() {
        this.entityManager = new ConexionJPA().createEntityManager();
    }

    public IRepositorioCliente obtenerRepositorioCliente(){return new RepositorioClientePersistente(entityManager);}
    public IRepositorioTarjeta obtenerRepositorioTarjetas(){return new RepositorioTarjetaPersistente(entityManager);}

    public void iniciar() {
        entityManager.getTransaction().begin();
    }

    public void terminar() {
        entityManager.getTransaction().commit();
    }
}
