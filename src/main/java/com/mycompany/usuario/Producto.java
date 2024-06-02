/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;
import java.util.Scanner;
/**
 *
 * @author ospin
 */
public abstract class Producto {
    static Scanner in = new Scanner(System.in);
    protected float precio;
    protected String nombre;
    protected String categoria;
    protected int puntos;
    protected String descripcion;
    

    
    
    public float getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Producto(float precio, String nombre, String categoria, int puntos, String descripcion) {
        this.precio = precio;
        this.nombre = nombre;
        this.categoria = categoria;
        this.puntos = puntos;
        this.descripcion = descripcion;
        
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", nombre=" + nombre + ", categoria=" + categoria + ", puntos=" + puntos + ", descripcion=" + descripcion + '}';
    }

    
    
    public static Producto crearproducto(){
        Producto productico;
        System.out.println("Ingrese el nombre del articulo:");
        String no = in.nextLine();
        System.out.println("Ingrese el precio del articulo:");
        float pr = in.nextFloat();
        System.out.println("Ingrese la categoria del articulo:");
        String ca = in.nextLine();
        System.out.println("Ingrese los puntos del articulo:");
        int pu = in.nextInt();
        System.out.println("Ingrese la descripcion del articulo:");
        String de = in.nextLine();
        if(ca=="ropa"){
            if (Ropa.getDescuento()!=0){
                pr = pr*(1-((float)Ropa.getDescuento()/100));
            }
            productico = new Ropa(pr,no,ca,pu,de);
            
        }else if(ca=="jueguetes"){
            if (Juguetes.getDescuento()!=0){
                pr = pr*(1-((float)Juguetes.getDescuento()/100));
            }
            productico = new Juguetes(pr,no,ca,pu,de);
        }else if(ca=="limpieza"){
            if (Limpieza.getDescuento()!=0){
                pr = pr*(1-((float)Limpieza.getDescuento()/100));
            }
            productico = new Limpieza(pr,no,ca,pu,de);
        }else{
            if (Alimentos.getDescuento()!=0){
                pr = pr*(1-((float)Alimentos.getDescuento()/100));
            }
            productico = new Alimentos(pr,no,ca,pu,de);
        }
        
        return productico;
        
    }
    
    
}
