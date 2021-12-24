package ebusiness.carvajal.sgtc.infraestructura.persistencia.entidad;

import javax.persistence.*;

@Entity(name = "tarjetas")
public class TarjetaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private ClienteEntity cliente;

    @Column( nullable = false)
    private String nroTarjeta;

    @Column( nullable = false )
    private String ultimosDigitos;

    public Long getId() {
        return id;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public String getUltimosDigitos() {
        return ultimosDigitos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public void setUltimosDigitos(String ultimosDigitos) {
        this.ultimosDigitos = ultimosDigitos;
    }
}
