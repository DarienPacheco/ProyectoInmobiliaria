package com.mycompany.inmobiliaria;

public abstract class Cliente {
    
    private String nombre;
    private String rut;
    private int idCliente;
    private int telefono;
    private String mail;
    private String pass;

    public Cliente(String nombre, String rut, int idCliente, int telefono, String mail, String pass) {
        this.nombre = nombre;
        this.rut = rut;
        this.idCliente = idCliente;
        this.telefono = telefono;
        this.mail = mail;
        this.pass = pass;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
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
   
    public abstract void mostrarNombre();
}
