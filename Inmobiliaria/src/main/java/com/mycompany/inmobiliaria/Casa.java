package com.mycompany.inmobiliaria;

import java.io.*;

public class Casa extends Propiedad implements Disponibilidad{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        private int terreno;
        
        
        
    public Casa( int precio, int numBanos,int numPiezas, String direccion, int idPropiedad, int area, int zona,int pisos, boolean disponibilidad, Vendedor owner, int terreno){
        super( precio, numBanos, numPiezas, direccion, idPropiedad, area, zona, pisos, disponibilidad,owner);
        this.terreno = terreno;
    }
        public Casa(){
        super(0,0,0,null,0,0,0,0,false,null);
        this.terreno=0;
    }
        public void setTerreno(int terreno){
            this.terreno = terreno;
        }
        public int getTerreno(){
            return terreno;
        }
    //Funcion que permite generar un precio recomendado para las variables de mayor importancia de la casa
    public void generarPrecio()throws IOException{
        int pEstimado;
        int opcion=1;
        //La zona indica el precio generar del terreno y el tamaño de la casa.
        switch(getZona()){
            case 1:
                pEstimado=(200*getArea() + 50*getTerreno());
                break;
            case 2:
                pEstimado=(300*getArea()+ 75*getTerreno());
                break;
            case 3:
                pEstimado=(400*getArea()+150*getTerreno());
                break;
            default:
                System.out.println("No se ha podido calcular el valor de la casa");
                return;
        }
        //Muestra cual es el precio que recomendamos y pregunta si se desea remplazar
        while (opcion!=0){
            if(getPrecio()!=pEstimado){
                System.out.println("El valor de la Casa es diferente a nuestras recomendaciones :"+getPrecio() );
                System.out.println("Desea cambiarlo por nuestro precio recomendado "+ pEstimado + "?");
                System.out.println("1. Si y Salir.");
                System.out.println("0. No y Salir");
                opcion=Integer.parseInt(lector.readLine());
                switch(opcion){
                    case 1: 
                        setPrecio(pEstimado);
                        System.out.println("Cambio realizado.");
                        return;
                    case 0:
                        return;
                    default:
                        System.out.println("El valor entregado no se encuentra dentro de las opciones");
                        break;
                }
            }else{
                //En caso de que el precio sea el recomendado entrega el siguiente mensaje.
                System.out.println("El precio de la Casa es ideal segun nuestros criterios.");
                return;
            }
        }
    }
    public void reservar(){
        if(isDisponibilidad()== noDisp){
            System.out.println("La Casa no se encuentra disponible.");
        }else{
            setDisponibilidad(noDisp);
            System.out.println("Su reserva se ha hecho con exito");
        }
    }
    
    
}
