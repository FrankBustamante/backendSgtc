package ebusiness.carvajal.sgtc.infraestructura.persistencia.builder;

import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.dominio.Tarjeta;
import ebusiness.carvajal.sgtc.infraestructura.persistencia.entidad.TarjetaEntity;

public class TarjetaBuilder {
    private  TarjetaBuilder(){}

    public static Tarjeta convertir(TarjetaEntity tarjetaEntity){
        if (tarjetaEntity == null) return null;
        Cliente cliente = ClienteBuilder.convertir(tarjetaEntity.getCliente());
        return new Tarjeta(cliente, tarjetaEntity.getNroTarjeta(), tarjetaEntity.getUltimosDigitos(), String.valueOf(tarjetaEntity.getId()));
    }

    public static TarjetaEntity convertir(Tarjeta tarjeta){
        TarjetaEntity tarjetaEntity = new TarjetaEntity();
        if(tarjeta.getId() != null)tarjetaEntity.setId(Long.parseLong(tarjeta.getId()));
        tarjetaEntity.setCliente(ClienteBuilder.convertir(tarjeta.getCliente()));
        tarjetaEntity.setNroTarjeta(tarjeta.getNroTarjeta());
        tarjetaEntity.setUltimosDigitos(tarjeta.getUltimosDigitos());
        return tarjetaEntity;
    }
}
