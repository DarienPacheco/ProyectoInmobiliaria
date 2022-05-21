/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmobiliaria;

import java.util.ArrayList;

/**
 *
 * @author chico
 */
public class Imprimir {
    private Imprimable ob;

    public Imprimir(Imprimable ob) {
        this.ob = ob;
        
    }

    public void imprimirObjetoPorImpresora(){
        System.out.println(this.ob.imprimir());
    }

    

    
    
    
}
