/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author darie
 */
public class Departamento extends Propiedad{
    
    private int planta;
    
    public Departamento( int precio, int numBanos,int numPiezas, String direccion, int idPropiedad, int area, int zona,int pisos,int planta){
        super( precio, numBanos, numPiezas, direccion, idPropiedad, area, zona, pisos);
        this.planta = planta;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }
    
    public void generarPrecio(){
        int pEstimado;
        pEstimado = getArea()*((getNumBanos()*5)+(getNumPiezas()*15)+(getArea()*25)+ (getPisos()*30));
        setPrecio(pEstimado);
    }

}
