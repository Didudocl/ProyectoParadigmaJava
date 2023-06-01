package Models;

import java.util.ArrayList;

public class Teclado {
    
    private int idTeclado;
    private String marca;
    private String modelo;
    private String idioma;
    
    private static ArrayList<Teclado> teclado = new ArrayList<>();

    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public static ArrayList<Teclado> getTeclado() {
        return teclado;
    }

    public static void setTeclado(ArrayList<Teclado> teclado) {
        Teclado.teclado = teclado;
    }

    
    //VALIDACIONES
    
    //Validacion idTeclado
    public boolean ValidaridTeclado(){
        if(this.idTeclado >= 0){
            return true;
        }else{
            return false;
        }
    }
    
    //Validacion marca
    
    //Validacion modelo
    
    //Validacion idioma
    
}
