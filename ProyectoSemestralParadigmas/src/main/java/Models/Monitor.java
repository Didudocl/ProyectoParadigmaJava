package Models;

import java.util.ArrayList;

public class Monitor {
    
    private int idMonitor;
    private String marca;
    private String modelo;
    private String tamano;
    
    private static ArrayList<Monitor> monitor = new ArrayList<>();

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
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

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public static ArrayList<Monitor> getMonitor() {
        return monitor;
    }

    public static void setMonitor(ArrayList<Monitor> monitor) {
        Monitor.monitor = monitor;
    }

    
    //VALIDACIONES
    
    //Validacion idMonitor
    public boolean ValidaridMonitor(){
        if(this.idMonitor>=0){
            return true;
        }else{
            return false;
        }
    }
    
    //Validacion marca
    
    //Validacion modelo
    
    //Validacion tamano
    
}
