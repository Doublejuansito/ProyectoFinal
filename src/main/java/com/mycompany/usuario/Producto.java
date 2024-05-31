/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;

/**
 *
 * @author ospin
 */
public abstract class Producto {
    protected float precio;
    protected String nombre;
    protected  float descuento;
    protected String categoria;
    protected int puntos;

    public float getPrecio() {
        return precio;
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

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
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

    public Producto(float precio, String nombre, float descuento, String categoria, int puntos) {
        this.precio = precio;
        this.nombre = nombre;
        this.descuento = descuento;
        this.categoria = categoria;
        this.puntos = puntos;
    }
    
    int hijueputavidaaaaaa = 1;
    
    int cambio = 0;
    
}
