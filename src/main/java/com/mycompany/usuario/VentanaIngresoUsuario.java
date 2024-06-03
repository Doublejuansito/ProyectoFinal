
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


public class VentanaIngresoUsuario extends JFrame {
     private JPanel panel;
     private JLabel etiquetaD;
     private JLabel etiquetaF;
     private JLabel etiqueta1;
     private JLabel etiqueta2;
     private JLabel etiquetaU;
     private JLabel etiquetaC;
     private JLabel etiquetaA;
     private JTextField cajaU;
     private JTextField cajaC;
     private JLabel etiquetaP4;
     private JLabel etiquetaP5;
     private JLabel etiquetaP6;
     private JLabel etiquetaPa1;
     private JLabel etiquetaPa2;
     private JLabel etiquetaPa3;
     private JLabel etiquetaPa4;
     private JLabel etiquetaPa5;
     private JLabel etiquetaPa6;
     private JButton boton2;
     private JButton boton1;
     private JButton botonP1;
     private JButton botonP2;
     private JButton botonP3;
     private JButton botonP4;
     private JButton botonP5;
     private JButton botonP6;
     static public int indice=0;
    
    public VentanaIngresoUsuario(){
        ImageIcon icon = new ImageIcon("CarritoPrincipal.png");//Imagen de icono
        this.setIconImage(icon.getImage());
        this.setSize(350,375);//Tamaño
        this.setTitle("Ingreso De usuario");//Titulo
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
        etiqueta2.setBounds(70, 0, 190, 65);// dimensionar la etiqueta
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
        etiquetaF.setBounds(0,65, 350, 400);// posicion en el panel y tamaño de la etiqueta
        etiquetaF.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaF.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        panel.add(etiquetaF);
     
        //Etiqueta Acceder
        etiquetaA = new JLabel();//Crear etiqueta con string
        etiquetaA.setBounds(0, 0, 350, 60);// posicion en el panel y tamaño de la etiqueta
        etiquetaA.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaA.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaA.setForeground(Color.black);//Asignar color al texto
        etiquetaA.setText("Acceder");//Asignar String
        etiquetaA.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaA.setFont(new Font ("chiller",Font.ROMAN_BASELINE,40));//Cambiar fuente
        etiquetaF.add(etiquetaA);
        //Etiqueta De usuario
        etiquetaU = new JLabel();//Crear etiqueta con string
        etiquetaU.setBounds(20, 45, 100, 75);// posicion en el panel y tamaño de la etiqueta
        etiquetaU.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaU.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaU.setForeground(Color.black);//Asignar color al texto
        etiquetaU.setText("Usuario");//Asignar String
        etiquetaU.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaU.setFont(new Font ("chiller",Font.ROMAN_BASELINE,25));//Cambiar fuente
        etiquetaF.add(etiquetaU);
        
        //Etiqueta de contraseña
        etiquetaC = new JLabel();//Crear etiqueta con string
        etiquetaC.setBounds(20, 120, 100, 75);// posicion en el panel y tamaño de la etiqueta
        etiquetaC.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaC.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        etiquetaC.setForeground(Color.black);//Asignar color al texto
        etiquetaC.setText("Contraseña");//Asignar String
        etiquetaC.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaC.setFont(new Font ("chiller",Font.ROMAN_BASELINE,25));//Cambiar fuente
        etiquetaF.add(etiquetaC);
        
        
        
         }
     private void cajasdetexto(){
        cajaU = new JTextField();
        cajaU.setBounds(140, 65, 150, 30);
        etiquetaF.add(cajaU);
        cajaC = new JTextField();
        cajaC.setBounds(140, 140, 150, 30);
        etiquetaF.add(cajaC);
         
     }
     private void boton(){
        boton1 = new JButton("Ingresar");//Nuevo Boton con texto
        boton1.setForeground(Color.black);//Color del texto
        boton1.setFont(new Font("arial", Font.ROMAN_BASELINE,15));//Fuente
        boton1.setBounds(95,200,150,40);//dimensiones del boton y posicion
        etiquetaF.add(boton1);//Agregar el boton al panel 
     }
     private void accionboton(){
         ActionListener oyenteDeAccion = new ActionListener() { // se crea el evento oyente de accion (utilizado para clicks y cosas simples)
             boolean usuarioe=false;
             
            @Override
            public void actionPerformed(ActionEvent e) {//a 
                for(Usuario usuarito1 : Main.usuarios){
                  
                    if (usuarito1.getNombre().equals(cajaU.getText())){
                        usuarioe=true;
                        indice=Main.usuarios.indexOf(usuarito1);
                        break;
                    }
            }
                if (usuarioe){
         
                    usuarioe=false;
                    if(Main.usuarios.get(indice).getContraseña()==(Integer.parseInt(cajaC.getText()))){
                        dispose();
                        Ventana ventana = new Ventana();
                        ventana.setVisible(true);
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        cajaC.setText("");
                        

                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Usuario y/0 Contraseña Incorrectos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    cajaC.setText("");
                    cajaU.setText("");
                }
            }
        }; //Oyente de accion
        boton1.addActionListener(oyenteDeAccion);// se agregael oyente de accion para que pase cada ves que oprima el boton
           
       }
         
     }
    