/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;

/**
 *
 * @author ospin
 */
public class Juguetes extends Producto{
    
    public Juguetes(float precio, String nombre, int puntos, String descripcion) {

        super(precio, nombre, "Juguetes", puntos, descripcion);
    }
    private static int descuento = 0;
    
    public static void aplicardescuento(int desc){
        descuento = desc;
    }

   
    public static int getDescuento(){
        return descuento;
    }
    public void preciodescontado(){
        System.out.println(precio*(1-(float)descuento));
    }

    

    
    
    
}
