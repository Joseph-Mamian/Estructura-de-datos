package com.mycompany.doble;

public class NodoDoble {
    
    private NodoDoble anterior;
    private NodoDoble siguiente;
    private String dato;

    public NodoDoble(NodoDoble anterior, NodoDoble siguiente, String dato) {
        this.anterior = anterior;
        this.siguiente = siguiente;
        this.dato = dato;
    }

    public NodoDoble() {
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public String getDato() {
        return dato;
    }
    
    
    
     
}
