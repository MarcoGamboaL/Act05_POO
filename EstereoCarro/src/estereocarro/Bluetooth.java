/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estereocarro;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Bluetooth {
    private boolean encendido;
    private boolean vinculado;
    private ArrayList dispVinculados=new ArrayList();

    public Bluetooth() {
    }

    public Bluetooth(boolean encendido, boolean vinculado, ArrayList dispVinculados) {
        this.encendido = encendido;
        this.vinculado = vinculado;
        this.dispVinculados = dispVinculados;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isVinculado() {
        return vinculado;
    }

    public void setVinculado(boolean vinculado) {
        this.vinculado = vinculado;
    }

    public ArrayList getDispVinculados() {
        return dispVinculados;
    }

    public void setDispVinculados(ArrayList dispVinculados) {
        this.dispVinculados = dispVinculados;
    }

    @Override
    public String toString() {
        return "Bluetooth{" + "encendido=" + encendido + ", vinculado=" + vinculado + ", dispVinculados=" + dispVinculados + '}';
    }
    
    
    
    public void encender(){
        this.encendido=true;
    }
    
    public void apagar(){
        this.encendido=false;
    }
    
    public ArrayList buscarDispositivos(){
       return  this.getDispVinculados();//probalemente mal, de ser necesario corregir
    }
    
    public void vincularDispositivo(Dispositivo unDisp){
        dispVinculados.add(unDisp);
    }
    
}
