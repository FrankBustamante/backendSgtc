package ebusiness.carvajal.sgtc.dominio;

public class Cliente {
    private final String nombreUsuario;
    private final String email;
    private String password;
    private String id;

    public Cliente(String password, String nombreUsuario, String email){
        this.email = email;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
    }

    public Cliente(String password, String nombreUsuario, String email, String id){
        this.email = email;
        this.id = id;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
    }

    public Cliente(String nombreUsuario, String email){
        this.email = email;
        this.id = null;
        this.password = null;
        this.nombreUsuario = nombreUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }
}
