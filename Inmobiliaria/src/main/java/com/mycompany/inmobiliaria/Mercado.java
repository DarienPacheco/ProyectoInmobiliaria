package com.mycompany.inmobiliaria;

import java.util.*;
import java.io.*;


public class Mercado implements Imprimable{
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Vendedor> vendedores;
    ArrayList<Asesor> asesores;
    //Se ocupa object, ya que propiedades va a guardar tanto Deptos como Casas.
    HashMap<Integer,Propiedad> propiedades;
    
    public Mercado(){
        vendedores = new ArrayList();
        asesores = new ArrayList();
        propiedades = new HashMap();
        
    }
    /*
    public void agregarAsesor() throws IOException{
        Asesor aPivot = new Asesor();
        System.out.println("Ingrese Nombre");
        aPivot.setNombre(lector.readLine());
        System.out.println("Ingrese Rut");
        aPivot.setRut(lector.readLine());
        System.out.println("Ingrese Mail");
        aPivot.setMail(lector.readLine());
        System.out.println("Ingrese Contraseña");
        aPivot.setPass(lector.readLine());
        System.out.println("Ingrese Disponibilidad");
        aPivot.setDisponibilidad(lector.readLine());
        System.out.println("Ingrese Clasificacion");
        aPivot.setClasificacion(lector.readLine());
        asesores.add(aPivot);
        
    }*/
    
    public void agregarVendedores() throws IOException{
        Vendedor vPivot = new Vendedor();
        System.out.println("Ingrese Nombre");
        vPivot.setNombre(lector.readLine());
        System.out.println("Ingrese Rut");
        vPivot.setRut(lector.readLine());
        System.out.println("Ingrese Id");
        vPivot.setIdCliente(Integer.parseInt(lector.readLine()));
        System.out.println("Ingrese Telefono");
        vPivot.setTelefono(Integer.parseInt(lector.readLine()));
        System.out.println("Ingrese Mail");  
        vPivot.setMail(lector.readLine());
        System.out.println("Ingrese Contraseña");
        vPivot.setPass(lector.readLine());
        vendedores.add(vPivot);
    
    }

    @Override
    public String imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void busquedaLimitada(int opcion){
        int contador=1;
        Propiedad pPivot;
        if(opcion==1){
            while(contador<=propiedades.size()){
                pPivot = propiedades.get(contador);
                if(pPivot instanceof Casa){
                    System.out.println("Casa : "+ pPivot.getIdPropiedad());
                    System.out.println("Dirección : " + pPivot.getDireccion());
                    System.out.println("Area : " + pPivot.getArea());
                    System.out.println("Numero Piezas : " + pPivot.getNumPiezas() );
                    System.out.println("Numero Baños : " + pPivot.getNumBanos());
                    System.out.println("Precio : " + pPivot.getPrecio());
                    System.out.println("Disponibilidad : " + pPivot.isDisponibilidad());
                    System.out.println("-----------------------------------");
                }
                contador++;
            }
            return;
        }else if(opcion==2){
            while(contador<=propiedades.size()){
                pPivot = propiedades.get(contador);
                if(pPivot instanceof Departamento){
                    System.out.println("Casa : "+ pPivot.getIdPropiedad());
                    System.out.println("Dirección : " + pPivot.getDireccion());
                    System.out.println("Area : " + pPivot.getArea());
                    System.out.println("Numero Piezas : " + pPivot.getNumPiezas() );
                    System.out.println("Numero Baños : " + pPivot.getNumBanos());
                    System.out.println("Precio : " + pPivot.getPrecio());
                    System.out.println("Disponibilidad : " + pPivot.isDisponibilidad());
                    System.out.println("-----------------------------------");
                }
                contador++;
            }
            return;
        }
        System.out.println("El valor ingresado no esta dentro de los aceptados.");
        return;
    }
    
    public void ganga(){
        int contador=1;
        int ganga=0;
        Propiedad pPivot,pIdeal=propiedades.get(contador);
        while(contador<=propiedades.size()){
            pPivot= propiedades.get(contador);
            
            if(contador == 1){
                ganga=pPivot.getPrecio();
            }
            if(pPivot.getPrecio()<=ganga){
                ganga=pPivot.getPrecio();
                pIdeal=pPivot;
            }
           contador++;
        }
        System.out.println("TE RECOMENDAMOS!!!!!!!!!!!!!:");
        System.out.println("Propiedad : "+ pIdeal.getIdPropiedad());
        System.out.println("Dirección : " + pIdeal.getDireccion());
        System.out.println("Area : " + pIdeal.getArea());
        System.out.println("Numero Piezas : " + pIdeal.getNumPiezas() );
        System.out.println("Numero Baños : " + pIdeal.getNumBanos());
        System.out.println("Precio : " + pIdeal.getPrecio());
        System.out.println("Disponibilidad : " + pIdeal.isDisponibilidad());
        System.out.println("-----------------------------------");
    }
}
