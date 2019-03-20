/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estereocarro;

/**
 *
 * @author Daniel
 */
public class Emisora {
    private float frecuencia;
    private String nombre;

    public Emisora() {
    }
    
    public Emisora(float frecuencia, String nombre) {
        this.frecuencia = frecuencia;
        this.nombre = nombre;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Emisora{" + "frecuencia=" + frecuencia + ", nombre=" + nombre + '}';
    }
    
    
            
    
}
