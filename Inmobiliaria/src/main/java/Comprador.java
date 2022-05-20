package com.mycompany.inmobiliaria;


public class Comprador extends Cliente {
    
    
    public Comprador(String nombre, String rut, int idCliente, int telefono, String mail, String pass){
        super(nombre,rut,idCliente,telefono,mail,pass);
    }
    
    public void mostrarNombre(){
        
        System.out.println(getNombre());
    }
    
}
