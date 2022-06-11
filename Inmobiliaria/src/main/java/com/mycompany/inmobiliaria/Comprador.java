package com.mycompany.inmobiliaria;


public class Comprador extends Cliente {
    
    
    public Comprador(String nombre, String rut, int idCliente, int telefono, String mail, String pass,Asesor asesor){
        super(nombre,rut,idCliente,telefono,mail,pass,asesor);
    }
    
    public void mostrarNombre(){
        System.out.println(getNombre());
    }
    
}
