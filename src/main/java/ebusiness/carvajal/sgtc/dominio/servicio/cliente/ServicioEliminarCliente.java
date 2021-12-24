package ebusiness.carvajal.sgtc.dominio.servicio.cliente;

import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioCliente;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ServicioEliminarCliente {
    private final IRepositorioCliente iRepositorioCliente;

    public ServicioEliminarCliente(IRepositorioCliente iRepositorioCliente) {
        this.iRepositorioCliente = iRepositorioCliente;
    }

    public void ejecutar(String id){this.iRepositorioCliente.eliminar(id);}
}
