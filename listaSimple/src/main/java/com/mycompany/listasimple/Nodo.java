package com.mycompany.listasimple;

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
<<<<<<< HEAD
    }  
=======
    } 
>>>>>>> be82722278cc2ad5604e6a2a43536adca6a2ceb6
}
