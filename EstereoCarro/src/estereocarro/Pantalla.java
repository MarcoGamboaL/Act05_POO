/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estereocarro;

/**
 *
 * @author tania
 */
public class Pantalla {
    private String  dimensiones  ;
    private boolean esDesmontable;
    private boolean esTactil     ;
    
    public Pantalla(){
    }

    public Pantalla(String dimensiones, boolean esDesmontable, boolean esTactil){
        this.dimensiones   = dimensiones;
        this.esDesmontable = esDesmontable;
        this.esTactil      = esTactil;
        
    }
    
    public String getDimensiones (){
     return dimensiones;   
    }
    
    public boolean getEsDesmontable (){
     return esDesmontable;   
    }
    
    public boolean getEsTactil (){
     return esTactil;   
    }    
    
    public void setDimensiones (String dimensiones){
        this.dimensiones = dimensiones;
    }
    
    public void setEsTactil (boolean esTactil){
        this.esTactil = esTactil;
    }
    
    public void setEsDesmontable (boolean esDesmontable){
        this.esDesmontable = esDesmontable;
    }    
    
}

