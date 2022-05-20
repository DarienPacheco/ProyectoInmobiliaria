package com.mycompany.inmobiliaria;

import java.util.*;
import java.io.*;


public class Mercado {
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Vendedor> vendedores;
    ArrayList<Asesor> asesores;
    //Se ocupa object, ya que propiedades va a guardar tanto Deptos como Casas.
    HashMap<Integer,Object> propiedades;
    
    public Mercado(){
        vendedores = new ArrayList();
        asesores = new ArrayList();
        propiedades = new HashMap();
    }
    
    
    
    public void agregarAsesor() throws IOException{
        
    }
    
    public void agregarVendedores() throws IOException{
        Vendedor vPivot = new Vendedor();
        
    
    }

}
