package com.mycompany.inmobiliaria;

import java.io.* ;
import java.util.*;
public class Main {
    
    
    public static void main(String[] args)  throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Mercado mercado = new Mercado();
        
        //Todo este codigo es principalmente para llenar las colecciones debido a la falta de tiempo que tubimos.
        Asesor aPivot = new Asesor("Juan Fernandez","20.618.997-6","JFernandez@gmail.com","123456","Lunes y viernes","4,7");
        mercado.asesores.add(aPivot);
        Vendedor vPivot = new Vendedor("Patricio Estrella","66.666.666-6",1,66666666,"BobesMiAmigo@fondodebikini.com","1456");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        Casa cPivot = new Casa(20300,2,1,"Fondo de bikini 3",1,50,3,2);
        mercado.propiedades.put(1, cPivot);
        vPivot.propiedades.add(cPivot);
        cPivot = new Casa(30000,4,7,"Fondo de bikini 17",2,100,3,3);
        mercado.propiedades.put(2, cPivot);
        vPivot.propiedades.add(cPivot);
        cPivot = new Casa(10000,1,1,"Fondo de bikini 1",3,20,3,1);
        mercado.propiedades.put(3, cPivot);
        vPivot.propiedades.add(cPivot);
        
        
        
        int opcion=1;
        int opcion2=1;
        
        while(opcion!=0){
            opcion2=1;
            System.out.println("Bienvenido, favor indiquenos la accion que quiere tomar:");
            System.out.println("1. Agregar");
            opcion=Integer.parseInt(lector.readLine());
            switch(opcion){
                case 0:
                    break;
                case 1:
                    while(opcion2!=0){
                        System.out.println("Bienvenido, favor indiquenos la accion que quiere tomar:");
                        System.out.println("1. Agregar xxxx");
                        System.out.println("1. Agregar xxxx");
                        System.out.println("1. Agregar xxxx");
                        opcion2=Integer.parseInt(lector.readLine());
                        switch(opcion2){
                            case 0:
                                break;
                            case 1:
                                break;
                            default:
                                System.out.println("El valor entregado no es valido."); 
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("El valor entregado no es valido."); 
                    break;
            }
        }   
    }
}