package ebusiness.carvajal.sgtc.aplicacion.fabrica;

import ebusiness.carvajal.sgtc.aplicacion.comando.ComandoTarjeta;
import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import org.springframework.stereotype.Component;

@Component
public class FabricaTarjeta {
    public Tarjeta crearTarjeta(ComandoTarjeta comandoTarjeta){
         return new Tarjeta(comandoTarjeta.getCliente(), comandoTarjeta.getNroTarjeta(), comandoTarjeta.getUltimosDigitos(), comandoTarjeta.getId());
    }
}
