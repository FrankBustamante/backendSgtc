package ebusiness.carvajal.sgtc.aplicacion.comando;

import ebusiness.carvajal.sgtc.dominio.Cliente;

public class ComandoTarjeta {
    private Cliente cliente;
    private final String nroTarjeta;
    private String ultimosDigitos;
    private final String id;


    public ComandoTarjeta(String nroTarjeta, String id){
        this.id = id;
        this.nroTarjeta = nroTarjeta;
        this.ultimosDigitos = this.getLastDigits(nroTarjeta);
    }

    public String getId() {
        return id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getUltimosDigitos() {
        return ultimosDigitos;
    }

    public String getNroTarjeta() {
        return nroTarjeta;
    }

    private String getLastDigits(String digits){
        int take = 4;
        String result = "";
        String[] arr = digits.split("");

        for(int i=arr.length;i>(arr.length-take);i--){
            result = arr[i-1] + result;
        }
        return result;
    }
}
