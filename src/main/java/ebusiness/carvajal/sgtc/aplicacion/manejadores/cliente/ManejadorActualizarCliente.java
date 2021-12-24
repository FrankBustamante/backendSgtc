package ebusiness.carvajal.sgtc.aplicacion.manejadores.cliente;

import ebusiness.carvajal.sgtc.aplicacion.comando.ComandoCliente;
import ebusiness.carvajal.sgtc.aplicacion.fabrica.FabricaCliente;
import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.servicio.cliente.ServicioActualizarCliente;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ManejadorActualizarCliente {
    private final ServicioActualizarCliente servicioActualizarCliente;
    private final FabricaCliente fabricaCliente;

    public ManejadorActualizarCliente(ServicioActualizarCliente servicioActualizarCliente, FabricaCliente fabricaCliente) {
        this.servicioActualizarCliente = servicioActualizarCliente;
        this.fabricaCliente = fabricaCliente;
    }

    @Transactional
    public Cliente ejecutar(String id, ComandoCliente cliente){
        return this.servicioActualizarCliente.ejecutar(id, this.fabricaCliente.crearCliente(cliente));
    }
}
