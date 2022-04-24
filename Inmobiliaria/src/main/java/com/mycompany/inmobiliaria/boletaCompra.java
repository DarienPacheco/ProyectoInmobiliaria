package com.mycompany.inmobiliaria;

import java.io.* ;

public class boletaCompra{
    private int idVendedor;
    private int idComprador;
    private int precio;
    private int idCasa;
    
    
    public boletaCompra(String precio, String idCasa, String idVendedor, String idComprador){
        this.precio = Integer.parseInt(precio);
        this.idCasa = Integer.parseInt(idCasa);
        this.idVendedor = Integer.parseInt(idVendedor);
        this.idComprador = Integer.parseInt(idComprador);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }
    
    
} // Fin clase