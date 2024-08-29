package com.mycompany.restaurante;

import javax.swing.JOptionPane;


public class Menu {
    String platos[];
    int datos[][];
    String[] dias= new String[]{"lunes","martes","miercoles","jueves","viernes","sabado"};
    Platos obj[];
    Platos arrayObjetos[];
    String nombre;
    int precio;

    double sumaT=0;
    double promT=0;
    
    public void crearMenu(int cantidad){
        obj= new Platos[cantidad];
    
        int i=0;
        while(i<cantidad){
            nombre=(JOptionPane.showInputDialog("ingresa el nombre"));
            precio=(Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio")));
            obj[i]=new Platos(nombre,precio);
            i++;        
        }
        
   }
    
    public void consultarMenu(){
        
    for(int i=0; i<obj.length; i++){     
    JOptionPane.showMessageDialog(null , "Platos: " + obj[i].getNombre() + " Precios: " + obj[i].getPrecio());
       }
    }
    
    public void ingresarDatos(){
        
        datos=new int[6][obj.length];
        
        for(int f=0; f<6; f++){
            int s=f+1;
            for (int c=0; c<obj.length; c++){
            datos[f][c]=Integer.parseInt(JOptionPane.showInputDialog("Ventas para el dia " + dias[f] + " del plato: " + obj[c].getNombre()));
            }
        }
    }
    
     public void analizarInformacion(){
        for(int f=0;f<obj.length;f++){
            int sumador = 0;
            double promedio = 0;
            int diamenos = 0;
            String diamen = "";
            int diasmas = 0;
            String diamas = "";
            
            for(int c = 0; c<6;c++){
                sumaT += datos[c][f];
                promT = sumaT/6;
                sumador += datos[c][f];
                if(c==5){
                promedio = (sumador/6);
                }
                if(c==0){
                    diamen = dias[c];
                    diamenos = sumador;
                    diasmas = sumador;
                    diamas = dias[c];
                }
                                
                if(diasmas==datos[c][f] && c!=0){
                diamas += " y " + dias[c];
                }
                
                if(diasmas<datos[c][f]){
                diasmas = datos[c][f];
                diamas = dias[c];
                }
                
                
                if(diamenos==datos[c][f] && c!=0){
                diamen += " y " + dias[c];
                }
                
                if(diamenos>datos[c][f]){
                    diamenos=datos[c][f];
                    diamen = dias[c];
                }
            }
            JOptionPane.showMessageDialog(null, "venta del plato " + obj[f].getNombre() + " es de " + sumador + "\nel dia que menos vendio fue " + diamen + "\nel dia que mas vendio fue " + diamas + "\nel promedio de ventas al dia es de: " + promedio);
        }
        double desviacion = sumaT - (promT * platos.length);
        double coefivari = desviacion / promT;
        JOptionPane.showMessageDialog(null,"La cantidad de platos vendidos en la semana es de: " + sumaT + "\nel promedio de ventas al dia de todos los platos es de: " + promT + "\nsu desviacion es de: " + desviacion + "\nsu coeficiente de variacion es de: " + coefivari + "%");
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