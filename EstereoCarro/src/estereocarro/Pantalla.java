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
public class Pantalla {//atributos de la clase
    private String  dimensiones;
    private boolean esDesmontable;
    private boolean esTactil;
    
    public Pantalla(){//constructor
    }

    public Pantalla(String dimensiones, boolean esDesmontable, boolean esTactil){//constructor sobrecargado
        this.dimensiones   = dimensiones;
        this.esDesmontable = esDesmontable;
        this.esTactil = esTactil;
        
    }
    //setters and getters
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

    @Override
    public String toString() {
        return "Pantalla{" + "dimensiones=" + dimensiones + ", esDesmontable=" + esDesmontable + ", esTactil=" + esTactil + '}';
    }
    
    
    
}

