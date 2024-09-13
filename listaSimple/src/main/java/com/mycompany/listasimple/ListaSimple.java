package com.mycompany.listasimple;

import javax.swing.JOptionPane;

public class ListaSimple {
    
    Nodo inicio;
    ListaSimple(){
    inicio=null;
    }
    
    void digitarInicio(String nombre, int edad, float promedio) {
        Nodo nuevo = new Nodo();
    
    nuevo.setNombre(nombre);
    nuevo.setEdad(edad);
    nuevo.setPromedio(promedio);
    nuevo.setEnlace(null);
    
    if(inicio==null){
        JOptionPane.showMessageDialog(null, "La lista esta vacia");
        inicio = nuevo;
    }
    else{
        nuevo.setEnlace(inicio);
        inicio = nuevo;
    }   
    
    }
  
    public void consultar(){
      
        Nodo temporal = inicio;
        if(inicio==null){
        JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }else{
            
            do{
            JOptionPane.showMessageDialog(null, "Nombre: " + temporal.getNombre() + "\nEdad: " + temporal.getEdad() + "\nPromedio: " + temporal.getPromedio());
            temporal=temporal.getEnlace();
            }while(temporal!= null);
        }
    }
    
    void digitarFinal (String nombre, int edad, float promedio) {
        Nodo nuevo = new Nodo();
    
    nuevo.setNombre(nombre);
    nuevo.setEdad(edad);
    nuevo.setPromedio(promedio);
    nuevo.setEnlace(null);
    
    if(inicio==null){
        JOptionPane.showMessageDialog(null, "La lista esta vacia");
        inicio = nuevo;
    }
    else{
        
        Nodo temporal= inicio;
        
        while(temporal.getEnlace()!=null){
            temporal=temporal.getEnlace();
        }
        temporal.setEnlace(nuevo);
         
        nuevo.setEnlace(inicio);
        inicio = nuevo;
    }
   }
  
}
