package ebusiness.carvajal.sgtc.infraestructura.controlador;

import ebusiness.carvajal.sgtc.aplicacion.comando.ComandoTarjeta;
import ebusiness.carvajal.sgtc.aplicacion.manejadores.tarjeta.*;
import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/tarjetas")
public class TarjetaControlador {
    private final ManejadorCrearTarjeta manejadorCrearTarjeta;
    private final ManejadorBuscarTarjeta manejadorBuscarTarjeta;
    private final ManejadorEliminarTarjeta manejadorEliminarTarjeta;
    private final ManejadorActualizarTarjeta manejadorActualizarTarjeta;
    private final ManejadorListarTarjeta manejadorListarTarjeta;

    public TarjetaControlador(ManejadorCrearTarjeta manejadorCrearTarjeta, ManejadorBuscarTarjeta manejadorBuscarTarjeta,
                              ManejadorEliminarTarjeta manejadorEliminarTarjeta, ManejadorActualizarTarjeta manejadorActualizarTarjeta,
                              ManejadorListarTarjeta manejadorListarTarjeta) {
        this.manejadorCrearTarjeta = manejadorCrearTarjeta;
        this.manejadorBuscarTarjeta = manejadorBuscarTarjeta;
        this.manejadorEliminarTarjeta = manejadorEliminarTarjeta;
        this.manejadorActualizarTarjeta = manejadorActualizarTarjeta;
        this.manejadorListarTarjeta = manejadorListarTarjeta;
    }

    @GetMapping("")
    public List<Tarjeta> listar(){
        return this.manejadorListarTarjeta.ejecutar();
    }

    @GetMapping("/{id}")
    public Tarjeta buscarPorId(@PathVariable(name = "id") String id){
        return this.manejadorBuscarTarjeta.ejecutar(id);
    }

    @PostMapping("/{cliente_id}")
    public void crear(@PathVariable(name = "cliente_id") String cliente_id,@RequestBody ComandoTarjeta comandoTarjeta){
        this.manejadorCrearTarjeta.ejecutar(cliente_id, comandoTarjeta);
    }

    @PutMapping("/{cliente_id}/{id}")
    public Tarjeta actualizar(@PathVariable(name = "cliente_id") String cliente_id, @PathVariable(name = "id") String id, @RequestBody ComandoTarjeta comandoTarjeta){
        return this.manejadorActualizarTarjeta.ejecutar(cliente_id, id, comandoTarjeta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable(name = "id") String id){
        this.manejadorEliminarTarjeta.ejecutar(id);
    }
}
