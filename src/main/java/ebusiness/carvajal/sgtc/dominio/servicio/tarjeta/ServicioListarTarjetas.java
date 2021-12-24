package ebusiness.carvajal.sgtc.dominio.servicio.tarjeta;

import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioTarjeta;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioListarTarjetas {
    private final IRepositorioTarjeta iRepositorioTarjeta;

    public ServicioListarTarjetas(IRepositorioTarjeta iRepositorioTarjeta){
        this.iRepositorioTarjeta = iRepositorioTarjeta;
    }

    public List<Tarjeta> ejecutar(){return this.iRepositorioTarjeta.listar();}
}
