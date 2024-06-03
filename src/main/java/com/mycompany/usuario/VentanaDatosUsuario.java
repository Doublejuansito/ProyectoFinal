/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class VentanaDatosUsuario extends JFrame {
     private JPanel panel;
     private JLabel etiquetaF;
     private JLabel etiqueta1;
     private JLabel etiqueta2;
     private JLabel etiquetaD;
     private JButton boton1;
     private JButton boton2;
     private JButton boton3;
     private JButton boton4;
    
    
    public VentanaDatosUsuario(){
        ImageIcon icon = new ImageIcon("CarritoPrincipal.png");//Imagen de icono
        this.setIconImage(icon.getImage());
        this.setSize(400,540);//Tamaño
        this.setTitle("Datos");//Titulo
        this.setLocationRelativeTo(null);//lo posciona en el centro
        this.setResizable(false);   // La deja en el tamaño que se establecio    
        iniciarComponentes();//Crear panel en el cuerpo de la ventana 
        
    }
    private void iniciarComponentes(){
        iniciarPanel();
        iniciaretiquetas();
        botones();
        //accionboton();
       
        
    }
     private void iniciarPanel(){//Crear panel
        panel = new JPanel(); 
        panel.setLayout(null); // Desactivar la configuración de diseño por defecto
        panel.setBackground(Color.decode("#FFFFFF")); // Color del panel
        this.getContentPane().add(panel);//Agregar el panel a la ventana 
    }
     private void iniciaretiquetas(){
         //  Logototipo de la empresa1
        ImageIcon imagen = new ImageIcon("LogotipFinal.png");// imagen guardad en la carpeta
        etiqueta2 = new JLabel ();// Crear nueva etiqueta 
        etiqueta2.setBounds(100, 0, 190, 65);// dimensionar la etiqueta
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(190, 65,Image.SCALE_AREA_AVERAGING)));
        panel.add(etiqueta2);
       
        //Inicio Azul
        etiqueta1 = new JLabel();//Crear etiqueta del inicio del panel
        etiqueta1.setBounds(0, 0, 400, 70);// posicion en el panel y tamaño de la etiqueta
        etiqueta1.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiqueta1.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        panel.add(etiqueta1);
        //Etiqueta Fondo
        etiquetaF = new JLabel();//Crear etiqueta del Fondo del panel
        etiquetaF.setBounds(0,70, 400, 470);// posicion en el panel y tamaño de la etiqueta
        etiquetaF.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaF.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        panel.add(etiquetaF);
     
        //Etiqueta Datos
        etiqueta2 = new JLabel();//Crear etiqueta con string
        etiqueta2.setBounds(0, 0, 400, 60);// posicion en el panel y tamaño de la etiqueta
        etiqueta2.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiqueta2.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiqueta2.setForeground(Color.black);//Asignar color al texto
        etiqueta2.setText("Datos");//Asignar String
        etiqueta2.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiqueta2.setFont(new Font ("chiller",Font.ROMAN_BASELINE,40));//Cambiar fuente
        etiquetaF.add(etiqueta2);
        //Etiqueta De usuario
        etiquetaD = new JLabel();//Crear etiqueta con string
        etiquetaD.setBounds(20, 50, 400, 65);// posicion en el panel y tamaño de la etiqueta
        etiquetaD.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaD.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaD.setForeground(Color.black);//Asignar color al texto
        etiquetaD.setText("                Usuario :    "+Main.usuarios.get(VentanaIngresoUsuario.indice).getNombre()+"    ");//Asignar String
        etiquetaD.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaD.setFont(new Font ("chiller",Font.ROMAN_BASELINE,25));//Cambiar fuente
        etiquetaF.add(etiquetaD);
        
        //Etiqueta de Identificacion
        etiquetaD = new JLabel();//Crear etiqueta con string
        etiquetaD.setBounds(20, 100, 400, 65);// posicion en el panel y tamaño de la etiqueta
        etiquetaD.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaD.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaD.setForeground(Color.black);//Asignar color al texto
        etiquetaD.setText("                Identificacion :   "+Main.usuarios.get(VentanaIngresoUsuario.indice).getIdentificacion()+"    ");//Asignar String
        etiquetaD.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaD.setVerticalAlignment(JLabel.CENTER);
        etiquetaD.setFont(new Font ("chiller",Font.ROMAN_BASELINE,25));//Cambiar fuente
        etiquetaF.add(etiquetaD);
        //Etiqueta de Correo        
        etiquetaD = new JLabel();//Crear etiqueta con string
        etiquetaD.setBounds(20, 150, 400, 65);// posicion en el panel y tamaño de la etiqueta
        etiquetaD.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaD.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaD.setForeground(Color.black);//Asignar color al texto
        etiquetaD.setText("                Correo :   "+Main.usuarios.get(VentanaIngresoUsuario.indice).getCorreo()+"    ");//Asignar String
        etiquetaD.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaD.setVerticalAlignment(JLabel.CENTER);
        etiquetaD.setFont(new Font ("chiller",Font.ROMAN_BASELINE,25));//Cambiar fuente
        etiquetaF.add(etiquetaD);
        //Etiqueta de Puntos       
        etiquetaD = new JLabel();//Crear etiqueta con string
        etiquetaD.setBounds(20, 200, 400, 65);// posicion en el panel y tamaño de la etiqueta
        etiquetaD.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaD.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaD.setForeground(Color.black);//Asignar color al texto
        etiquetaD.setText("                Puntos :   "+Main.usuarios.get(VentanaIngresoUsuario.indice).getPuntos()+"    ");//Asignar String
        etiquetaD.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaD.setVerticalAlignment(JLabel.CENTER);
        etiquetaD.setFont(new Font ("chiller",Font.ROMAN_BASELINE,25));//Cambiar fuente
        etiquetaF.add(etiquetaD);
        //Etiqueta de Dinero       
        etiquetaD = new JLabel();//Crear etiqueta con string
        etiquetaD.setBounds(20, 250, 400, 65);// posicion en el panel y tamaño de la etiqueta
        etiquetaD.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaD.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaD.setForeground(Color.black);//Asignar color al texto
        etiquetaD.setText("                Dinero :   $"+Main.usuarios.get(VentanaIngresoUsuario.indice).getDinero()+"    ");//Asignar String
        etiquetaD.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaD.setVerticalAlignment(JLabel.CENTER);
        etiquetaD.setFont(new Font ("chiller",Font.ROMAN_BASELINE,25));//Cambiar fuente
        etiquetaF.add(etiquetaD);
        
        
        
         }
     
     private void botones(){
        //Boton Recargar
        boton1 = new JButton("Recargar");//Nuevo Boton con texto
        boton1.setForeground(Color.black);//Color del texto
        boton1.setFont(new Font("arial", Font.ROMAN_BASELINE,15));//Fuente
        boton1.setBounds(200,325,170,40);//dimensiones del boton y posicion
        etiquetaF.add(boton1);//Agregar el boton al panel 
        
        //Boton Carrito        
        boton2 = new JButton("Carrito");//Nuevo Boton con texto
        boton2.setForeground(Color.black);//Color del texto
        boton2.setFont(new Font("arial", Font.ROMAN_BASELINE,15));//Fuente
        boton2.setBounds(20,325,170,40);//dimensiones del boton y posicion
        etiquetaF.add(boton2);//Agregar el boton al panel 
        
        //Boton Agregar Usuario
        
        boton3 = new JButton("Agregar Usuario");//Nuevo Boton con texto
        boton3.setForeground(Color.black);//Color del texto
        boton3.setFont(new Font("arial", Font.ROMAN_BASELINE,15));//Fuente
        boton3.setBounds(200,375,170,40);//dimensiones del boton y posicion
        etiquetaF.add(boton3);//Agregar el boton al panel 
        
        //Boton Cambiar Usuario
        
        boton4 = new JButton("Cambiar Usuario");//Nuevo Boton con texto
        boton4.setForeground(Color.black);//Color del texto
        boton4.setFont(new Font("arial", Font.ROMAN_BASELINE,15));//Fuente
        boton4.setBounds(20,375,170,40);//dimensiones del boton y posicion
        etiquetaF.add(boton4);//Agregar el boton al panel 
        
        
        
     }//Corregir
