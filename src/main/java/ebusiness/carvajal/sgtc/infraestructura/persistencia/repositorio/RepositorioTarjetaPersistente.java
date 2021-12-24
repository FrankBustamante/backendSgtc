package ebusiness.carvajal.sgtc.infraestructura.persistencia.repositorio;

import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioTarjeta;
import ebusiness.carvajal.sgtc.infraestructura.persistencia.builder.TarjetaBuilder;
import ebusiness.carvajal.sgtc.infraestructura.persistencia.entidad.ClienteEntity;
import ebusiness.carvajal.sgtc.infraestructura.persistencia.entidad.TarjetaEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class RepositorioTarjetaPersistente implements IRepositorioTarjeta {
    private final EntityManager entityManager;

    public RepositorioTarjetaPersistente(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Tarjeta buscarPorId(String id) {
        Long idL = Long.parseLong(id);
        return TarjetaBuilder.convertir(entityManager.find(TarjetaEntity.class, idL));
    }

    @Override
    public void guardar(Tarjeta tarjeta) {
        entityManager.persist(TarjetaBuilder.convertir(tarjeta));
    }

    @Override
    public List<Tarjeta> listar() {
        Query query = this.entityManager.createQuery("SELECT t FROM tarjetas t ");
        return (List<Tarjeta>) query.getResultList();
    }

    @Override
    public Tarjeta actualizar(String id, Tarjeta tarjeta) {
        tarjeta.setId(id);
        return TarjetaBuilder.convertir(entityManager.merge(TarjetaBuilder.convertir(tarjeta)));
    }

    @Override
    public void eliminar(String id) {
        Long idL = Long.parseLong(id);

        TarjetaEntity tarjetaEntity = entityManager.find(TarjetaEntity.class, idL);
        if(entityManager.contains(tarjetaEntity))entityManager.remove(tarjetaEntity);
    }

    @Override
    public void eliminarPorCliente(String id) {
        Long idL = Long.parseLong(id);
        Query query = this.entityManager.createQuery("DELETE FROM tarjetas t WHERE t.cliente.id = :cliente");
        query.setParameter("cliente", idL);
        query.executeUpdate();
    }
}
