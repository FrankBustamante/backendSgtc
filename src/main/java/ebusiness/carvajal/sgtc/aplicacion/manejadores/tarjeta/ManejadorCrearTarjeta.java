package ebusiness.carvajal.sgtc.aplicacion.manejadores.tarjeta;

import ebusiness.carvajal.sgtc.aplicacion.comando.ComandoTarjeta;
import ebusiness.carvajal.sgtc.aplicacion.fabrica.FabricaTarjeta;
import ebusiness.carvajal.sgtc.aplicacion.manejadores.cliente.ManejadorBuscarCliente;
import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import ebusiness.carvajal.sgtc.dominio.servicio.tarjeta.ServicioCrearTarjeta;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ManejadorCrearTarjeta {
    private final ServicioCrearTarjeta servicioCrearTarjeta;
    private final FabricaTarjeta fabricaTarjeta;
    private final ManejadorBuscarCliente manejadorBuscarCliente;

    public ManejadorCrearTarjeta(ServicioCrearTarjeta servicioCrearTarjeta, FabricaTarjeta fabricaTarjeta, ManejadorBuscarCliente manejadorBuscarCliente) {
        this.manejadorBuscarCliente = manejadorBuscarCliente;
        this.servicioCrearTarjeta = servicioCrearTarjeta;
        this.fabricaTarjeta = fabricaTarjeta;
    }

    @Transactional
    public void ejecutar(String cliente_id, ComandoTarjeta comandoTarjeta){
        Cliente cliente = this.manejadorBuscarCliente.ejecutar(cliente_id);
        comandoTarjeta.setCliente(cliente);
        Tarjeta tarjeta = this.fabricaTarjeta.crearTarjeta(comandoTarjeta);
        this.servicioCrearTarjeta.ejecutar(tarjeta);
    }


}
