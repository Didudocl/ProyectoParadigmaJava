package Models;

import java.util.ArrayList;

public class Notebook {
    
    private int idNotebook;
    private String marca;
    private String modelo;
    private int cantRam;
    private String procesador;
    private String tamPantalla;
    
    private static ArrayList<Notebook> notebook = new ArrayList<>();

    public int getIdNotebook() {
        return idNotebook;
    }

    public void setIdNotebook(int idNotebook) {
        this.idNotebook = idNotebook;
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

    public int getCantRam() {
        return cantRam;
    }

    public void setCantRam(int cantRam) {
        this.cantRam = cantRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTamPantalla() {
        return tamPantalla;
    }

    public void setTamPantalla(String tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    public static ArrayList<Notebook> getNotebook() {
        return notebook;
    }

    public static void setNotebook(ArrayList<Notebook> notebook) {
        Notebook.notebook = notebook;
    }

    
    //VALIDACIONES
    
    //Validacion para idNotebook
    public boolean ValidaridNotebook(){
        if(this.idNotebook>=0){
            return true;
        }else{
            return false;
        }
    }
        
    //Validacion marca
    
    //Validacion modelo
    
    //Validacion cantRam
    public boolean ValidarcantRam(){
        if(this.cantRam == 2 || this.cantRam == 4 || this.cantRam == 8 || this.cantRam == 16){
            return true;
        }else{
            return false;
        }
    }
    //Validacion procesador
    
    //Validacion tamPantalla
    
}
