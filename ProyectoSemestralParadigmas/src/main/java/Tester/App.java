package Tester;

import Controllers.Controller;
import Models.Monitor;
import Models.Mouse;
import Models.Notebook;
import Models.PcEscritorio;
import Models.Teclado;
import Models.Usuario;
import ViewsGUI.PrincipalGUI;
import ViewsGUI.ListarIndividual;

public class App {

    public static void main(String[] args) {

        PrincipalGUI princ = new PrincipalGUI();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);

        // Código para crear instancias de los objetos...
        Controller controller = new Controller();

        // Llamada al método obtenerExistenciasMonitor() con el código del monitor deseado
        int codigoMonitorDeseado = 1;
        controller.obtenerExistenciasMonitor(codigoMonitorDeseado);
        // Llamada al método obtenerExistenciasMouse() con el código del mouse deseado
        int codigoMouseDeseado = 1;
        controller.obtenerExistenciasMouse(codigoMouseDeseado);
        // Llamada al método obtenerExistenciasMouse() con el código del notebook deseado
        int codigoNotebookDeseado = 1;
        controller.obtenerExistenciasNotebook(codigoNotebookDeseado);
        // Llamada al método obtenerExistenciasPcEscritorio() con el código del notebook deseado
        int codigoPcEscritorio = 1;
        controller.obtenerExistenciasPcEscritorio(codigoPcEscritorio);
        // Llamada al método obtenerExistenciasPcEscritorio() con el código del notebook deseado
        int codigoTeclado = 1;
        controller.obtenerExistenciasTeclado(codigoTeclado);
        // Llamada al método obtenerExistenciasUsuario() con el código del usuario deseado
        //String codigoUsiario = ;
        //controller.obtenerExistenciasUsuario(codigoUsiario);
        
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
        note.setCantRam("2");
        note.setProcesador("");
        note.setTamPantalla("");

        //2
        note.setIdNotebook(1);
        note.setMarca("");
        note.setModelo("");
        note.setCantRam("4");
        note.setProcesador("");
        note.setTamPantalla("");

        //3
        note.setIdNotebook(2);
        note.setMarca("");
        note.setModelo("");
        note.setCantRam("8");
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

        user.setNombreUsuario("diegox");
        user.setNombres("Diego Alexis");
        user.setRut("213087703");
        user.setContrasena("diego123");
        user.setApellidoPaterno("Salazar");
        user.setApellidoMaterno("Jara");
        
        
        

    }
}
