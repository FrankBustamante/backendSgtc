package ebusiness.carvajal.sgtc.aplicacion.comando;

import org.springframework.stereotype.Component;

public class ComandoCliente {
    private final String nombreUsuario;
    private final String email;
    private final String password;
    private final String id;

    public ComandoCliente(String nombreUsuario, String email, String password, String id) {
        this.nombreUsuario = nombreUsuario;
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public String getId() {return id;}

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
