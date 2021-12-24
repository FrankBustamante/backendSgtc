package ebusiness.carvajal.sgtc.dominio.servicio.tarjeta;

import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioTarjeta;
import org.springframework.stereotype.Component;

@Component
public class ServicioBuscarTarjeta {
    private final IRepositorioTarjeta iRepositorioTarjeta;

    public ServicioBuscarTarjeta(IRepositorioTarjeta iRepositorioTarjeta){
        this.iRepositorioTarjeta = iRepositorioTarjeta;
    }

    public Tarjeta ejecutar(String id){return this.iRepositorioTarjeta.buscarPorId(id);}
}
