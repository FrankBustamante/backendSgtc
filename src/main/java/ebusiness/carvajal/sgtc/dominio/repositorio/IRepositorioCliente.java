package ebusiness.carvajal.sgtc.dominio.repositorio;

import ebusiness.carvajal.sgtc.dominio.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IRepositorioCliente {
    /**
     * Permite buscar un Cliente dado un ID
     * @param id
     * @return Cliente
     */
    Cliente buscarPorId(String id);

    /**
     * Permite guardar una Cliente en la DB
     * @param cliente
     */
    void guardar(Cliente cliente);

    /**
     * Permite obtener todos los registros de Cliente en la DB
     * @return list<Cliente>
     */
    List<Cliente> listar();

    /**
     * Pemite actualizar un Cliente
     * @param id, cliente
     * @return Cliente actualizado
     */
    Cliente actualizar(String id, Cliente cliente);

    /**
     * Permite elimnar un Cliente dado un ID
     * @param id
     */
    void eliminar(String id);
}
