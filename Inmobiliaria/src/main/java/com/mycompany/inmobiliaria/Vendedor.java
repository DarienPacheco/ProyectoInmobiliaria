package com.mycompany.inmobiliaria;

import java.util.*;


public class Vendedor extends Cliente {
    ArrayList<Propiedad> propiedades;
    
    public Vendedor(String nombre, String rut, int idCliente, int telefono, String mail, String pass,Asesor asesor){
        super(nombre, rut, idCliente, telefono, mail, pass,asesor);
        propiedades = new ArrayList();
    }
    public Vendedor(){
        super(null,null,0,0,null,null,null);
        propiedades = new ArrayList();
    }
    
    public void mostrarNombre(){
        
        System.out.println(getNombre());
    }

    public void mostrarPropiedades(){
        int i=0;
        Casa cPivot;
        Departamento dPivot;
        while(i < propiedades.size()){
            if(propiedades.get(i) instanceof Casa){
                cPivot = (Casa) propiedades.get(i);
                System.out.println("================================");
                System.out.println("==============CASA==============");
                System.out.println("================================");
                System.out.println("ID: " + cPivot.getIdPropiedad());
                System.out.println("Precio: " + cPivot.getPrecio());
                System.out.println("Numero de Piezas: " + cPivot.getNumPiezas());
                System.out.println("Numero de Baños: " + cPivot.getNumBanos());
                System.out.println("Metros Cuadrados: " + cPivot.getArea());
                System.out.println("Pisos: " + cPivot.getPisos());
                System.out.println("Direccion: " + cPivot.getDireccion());
                if(cPivot.isDisponibilidad()){
                    System.out.println("Disponible para Visita ");
                }else{
                    System.out.println("No Disponible para Visita");
                }
                System.out.println("================================");  
            }else{
                dPivot = (Departamento) propiedades.get(i);
                System.out.println("================================");
                System.out.println("==========DEPARTAMENTO==========");
                System.out.println("================================");
                System.out.println("ID: " + dPivot.getIdPropiedad());
                System.out.println("Precio: " + dPivot.getPrecio());
                System.out.println("Numero de Piezas: " + dPivot.getNumPiezas());
                System.out.println("Numero de Baños: " + dPivot.getNumBanos());
                System.out.println("Metros Cuadrados: " + dPivot.getArea());
                System.out.println("Pisos: " + dPivot.getPisos());
                System.out.println("Direccion: " + dPivot.getDireccion());
                System.out.println("Planta: " + dPivot.getPlanta());
                if(dPivot.isDisponibilidad()){
                    System.out.println("Disponible para Visita ");
                }else{
                    System.out.println("No Disponible para Visita");
                }
                System.out.println("================================");    
            }
            i++;
        }
        
    }

    
    
}
