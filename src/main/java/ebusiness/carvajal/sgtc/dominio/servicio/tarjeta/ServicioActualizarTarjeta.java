package ebusiness.carvajal.sgtc.dominio.servicio.tarjeta;

import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioTarjeta;
import org.springframework.stereotype.Component;

@Component
public class ServicioActualizarTarjeta {
    private final IRepositorioTarjeta iRepositorioTarjeta;

    public ServicioActualizarTarjeta(IRepositorioTarjeta iRepositorioTarjeta){
        this.iRepositorioTarjeta = iRepositorioTarjeta;
    }

    public Tarjeta ejecutar(String id, Tarjeta tarjeta){return this.iRepositorioTarjeta.actualizar(id, tarjeta);}
}
