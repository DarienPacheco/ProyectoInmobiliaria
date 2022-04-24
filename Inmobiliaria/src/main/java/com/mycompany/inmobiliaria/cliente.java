package com.mycompany.inmobiliaria;

import java.io.* ;
import java.util.*;

public class cliente{
    private String nombreCliente;
    private String rutCliente;
    private int idCliente;
    private int telefono;
    private String mailCliente;
    private String passCliente;
    private ArrayList<propiedades> props;
    
    
    public cliente (String nombre, String rut, String id, String telefono, String mail, String pass){
        this.nombreCliente = nombre;
        this.rutCliente = rut;
        this.idCliente = Integer.parseInt(id);
        this.telefono = Integer.parseInt(telefono);
        this.mailCliente = mail;
        this.passCliente = pass;
        props = new ArrayList();
    
    }

    public cliente(){
       props = new ArrayList();
    }
    
    
    
    public String getNombre() {
        return nombreCliente;
    }

    public void setNombre(String nombre) {
        this.nombreCliente = nombre;
    }

    public String getRut() {
        return rutCliente;
    }

    public void setRut(String rut) {
        this.rutCliente = rut;
    }

    public int getId() {
        return idCliente;
    }

    public void setId() {
        int numero = (int)(Math.random()*10000+1);
        this.idCliente = numero;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mailCliente;
    }

    public void setMail(String mail) {
        this.mailCliente = mail;
    }

    public String getPass() {
        return passCliente;
    }

    public void setPass(String pass) {
        this.passCliente = pass;
    }
    
    public void mostrarPropiedades(){
        propiedades pPivot;
        int i = 0 ;
        while(i < props.size()){
            pPivot = props.get(i);
            System.out.println("Id casa: " + pPivot.getId());
            System.out.println("Precio: " + pPivot.getPrecio());
            System.out.println("Piezas: "+ pPivot.getNumPiezas());
            System.out.println("Baños: " + pPivot.getNumBanos());
            System.out.println("Metros cuadrados: "+ pPivot.getMetrosCuadrados());
            i++;
        }
    }
    
} // Fin clase