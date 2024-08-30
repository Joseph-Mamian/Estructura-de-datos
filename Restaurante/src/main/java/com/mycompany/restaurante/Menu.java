package com.mycompany.restaurante;

import javax.swing.JOptionPane;


public class Menu {
    String platos[];
    int datos[][];
    String[] dias= new String[]{"lunes","martes","miercoles","jueves","viernes","sabado"};
    Platos obj[];
    int costo[];
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
    JOptionPane.showMessageDialog(null , "Plato: \n"  + obj[i].getNombre() + "Precio: " + obj[i].getPrecio());
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
    
    public void crearCostes(){
        
        costo=new int[obj.length];
        
        for(int i=0; i<obj.length; i++){
        costo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el coste de hacer " + obj[i].getNombre()));
        i++;
        }
    
    
    }
    
     public void analizarInformacion(){
        for(int f=0;f<obj.length;f++){
            int sum = 0;
            double promedio = 0;
            int diamenos = 0;
            String diamen = "";
            int diasmas = 0;
            String diamas = "";
            String mensaje="";
            int ganancia=0;
            int ventaT=0;
            int comparacion=0;
            
            for(int c = 0; c<6;c++){
                sumaT += datos[c][f];
                promT = sumaT/6;
                sum += datos[c][f];
                if(c==5){
                promedio = (sum/6);
                }
                if(c==0){
                    diamen = dias[c];
                    diamenos = sum;
                    diasmas = sum;
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
                
                for(int i=0; i<6; i++){
            ganancia=costo[f]*datos[c][f];
            ventaT=obj[c].getPrecio()*datos[f][c];
            comparacion=ventaT-ganancia;
            
            if(comparacion>ganancia){
            mensaje="  Felicidades tuvo una ganancia!!!!";
            }else{
            mensaje="  Lastima tuvo una perdida :C";
            }        
           }           
       }
            JOptionPane.showMessageDialog(null, "venta del plato " + obj[f].getNombre() + " es de " + sum + "\nel dia que menos vendio fue " + diamen + "\nel dia que mas vendio fue " + diamas + "\nel promedio de ventas al dia es de: " + promedio + "\nEl total vendido fue: " + ventaT + "\nLA ganancia total fue: " + comparacion + "\n" + mensaje);
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