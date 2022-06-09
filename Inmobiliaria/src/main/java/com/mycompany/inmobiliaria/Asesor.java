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
    private int id;
    public ArrayList <Vendedor> vendedores;
    
    public Asesor() {
        vendedores = new ArrayList();
    }
 
    public Asesor(String nombre, String rut, String mail, String pass, boolean disponibilidad, String clasificacion, int id){
        this.nombre = nombre;
        this.rut = rut;
        this.mail = mail;
        this.pass = pass;
        this.disponibilidad = disponibilidad;
        this.clasificacion = clasificacion;
        this.id = id;
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

    public boolean isDisponibilidad() {
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
    
    public void setId(int Id){
        this.id = Id;
    }
    public int getId(){
        return id;
    }

    @Override
    public String imprimir() {
        return this.nombre + " - " + this.rut + " - " + this.clasificacion + " - " + this.disponibilidad + " - " + this.mail;
    }

    
    public void reservar(){
        if(isDisponibilidad()== noDisp){
            System.out.println("El Asesor no se encuentra disponible.");
        }else{
            setDisponibilidad(noDisp);
            System.out.println("Su reserva se ha hecho con exito");
        }
    }
    
    //Permite buscar vendedores por rut y veriricar la existencia de un rut en caso de crear uno nuevo
    public Vendedor eliminarVendedor(String rut){
        Vendedor vPivot = null;
        int i=0;
        //Ocupa un ciclo para encontrar el rut del vendedor, una vez encontrado, lo eliminado ocupando su posicion.
        while(i <= vendedores.size()){
            vPivot = vendedores.get(i);
            if(vPivot.getRut().equals(rut)){
                System.out.println("Rut encontrado.");
                vendedores.remove(i);
                //avisa una vez encontrado
                System.out.println("Vendedor Eliminado de Asesor");
                return vPivot;
            }else{
                i++; 
            }  
        }
        System.out.println("Vendedor no encontrado");
        return null;
    }
    public void mostrarVendedores(){
        Vendedor vPivot;
        int i=0;
        System.out.println("VENDEDORES:");
        while(i < vendedores.size()){
            vPivot = vendedores.get(i);
            System.out.println("====================================");
            System.out.println("Nombre: " + vPivot.getNombre());
            System.out.println("Rut: " + vPivot.getRut());
            System.out.println("ID: " + vPivot.getIdCliente());
            System.out.println("Telefono: " + vPivot.getTelefono());
            System.out.println("Mail: " + vPivot.getMail());
            i++;
        }
        System.out.println("====================================");
    }  
}
