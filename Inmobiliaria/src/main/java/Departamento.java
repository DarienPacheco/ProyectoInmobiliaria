package com.mycompany.inmobiliaria;


import java.io.*;


public class Departamento extends Propiedad{
    
    private int planta;
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    
    public Departamento( int precio, int numBanos,int numPiezas, String direccion, int idPropiedad, int area, int zona,int pisos,int planta){
        super( precio, numBanos, numPiezas, direccion, idPropiedad, area, zona, pisos);
        this.planta = planta;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }
    
    
    public void generarPrecio()throws IOException{
            int pEstimado;
            int opcion=1;
            switch(getZona()){
                case 1:
                    pEstimado=300*getArea();
                    break;
                case 2:
                    pEstimado=400*getArea();
                    break;
                case 3:
                    pEstimado=600*getArea();
                    break;
                default:
                    System.out.println("No se ha podido calcular el valor de la casa");
                    return;
            }
            while (opcion!=0){
                if(getPrecio()!=pEstimado){
                    System.out.println("El valor del Departamento es diferente a nuestras recomendaciones :"+getPrecio() );
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
                    System.out.println("El precio del departamento es ideal segun nuestros criterios.");
                    return;
                }
            }
        }
    }
