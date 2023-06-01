package Controllers;

import Models.Usuario;

public class Controller {

    public void Registrarse(String nombreUsuario, String nombres, String apellidoPaterno, String apellidoMaterno, 
                            String rut, String clave) {
        
        Usuario user = new Usuario();
        //para setear los valores de dueño
        user.setNombreUsuario(nombreUsuario);
        user.setNombres(nombres);
        user.setApellidoPaterno(apellidoPaterno);
        user.setApellidoMaterno(apellidoMaterno);
        user.setRut(rut);
        user.setContrasena(clave);
        Usuario.getUsuario().add(user);
    }
    
    
    
        
}
