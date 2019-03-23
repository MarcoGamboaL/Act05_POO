/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estereocarro;

import java.util.ArrayList;

/**
 *
 * @author tania
 */
public class Banda {
    
    private TipoBanda tipo                      ;
    private ArrayList emisoras = new ArrayList();
  
    public Banda (){}
    
    public Banda (TipoBanda tipo, ArrayList emisoras){
    
            this.emisoras = emisoras;
            this.tipo     = tipo    ;
            
    }
    
    public TipoBanda getTipo(){
        return tipo;
    }
    
    public ArrayList getEmisoras (){
        return emisoras;
    }
    
    public void setTipo(TipoBanda tipo){
        this.tipo = tipo;
    }
    
    public void setEmisoras (ArrayList emisoras){
        this.emisoras = emisoras;
    }
}

