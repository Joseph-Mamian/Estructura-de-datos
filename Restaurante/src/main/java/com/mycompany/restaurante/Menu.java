package com.mycompany.restaurante;

import javax.swing.JOptionPane;


public class Menu {
    String platos[];
    int datos[][];
    String[] dias= new String[]{"lunes","martes","miercoles","jueves","viernes","sabado"};
    Platos arrayObjetos[];
    
    public void crearMenu(int cantidad){
        int i=0;
       arrayObjetos= new Platos[cantidad];    
    
    platos=new String[cantidad];
    Platos plato= new Platos();
    
    while(i <cantidad){
    
        onjeto
                
    }
    
   
   }
    
    public void consultarMenu(){
    
    for(int i=0; i<platos.length; i++){
    JOptionPane.showMessageDialog(null , "Platos: " + platos[i]);
       }
    }
    
    public void ingresarDatos(){
        
        datos=new int[6][platos.length];
        
        for(int f=0; f<6; f++){
            int s=f+1;
            for (int c=0; c<platos.length; c++){
            datos[f][c]=Integer.parseInt(JOptionPane.showInputDialog("Ventas para el dia " + dias[f] + " del plato: " + platos[c]));
            }
        }
    }
    
    public void ventaTotal(){
    
    int sumaT=0;
    
     for(int f=0; f<6; f++){
            for (int c=0; c<platos.length; c++){
            sumaT=sumaT + datos[f][c];
            }
        }
        JOptionPane.showMessageDialog(null, "El total de platos vendidos a la semana es: " + sumaT);
    }
    
    public void diaMasvendido(){
    int suma=0;
    
    for(int f=0; f<6; f++){   
            for (int c=0; c<platos.length; c++){
           }
        }
    }
    
    
}



    /*listado de datos 
    *cantidad de platos vendidos en total del plato x (1,2,3)
        *dia de la semana que mas se vendio el plato x
        *dia de la semana que menos se vendio el plato x
        *dia de la semana que mas se vende (en general)
        *dia de la semana que menos se vende (en general)
        
        *5 estadisticas libres
        
        */