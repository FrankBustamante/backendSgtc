package ebusiness.carvajal.sgtc.infraestructura.configuracion;

import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioCliente;
import ebusiness.carvajal.sgtc.dominio.repositorio.IRepositorioTarjeta;
import ebusiness.carvajal.sgtc.dominio.servicio.cliente.ServicioCrearCliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {
    @Bean
    public ServicioCrearCliente usuario1(IRepositorioCliente iRepositorioCliente){
        return new ServicioCrearCliente(iRepositorioCliente);
    }
}
