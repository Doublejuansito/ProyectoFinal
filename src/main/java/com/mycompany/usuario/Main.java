/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.usuario;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author ospin
 */
public class Main {
    public static Random rand = new Random();
    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    public static ArrayList<Bono> bonos = new ArrayList<Bono>();
    public static ArrayList<Producto> productos = new ArrayList<Producto>();
    static Scanner in = new Scanner(System.in);
    public static void crearusuario(){
        Usuario nuevousuario = Usuario.crear();
        
        usuarios.add(nuevousuario);
    }
    public static void agregarproducto(){
        Producto nuevoproducto = Producto.crearproducto();        
        productos.add(nuevoproducto);
    }
    public static void agregarbono(Bono bono, Usuario usuarito){
        usuarito.setPuntos(usuarito.getPuntos()-bono.getPuntos());   
        bonos.add(bono);
    }
    public static void promocion(){
        int num = rand.nextInt(4);
        int des = 10 + rand.nextInt(30);
        switch(num){
            case 0:
                Juguetes.aplicardescuento(des);
                break;
            case 1:
                Ropa.aplicardescuento(des);
                break;
            case 2:
                Alimentos.aplicardescuento(des);
                break;
            case 3:
                Limpieza.aplicardescuento(des);
                break;
             
        }
    }
    public static void eliminarusuario(){
        System.out.println("Ingrese el numero de identificacion del usuario que desea eliminar");
        int num = in.nextInt();
        for(Usuario usuarito1 : usuarios){
            if (usuarito1.getIdentificacion()==num){
                usuarios.remove(usuarios.indexOf(usuarito1));
                break;
            }
        
    }}
    public static void ingresarUsuario(){ //Ingresar a la ventana de ingresar usuario
        VentanaIngresoUsuario ventana2= new VentanaIngresoUsuario();
        ventana2.setVisible(true);
        
    }
    public static void usuariosPredeterminados(){//Establecer ususarios predetterminados
        Usuario usuario1 = new Usuario("Juan",10,11,2,"sh");
        Usuario usuario2 = new Usuario("sara",11,12,2,"sdh");
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        
    }

    public static void main(String[] args) { 
//        System.out.println(4.0/100);
//        Juguetes juguete = new Juguetes(10,"","",4,"");
//        Ropa ropa = new Ropa(10,"","",4,"");
//        
//        Juguetes juguete2 = new Juguetes(10,"","",4,"");
//        System.out.println(juguete.getDescuento());
//        System.out.println(ropa.getDescuento());
//        System.out.println(juguete2.getDescuento());
//        crearusuario();
//        crearusuario();
//        crearusuario();
//        eliminarusuario();
//        for(Usuario usuario : usuarios){
//            System.out.println(usuario.toString());
            usuariosPredeterminados();
            ingresarUsuario();
            

            
        }
        
    }
    

