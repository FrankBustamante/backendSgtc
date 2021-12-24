package ebusiness.carvajal.sgtc.dominio.servicio.cliente;

import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioCliente;
import org.springframework.stereotype.Component;

@Component
public class ServicioBucarCliente {

    private final IRepositorioCliente irepositorioCliente;

    public ServicioBucarCliente(IRepositorioCliente irepositorioCliente) {
        this.irepositorioCliente = irepositorioCliente;
    }

    public Cliente ejecutar(String id){return this.irepositorioCliente.buscarPorId(id);}
}
