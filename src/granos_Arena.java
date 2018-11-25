


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class granos_Arena {
    
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        
        mapa.print();
        System.out.println("");
        
        mapa.InsetarGrano(1, 1);
        
        mapa.print();
        System.out.println("");
        
        while (mapa.InsetarGrano()) {
            mapa.print();
            System.out.println("");
            mapa.printGranos();
            System.out.println("");
        }
        
        mapa.print();
        System.out.println("");
        
        mapa.printGranos();
        System.out.println("");

        
    }
    
}
