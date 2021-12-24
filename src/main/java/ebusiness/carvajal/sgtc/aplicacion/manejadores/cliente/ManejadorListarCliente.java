package ebusiness.carvajal.sgtc.aplicacion.manejadores.cliente;

import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.servicio.cliente.ServicioListarClientes;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ManejadorListarCliente {
    private final ServicioListarClientes servicioListarClientes;

    public ManejadorListarCliente(ServicioListarClientes servicioListarClientes) {
        this.servicioListarClientes = servicioListarClientes;
    }

    @Transactional
    public List<Cliente> ejecutar(){
        return this.servicioListarClientes.ejecutar();
    }
}
