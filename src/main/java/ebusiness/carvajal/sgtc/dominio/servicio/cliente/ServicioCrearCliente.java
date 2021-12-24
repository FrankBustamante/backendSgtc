package ebusiness.carvajal.sgtc.dominio.servicio.cliente;

import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicioCrearCliente {

    private final IRepositorioCliente iRepositorioCliente;

    public ServicioCrearCliente(IRepositorioCliente iRepositorioCliente) {
        this.iRepositorioCliente = iRepositorioCliente;
    }

    public void ejecutar(Cliente cliente){this.iRepositorioCliente.guardar(cliente);}
}
