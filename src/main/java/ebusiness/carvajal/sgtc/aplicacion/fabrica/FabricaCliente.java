package ebusiness.carvajal.sgtc.aplicacion.fabrica;

import ebusiness.carvajal.sgtc.aplicacion.comando.ComandoCliente;
import ebusiness.carvajal.sgtc.dominio.Cliente;
import org.springframework.stereotype.Component;

@Component
public class FabricaCliente {
    public Cliente crearCliente(ComandoCliente comandoCliente){
        return new Cliente(this.encriptar(comandoCliente.getPassword()), comandoCliente.getNombreUsuario(), comandoCliente.getEmail(),
                comandoCliente.getId());
    }

    private String encriptar(String pass){
        String encriptedPassword = pass;
        return encriptedPassword;
    }
}
