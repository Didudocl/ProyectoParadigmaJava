package Models;

import java.util.ArrayList;

public class Mouse {
    
    private int idMouse;
    private String marca;
    private String modelo;
    private int existencias;
    
    private static ArrayList<Mouse> mouse = new ArrayList<>();

    public int getIdMouse() {
        return idMouse;
    }

    public void setIdMouse(int idMouse) {
        this.idMouse = idMouse;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static ArrayList<Mouse> getMouse() {
        return mouse;
    }

    public static void setMouse(ArrayList<Mouse> mouse) {
        Mouse.mouse = mouse;
    }
    
    public int getExistencias() {
    return existencias;
    }

    public void setExistencias(int existencias) {
    this.existencias = existencias;
    }
    
    public static Mouse buscarMousePorCodigo(int codigo) {
        for (Mouse mouse : mouse) {
            if (mouse.getIdMouse()== codigo) {
                return mouse;
            }
        }
        return null; // Retorna null si no se encuentra el mouse con el código especificado
    }
    
    public void obtenerExistenciasMouse(int codigoMouse) {
        Mouse mouse = Mouse.buscarMousePorCodigo(codigoMouse);

        if (mouse != null) {
            int existencias = mouse.getExistencias();
            System.out.println("Existencias del mouse: " + existencias);
        } else {
            System.out.println("No se encontró el mouse con el código proporcionado");
        }
    }
    
    //VALIDACIONES
    
    //Validacion para idMouse
    public boolean ValidaridMouse(){
        if(this.idMouse>=0)
        {
            return true;
        }else{
            return false;
        }   
    }
    
    //Validacion para marca
    
    
    //Validacion para modelo
    
    

}
