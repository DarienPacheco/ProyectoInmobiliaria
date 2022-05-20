/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author darie
 */
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
