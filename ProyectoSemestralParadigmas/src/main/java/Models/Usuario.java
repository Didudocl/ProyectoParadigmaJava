package Models;

import java.util.ArrayList;

public class Usuario {
    
    private String rut;
    private String nombreUsuario;
    private String contrasena;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    
    private static ArrayList<Usuario> usuario = new ArrayList<>();

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public static ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public static void setUsuario(ArrayList<Usuario> usuario) {
        Usuario.usuario = usuario;
    }
    
    
    //VALIDACIONES
    
    //Validacion rut
    /*
    public void Validarrut(){
{
    String DigitoOK = "";
    int Acumulador = 0;
    int Contador = 2;
    
    while (this.rut!=0)
    {
        int Multiplo = (this.rut % 10) * Contador;
        Acumulador = Acumulador + Multiplo;
        this.rut = Math.round(this.rut / 10);
        Contador++;
        if(Contador == 8){ 
            Contador = 2;
        }
    }
    int Residuo = 11 - (Acumulador % 11);
    //
    if (Residuo < 10)
    {
        DigitoOK = String.valueOf(Residuo);
   }
    else if(Residuo == 10)
    { 
        DigitoOK = "K";
   }
    else
    {
        DigitoOK = "0";
    }
}
        System.out.println(DigitoOK; 
    }
    */
    
    /*
    public class ValidacionRut {
        private int rut;
        private String rutDigito;
        private int Digito;
        private int Multiplo;
        private int Acumulador;

    public ValidacionRut(String rutDigito, int Digito, int Multiplo, int Acumulador, int rut) {
        this.rutDigito = rutDigito;
        this.Digito = Digito;
        this.Multiplo = Multiplo;
        this.Acumulador = Acumulador;
    }

    public ValidacionRut() {
    }

    public String getRutDigito() {
        return rutDigito;
    }

    public void setRutDigito(String rutDigito) {
        this.rutDigito = rutDigito;
    }

    public int getDigito() {
        return Digito;
    }

    public void setDigito(int Digito) {
        this.Digito = Digito;
    }

    public int getMultiplo() {
        return Multiplo;
    }

    public void setMultiplo(int Multiplo) {
        this.Multiplo = Multiplo;
    }

    public int getAcumulador() {
        return Acumulador;
    }

    public void setAcumulador(int Acumulador) {
        this.Acumulador = Acumulador;
    }
    public int getRut() {
        return rut;
    }
    
    public void setRut(int rut){
        this.rut=rut;
    }
    public void ValidarRut(){
        int contador;
        contador=2;
        Acumulador=0;
        while (rut!=0){
            Multiplo=(rut%10)*contador;
            Acumulador=Acumulador+Multiplo;
            rut=rut/10;
            contador=contador++;
            if(contador==8){
                contador=2;
            }
        }
      
    }
    
}
    */
    //Validacion nombreUsuario
    
    //Validacion contrasena
    
    //Validacion nombres
    
    //Validacion apellidoPaterno
    
    //Validacion apellidoMaterno
}
