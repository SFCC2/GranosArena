/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sulay2016
 */
public class Pila_Lista<T>{
        private Pila pila;

        public Pila_Lista() {
            pila = null;
        }
        
        public void print(){
            Pila temporal;
            temporal = pila;
            if(temporal != null){
                while(temporal.siguiente != null){
                    System.out.print(temporal.elemento);
                    temporal = temporal.siguiente;
                }
                System.out.print(temporal.elemento);
            }
        }
        
        public int length(){
            Pila temporal;
            int total = 0;
            temporal = pila;
            if(temporal != null){
                while(temporal.siguiente != null){
                    total += 1;
                    temporal = temporal.siguiente;
                }
                total+=1;
            }
            return total;
        }
        
        public void push(T elemento){
            Pila nueva;
            nueva= new Pila(elemento);
            
            if(pila == null){
                pila = nueva;
            }else{
                nueva.siguiente = pila;
                pila = nueva;
            }
        }
        
        
        public void pop(){
            if(pila == null){
                return;
            }else{
                if(pila.siguiente == null){
                    vaciarPila();  
                }else{
                    pila = pila.siguiente;
                }
            }
        }
        
        public void vaciarPila(){
            while (pila!=null) {            
                pila = null;
            }
        }
    }
