package Models;

import java.util.ArrayList;

public class Mouse {
    
    private int idMouse;
    private String marca;
    private String modelo;
    
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
