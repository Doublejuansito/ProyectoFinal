
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

public class Ventana extends JFrame {
     private JPanel panel;
     private JLabel etiquetaD;
     private JLabel etiquetaF;
     private JLabel etiqueta1;
     private JLabel etiqueta2;
     private JLabel etiquetaP1;
     private JLabel etiquetaP2;
     private JLabel etiquetaP3;
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
     
    public Ventana (){
        ImageIcon icon = new ImageIcon("CarritoPrincipal.png");//Imagen de icono
        this.setIconImage(icon.getImage());
        this.setSize(1000,800);//Tamaño
        this.setTitle("RedimePlus");//Titulo
        this.setLocationRelativeTo(null);//lo posciona en el centro
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Terminar el programa al cerrarse
        this.setResizable(false);   // La deja en el tamaño que se establecio    
        iniciarComponentes();//Crear panel en el cuerpo de la ventana 
    }
     private void iniciarComponentes(){
        iniciarPanel();
        iniciaretiquetas();
       
        colocarBotonesPrinci();
        etiquetasProductos();
        animacionetiquetas();
        botonesComprarproductos();
        //colocarBotonesAccion();
        //colocarcajadetexto();
        //colocarAreaTexto();
        //colocarListadesplegable();
        //Ejemplo de accion
        //colocart();
        //colocarcajadeT();
        //colocarB();
        //colocarAreaTexto();
        //oyenteteclado();
        
        
        
        
        
        //Etiqueta de texto
          panel.revalidate();
        panel.repaint();
        
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
        etiqueta2.setBounds(0, 0, 380, 130);// dimensionar la etiqueta
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(380, 130,Image.SCALE_AREA_AVERAGING)));
        panel.add(etiqueta2);
        //Etiqueta de Dinero y puntos
        
        etiquetaD = new JLabel();//Crear etiqueta con string
        etiquetaD.setBounds(830, 33, 150, 35);// posicion en el panel y tamaño de la etiqueta
        etiquetaD.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaD.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaD.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaD.setText("Dinero : "+(Main.usuarios.get(VentanaIngresoUsuario.indice)).getDinero());//Asignar String
        etiquetaD.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaD.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        panel.add(etiquetaD);
        etiquetaD = new JLabel();//Crear etiqueta con string
        etiquetaD.setBounds(830, 63, 150, 35);// posicion en el panel y tamaño de la etiqueta
        etiquetaD.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaD.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaD.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaD.setText("Puntos : "+(Main.usuarios.get(VentanaIngresoUsuario.indice)).getPuntos());//Asignar String
        etiquetaD.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaD.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        panel.add(etiquetaD);

        etiqueta1 = new JLabel();//Crear etiqueta del inicio del panel
        etiqueta1.setBounds(0, 0, 1000, 130);// posicion en el panel y tamaño de la etiqueta
        etiqueta1.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiqueta1.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        panel.add(etiqueta1);
        //Etiqueta Fondo
        etiquetaF = new JLabel();//Crear etiqueta del Fondo del panel
        etiquetaF.setBounds(0,130, 1000, 1000);// posicion en el panel y tamaño de la etiqueta
        etiquetaF.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaF.setBackground(Color.decode("#eae39a"));// Color de la etiqueta 
        panel.add(etiquetaF);
        
        
         }
      private void colocarBotonesPrinci(){
        //Crear Botones
        //Boton de texto
       
      //Agregar el boton al panel 1
        boton1 = new JButton(Main.usuarios.get(VentanaIngresoUsuario.indice).getNombre());//Nuevo Boton con texto
        boton1.setForeground(Color.white);//Color del texto
        boton1.setOpaque(true);
        boton1.setBackground(Color.decode("#f1d072"));
        boton1.setFont(new Font("arial",Font.ROMAN_BASELINE,20));//Fuente
        boton1.setBounds(400,33,200,70);//dimensiones del boton y posicio
        //Boton Redimir Puntos
        boton2 = new JButton("Redimir");//Nuevo Boton con texto
        boton2.setForeground(Color.white);//Color del texto
        boton2.setOpaque(true);
        boton2.setBackground(Color.decode("#f1d072"));
        boton2.setFont(new Font("arial",Font.ROMAN_BASELINE,20));//Fuente
        boton2.setBounds(615,33,200,70);//dimensiones del boton y posicion
        

        etiqueta1.add(boton1);
        etiqueta1.add(boton2);
        //Boton imagen 

    }
      private void etiquetasProductos(){
        etiquetaP1 = new JLabel();//Crear etiqueta con string
        etiquetaP1.setBounds(100, 50, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaP1.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP1.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaP1.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP1.setText("Dinero : $34.000");//Asignar String
        etiquetaP1.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP1.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaF.add(etiquetaP1);
        
        etiquetaP2 = new JLabel();//Crear etiqueta con string
        etiquetaP2.setBounds(400, 50, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaP2.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP2.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaP2.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP2.setText("Dinero : $34.000");//Asignar String
        etiquetaP2.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP2.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaF.add(etiquetaP2);
        
        etiquetaP3 = new JLabel();//Crear etiqueta con string
        etiquetaP3.setBounds(700, 50, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaP3.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP3.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaP3.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP3.setText("Dinero : $34.000");//Asignar String
        etiquetaP3.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP3.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaF.add(etiquetaP3);
        
        etiquetaP4 = new JLabel();//Crear etiqueta con string
        etiquetaP4.setBounds(100, 335, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaP4.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP4.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaP4.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP4.setText("Dinero : $34.000");//Asignar String
        etiquetaP4.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP4.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaF.add(etiquetaP4);
        
        etiquetaP5 = new JLabel();//Crear etiqueta con string
        etiquetaP5.setBounds(400, 335, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaP5.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP5.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaP5.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP5.setText("Dinero : $34.000");//Asignar String
        etiquetaP5.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP5.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaF.add(etiquetaP5);
        
        etiquetaP6 = new JLabel();//Crear etiqueta con string
        etiquetaP6.setBounds(700, 335, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaP6.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP6.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaP6.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP6.setText("Dinero : $34.000");//Asignar String
        etiquetaP6.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP6.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaF.add(etiquetaP6);
        
        etiquetaPa1 = new JLabel();//Crear etiqueta con string
        etiquetaPa1.setBounds(100, 50, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaPa1.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaPa1.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaPa1.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaPa1.setText("Dinero : atras");//Asignar String
        etiquetaPa1.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaPa1.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaPa1.setVisible(false);
        etiquetaF.add(etiquetaPa1);
        
        etiquetaPa2 = new JLabel();//Crear etiqueta con string
        etiquetaPa2.setBounds(400, 50, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaPa2.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaPa2.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaPa2.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaPa2.setText("Dinero : atras");//Asignar String
        etiquetaPa2.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaPa2.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaPa2.setVisible(false);
        etiquetaF.add(etiquetaPa2);
        
        etiquetaPa3 = new JLabel();//Crear etiqueta con string
        etiquetaPa3.setBounds(700, 50, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaPa3.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaPa3.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaPa3.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaPa3.setText("Dinero : atras");//Asignar String
        etiquetaPa3.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaPa3.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaPa3.setVisible(false);
        etiquetaF.add(etiquetaPa3);
        
        etiquetaPa4 = new JLabel();//Crear etiqueta con string
        etiquetaPa4.setBounds(100, 335, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaPa4.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaPa4.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaPa4.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaPa4.setText("Dinero : atras");//Asignar String
        etiquetaPa4.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaPa4.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaPa4.setVisible(false);
        etiquetaF.add(etiquetaPa4);
        
        etiquetaPa5 = new JLabel();//Crear etiqueta con string
        etiquetaPa5.setBounds(400, 335, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaPa5.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaPa5.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaPa5.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaPa5.setText("Dinero : atras");//Asignar String
        etiquetaPa5.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaPa5.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaPa5.setVisible(false);
        etiquetaF.add(etiquetaPa5);
        
        etiquetaPa6 = new JLabel();//Crear etiqueta con string
        etiquetaPa6.setBounds(700, 335, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaPa6.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaPa6.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaPa6.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaPa6.setText("Dinero : atras");//Asignar String
        etiquetaPa6.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaPa6.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaPa5.setVisible(false);
        etiquetaF.add(etiquetaPa6);
          
        
       
      }
      //Oyeten de raton con etiquetas de ptoductos
      private void oyenteprincipal(JLabel etiqueta ,JLabel etiqueta1){//Etiqueta Principal-Etiqueta Secundaria
           MouseListener oyenteraton1 = new MouseListener(){
               @Override
               public void mouseClicked(MouseEvent e) { // al dar click y soltar en el mismo lugar pasa lo siguiente
               }
               @Override
               public void mousePressed(MouseEvent e) {//Cuando se da click pasa lo siguiente (solo darel click)
               }
               @Override
               public void mouseReleased(MouseEvent e) {//Presionar el boton y soltar afuera pasa lo siguiente
               }

               @Override
               public void mouseEntered(MouseEvent e) {//Pasar el mouse por encima del boton pasa lo siguiente 
                   etiqueta.setVisible(false);
                   etiqueta1.setVisible(true);
               }

               @Override
               public void mouseExited(MouseEvent e) {// Salir del boton pasa lo siguiente
                   etiqueta1.setVisible(false);
               
                   etiqueta.setVisible(true);
               }
               
           };
           etiqueta.addMouseListener(oyenteraton1);
           
       }
      private void oyentesecundario(JLabel etiqueta ,JLabel etiqueta1){//Etiqueta Principal-Etiqueta Secundaria
           MouseListener oyenteraton1 = new MouseListener(){
               @Override
               public void mouseClicked(MouseEvent e) { // al dar click y soltar en el mismo lugar pasa lo siguiente
               }
               @Override
               public void mousePressed(MouseEvent e) {//Cuando se da click pasa lo siguiente (solo darel click)
               }
               @Override
               public void mouseReleased(MouseEvent e) {//Presionar el boton y soltar afuera pasa lo siguiente
               }

               @Override
               public void mouseEntered(MouseEvent e) {//Pasar el mouse por encima del boton pasa lo siguiente 
                   etiqueta1.setVisible(false);
                   etiqueta.setVisible(true);
                   
               }

               @Override
               public void mouseExited(MouseEvent e) {// Salir del boton pasa lo siguiente
                   etiqueta.setVisible(false);
                   etiqueta1.setVisible(true);
               
               }
               
           };
           etiqueta.addMouseListener(oyenteraton1);
           
       }
      //Agregar al carrito con boton
      private void accionesbotonAgregarc(JButton boton,JLabel etiqueta ,JLabel etiqueta1){
            MouseListener oyenteraton1 = new MouseListener(){
               @Override
               public void mouseClicked(MouseEvent e) { // al dar click y soltar en el mismo lugar pasa lo siguiente
               }
               @Override
               public void mousePressed(MouseEvent e) {//Cuando se da click pasa lo siguiente (solo darel click)
               //Aca va la opcion de agregarse al carrito
               }
               @Override
               public void mouseReleased(MouseEvent e) {//Presionar el boton y soltar afuera pasa lo siguiente
               }

               @Override
               public void mouseEntered(MouseEvent e) {//Pasar el mouse por encima del boton pasa lo siguiente 
                   etiqueta.setVisible(false);
                   etiqueta1.setVisible(true);
               }

               @Override
               public void mouseExited(MouseEvent e) {// Salir del boton pasa lo siguiente
                   etiqueta1.setVisible(false);
               
                   etiqueta.setVisible(true);
               }
               
           };
           boton.addMouseListener(oyenteraton1);
          
      }
      private void animacionetiquetas(){
          oyenteprincipal(etiquetaP1 ,etiquetaPa1);
          oyentesecundario(etiquetaPa1 ,etiquetaP1);
          //Primer par
          oyenteprincipal(etiquetaP2 ,etiquetaPa2);
          oyentesecundario(etiquetaPa2 ,etiquetaP2);
          //Segundo Par
          oyenteprincipal(etiquetaP3 ,etiquetaPa3);
          oyentesecundario(etiquetaPa3 ,etiquetaP3);
          //Tercer Par
          oyenteprincipal(etiquetaP4 ,etiquetaPa4);
          oyentesecundario(etiquetaPa4 ,etiquetaP4);
          //Cuarto Par
          oyenteprincipal(etiquetaP5 ,etiquetaPa5);
          oyentesecundario(etiquetaPa5 ,etiquetaP5);
          //Quinto par
          oyenteprincipal(etiquetaP6 ,etiquetaPa6);
          oyentesecundario(etiquetaPa6 ,etiquetaP6);
          //Sexto par
          // Agregar los listeners de mouse a ambas etiquetas
      }
      private void botonesComprarproductos(){
        //Primer Boton
        botonP1 = new JButton("Agregar al carrito");//Nuevo Boton con texto
        botonP1.setForeground(Color.BLACK);//Color del texto
        botonP1.setFont(new Font("arial", Font.ROMAN_BASELINE,10));//Fuente
        botonP1.setBounds(0,200,200,50);//dimensiones del boton y posicion
        accionesbotonAgregarc(botonP1,etiquetaP1 , etiquetaPa1);
        etiquetaPa1.add(botonP1);//Agregar el boton al panel 1
        //Segundo Boton
        botonP2 = new JButton("Agregar al carrito");//Nuevo Boton con texto
        botonP2.setForeground(Color.BLACK);//Color del texto
        botonP2.setFont(new Font("arial", Font.ROMAN_BASELINE,10));//Fuente
        botonP2.setBounds(0,200,200,50);//dimensiones del boton y posicion
        accionesbotonAgregarc(botonP2,etiquetaP2 , etiquetaPa2);
        etiquetaPa2.add(botonP2);//Agregar el boton al panel 1
        //Tecer Boton
        botonP3 = new JButton("Agregar al carrito");//Nuevo Boton con texto
        botonP3.setForeground(Color.BLACK);//Color del texto
        botonP3.setFont(new Font("arial", Font.ROMAN_BASELINE,10));//Fuente
        botonP3.setBounds(0,200,200,50);//dimensiones del boton y posicion
        accionesbotonAgregarc(botonP3,etiquetaP3 , etiquetaPa3);
        etiquetaPa3.add(botonP3);//Agregar el boton al panel 1
        //Cuarto Boton
        botonP4 = new JButton("Agregar al carrito");//Nuevo Boton con texto
        botonP4.setForeground(Color.BLACK);//Color del texto
        botonP4.setFont(new Font("arial", Font.ROMAN_BASELINE,10));//Fuente
        botonP4.setBounds(0,200,200,50);//dimensiones del boton y posicion
        accionesbotonAgregarc(botonP4,etiquetaP4 , etiquetaPa4);
        etiquetaPa4.add(botonP4);//Agregar el boton al panel 1
        //Quinto Boton
        botonP5 = new JButton("Agregar al carrito");//Nuevo Boton con texto
        botonP5.setForeground(Color.BLACK);//Color del texto
        botonP5.setFont(new Font("arial", Font.ROMAN_BASELINE,10));//Fuente
        botonP5.setBounds(0,200,200,50);//dimensiones del boton y posicion
        accionesbotonAgregarc(botonP5,etiquetaP5 , etiquetaPa5);
        etiquetaPa5.add(botonP5);//Agregar el boton al panel 1
        //Sexto Boton
        botonP6 = new JButton("Agregar al carrito");//Nuevo Boton con texto
        botonP6.setForeground(Color.BLACK);//Color del texto
        botonP6.setFont(new Font("arial", Font.ROMAN_BASELINE,10));//Fuente
        botonP6.setBounds(0,200,200,50);//dimensiones del boton y posicion
        accionesbotonAgregarc(botonP6,etiquetaP6 , etiquetaPa6);
        etiquetaPa6.add(botonP6);//Agregar el boton al panel 1
        
        
          
      }
     
           
}

        





