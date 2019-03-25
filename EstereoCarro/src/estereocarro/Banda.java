/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estereocarro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tania
 */
public final class Banda {
    
    private TipoBanda tipo;
    private ArrayList<Emisora> listaEmisoras = new ArrayList();
  
    public Banda (){
    
    }
    
    public Banda (TipoBanda tipo, ArrayList emisoras){
    
            this.listaEmisoras = emisoras;
            this.tipo = tipo;
            
    }
    
    public TipoBanda getTipo(){
        return tipo;
    }
    
    public List getListaEmisoras (){
        return listaEmisoras;
    }
    
    public void setTipo(TipoBanda tipo){
        this.tipo = tipo;
    }
    
    public void setListaEmisoras (ArrayList emisoras){
        this.listaEmisoras = emisoras;
    }
    //recorre la lista de emisoras y verifica que no exista una emisora con los datos de la que se desea agregar
    public boolean agregarEmisora(Emisora unaEmisora){
        for (int i=0; i < listaEmisoras.size(); i++){
            if (listaEmisoras.get(i).getFrecuencia()==unaEmisora.getFrecuencia() || listaEmisoras.get(i).getNombre()==unaEmisora.getNombre() ){
                return false;
            }
        }
        listaEmisoras.add(unaEmisora);
        return true;
    }
}

