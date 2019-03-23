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

//FALTA LA WEA DEL TO STRING

//CREAO LA CLASE EQUALIZADOR
public class Equalizador {
    
    //INICIALIZO LOS VALORES PRIVADOS
    private int volumen;
    private int bajos  ;
    private int agudos ;

   public Equalizador(){};//NECESITO VER BIEN PARA QUE SIRVE ESTE PEDAZO DE CODIGO


public Equalizador (int elVolumen, int losBajos, int losAgudos){
    
    //OBTENGO LOS VALORES Y LOS GUARDO
    this.volumen = elVolumen;
    this.bajos   = losBajos ;
    this.agudos  = losAgudos;
    
}

// A PARTIR DE AQUIE ESTAN LOS GET DE LA CLASE

public int getVolumen (){
    
    return volumen;
}

public int getBajos   (){
    
    return bajos  ;
}

public int getAgudos  (){
    
    return agudos ;
}

//A PARTIR DE AQUI ESTAN LOS SET DE LA CLASE
public void setVolumen (int elVolumen){
    
    this.volumen = elVolumen;

}

public void setBajos (int losBajos   ){
    
    this.bajos   = losBajos ;

}

public void setAgudos (int losAgudos ){
    
    this.agudos  = losAgudos ;

}


    @Override
    public String toString() {
        return "Equalizador " + "volumen=" + volumen + ", bajos=" + bajos + ", agudos=" + agudos + '\n';
    }
    
}