/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author usuario
 */
public class Pila<T> {
    T elemento;
    Pila siguiente;

    public Pila(T nuevo) {
        elemento = nuevo;
        siguiente = null;
    }
}


