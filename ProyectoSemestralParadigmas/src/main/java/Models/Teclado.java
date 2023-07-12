package Models;

import java.util.ArrayList;

public class Teclado {

    private int idTeclado;
    private String marca;
    private String modelo;
    private String idioma;
    private int existencias;
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

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public static Teclado buscarTecladoPorCodigo(int codigo) {
        for (Teclado teclado : teclado) {
            if (teclado.getIdTeclado() == codigo) {
                return teclado;
            }
        }
        return null; // Retorna null si no se encuentra el teclado con el código especificado
    }

    public void obtenerExistenciasTeclado(int codigoTeclado) {
        Teclado teclado = Teclado.buscarTecladoPorCodigo(codigoTeclado);

        if (teclado != null) {
            int existencias = teclado.getExistencias();
            System.out.println("Existencias del teclado: " + existencias);
        } else {
            System.out.println("No se encontró el teclado con el código proporcionado");
        }
    }

    //VALIDACIONES
    //Validacion idTeclado
    public boolean ValidaridTeclado() {
        if (this.idTeclado >= 0) {
            return true;
        } else {
            return false;
        }
    }

    //Validacion marca
    //Validacion modelo
    //Validacion idioma
}
