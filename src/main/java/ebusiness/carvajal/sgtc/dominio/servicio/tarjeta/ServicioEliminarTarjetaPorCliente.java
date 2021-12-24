package ebusiness.carvajal.sgtc.dominio.servicio.tarjeta;

import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioTarjeta;
import org.springframework.stereotype.Component;

@Component
public class ServicioEliminarTarjetaPorCliente {
    private final IRepositorioTarjeta iRepositorioTarjeta;

    public ServicioEliminarTarjetaPorCliente(IRepositorioTarjeta iRepositorioTarjeta) {
        this.iRepositorioTarjeta = iRepositorioTarjeta;
    }

    public void ejecutar(String id){
        this.iRepositorioTarjeta.eliminarPorCliente(id);
    }
}
