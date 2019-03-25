/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estereocarro;

import java.util.Arrays;

/**
 *
 * @author Daniel
 */
//Aqui se haceb las pruebas, cambiar nombre
public class EstereoCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(">>>>>>>Programacion del radio Tania y Marco<<<<<<<\n");
        //creacion de las bandas
        Banda bandaAM = new Banda();
        Banda bandaFM=new Banda();
       
        //creación de las emisoras AM
        Emisora pop =new Emisora((float) 92.3,"Jackson´s Spirit");
        Emisora death =new Emisora((float) 107.5,"Nuclear Blast");
        Emisora metal = new Emisora((float)94.7,"Napalm Estereo");
        Emisora kaz =new Emisora((float) 91.7,"Robot Music"); 
        Emisora dust =new Emisora((float) 107.5,"Nube Estereo");
        Emisora stone = new Emisora((float)94.7,"Thunder Songs");
        Emisora fire = new Emisora((float) 92.3,"Leaf Estereo");
        Emisora ghost =new Emisora((float) 107.5,"Blind Shield");
        Emisora dragon = new Emisora((float)94.7,"Ride Estereo");
        Emisora sword = new Emisora((float)87.2,"Sword Music");
        //Creación de las emisoras FM(Tania)
        
        
        //aqui se agregan las canciones a la banda AM
        bandaAM.agregarEmisora(sword);
        bandaAM.agregarEmisora(dragon);
        bandaAM.agregarEmisora(ghost);
        bandaAM.agregarEmisora(fire);
        bandaAM.agregarEmisora(stone);
        bandaAM.agregarEmisora(dust);
        bandaAM.agregarEmisora(pop);
        bandaAM.agregarEmisora(kaz);
        bandaAM.agregarEmisora(metal);
        bandaAM.agregarEmisora(death);
        
        //aqui se agrgan las canciones de la banda FM(Tania)
        
        
        //Memoria SD
        MemoriaExterna miSD =new MemoriaExterna();
        miSD.setTipo(TipoMemoria.SD);
        
        //Memoria USB
        MemoriaExterna miUSB = new MemoriaExterna();
        miUSB.setTipo(TipoMemoria.USB);
        
        //dispositivo
        Dispositivo miDispositivo = new Dispositivo();
        
        //Radio
        RadioEstereo miRadio = new RadioEstereo();
        
        //incorporar SD y USB
        miRadio.getMemoriasExternas().add(miSD);
        miRadio.getMemoriasExternas().add(miUSB);
        
        //bluetooth
        Bluetooth miBluetooth = new Bluetooth();
        miBluetooth.vincularDispositivo(miDispositivo);
        
        //incorporar bluetooth al radio
        miRadio.setElBluetooth(miBluetooth);
        
        //Scan de emisoras 
        miRadio.hacerScan(bandaAM);
        //miRadio.hacerScan(bandaFM);
        
        //reproducir Emisora
        miRadio.reproducirEmisora();
        
        
    }
    
}
