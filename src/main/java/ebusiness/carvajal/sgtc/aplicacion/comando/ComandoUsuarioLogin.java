package ebusiness.carvajal.sgtc.aplicacion.comando;

public class ComandoUsuarioLogin {
    private String email;
    private String password;

    public ComandoUsuarioLogin(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
