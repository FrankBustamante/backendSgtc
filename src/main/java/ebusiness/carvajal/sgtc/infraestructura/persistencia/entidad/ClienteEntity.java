package ebusiness.carvajal.sgtc.infraestructura.persistencia.entidad;

import javax.persistence.*;

@Entity(name = "clientes")
public class ClienteEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @Column( nullable = false)
    private String nombreUsuario;

    @Column( nullable = false)
    private String email;

    @Column( nullable = false)
    private String password;

    public Long getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
