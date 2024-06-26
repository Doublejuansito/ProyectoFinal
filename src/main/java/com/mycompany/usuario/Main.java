/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.usuario;
import java.awt.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author ospin
 */
public class Main {
    
    public static Random rand = new Random();
    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    public static ArrayList<Bono> bonosusados = new ArrayList<Bono>();
    public static ArrayList<Bono> bonos = new ArrayList<Bono>();
    public static ArrayList<Producto> productos = new ArrayList<Producto>();
    public static ArrayList<Integer> indices = new ArrayList<Integer>();
    static Scanner in = new Scanner(System.in);
    
    public static void menu(){
        while(true){
        System.out.println("Bienvenido querido usuario!");
        System.out.println("");
        System.out.println("");
        System.out.println("Presione 1 para crear producto || Presione 2 para crear bono || Presione culquier otra para salir");
        System.out.println("");
        int n = in.nextInt();
        System.out.println("");
        if(n==1){
            System.out.println("Decidiste crear un producto");
            System.out.println("");
            System.out.println("Llena los siguientes datos");
            agregarproducto();
        }else if(n==2){
            System.out.println("Decidiste crear un bono");
            System.out.println("");
            System.out.println("Llena los siguientes datos");
            crearbono();
        }
        else{
            break;
        }
    }}
    
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
        bonosusados.add(bono);
    }
    public static void crearbono(){
        Bono bonito;
        System.out.println("Ingrese el nombre del bono");
        String n = in.nextLine();
        System.out.println("Ingrese los puntos para redimir el bono");
        int p = in.nextInt();
        in.nextLine();
        System.out.println("Ingrese la categoria del bono");
        String c = in.nextLine();
        System.out.println("Ingrese la descripcion");
        String d = in.nextLine();
        switch(c){
            case "entretenimiento":
                bonito = new Entretenimiento(n,p,d);
                break;
            case "saludybelleza":
                bonito = new Saludybelleza(n,p,d);
                break;
            default:
                bonito = new Articulos(n,p,d);
                break;
        }
        bonos.add(bonito);
    }
    public static void promocion(){
        int num = rand.nextInt(4);
        int num2;
        do {
            num2 = rand.nextInt(4); // Genera otro número aleatorio entre 0 y 99
        } while (num2 == num);
        int des = 10 + rand.nextInt(30);
        int des2 = 10 + rand.nextInt(30);
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
        switch(num2){
            case 0:
                Juguetes.aplicardescuento(des2);
                break;
            case 1:
                Ropa.aplicardescuento(des2);
                break;
            case 2:
                Alimentos.aplicardescuento(des2);
                break;
            case 3:
                Limpieza.aplicardescuento(des2);
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
    public static void agregarUsuario(){ //Ingresar a la ventana de ingresar usuario
        VentanaAgregarUsuario ventana3= new VentanaAgregarUsuario();
        ventana3.setVisible(true);
        
    }
    public static void mostrarbono(){ //Ingresar a la ventana de ingresar usuario
        VentanaBono ventana4= new VentanaBono();
        ventana4.setVisible(true);
        
        
    }
   
    public static void mostrarventana(){
        
        Ventana ventana5 = new Ventana();
        ventana5.setVisible(true);
    }
    public static void recarga(){
        VentanaRecargar ventan = new VentanaRecargar();
        ventan.setVisible(true);
    }
    
    public static void usuariosPredeterminados(){//Establecer ususarios predetterminados
        Usuario usuario1 = new Usuario("Juan",10,11,2,"sh");
        Usuario usuario2 = new Usuario("sara",11,12,2,"sdh");
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        
    }
    public static void productosPrincipales(){
       
        Producto p1 = new Ropa(153.900f,"Gaban Negro",25,"Trabajado manualmente para articular un perfecto corte con cuello y botones, \nDiponible en tallas : S-M-L");
        Producto p2 = new Ropa(70.950f,"Camisa Blanca",10,"Camisa Formal Solo Fondo Dobby Blanca Malla \nDiponible en tallas : XS-S-M-L");
        Producto p3 = new Alimentos(19.360f,"Café NESCAFE Tradición Instantáneo (170 gr)",2,"Café soluble Instantáneo de fácil preparación NESCAFÉ TRADICIÓN \n170 gr");
        Producto p4 = new Alimentos(11.340f,"Modificador de Leche MILO 250 gr",1,"Solidos lacteos (leche entera en polvo) o/y suero de leche en polvo \n250 gr");
        Producto p5 = new Juguetes(40.771f,"Cactus Bailarin Imita La Voz",4," Divertido juguete de cactus eléctrico, que se puede retorcer para cantar y bailar, trayendo risas a familiares y amigos \n120 canciones");
        Producto p6 = new Limpieza(12.090f,"Limpia Vidrios 500 Ml Ecocleaner",1,"Limpieza y transparencia al instante. Elimina residuos de polvo, grasa y demás suciedades.\n500 Ml");
        p1.setImagen(new ImageIcon ("gaban.jpg"));
        p2.setImagen(new ImageIcon ("Camisa.jpeg"));
        p3.setImagen(new ImageIcon ("Nescafe.jpeg"));
        p4.setImagen(new ImageIcon ("Milo.jpeg"));
        p5.setImagen(new ImageIcon ("CactusBailarin.jpeg"));
        p6.setImagen(new ImageIcon ("LimpiaVidrios.jpeg"));
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        
    }
    public static void iniciarbonos(){
        Bono b1 = new Entretenimiento("Tarjeta regalo netflix",150,"1 mes para disfrutar tus peliculas y series favoritas");
        Bono b2 = new Entretenimiento("2 boletas para cine colombia",100,"Disfruta con un acompañante la pelicula que desees");
        Bono b3 = new Saludybelleza("2*1 en marca nivea",200,"Paga un articulo de marca nivea, y la segunda unidad es completamente gratis");
        Bono b4 = new Saludybelleza("1 corte gratis en lords barberia",180,"Disfruta un cambio de look en una de las mejores barberias del pais");
        Bono b5 = new Articulos("Sanduchera",250,"Disfruta de una hermosa sanduchera para preparar los mejores emparedados");
        Bono b6 = new Articulos("llavero",80,"Hermoso llavero para acomodar las llaves");
        b1.setImagen(new ImageIcon ("netflix.png"));
        b2.setImagen(new ImageIcon ("cineco.png"));
        b3.setImagen(new ImageIcon ("nivea.png"));
        b4.setImagen(new ImageIcon ("lords.png"));
        b5.setImagen(new ImageIcon ("sanduchera.jpeg"));
        b6.setImagen(new ImageIcon ("llavero.jpg"));
        bonos.add(b1);
        bonos.add(b2);
        bonos.add(b3);
        bonos.add(b4);
        bonos.add(b5);
        bonos.add(b6);
        
    }
    public static ArrayList<Integer> generarindicesaletoriosproductos() {
        ArrayList<Integer> enteros = new ArrayList<Integer>();

        for (int i=0;i<6;i++){
            enteros.add(i); 
        }
        Collections.shuffle(enteros);
        for (int i=0;i<6;i++){
            indices.add(enteros.get(i));
    
        }
        return indices;
        
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


//Aca empieza el codigo

           usuariosPredeterminados();
           productosPrincipales();
           iniciarbonos();
           promocion();
           indices = generarindicesaletoriosproductos();
           
           
           ingresarUsuario();
           
           //Ventana ventana = new Ventana();
           //ventana.setVisible(true);        
           menu();
           
            
            
            

            
        }
        
    }
    

