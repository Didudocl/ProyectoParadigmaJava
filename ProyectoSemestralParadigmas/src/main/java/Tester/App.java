package Tester;
import Models.Monitor;
import Models.Mouse;
import Models.Notebook;
import Models.PcEscritorio;
import Models.Teclado;
import Models.Usuario;
import ViewsGUI.PrincipalGUI;


public class App {
    public static void main(String[] args) {
        
        
        PrincipalGUI princ = new PrincipalGUI();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);  
        
       
        //Ingresar Monitor
        Monitor mon = new Monitor();
        
        //1
        mon.setIdMonitor(0);
        mon.setMarca("");
        mon.setModelo("");
        mon.setTamano("");
        
        //2
        mon.setIdMonitor(1);
        mon.setMarca("");
        mon.setModelo("");
        mon.setTamano("");
        
        //3
        mon.setIdMonitor(2);
        mon.setMarca("");
        mon.setModelo("");
        mon.setTamano("");
        
        //Ingresar Mouse
        Mouse mouse = new Mouse();
        
        //1
        mouse.setIdMouse(0);
        mouse.setMarca("");
        mouse.setModelo("");
        
        //2
        mouse.setIdMouse(1);
        mouse.setMarca("");
        mouse.setModelo("");
        
        //3
        mouse.setIdMouse(2);
        mouse.setMarca("");
        mouse.setModelo("");
        
        //Ingresar Notebook
        Notebook note = new Notebook();
        
        //1
        note.setIdNotebook(0);
        note.setMarca("");
        note.setModelo("");
        note.setCantRam(2);
        note.setProcesador("");
        note.setTamPantalla("");
        
        //2
        note.setIdNotebook(1);
        note.setMarca("");
        note.setModelo("");
        note.setCantRam(4);
        note.setProcesador("");
        note.setTamPantalla("");
        
        //3
        note.setIdNotebook(2);
        note.setMarca("");
        note.setModelo("");
        note.setCantRam(8);
        note.setProcesador("");
        note.setTamPantalla("");
        
        //Ingresar PcEscritorio
        //PcEscritorio Pc = new PcEscritorio();
        
        
        //Ingresar Teclado
        Teclado teclado = new Teclado();
        
        //1
        teclado.setIdTeclado(0);
        teclado.setIdioma("");
        teclado.setMarca("");
        teclado.setModelo("");
        
        //2
        teclado.setIdTeclado(1);
        teclado.setIdioma("");
        teclado.setMarca("");
        teclado.setModelo("");
        
        //3
        teclado.setIdTeclado(2);
        teclado.setIdioma("");
        teclado.setMarca("");
        teclado.setModelo("");
        
        
        //Ingresar Usuario
        Usuario user = new Usuario();
        
        user.setNombreUsuario("");
        user.setNombres("");
        user.setRut("");
        user.setContrasena("");
        user.setApellidoPaterno("");
        user.setApellidoMaterno("");
        
    }
}
