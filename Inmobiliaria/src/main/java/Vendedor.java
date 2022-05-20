package com.mycompany.inmobiliaria;

import java.util.*;


public class Vendedor extends Cliente{
    ArrayList<Propiedad> propiedades;
    
    public Vendedor(String nombre, String rut, int idCliente, int telefono, String mail, String pass){
        super(nombre, rut, idCliente, telefono, mail, pass);
    }
    public Vendedor(){
        super(null,null,0,0,null,null);
        propiedades = new ArrayList();
    }
    
    public void mostrarNombre(){
        
        System.out.println(getNombre());
    }
    
}
