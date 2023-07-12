package Controllers;

import Models.Usuario;
import Models.Monitor;
import Models.Mouse;
import Models.Notebook;
import Models.PcEscritorio;
import Models.Teclado;
import java.util.ArrayList;

public class Controller {

    
     public String login(String user, String password){
        
        Usuario usuario = Usuario.busquedaUsuario(user, password);
        
        String mensaje="";
        if(usuario != null){
            
          mensaje = "Usuario y contraseña correctas";  
        }
        else{
            mensaje = "Usuario no encontrado";
        }
        
        return mensaje;
    }
    
    
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
    
    
    public void agregarProducto(String producto, int id, String marca, String idioma, String modelo, String ram, 
            String procesador, String tamanopantalla)
    {
        Teclado teclado = new Teclado();
        Mouse mouse = new Mouse();
        Notebook note = new Notebook();
        Monitor monitor = new Monitor();
        
        switch (producto) {
       //setea los datos segun los parametros que recibe la funcion desde el ViewsGUI/AgregarProducto
            case "Teclado":
                if(teclado.getIdTeclado() != id){
                    teclado.setIdTeclado(id);
                }
                teclado.setMarca(marca);
                teclado.setIdioma(idioma);
                teclado.setModelo(modelo);
                teclado.getTeclado().add(teclado);
                
                break;
        
            case "Mouse":
                if(mouse.getIdMouse() != id){
                    mouse.setIdMouse(id);
                }
                mouse.setMarca(marca);
                mouse.setModelo(modelo);
                mouse.getMouse().add(mouse);
                break;
                
        
            case "Notebook":
                if(note.getIdNotebook() != id){
                    note.setIdNotebook(id);
                }
                note.setCantRam(ram);
                note.setMarca(marca);
                note.setModelo(modelo);
                note.setProcesador(procesador);
                note.setTamPantalla(tamanopantalla);
                note.getNotebook().add(note);
                break;
        
            case "Monitor":
                if(monitor.getIdMonitor() != id){
                    monitor.setIdMonitor(id);
                }
                monitor.setMarca(marca);
                monitor.setModelo(modelo);
                monitor.setTamano(tamanopantalla);
                monitor.getMonitor().add(monitor);
                break;
            default:
                break;
        }
        
    }

   
    
    public void listarINDteclado(String producto, String id){
        
        Teclado teclado = new Teclado();
        Mouse mouse = new Mouse();
        Notebook note = new Notebook();
        Monitor monitor = new Monitor();
        
        if(producto.equals("Teclado") && id.equals(teclado.getIdTeclado())){
            //muestra el teclado y sus caracteristicas segun el id
        }
        else if(producto.equals("Mouse") && id.equals(mouse.getIdMouse())){
            //muestra el mouse y sus caracteristicas segun el id
        }
        else if(producto.equals("Notebook") && id.equals(note.getIdNotebook())){
            //muestra el notebook y sus caracteristicas segun el id
        }
        else if(producto.equals("Monitor") && id.equals(monitor.getIdMonitor())){
            //muestra el monitor y sus caracteristicas segun el id
        }
      
    }

    public void obtenerExistenciasMonitor(int codigoMonitor) {
        Monitor monitor = Monitor.buscarMonitorPorCodigo(codigoMonitor);

        if (monitor != null) {
            int existencias = monitor.getExistencias();
            System.out.println("Existencias del monitor: " + existencias);
        } else {
            System.out.println("No se encontro el monitor con el codigo proporcionado");
        }
    }

    public void obtenerExistenciasMouse(int codigoMouse) {
        Mouse mouse = Mouse.buscarMousePorCodigo(codigoMouse);

        if (mouse != null) {
            int existencias = mouse.getExistencias();
            System.out.println("Existencias del mouse: " + existencias);
        } else {
            System.out.println("No se encontro el mouse con el codigo proporcionado");
        }
    }

    public void obtenerExistenciasNotebook(int codigoNotebook) {
        Notebook notebook = Notebook.buscarNotebookPorCodigo(codigoNotebook);

        if (notebook != null) {
            int existencias = notebook.getExistencias();
            System.out.println("Existencias del notebook: " + existencias);
        } else {
            System.out.println("No se encontro el notebook con el codigo proporcionado");
        }
    }

    public void obtenerExistenciasPcEscritorio(int codigoPcEscritorio) {
        PcEscritorio pcescritorio = PcEscritorio.buscarPcEscritorioPorCodigo(codigoPcEscritorio);

        if (pcescritorio != null) {
            int existencias = pcescritorio.getExistencias();
            System.out.println("Existencias del Pc de escritorio: " + existencias);
        } else {
            System.out.println("No se encontro el Pc de esritorio con el codigo proporcionado");
        }
    }
    
    public void obtenerExistenciasTeclado(int codigoTeclado) {
        Teclado teclado = Teclado.buscarTecladoPorCodigo(codigoTeclado);

        if (teclado != null) {
            int existencias = teclado.getExistencias();
            System.out.println("Existencias del teclado: " + existencias);
        } else {
            System.out.println("No se encontro el teclado con el código proporcionado");
        }
    }
    
    public void obtenerExistenciasUsuario(String codigoUsuario) {
        Usuario usuario = Usuario.buscarUsuarioPorCodigo("codigoUsuario");

        if (usuario != null) {
            int existencias = usuario.getExistencias();
            System.out.println("Existencias del usuario: " + existencias);
        } else {
            System.out.println("No se encontro el usuario con el código proporcionado");
        }
    }
}
