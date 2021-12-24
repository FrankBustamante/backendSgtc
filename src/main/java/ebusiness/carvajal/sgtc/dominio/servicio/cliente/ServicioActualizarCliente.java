package ebusiness.carvajal.sgtc.dominio.servicio.cliente;

import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioCliente;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ServicioActualizarCliente {
    private final IRepositorioCliente irepositorioCliente;

    public ServicioActualizarCliente(IRepositorioCliente irepositorioCliente) {
        this.irepositorioCliente = irepositorioCliente;
    }

    public Cliente ejecutar(String id, Cliente cliente){return this.irepositorioCliente.actualizar(id, cliente);}
}
