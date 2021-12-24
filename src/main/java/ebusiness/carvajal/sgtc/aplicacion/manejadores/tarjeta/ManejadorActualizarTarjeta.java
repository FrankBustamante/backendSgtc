package ebusiness.carvajal.sgtc.aplicacion.manejadores.tarjeta;

import ebusiness.carvajal.sgtc.aplicacion.comando.ComandoTarjeta;
import ebusiness.carvajal.sgtc.aplicacion.fabrica.FabricaTarjeta;
import ebusiness.carvajal.sgtc.aplicacion.manejadores.cliente.ManejadorBuscarCliente;
import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import ebusiness.carvajal.sgtc.dominio.servicio.tarjeta.ServicioActualizarTarjeta;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ManejadorActualizarTarjeta {
    private final ServicioActualizarTarjeta servicioActualizarTarjeta;
    private final FabricaTarjeta fabricaTarjeta;
    private final ManejadorBuscarCliente manejadorBuscarCliente;

    public ManejadorActualizarTarjeta(ManejadorBuscarCliente manejadorBuscarCliente, ServicioActualizarTarjeta servicioActualizarTarjeta, FabricaTarjeta fabricaTarjeta) {
        this.servicioActualizarTarjeta = servicioActualizarTarjeta;
        this.manejadorBuscarCliente = manejadorBuscarCliente;
        this.fabricaTarjeta = fabricaTarjeta;
    }

    @Transactional
    public Tarjeta ejecutar(String cliente_id, String id, ComandoTarjeta tarjeta){
        Cliente cliente = this.manejadorBuscarCliente.ejecutar(cliente_id);
        tarjeta.setCliente(cliente);
        return this.servicioActualizarTarjeta.ejecutar(id, this.fabricaTarjeta.crearTarjeta(tarjeta));
    }
}
