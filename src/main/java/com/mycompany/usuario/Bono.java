/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ospin
 */
public abstract class Bono {
    protected String nombre;
    protected int puntos;
    protected String categoria;
    protected String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Bono(String nombre, int puntos, String categoria, String descripcion) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }
    

}
