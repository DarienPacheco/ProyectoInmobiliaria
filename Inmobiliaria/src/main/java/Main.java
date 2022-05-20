package com.mycompany.inmobiliaria;

import java.io.* ;
import java.util.*;
public class Main {
    
    
    public static void main(String[] args)  throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Mercado mercado = new Mercado();
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