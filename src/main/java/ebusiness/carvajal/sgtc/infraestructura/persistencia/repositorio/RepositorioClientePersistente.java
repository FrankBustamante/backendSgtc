package ebusiness.carvajal.sgtc.infraestructura.persistencia.repositorio;

import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioCliente;
import ebusiness.carvajal.sgtc.infraestructura.persistencia.builder.ClienteBuilder;
import ebusiness.carvajal.sgtc.infraestructura.persistencia.entidad.ClienteEntity;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class RepositorioClientePersistente implements IRepositorioCliente {
    private final EntityManager entityManager;

    public RepositorioClientePersistente(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Cliente buscarPorId(String id) {
        Long idL = Long.parseLong(id);
        return ClienteBuilder.convertir(this.entityManager.find(ClienteEntity.class,idL));
    }

    @Override
    public void guardar(Cliente cliente) {
        this.entityManager.persist(ClienteBuilder.convertir(cliente));
    }

    @Override
    public List<Cliente> listar() {
        Query query = this.entityManager.createQuery("SELECT c FROM clientes c ");

        return (List<Cliente>) query.getResultList();
    }

    @Override
    public Cliente actualizar(String id, Cliente cliente) {
        cliente.setId(id);
        return  ClienteBuilder.convertir(entityManager.merge(ClienteBuilder.convertir(cliente)));
    }

    @Override
    public void eliminar(String id) {
        Long idL = Long.parseLong(id);
        ClienteEntity clienteEntity = entityManager.find(ClienteEntity.class, idL);
        if(entityManager.contains(clienteEntity))entityManager.remove(clienteEntity);
    }
}
