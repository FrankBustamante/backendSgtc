package ebusiness.carvajal.sgtc.infraestructura.persistencia.builder;

import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.infraestructura.persistencia.entidad.ClienteEntity;

public class ClienteBuilder {
    private ClienteBuilder() {
    }

    public static Cliente convertir(ClienteEntity clienteEntity){
        if (clienteEntity == null) return null;
        return new Cliente(clienteEntity.getPassword(), clienteEntity.getNombreUsuario(), clienteEntity.getEmail(), String.valueOf(clienteEntity.getId()));
    }

    public static ClienteEntity convertir(Cliente cliente){
        ClienteEntity clienteEntity = new ClienteEntity();
        clienteEntity.setEmail(cliente.getEmail());
        if(cliente.getId() != null)clienteEntity.setId(Long.parseLong(cliente.getId()));
        clienteEntity.setNombreUsuario(cliente.getNombreUsuario());
        if(cliente.getPassword() != null)clienteEntity.setPassword(cliente.getPassword());
        return clienteEntity;
    }

}
