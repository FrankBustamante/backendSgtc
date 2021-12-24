package ebusiness.carvajal.sgtc.dominio.servicio.tarjeta;

import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioTarjeta;
import org.springframework.stereotype.Component;

@Component
public class ServicioEliminarTarjeta {
    private final IRepositorioTarjeta iRepositorioTarjeta;

    public ServicioEliminarTarjeta(IRepositorioTarjeta iRepositorioTarjeta){
        this.iRepositorioTarjeta = iRepositorioTarjeta;
    }

    public void ejecutar(String id){this.iRepositorioTarjeta.eliminar(id);}
}
