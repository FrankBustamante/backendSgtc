package ebusiness.carvajal.sgtc.infraestructura.controlador;

import ebusiness.carvajal.sgtc.aplicacion.comando.ComandoCliente;
import ebusiness.carvajal.sgtc.aplicacion.comando.ComandoTarjeta;
import ebusiness.carvajal.sgtc.aplicacion.manejadores.cliente.*;
import ebusiness.carvajal.sgtc.dominio.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteControlador {
    private final ManejadorCrearCliente manejadorCrearCliente;
    private final ManejadorListarCliente manejadorListarCliente;
    private final ManejadorBuscarCliente manejadorBuscarCliente;
    private final ManejadorActualizarCliente manejadorActualizarCliente;
    private final ManejadorEliminarCliente manejadorEliminarCliente;

    public ClienteControlador(ManejadorCrearCliente manejadorCrearCliente, ManejadorListarCliente manejadorListarCliente,
                              ManejadorBuscarCliente manejadorBuscarCliente, ManejadorActualizarCliente manejadorActualizarCliente,
                              ManejadorEliminarCliente manejadorEliminarCliente) {
        this.manejadorEliminarCliente = manejadorEliminarCliente;
        this.manejadorBuscarCliente = manejadorBuscarCliente;
        this.manejadorActualizarCliente = manejadorActualizarCliente;
        this.manejadorCrearCliente = manejadorCrearCliente;
        this.manejadorListarCliente = manejadorListarCliente;
    }

    @GetMapping("")
    public List<Cliente> listar(){
        return this.manejadorListarCliente.ejecutar();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable(name = "id") String id){
        return this.manejadorBuscarCliente.ejecutar(id);
    }

    @PostMapping("")
    public void crear(@RequestBody ComandoCliente comandoCliente){
        this.manejadorCrearCliente.ejecutar(comandoCliente);
    }

    @PutMapping("/{id}")
    public Cliente actualizar(@PathVariable(name = "id") String id, @RequestBody ComandoCliente comandoCliente){
        return this.manejadorActualizarCliente.ejecutar(id,comandoCliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable(name = "id") String id){
        this.manejadorEliminarCliente.ejecutar(id);
    }
}
