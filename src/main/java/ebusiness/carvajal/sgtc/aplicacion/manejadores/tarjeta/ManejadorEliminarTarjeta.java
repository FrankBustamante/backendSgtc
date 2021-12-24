package ebusiness.carvajal.sgtc.aplicacion.manejadores.tarjeta;

import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import ebusiness.carvajal.sgtc.dominio.servicio.tarjeta.ServicioEliminarTarjeta;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ManejadorEliminarTarjeta {
    private final ServicioEliminarTarjeta servicioEliminarTarjeta;

    public ManejadorEliminarTarjeta(ServicioEliminarTarjeta servicioEliminarTarjeta) {
        this.servicioEliminarTarjeta = servicioEliminarTarjeta;
    }

    @Transactional
    public void ejecutar(String id){
        this.servicioEliminarTarjeta.ejecutar(id);
    }
}
