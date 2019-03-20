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
 * Falta revisar y agregar todas las validaciones las cuales se debe agregar
 * cuando estén implementadas todas las clases
 * Algunos metodos deben ser revisados.
 * 
 */
public class RadioEstereo {
    private String marca;
    private String dimensiones;
    private ArrayList memoriaAM = new ArrayList(6) ;
    private ArrayList memoriaFM = new ArrayList(18);
    private TipoBanda bandaActual;
    private Emisora emisoraActual;
    private Bluetooth elBluetooth;
    private ArrayList memoriasExternas = new ArrayList();
    private MemoriaExterna memExternaSeleccionada;
    private boolean encendido;

    public RadioEstereo() {
    }

    public RadioEstereo(String marca, String dimensiones, TipoBanda bandaActual, Emisora emisoraActual, Bluetooth elBluetooth, MemoriaExterna memExternaSeleccionada, boolean encendido) {
        this.marca = marca;
        this.dimensiones = dimensiones;
        this.bandaActual = bandaActual;
        this.emisoraActual = emisoraActual;
        this.elBluetooth = elBluetooth;
        this.memExternaSeleccionada = memExternaSeleccionada;
        this.encendido = encendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public ArrayList getMemoriaAM() {
        return memoriaAM;
    }

    public void setMemoriaAM(ArrayList memoriaAM) {
        this.memoriaAM = memoriaAM;
    }

    public ArrayList getMemoriaFM() {
        return memoriaFM;
    }

    public void setMemoriaFM(ArrayList memoriaFM) {
        this.memoriaFM = memoriaFM;
    }

    public TipoBanda getBandaActual() {
        return bandaActual;
    }

    public void setBandaActual(TipoBanda bandaActual) {
        this.bandaActual = bandaActual;
    }

    public Emisora getEmisoraActual() {
        return emisoraActual;
    }

    public void setEmisoraActual(Emisora emisoraActual) {
        this.emisoraActual = emisoraActual;
    }

    public Bluetooth getElBluetooth() {
        return elBluetooth;
    }

    public void setElBluetooth(Bluetooth elBluetooth) {
        this.elBluetooth = elBluetooth;
    }

    public ArrayList getMemoriasExternas() {
        return memoriasExternas;
    }

    public void setMemoriasExternas(ArrayList memoriasExternas) {
        this.memoriasExternas = memoriasExternas;
    }

    public MemoriaExterna getMemExternaSeleccionada() {
        return memExternaSeleccionada;
    }

    public void setMemExternaSeleccionada(MemoriaExterna memExternaSeleccionada) {
        this.memExternaSeleccionada = memExternaSeleccionada;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    
    public void encender(){
        this.encendido=true;
    }
    
    public void apagar(){
        this.encendido=false;
    }
    
    public void asignarEmisoraAMemoria(TipoBanda banda,int numMemoria,Emisora emisora){
        if(banda==TipoBanda.AM){
            memoriaAM.add(numMemoria, emisora);
        }
        if(banda==TipoBanda.FM){
            memoriaFM.add(numMemoria, emisora);
        }
    }
    
    public void  getMemoria(TipoBanda banda,int posicion){
        if(banda==TipoBanda.AM){
          memoriaAM.get(posicion).toString();
        }
        if(banda==TipoBanda.FM){
            memoriaFM.get(posicion).toString();
        }
    }
    
    public void hacerScan(Banda laBanda){//agregar clase banda y como recorrer la misma
        
    }
    
    public void setSigEmisora(TipoBanda banda){
        if(banda==TipoBanda.AM){
            int posSig=memoriaAM.indexOf(emisoraActual)+1;
          //  emisoraActual=memoriaAM[posSig];//revisar corregir
        }
        if(banda==TipoBanda.FM){
            int posSig=memoriaFM.indexOf(emisoraActual)+1;
          //  emisoraActual=memoriaFM[posSig];//revisar corregir
        }
    }
    
  public void setAntEmisora(TipoBanda banda){
        if(banda==TipoBanda.AM){
            int posAnt=memoriaAM.indexOf(emisoraActual)-1;
          //  emisoraActual=memoriaAM[posAnt];//revisar corregir
        }
        if(banda==TipoBanda.FM){
            int posAnt=memoriaFM.indexOf(emisoraActual)-1;
          //  emisoraActual=memoriaFM[posAnt];//revisar corregir
        }
    } 
  
  public void reproducirEmisora(){
      System.out.println("Se esta reproduciendo la emisora: "+emisoraActual.getNombre()+" y su frecuencia es:"+emisoraActual.getFrecuencia()+"\n");
  }
    
  public void reproducirDesdeBluetooth(){
      System.out.println("Se esta reproduciendo desde un dispositivo bluetooth");
  }
  
  public void reproducirDesdeMemoriaExterna(){
      System.out.println("Se esta reproduciendo desde: Memoria Externa");
  }
  
}
