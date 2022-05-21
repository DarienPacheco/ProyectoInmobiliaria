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
}
