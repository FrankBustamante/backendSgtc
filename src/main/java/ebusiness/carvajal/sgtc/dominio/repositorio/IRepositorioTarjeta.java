package ebusiness.carvajal.sgtc.dominio.repositorio;

import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IRepositorioTarjeta {
    /**
     * Permite buscar una tarjeta dado un ID
     * @param id
     * @return Tarjeta
     */
    Tarjeta buscarPorId(String id);

    /**
     * Permite guardar una tarjeta en la DB
     * @param tarjeta
     */
    void guardar(Tarjeta tarjeta);

    /**
     * Permite obtener todos los registros de Tarjetas en la DB
     * @return list<Tarjeta>
     */
    List<Tarjeta> listar();

    /**
     * Pemite actualizar una Tarjeta
     * @param id tarjeta
     * @return Tarjeta actualizada
     */
    Tarjeta actualizar(String id, Tarjeta tarjeta);

    /**
     * Permite elimnar una Tarjeta dado un ID
     * @param id
     */
    void eliminar(String id);

    /**
     * Elimnar todas las tarjetas de un cliente
     * @param id
     */
    void eliminarPorCliente(String id);
}
