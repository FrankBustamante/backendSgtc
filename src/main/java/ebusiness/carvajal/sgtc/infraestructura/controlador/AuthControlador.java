package ebusiness.carvajal.sgtc.infraestructura.controlador;

import ebusiness.carvajal.sgtc.aplicacion.comando.ComandoUsuarioLogin;
import ebusiness.carvajal.sgtc.dominio.Cliente;
import ebusiness.carvajal.sgtc.infraestructura.seguridad.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthControlador {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtProvider jwtProvider;
    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("")
    public String listar(){
        return "{datos: 123}";
    }

    @PostMapping("/login")
    public String login(@RequestBody ComandoUsuarioLogin usuarioLogin, final HttpServletRequest request){
        /*
        Authentication authentication =
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(usuarioLogin.getEmail(), usuarioLogin.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
         */

        UsernamePasswordAuthenticationToken auth =
                new UsernamePasswordAuthenticationToken(usuarioLogin.getEmail(), usuarioLogin.getPassword());
        SecurityContextHolder.getContext().setAuthentication(auth);

        String token =  jwtProvider.generateToken(auth);;
        return token;
    }

}
