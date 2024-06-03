/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ospin
 */
public class Usuario {
    Scanner in = new Scanner(System.in);
    private String nombre;
    private int identificacion;
    private int contraseña;
    private float dinero;
    private String correo;
    private ArrayList<Producto> carrito;
    private int puntos;
   
    public Usuario(String nombre, int identificacion, int contraseña, float dinero, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contraseña = contraseña;
        this.dinero = dinero;
        this.correo = correo;
        carrito = new ArrayList<Producto>();
        puntos = 0;    
        
    }

    
    
    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    
   
    public static Usuario crear(){
        Scanner in = new Scanner(System.in);
        String n,co;
        int id,c,a;
        System.out.println("Ingrese el nombre");
        n = in.nextLine();
        
        while(true){
        a = 0;
        System.out.println("Ingrese la identificacion");
        id = in.nextInt();
        for(Usuario usuarito1 : Main.usuarios){
            if (usuarito1.getIdentificacion()==id){
                a = 1;
                System.out.println("El usuario ya se encuentra registrado con los siguientes datos: ");
                System.out.println(usuarito1.toString());
                System.out.print("Por favor vuelva e ");
                break;
            }
        }
        if (a==0){
            break;
        }
        }
        
        System.out.println("Ingrese una contraseña");
        c = in.nextInt();
        in.nextLine();
        System.out.println("Ingrese su correo electronico");
        co = in.nextLine();
        Usuario usuarionuevo = new Usuario(n,id,c,0,co);
        return usuarionuevo;
    }
    public void recargardinero(){
        System.out.println("Ingrese cuanto dinero desea recargar");
        float n = in.nextFloat();
        dinero += n;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", contrase\u00f1a=" + contraseña + ", dinero=" + dinero + ", correo=" + correo + '}';
    }
    
    public void agregaralcarrito(String nombre){
        for(Producto productito:Main.productos){
           if(productito.getNombre()==nombre){
               
               carrito.add(productito);
           } 
        }
    }
    public void eliminardelcarrito(String nombre){
        for(Producto productito:Main.productos){
           if(productito.getNombre()==nombre){
               carrito.remove(productito);
           } 
        }
    }
    public void comprar(){
        float plata = 0;
        int puntacos = 0;
        for(Producto productazo:carrito){
            plata += productazo.getPrecio();
            puntacos += productazo.getPuntos();
        }
        dinero -= plata;
        puntos += puntacos;
        carrito.clear();
    }
    
    
    
}
