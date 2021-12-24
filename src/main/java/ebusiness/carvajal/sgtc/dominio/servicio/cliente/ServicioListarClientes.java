package ebusiness.carvajal.sgtc.dominio.servicio.cliente;

import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioCliente;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioListarClientes {
    private final IRepositorioCliente irepositorioCliente;


    public ServicioListarClientes(IRepositorioCliente irepositorioCliente) {
        this.irepositorioCliente = irepositorioCliente;
    }

    public List<Cliente> ejecutar(){return this.irepositorioCliente.listar();}
}
