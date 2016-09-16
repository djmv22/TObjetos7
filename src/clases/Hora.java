/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author DanielDeJesus
 */
public class Hora {
    
    private int horas;
    private int minutos;
    private int segundos;
    
    public Hora (int horas, int minutos, int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }
    
    public Hora(){
        this.horas=00;
        this.minutos=00;
        this.segundos=00;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public int validar(){
        int aux;
        if (this.getHoras()<=23 && this.minutos<=59 && this.segundos<=59){
            aux = 0;
        }
        else{
            aux = 1;
        }
        return aux;
    }
    
    public String mostrar(){
        String m;
        m = "La hora es: "+this.getHoras()+":"+this.getMinutos()+":"+this.getSegundos();
        return m;
    }
    
    public String igualar(Hora h){
        String aux;
        if (this.getHoras()==h.getHoras() && this.getMinutos()==h.getMinutos() && this.getSegundos()==h.getSegundos()){
            aux = "Ambas horas son iguales";
        }
        else{
            aux = "Ambas horas son distintas";
        }
        return aux;
    }
     
    public String menorQue(Hora h){
        String aux;
        if(this.getHoras()<h.getHoras()){
            aux = "La primera hora es menor a la segunda";
        }
        else if(h.getHoras()<this.getHoras()){
            aux = "La segunda hora es menor a la primera";
        }
        else if(this.getMinutos()<h.getMinutos()){
            aux = "La primera hora es menor a la segunda";
        }
        else if(h.getMinutos()<this.getMinutos()){
            aux = "La segunda hora es menor a la primera";
        }
        else if(this.getSegundos()<h.getSegundos()){
            aux = "La primera hora es menor a la segunda";
        }
        else if(h.getSegundos()<this.getSegundos()){
            aux = "La segunda hora es menor a la primera";
        }
        else{
            aux = "Ambas horas son iguales";
        }
        return aux;
    }
    
    public String mayorQue(Hora h){
        String aux;
        if(this.getHoras()>h.getHoras()){
            aux = "La primera hora es mayor a la segunda";
        }
        else if(h.getHoras()>this.getHoras()){
            aux = "La segunda hora es mayor a la primera";
        }
        else if(this.getMinutos()>h.getMinutos()){
            aux = "La primera hora es mayor a la segunda";
        }
        else if(h.getMinutos()>this.getMinutos()){
            aux = "La segunda hora es mayor a la primera";
        }
        else if(this.getSegundos()>h.getSegundos()){
            aux = "La primera hora es mayor a la segunda";
        }
        else if(h.getSegundos()>this.getSegundos()){
            aux = "La segunda hora es mayor a la primera";
        }
        else{
            aux = "Ambas horas son iguales";
        }
        return aux;
    }
    
}
