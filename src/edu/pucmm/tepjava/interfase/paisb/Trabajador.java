/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.interfase.paisb;

/**
 *
 * @author vacax
 */
public class Trabajador {
    
    String nombre;
    
    public Trabajador(String nombre){
        this.nombre = nombre;
    }
    
    public void trabajar(){
        System.out.println(""+nombre+", trabajando");
    }
}
