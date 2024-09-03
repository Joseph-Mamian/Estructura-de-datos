package com.mycompany.listasimple;

import javax.swing.JOptionPane;

public class Nodo {
    String nombre;
    int edad;
    float promedio;
    private Nodo enlace;

    public Nodo() {
    }
    

    public Nodo(String nombre, int edad, float promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    public class listaSimple{
    Nodo inicio;
    
    listaSimple(){
    inicio=null;
    }
   }
    
    public void insertarInicio(String nombre, int edad, float promedio){
    
    Nodo nuevo= new Nodo();
    
    nuevo.setNombre(nombre);
    nuevo.setEdad(edad);
    nuevo.setPromedio(promedio);
    nuevo.setEnlace(null);
    
    if(inicio==null){
        JOptionPane.showMessageDialog(null, "La lista esta vacia");
    inicio= nuevo;
    }
    else{
    nuevo.setEnlace(nuevo);
    inicio = nuevo;
    
    }
   }
    
   public void consultar(){
       
       Nodo temporal=inicio;
       if(inicio==null){
       JOptionPane.showMessageDialog(null, "La lista esta vacia");
       }else{
       
           do{
               
               JOptionPane.showMessageDialog(null, "Nombre: " + temporal.getNombre() + temporal.getEdad() + temporal.getPromedio());
           
           }while(temporal.getEnlace()!= null);           
       }
   
   
   }
    
}
