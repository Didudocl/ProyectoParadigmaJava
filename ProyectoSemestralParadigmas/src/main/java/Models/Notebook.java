package Models;

import java.util.ArrayList;

public class Notebook {
    
    private int idNotebook;
    private String marca;
    private String modelo;
    private String cantRam;
    private String procesador;
    private String tamPantalla;
    private int existencias;
    
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

    public String getCantRam() {
        return cantRam;
    }

    public void setCantRam(String cantRam) {
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

    public int getExistencias() {
    return existencias;
    }

    public void setExistencias(int existencias) {
    this.existencias = existencias;
    }
    
    public static Notebook buscarNotebookPorCodigo(int codigo) {
        for (Notebook notebook : notebook) {
            if (notebook.getIdNotebook()== codigo) {
                return notebook;
            }
        }
        return null; // Retorna null si no se encuentra el notebook con el código especificado
    }
    
    public void obtenerExistenciasNotebook(int codigoNotebook) {
        Notebook notebook = Notebook.buscarNotebookPorCodigo(codigoNotebook);

        if (notebook != null) {
            int existencias = notebook.getExistencias();
            System.out.println("Existencias del notebook: " + existencias);
        } else {
            System.out.println("No se encontró el notebook con el código proporcionado");
        }
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
        if(this.cantRam.equals("2") || this.cantRam.equals("4") || this.cantRam.equals("8") || this.cantRam.equals("16")){
            return true;
        }else{
            return false;
        }
    }
    //Validacion procesador
    
    //Validacion tamPantalla
    
}
