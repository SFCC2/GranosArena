/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sulay2016
 */
public class Mapa {
    
    private Pila_Lista[][] mapa;
    private static String grano = "*";
    
    
    public Mapa(){
        this.mapa = new Pila_Lista[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mapa[i][j] = new Pila_Lista();        
            }
        }
    }
    
    public void print(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mapa[i][j].length() + " | ");
            }
            System.out.println("");
        }
    }
    
    public void printGranos(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mapa[i][j].print();
                System.out.print(" | ");
            }
            System.out.println("");
        }
    }
    
    public void InsetarGrano(int fila, int columna){
        mapa[fila][columna].push(grano);
    }
    
    
    public boolean InsetarGrano(){
        boolean inserto = false;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(mapa[i][j].length()>0 && mapa[i][j].length()<4 && inserto == false){
                    InsetarGrano(i,j);
                    inserto = true;
                }
            }
        }
                
        if(inserto == false){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(mapa[i][j].length() == 0 && inserto == false){
                        InsetarGrano(i,j);
                        inserto = true;
                    }
                }
            }
        }
        
        return inserto;
        
    }
    
    
    
    
}
