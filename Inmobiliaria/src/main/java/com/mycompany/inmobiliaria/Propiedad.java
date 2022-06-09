package com.mycompany.inmobiliaria;

import java.io.IOException;


public abstract class Propiedad implements Disponibilidad{
    private int precio;
    private int numBanos;
    private int numPiezas;
    private String direccion;
    private int idPropiedad;
    private int area;
    private int zona;
    private int pisos;
    private boolean disponibilidad;
    private Vendedor owner;

    public Propiedad(int precio, int numBanos, int numPiezas, String direccion, int idPropiedad, int area, int zona, int pisos, boolean disponibilidad, Vendedor owner){
        
        this.precio = precio;
        this.numBanos = numBanos;
        this.numPiezas = numPiezas;
        this.direccion = direccion;
        this.idPropiedad = idPropiedad;
        this.area = area;
        this.zona = zona;
        this.pisos = pisos;
        this.disponibilidad = disponibilidad;
        this.owner = owner;
    }
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }

    public int getNumPiezas() {
        return numPiezas;
    }

    public void setNumPiezas(int numPiezas) {
        this.numPiezas = numPiezas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public void setOwner(Vendedor owner){
        this.owner = owner;
    }
    public Vendedor getOwner(){
        return owner;
    }
    
    public abstract void generarPrecio()throws IOException;
    
    public void reservar(){
        if(isDisponibilidad()== noDisp){
            System.out.println("El departamento no se encuentra disponible.");
        }else{
            setDisponibilidad(noDisp);
            System.out.println("Su reserva se ha hecho con exito");
        }
    } 
   
}
