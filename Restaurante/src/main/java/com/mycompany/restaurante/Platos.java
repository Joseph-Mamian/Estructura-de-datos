package com.mycompany.restaurante;


public class Platos {
    private String nombre;
    private int precio;

    public Platos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Platos() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