//     private void accionboton(){
//         ActionListener oyenteDeAccion = new ActionListener() { // se crea el evento oyente de accion (utilizado para clicks y cosas simples)
//             boolean usuarioe=false;
//             
//            @Override
//            public void actionPerformed(ActionEvent e) {//a 
//                for(Usuario usuarito1 : Main.usuarios){
//                  
//                    if (usuarito1.getNombre().equals(cajaU.getText())){
//                        usuarioe=true;
//                        indice=Main.usuarios.indexOf(usuarito1);
//                        break;
//                    }
//            }
//                if (usuarioe){
//         
//                    usuarioe=false;
//                    if(Main.usuarios.get(indice).getContraseña()==(Integer.parseInt(cajaC.getText()))){
//                        dispose();
//                        Ventana ventana = new Ventana();
//                        ventana.setVisible(true);
//                        
//                    }
//                    else{
//                        JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Advertencia", JOptionPane.WARNING_MESSAGE);
//                        cajaC.setText("");
//                        
//
//                    }
//                }
//                else{
//                    JOptionPane.showMessageDialog(null, "Usuario y/0 Contraseña Incorrectos", "Advertencia", JOptionPane.WARNING_MESSAGE);
//                    cajaC.setText("");
//                    cajaU.setText("");
//                }
//            }
//        }; //Oyente de accion
//        boton1.addActionListener(oyenteDeAccion);// se agregael oyente de accion para que pase cada ves que oprima el boton
//           
//       }
         
     }