/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.usuario;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ospin
 */
public class Main {
    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    static Scanner in = new Scanner(System.in);
    public static void crearusuario(){
        Usuario nuevousuario = Usuario.crear();
        
        usuarios.add(nuevousuario);
    }
    public static void eliminarusuario(){
        System.out.println("Ingrese el numero de identificacion del usuario que desea eliminar");
        int num = in.nextInt();
        for(Usuario usuarito1 : Main.usuarios){
            if (usuarito1.getIdentificacion()==num){
                usuarios.remove(usuarios.indexOf(usuarito1));
                break;
            }
        
    }}

    public static void main(String[] args) {        
        crearusuario();
        crearusuario();
        crearusuario();
        eliminarusuario();
        for(Usuario usuario : usuarios){
            System.out.println(usuario.toString());
            
        }
        
    }
    
}
