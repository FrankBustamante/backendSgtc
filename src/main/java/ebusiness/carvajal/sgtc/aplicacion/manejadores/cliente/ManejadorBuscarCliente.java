package ebusiness.carvajal.sgtc.aplicacion.manejadores.cliente;

import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.servicio.cliente.ServicioBucarCliente;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ManejadorBuscarCliente {
    private final ServicioBucarCliente servicioBucarCliente;

    public ManejadorBuscarCliente(ServicioBucarCliente servicioBucarCliente) {
        this.servicioBucarCliente = servicioBucarCliente;
    }

    @Transactional
    public Cliente ejecutar(String id){
        return this.servicioBucarCliente.ejecutar(id);
    }
}
