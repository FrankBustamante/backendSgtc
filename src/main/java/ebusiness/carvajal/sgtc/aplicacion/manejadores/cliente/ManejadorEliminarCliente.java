package ebusiness.carvajal.sgtc.aplicacion.manejadores.cliente;

import ebusiness.carvajal.sgtc.aplicacion.manejadores.tarjeta.ManejadorEliminarTarjeta;
import ebusiness.carvajal.sgtc.aplicacion.manejadores.tarjeta.ManejadorEliminarTarjetaPorCliente;
import ebusiness.carvajal.sgtc.dominio.servicio.cliente.ServicioEliminarCliente;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ManejadorEliminarCliente {
    private final ServicioEliminarCliente servicioEliminarCliente;
    private final ManejadorEliminarTarjetaPorCliente manejadorEliminarTarjetaPorCliente;

    public ManejadorEliminarCliente(ServicioEliminarCliente servicioEliminarCliente, ManejadorEliminarTarjetaPorCliente manejadorEliminarTarjetaPorCliente) {
        this.servicioEliminarCliente = servicioEliminarCliente;
        this.manejadorEliminarTarjetaPorCliente = manejadorEliminarTarjetaPorCliente;
    }

    @Transactional
    public void ejecutar(String id){
        this.manejadorEliminarTarjetaPorCliente.ejecutar(id);
        this.servicioEliminarCliente.ejecutar(id);
    }
}
