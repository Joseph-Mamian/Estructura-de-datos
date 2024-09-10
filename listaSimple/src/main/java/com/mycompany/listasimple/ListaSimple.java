package com.mycompany.listasimple;

import javax.swing.JOptionPane;

public class ListaSimple {
    
    Nodo inicio;
    ListaSimple(){
        inicio = null;
    }
    
    public void insertarInicio(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();

        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            inicio = nuevo;
        }
        else{
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        }
    }
    
    public void insertarFinal(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            inicio = nuevo;
        }
        else{
            Nodo temporal = inicio;
            while(temporal.getEnlace()!=null){
                temporal = temporal.getEnlace();
            }
            temporal.setEnlace(nuevo);
        }
    }
    
        public void insertareleccion(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        String nombreval = "";
        JOptionPane.showInputDialog("ingrese el nombre del objeto para poner despues de este", nombreval);
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            inicio = nuevo;
            return;
        }
        Nodo after = inicio;
        while(after != null && !after.getNombre().equals(nombreval)){
            after = inicio.getEnlace();
        }
        
        if(after == null){
            JOptionPane.showMessageDialog(null, "No existe un objeto con ese nombre en la lista");
            return;
        }
        
        nuevo.setEnlace(after.getEnlace());
        after.setEnlace(nuevo);
        JOptionPane.showMessageDialog(null, "insertado con exito");
    }
    
    public void consultar(){
        
        Nodo temporal = inicio;
        if(inicio==null){
        JOptionPane.showMessageDialog(null, "La lista está vacía");
        }else{
            do{
                JOptionPane.showMessageDialog(null, "Nombre: " + temporal.getNombre() + " edad: " +  temporal.getEdad() + " promedio: " + temporal.getPromedio());
                temporal = temporal.getEnlace();
            }while(temporal.getEnlace() != null);
        }        
    }
    
    public void eliminar(){
    Nodo anterior = inicio;
    Nodo siguiente = null;
     
        if(inicio==null){
        JOptionPane.showMessageDialog(null, "La lista está vacía");
        }else{
        
        }
    
    }
}