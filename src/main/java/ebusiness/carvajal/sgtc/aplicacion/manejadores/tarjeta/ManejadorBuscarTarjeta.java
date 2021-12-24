package ebusiness.carvajal.sgtc.aplicacion.manejadores.tarjeta;

import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import ebusiness.carvajal.sgtc.dominio.servicio.tarjeta.ServicioBuscarTarjeta;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ManejadorBuscarTarjeta {
    private final ServicioBuscarTarjeta servicioBuscarTarjeta;

    public ManejadorBuscarTarjeta(ServicioBuscarTarjeta servicioBuscarTarjeta) {
        this.servicioBuscarTarjeta = servicioBuscarTarjeta;
    }

    @Transactional
    public Tarjeta ejecutar(String id){
        return this.servicioBuscarTarjeta.ejecutar(id);
    }
}
