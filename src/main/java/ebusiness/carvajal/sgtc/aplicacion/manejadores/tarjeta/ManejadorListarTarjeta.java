package ebusiness.carvajal.sgtc.aplicacion.manejadores.tarjeta;

import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import ebusiness.carvajal.sgtc.dominio.servicio.tarjeta.ServicioListarTarjetas;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ManejadorListarTarjeta {
    private final ServicioListarTarjetas servicioListarTarjetas;

    public ManejadorListarTarjeta(ServicioListarTarjetas servicioListarTarjetas) {
        this.servicioListarTarjetas = servicioListarTarjetas;
    }

    @Transactional
    public List<Tarjeta> ejecutar(){
        return this.servicioListarTarjetas.ejecutar();
    }
}
