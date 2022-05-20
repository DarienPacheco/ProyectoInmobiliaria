package com.mycompany.inmobiliaria;

public class Casa extends Propiedad{
    
        public Casa( int precio, int numBanos,int numPiezas, String direccion, int idPropiedad, int area, int zona,int pisos){
        super( precio, numBanos, numPiezas, direccion, idPropiedad, area, zona, pisos);
        
    }

    public void generarPrecio(){
        int pEstimado;
        pEstimado = getArea()*((getNumBanos()*5)+(getNumPiezas()*9)+(getArea()*50)+ (getPisos()*20));
        setPrecio(pEstimado);
    }
    
}
