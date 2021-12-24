package ebusiness.carvajal.sgtc.dominio.servicio.tarjeta;

import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioTarjeta;
import org.springframework.stereotype.Component;

@Component
public class ServicioCrearTarjeta {
    private final IRepositorioTarjeta iRepositorioTarjeta;

    public ServicioCrearTarjeta(IRepositorioTarjeta iRepositorioTarjeta){
        this.iRepositorioTarjeta = iRepositorioTarjeta;
    }

    public void ejecutar(Tarjeta tarjeta){this.iRepositorioTarjeta.guardar(tarjeta);}
}
