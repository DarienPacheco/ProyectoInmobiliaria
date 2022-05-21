package com.mycompany.inmobiliaria;

import java.io.* ;
import java.util.*;
 
public class Asesor implements Imprimable, Disponibilidad{
    private String nombre;
    private String rut;
    private String mail;
    private String pass;
    private boolean disponibilidad;
    private String clasificacion;
    public ArrayList <Vendedor> vendedores;
    
    public Asesor() {
        vendedores = new ArrayList();
    }
 
    public Asesor(String nombre, String rut, String mail, String pass, boolean disponibilidad, String clasificacion){
        this.nombre = nombre;
        this.rut = rut;
        this.mail = mail;
        this.pass = pass;
        this.disponibilidad = disponibilidad;
        this.clasificacion = clasificacion;
        vendedores = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    @Override
    public String imprimir() {
        return this.nombre + " - " + this.rut + " - " + this.clasificacion + " - " + this.disponibilidad + " - " + this.mail;
    }

    
    
}
