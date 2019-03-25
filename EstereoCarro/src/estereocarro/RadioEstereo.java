/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estereocarro;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Daniel
 * 
 */
public class RadioEstereo {
    private String marca;
    private String dimensiones;
    private Emisora[] memoriaAM = new Emisora[6] ;
    private Emisora[] memoriaFM = new Emisora[18];
    private TipoBanda bandaActual;
    private Emisora emisoraActual;
    private Bluetooth elBluetooth;
    private ArrayList <MemoriaExterna>memoriasExternas = new ArrayList();
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

    public Emisora[] getMemoriaAM() {
        return memoriaAM;
    }

    public void setMemoriaAM(Emisora[] memoriaAM) {
        this.memoriaAM = memoriaAM;
    }

    public Emisora[] getMemoriaFM() {
        return memoriaFM;
    }

    public void setMemoriaFM(Emisora[] memoriaFM) {
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

    public List getMemoriasExternas() {
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

    public boolean estaEncendido() {
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
            if(numMemoria >= 0 && numMemoria < memoriaAM.length){
                memoriaAM[numMemoria]=emisora;
            }
        }
        if(banda==TipoBanda.FM){
            if(numMemoria >= 0 && numMemoria < memoriaFM.length){
            memoriaFM[numMemoria] = emisora ;
            
            }
        }
    }
    
    public Emisora getMemoria(TipoBanda banda,int posicion){//falla se debe corregir
        if(banda==TipoBanda.AM && posicion<memoriaAM.length && memoriaAM[posicion]!=null){
            System.out.println("Emisora guardada: "+memoriaAM[posicion].toString());
            return memoriaAM[posicion];
        }
        if(banda==TipoBanda.FM && posicion<memoriaFM.length && memoriaFM[posicion]!=null){
            System.out.println("Emisora Guardada: "+memoriaFM[posicion].toString());
            
        }
        
        return null;
    }
    
    public void hacerScan(Banda laBanda){//agregar clase banda y como recorrer la misma
      int numero= (int) (Math.random()*laBanda.getListaEmisoras().size());//seleciona un numero aleatorio entre los elementos de la banda
        
        //se Establece la emisora actual en la emisora encontrada por el Scan
        Object [] array = laBanda.getListaEmisoras().toArray();
        Emisora emisoraAleatoria = (Emisora) array[numero];
        emisoraActual = emisoraAleatoria;
        System.out.println("Esta escuchando: "+emisoraActual.getFrecuencia()+" "+emisoraActual.getNombre());//indica cual emisora esta sonando 
        
        /**El metodo en comentarios abajo debería:
         * mostrar la informacion de todas las emisoras
         * en la banda seleccionada, 
         * esperando 5 segundos entre una y otra
         */
        
     /* for (int i=0; i<laBanda.getListaEmisoras().size(); i++){
          new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                
            }
        }, 5000); 
        System.out.println("Esta escuchando: "+laBanda.getListaEmisoras().get(i).toString());*/
    }
        
        
        
   
    public void setSigEmisora(TipoBanda banda){
        if(banda==TipoBanda.AM && bandaActual==TipoBanda.AM){
            
    }
    }
    
  public void setAntEmisora(TipoBanda banda){
       
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
