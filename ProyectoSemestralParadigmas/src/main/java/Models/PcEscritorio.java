package Models;

import java.util.ArrayList;

public class PcEscritorio {
    
    private int idPc;
    private String marca;
    private String modelo;
    private int cantRam;
    private String procesador;
    private Teclado teclado;
    private Mouse mouse;
    private Monitor monitor;
    private static ArrayList<PcEscritorio> pcescritorio = new ArrayList<>();


    public int getIdPc() {
        return idPc;
    }

    public void setIdPc(int idPc) {
        this.idPc = idPc;
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

    public static ArrayList<PcEscritorio> getPcescritorio() {
        return pcescritorio;
    }

    public static void setPcescritorio(ArrayList<PcEscritorio> pcescritorio) {
        PcEscritorio.pcescritorio = pcescritorio;
    }
    
    //Le paso los datos de teclado, mouse, monitor
    public PcEscritorio(Teclado teclado, Mouse mouse, Monitor monitor){
        this.teclado = teclado;
        this.mouse = mouse;
        this.monitor = monitor;
    }
    
    
    //VALIDACIONES
    
    //Validacion idPc
    public boolean ValidaridPc(){
        if(this.idPc >= 0){
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
}
