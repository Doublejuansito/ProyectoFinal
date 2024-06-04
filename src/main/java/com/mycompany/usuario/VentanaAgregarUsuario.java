/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;

import static com.mycompany.usuario.VentanaIngresoUsuario.indice;
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

public class VentanaAgregarUsuario extends JFrame {
    private JPanel panel;
    private JLabel etiquetaNo;
    private JLabel etiquetaId;
    private JLabel etiquetaCo;
    private JLabel etiquetaCon;
    private JLabel etiquetaDi;
    private JLabel etiquetaB;
    private JLabel etiqueta2;
    private JLabel etiqueta1;
    private JLabel etiquetaF;
    private JTextField cajaNo;
    private JTextField cajaId;
    private JTextField cajaCo;
    private JTextField cajaCon;
    private JTextField cajaDi;
    private JButton boton1;
    
    public VentanaAgregarUsuario(){
        ImageIcon icon = new ImageIcon("CarritoPrincipal.png");//Imagen de icono
        this.setIconImage(icon.getImage());
        this.setSize(400,620);//Tamaño
        this.setTitle("Agregar usuario");//Titulo
        this.setLocationRelativeTo(null);//lo posciona en el centro
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Terminar el programa al cerrarse
        this.setResizable(false);   // La deja en el tamaño que se establecio    
        iniciarComponentes();//Crear panel en el cuerpo de la ventana 
    
}
    private void iniciarComponentes(){
        iniciarPanel();
        iniciaretiquetas();
        cajasdetexto();
        boton();
        
        accionboton();
               
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
        etiqueta1.setBounds(0, 0, 1000, 70);// posicion en el panel y tamaño de la etiqueta
        etiqueta1.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiqueta1.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        panel.add(etiqueta1);
        //Etiqueta Fondo
        etiquetaF = new JLabel();//Crear etiqueta del Fondo del panel
        etiquetaF.setBounds(0,65, 400, 620);// posicion en el panel y tamaño de la etiqueta
        etiquetaF.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaF.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        panel.add(etiquetaF);
     
        //Etiqueta Acceder
        etiquetaB = new JLabel();//Crear etiqueta con string
        etiquetaB.setBounds(25, 10, 350, 60);// posicion en el panel y tamaño de la etiqueta
        etiquetaB.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaB.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaB.setForeground(Color.black);//Asignar color al texto
        etiquetaB.setText("Bienvenido");//Asignar String
        etiquetaB.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaB.setFont(new Font ("chiller",Font.ROMAN_BASELINE,40));//Cambiar fuente
        etiquetaF.add(etiquetaB);
        //Etiqueta De usuario
        etiquetaNo = new JLabel();//Crear etiqueta con string
        etiquetaNo.setBounds(50, 55, 100, 75);// posicion en el panel y tamaño de la etiqueta
        etiquetaNo.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaNo.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaNo.setForeground(Color.black);//Asignar color al texto
        etiquetaNo.setText("Nombre");//Asignar String
        etiquetaNo.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaNo.setFont(new Font ("chiller",Font.ROMAN_BASELINE,25));//Cambiar fuente
        etiquetaF.add(etiquetaNo);
        
        //Etiqueta de contraseña
        etiquetaId = new JLabel();//Crear etiqueta con string
        etiquetaId.setBounds(50, 130, 100, 75);// posicion en el panel y tamaño de la etiqueta
        etiquetaId.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaId.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaId.setForeground(Color.black);//Asignar color al texto
        etiquetaId.setText("Identificacion");//Asignar String
        etiquetaId.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaId.setFont(new Font ("chiller",Font.ROMAN_BASELINE,25));//Cambiar fuente
        etiquetaF.add(etiquetaId);
        
         //Etiqueta de contraseña
        etiquetaCo = new JLabel();//Crear etiqueta con string
        etiquetaCo.setBounds(50, 205, 100, 75);// posicion en el panel y tamaño de la etiqueta
        etiquetaCo.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaCo.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaCo.setForeground(Color.black);//Asignar color al texto
        etiquetaCo.setText("Correo");//Asignar String
        etiquetaCo.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaCo.setFont(new Font ("chiller",Font.ROMAN_BASELINE,25));//Cambiar fuente
        etiquetaF.add(etiquetaCo);
        
        //Etiqueta de contraseña
        etiquetaCon = new JLabel();//Crear etiqueta con string
        etiquetaCon.setBounds(50, 280, 100, 75);// posicion en el panel y tamaño de la etiqueta
        etiquetaCon.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaCon.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaCon.setForeground(Color.black);//Asignar color al texto
        etiquetaCon.setText("Contraseña");//Asignar String
        etiquetaCon.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaCon.setFont(new Font ("chiller",Font.ROMAN_BASELINE,25));//Cambiar fuente
        etiquetaF.add(etiquetaCon);
        
        //Etiqueta de contraseña
        etiquetaDi = new JLabel();//Crear etiqueta con string
        etiquetaDi.setBounds(50, 355, 100, 75);// posicion en el panel y tamaño de la etiqueta
        etiquetaDi.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaDi.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaDi.setForeground(Color.black);//Asignar color al texto
        etiquetaDi.setText("Dinero");//Asignar String
        etiquetaDi.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaDi.setFont(new Font ("chiller",Font.ROMAN_BASELINE,25));//Cambiar fuente
        etiquetaF.add(etiquetaDi);
        
   
        
        
        
        
         }
     private void cajasdetexto(){
        cajaNo = new JTextField();
        cajaNo.setBounds(170, 80, 150, 30);
        etiquetaF.add(cajaNo);
        cajaId = new JTextField();
        cajaId.setBounds(170, 155, 150, 30);
        etiquetaF.add(cajaId);
        cajaCo = new JTextField();
        cajaCo.setBounds(170, 230, 150, 30);
        etiquetaF.add(cajaCo);
        cajaCon = new JTextField();
        cajaCon.setBounds(170, 305, 150, 30);
        etiquetaF.add(cajaCon);
        cajaDi = new JTextField();
        cajaDi.setBounds(170, 380, 150, 30);
        etiquetaF.add(cajaDi);
        
         
     }
     private void boton(){
        boton1 = new JButton("Ingresar");//Nuevo Boton con texto
        boton1.setForeground(Color.black);//Color del texto
        boton1.setFont(new Font("arial", Font.ROMAN_BASELINE,15));//Fuente
        boton1.setBounds(120,440,150,40);//dimensiones del boton y posicion
        
        etiquetaF.add(boton1);//Agregar el boton al panel 
        
     }
     
     private void accionboton(){
        
       }
}
