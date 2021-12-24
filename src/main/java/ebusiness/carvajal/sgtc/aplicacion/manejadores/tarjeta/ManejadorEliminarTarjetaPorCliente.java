package ebusiness.carvajal.sgtc.aplicacion.manejadores.tarjeta;

import ebusiness.carvajal.sgtc.dominio.servicio.tarjeta.ServicioEliminarTarjetaPorCliente;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ManejadorEliminarTarjetaPorCliente {
    private final ServicioEliminarTarjetaPorCliente servicioEliminarTarjetaPorCliente;

    public ManejadorEliminarTarjetaPorCliente(ServicioEliminarTarjetaPorCliente servicioEliminarTarjetaPorCliente) {
        this.servicioEliminarTarjetaPorCliente = servicioEliminarTarjetaPorCliente;
    }

    @Transactional
    public void ejecutar(String id){
        this.servicioEliminarTarjetaPorCliente.ejecutar(id);
    }
}
