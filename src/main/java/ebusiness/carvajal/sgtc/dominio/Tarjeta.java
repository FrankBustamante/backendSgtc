package ebusiness.carvajal.sgtc.dominio;

import org.springframework.util.StringUtils;

public class Tarjeta {
    private final Cliente cliente;
    private final String nroTarjeta;
    private final String ultimosDigitos;
    private String id;

    public Tarjeta(Cliente cliente, String nroTarjeta, String ultimosDigitos){
        this.cliente = cliente;
        this.nroTarjeta = nroTarjeta;
        this.ultimosDigitos = ultimosDigitos;
    }

    public Tarjeta(Cliente cliente, String nroTarjeta, String ultimosDigitos, String id){
        this.cliente = cliente;
        this.id = id;
        this.nroTarjeta = nroTarjeta;
        this.ultimosDigitos = ultimosDigitos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public String getUltimosDigitos() {
        return ultimosDigitos;
    }


}
