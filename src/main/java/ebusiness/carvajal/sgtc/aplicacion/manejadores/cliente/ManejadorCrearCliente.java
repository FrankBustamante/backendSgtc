package ebusiness.carvajal.sgtc.aplicacion.manejadores.cliente;

import ebusiness.carvajal.sgtc.aplicacion.comando.ComandoCliente;
import ebusiness.carvajal.sgtc.aplicacion.fabrica.FabricaCliente;
import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.servicio.cliente.ServicioCrearCliente;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ManejadorCrearCliente {
    private final ServicioCrearCliente servicioCrearCliente;
    private final FabricaCliente fabricaCliente;

    public ManejadorCrearCliente(ServicioCrearCliente servicioCrearCliente, FabricaCliente fabricaCliente) {
        this.servicioCrearCliente = servicioCrearCliente;
        this.fabricaCliente = fabricaCliente;
    }

    @Transactional
    public void ejecutar(ComandoCliente comandoCliente){
        Cliente cliente = this.fabricaCliente.crearCliente(comandoCliente);
        this.servicioCrearCliente.ejecutar(cliente);
    }
}
