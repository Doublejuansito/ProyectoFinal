
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

public class Ventana extends JFrame {
     private JPanel panel;
     private JLabel etiquetaD;
     private JLabel etiquetaF;
     private JLabel etiqueta1;
     private JLabel etiqueta2;
     private JLabel etiquetaP1;
     private JLabel etiquetaP1t;
     private JLabel etiquetaP1t2;
     private JLabel etiquetaP2;
     private JLabel etiquetaP2t;
     private JLabel etiquetaP2t2;
     private JLabel etiquetaP3;
     private JLabel etiquetaP3t;
     private JLabel etiquetaP3t2;
     private JLabel etiquetaP4;
     private JLabel etiquetaP4t;
     private JLabel etiquetaP4t2;
     private JLabel etiquetaP5;
     private JLabel etiquetaP5t;
     private JLabel etiquetaP5t2;
     private JLabel etiquetaP6;
     private JLabel etiquetaP6t;
     private JLabel etiquetaP6t2;
     private JLabel etiquetaPa1;
     private JLabel etiquetaPa2;
     private JLabel etiquetaPa3;
     private JLabel etiquetaPa4;
     private JLabel etiquetaPa5;
     private JLabel etiquetaPa6;
     private ImageIcon imagen1_1;
     private ImageIcon imagen1_2;
     private ImageIcon imagen1_3;
     private ImageIcon imagen1_4;
     private ImageIcon imagen1_5;
     private ImageIcon imagen1_6;
     private JLabel imagen1;
     private JLabel imagen2;
     private JLabel imagen3;
     private JLabel imagen4;
     private JLabel imagen5;
     private JLabel imagen6;
     private JButton boton2;
     private JButton boton1;
     private JButton botonP1;
     private JButton botonP2;
     private JButton botonP3;
     private JButton botonP4;
     private JButton botonP5;
     private JButton botonP6;
     private JTextArea Descripcion1;
     private JTextArea Descripcion2;
     private JTextArea Descripcion3;
     private JTextArea Descripcion4;
     private JTextArea Descripcion5;
     private JTextArea Descripcion6;
     private JTextArea PP1;
     private JTextArea PP2;
     private JTextArea PP3;
     private JTextArea PP4;
     private JTextArea PP5;
     private JTextArea PP6;
     
     
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
        areadetextodescripcion();
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
        etiquetaD.setBounds(840, 33, 150, 35);// posicion en el panel y tamaño de la etiqueta
        etiquetaD.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaD.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaD.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaD.setText("Dinero : "+(Main.usuarios.get(VentanaIngresoUsuario.indice)).getDinero());//Asignar String
        etiquetaD.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaD.setHorizontalAlignment(JLabel.LEFT);//Añadir el texto a una posciicoon dentro de la etiqueta
        panel.add(etiquetaD);
        etiquetaD = new JLabel();//Crear etiqueta con string
        etiquetaD.setBounds(840, 63, 150, 35);// posicion en el panel y tamaño de la etiqueta
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
      //Boton usuario
        boton1 = new JButton(Main.usuarios.get(VentanaIngresoUsuario.indice).getNombre());//Nuevo Boton con texto
        boton1.setForeground(Color.white);//Color del texto
        boton1.setOpaque(true);
        boton1.setBackground(Color.decode("#f1d072"));
        boton1.setFont(new Font("arial",Font.ROMAN_BASELINE,20));//Fuente
        boton1.setBounds(400,33,200,70);//dimensiones del boton y posicio
        
        //Evento Boton datos Usuario
        
        ActionListener oyenteDeAccionusuario = new ActionListener() { // se crea el evento oyente de accion (utilizado para clicks y cosas simples)
            @Override
            public void actionPerformed(ActionEvent e) {//a 
//                
                  VentanaDatosUsuario ventana = new VentanaDatosUsuario();//crear la ventana datos usuario
                  ventana.setVisible(true); 
            }
        }; //Oyente de accion
        boton1.addActionListener(oyenteDeAccionusuario);// se agregael oyente de accion para que pase cada ves que oprima el boton
        
        
        
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
        etiquetaP1t = new JLabel();
        etiquetaP1t.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP1t.setBackground(Color.decode("#f1d072"));// Color de la etiqueta 
        etiquetaP1t.setBounds(10, 10, 180,30);
        etiquetaP1t.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP1t.setText(Main.productos.get(Main.indices.get(0)).getNombre());//Asignar String
        etiquetaP1t.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP1t.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaP1.add(etiquetaP1t);
        imagen1 = new JLabel();
        imagen1.setBounds(10,50,180,190);
        imagen1_1=(Main.productos.get(Main.indices.get(0)).getImagen());//Imagen Obtenida de la lista aleatoria
        imagen1.setIcon(new ImageIcon(imagen1_1.getImage().getScaledInstance(180, 190,Image.SCALE_AREA_AVERAGING)));//Setea la imagen del producto1 de la lista aleatoria 
        etiquetaP1.add(imagen1);
        etiquetaF.add(etiquetaP1);
        
        etiquetaP2 = new JLabel();//Crear etiqueta con string
        etiquetaP2.setBounds(400, 50, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaP2.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP2.setBackground(Color.decode("#175CA7"));// Color de la etiqueta etiquetaP1t = new JLabel();
        etiquetaP2t = new JLabel();
        etiquetaP2t.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP2t.setBackground(Color.decode("#f1d072"));// Color de la etiqueta 
        etiquetaP2t.setBounds(10, 10, 180,30);
        etiquetaP2t.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP2t.setText(Main.productos.get(Main.indices.get(1)).getNombre());//Asignar String
        etiquetaP2t.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP2t.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaP2.add(etiquetaP2t);
        imagen2 = new JLabel();
        imagen2.setBounds(10,50,180,190);
        imagen1_2=(Main.productos.get(Main.indices.get(1)).getImagen());//Imagen Obtenida de la lista aleatoria
        imagen2.setIcon(new ImageIcon(imagen1_2.getImage().getScaledInstance(180, 190,Image.SCALE_AREA_AVERAGING)));//Setea la imagen del producto1 de la lista aleatoria 
        etiquetaP2.add(imagen2);
        etiquetaF.add(etiquetaP2);
        
        etiquetaP3 = new JLabel();//Crear etiqueta con string
        etiquetaP3.setBounds(700, 50, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaP3.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP3.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaP3t = new JLabel();
        etiquetaP3t.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP3t.setBackground(Color.decode("#f1d072"));// Color de la etiqueta 
        etiquetaP3t.setBounds(10, 10, 180,30);
        etiquetaP3t.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP3t.setText(Main.productos.get(Main.indices.get(2)).getNombre());//Asignar String
        etiquetaP3t.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP3t.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaP3.add(etiquetaP3t);
        imagen3 = new JLabel();
        imagen3.setBounds(10,50,180,190);
        imagen1_3=(Main.productos.get(Main.indices.get(2)).getImagen());//Imagen Obtenida de la lista aleatoria
        imagen3.setIcon(new ImageIcon(imagen1_3.getImage().getScaledInstance(180, 190,Image.SCALE_AREA_AVERAGING)));//Setea la imagen del producto1 de la lista aleatoria 
        etiquetaP3.add(imagen3);
        etiquetaF.add(etiquetaP3);
        
        etiquetaP4 = new JLabel();//Crear etiqueta con string
        etiquetaP4.setBounds(100, 335, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaP4.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP4.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaP4t = new JLabel();
        etiquetaP4t.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP4t.setBackground(Color.decode("#f1d072"));// Color de la etiqueta 
        etiquetaP4t.setBounds(10, 10, 180,30);
        etiquetaP4t.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP4t.setText(Main.productos.get(Main.indices.get(3)).getNombre());//Asignar String
        etiquetaP4t.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP4t.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaP4.add(etiquetaP4t);
        imagen4 = new JLabel();
        imagen4.setBounds(10,50,180,190);
        imagen1_4=(Main.productos.get(Main.indices.get(3)).getImagen());//Imagen Obtenida de la lista aleatoria
        imagen4.setIcon(new ImageIcon(imagen1_4.getImage().getScaledInstance(180, 190,Image.SCALE_AREA_AVERAGING)));//Setea la imagen del producto1 de la lista aleatoria  
        etiquetaP4.add(imagen4);
        etiquetaF.add(etiquetaP4);
        
        etiquetaP5 = new JLabel();//Crear etiqueta con string
        etiquetaP5.setBounds(400, 335, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaP5.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP5.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaP5t = new JLabel();
        etiquetaP5t.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP5t.setBackground(Color.decode("#f1d072"));// Color de la etiqueta 
        etiquetaP5t.setBounds(10, 10, 180,30);
        etiquetaP5t.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP5t.setText(Main.productos.get(Main.indices.get(4)).getNombre());//Asignar String
        etiquetaP5t.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP5t.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaP5.add(etiquetaP5t);
        imagen5 = new JLabel();
        imagen5.setBounds(10,50,180,190);
        imagen1_5=(Main.productos.get(Main.indices.get(4)).getImagen());//Imagen Obtenida de la lista aleatoria
        imagen5.setIcon(new ImageIcon(imagen1_5.getImage().getScaledInstance(180, 190,Image.SCALE_AREA_AVERAGING)));//Setea la imagen del producto1 de la lista aleatoria 
        etiquetaP5.add(imagen5);
        etiquetaF.add(etiquetaP5);
        
        etiquetaP6 = new JLabel();//Crear etiqueta con string
        etiquetaP6.setBounds(700, 335, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaP6.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP6.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaP6t = new JLabel();
        etiquetaP6t.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP6t.setBackground(Color.decode("#f1d072"));// Color de la etiqueta 
        etiquetaP6t.setBounds(10, 10, 180,30);
        etiquetaP6t.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP6t.setText(Main.productos.get(Main.indices.get(5)).getNombre());//Asignar String
        etiquetaP6t.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP6t.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaP6.add(etiquetaP6t);
        imagen6 = new JLabel();
        imagen6.setBounds(10,50,180,190);
        imagen1_6=(Main.productos.get(Main.indices.get(5)).getImagen());//Imagen Obtenida de la lista aleatoria
        imagen6.setIcon(new ImageIcon(imagen1_6.getImage().getScaledInstance(180, 190,Image.SCALE_AREA_AVERAGING)));//Setea la imagen del producto1 de la lista aleatoria  
        etiquetaP6.add(imagen6);
        etiquetaF.add(etiquetaP6);
        
        etiquetaPa1 = new JLabel();//Crear etiqueta con string
        etiquetaPa1.setBounds(100, 50, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaPa1.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaPa1.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaPa1.setVisible(false);
        //etiqueta texto
        etiquetaP1t2 = new JLabel();
        etiquetaP1t2.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP1t2.setBackground(Color.decode("#f1d072"));// Color de la etiqueta 
        etiquetaP1t2.setBounds(10, 10, 180,30);
        etiquetaP1t2.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP1t2.setText(Main.productos.get(Main.indices.get(0)).getNombre());//Asignar String
        etiquetaP1t2.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP1t2.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaPa1.add(etiquetaP1t2);
        etiquetaF.add(etiquetaPa1);
        
        etiquetaPa2 = new JLabel();//Crear etiqueta con string
        etiquetaPa2.setBounds(400, 50, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaPa2.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaPa2.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaPa2.setVisible(false);
        //etiqueta texto
        etiquetaP2t2 = new JLabel();
        etiquetaP2t2.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP2t2.setBackground(Color.decode("#f1d072"));// Color de la etiqueta 
        etiquetaP2t2.setBounds(10, 10, 180,30);
        etiquetaP2t2.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP2t2.setText(Main.productos.get(Main.indices.get(1)).getNombre());//Asignar String
        etiquetaP2t2.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP2t2.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaPa2.add(etiquetaP2t2);
        
        etiquetaF.add(etiquetaPa2);
        
        etiquetaPa3 = new JLabel();//Crear etiqueta con string
        etiquetaPa3.setBounds(700, 50, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaPa3.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaPa3.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaPa3.setVisible(false);
        //Texto
        etiquetaP3t2 = new JLabel();
        etiquetaP3t2.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP3t2.setBackground(Color.decode("#f1d072"));// Color de la etiqueta 
        etiquetaP3t2.setBounds(10, 10, 180,30);
        etiquetaP3t2.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP3t2.setText(Main.productos.get(Main.indices.get(2)).getNombre());//Asignar String
        etiquetaP3t2.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP3t2.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaPa3.add(etiquetaP3t2);
        etiquetaF.add(etiquetaPa3);
        
        etiquetaPa4 = new JLabel();//Crear etiqueta con string
        etiquetaPa4.setBounds(100, 335, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaPa4.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaPa4.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaPa4.setVisible(false);
        etiquetaP4t2 = new JLabel();
        etiquetaP4t2.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP4t2.setBackground(Color.decode("#f1d072"));// Color de la etiqueta 
        etiquetaP4t2.setBounds(10, 10, 180,30);
        etiquetaP4t2.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP4t2.setText(Main.productos.get(Main.indices.get(3)).getNombre());//Asignar String
        etiquetaP4t2.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP4t2.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaPa4.add(etiquetaP4t2);
        etiquetaF.add(etiquetaPa4);
        
        etiquetaPa5 = new JLabel();//Crear etiqueta con string
        etiquetaPa5.setBounds(400, 335, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaPa5.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaPa5.setBackground(Color.decode("#175CA7"));// Color de la etiqueta
        etiquetaPa5.setVisible(false);
        etiquetaP5t2 = new JLabel();
        etiquetaP5t2.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP5t2.setBackground(Color.decode("#f1d072"));// Color de la etiqueta 
        etiquetaP5t2.setBounds(10, 10, 180,30);
        etiquetaP5t2.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP5t2.setText(Main.productos.get(Main.indices.get(4)).getNombre());//Asignar String
        etiquetaP5t2.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP5t2.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaPa5.add(etiquetaP5t2);
        etiquetaF.add(etiquetaPa5);
        
        etiquetaPa6 = new JLabel();//Crear etiqueta con string
        etiquetaPa6.setBounds(700, 335, 200, 250);// posicion en el panel y tamaño de la etiqueta
        etiquetaPa6.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaPa6.setBackground(Color.decode("#175CA7"));// Color de la etiqueta 
        etiquetaPa6.setVisible(false);
        etiquetaP6t2 = new JLabel();
        etiquetaP6t2.setOpaque(true);//Dejar que la etiqueta deje de ser transparente
        etiquetaP6t2.setBackground(Color.decode("#f1d072"));// Color de la etiqueta 
        etiquetaP6t2.setBounds(10, 10, 180,30);
        etiquetaP6t2.setForeground(Color.WHITE);//Asignar color al texto
        etiquetaP6t2.setText(Main.productos.get(Main.indices.get(5)).getNombre());//Asignar String
        etiquetaP6t2.setFont(new Font ("chiller",Font.ROMAN_BASELINE,20));//Cambiar fuente
        etiquetaP6t2.setHorizontalAlignment(JLabel.CENTER);//Añadir el texto a una posciicoon dentro de la etiqueta
        etiquetaPa6.add(etiquetaP6t2);
        etiquetaF.add(etiquetaPa6);
          
        
       
      }
      //Oyeten de raton con etiquetas de productos
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
      //Agregar al carrito con boton ademas de corregir animacion etiquetas
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
      //corregir animacion con caja de texto
      private void accionescajadetexto(JTextArea texto,JLabel etiqueta ,JLabel etiqueta1){
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
           texto.addMouseListener(oyenteraton1);
          
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
      private void descuento(int indice,JTextArea PP1){
        Producto p1 =Main.productos.get(Main.indices.get(indice));
        PP1.setText("Puntos : "+p1.getPuntos()+"\n");
        switch(p1.getCategoria()){
            case "Juguetes":
                if(Juguetes.getDescuento()!=0){
                    PP1.append("Descuento : "+Juguetes.getDescuento()+"%");
                    PP1.append("\nAntes : $"+p1.getPrecio());
                    PP1.append("\nAhora : $"+(p1.getPrecio()*(1-((float)Juguetes.getDescuento()/100))));
                    Main.productos.get(Main.indices.get(indice)).setPrecio(p1.getPrecio()*(1-((float)Juguetes.getDescuento()/100)));
                    
            }
                else{
                    PP1.append("\nPrecio : $"+p1.getPrecio());
                    
                }
                break;
            case "Ropa":
                if(Ropa.getDescuento()!=0){
                    PP1.append("Descuento : "+Ropa.getDescuento()+"%");
                    PP1.append("\nAntes : $"+p1.getPrecio());
                    PP1.append("\nAhora : $"+(p1.getPrecio()*(1-((float)Ropa.getDescuento()/100))));
                    Main.productos.get(Main.indices.get(indice)).setPrecio(p1.getPrecio()*(1-((float)Ropa.getDescuento()/100)));
                    
                    
                
            }
                else{
                    PP1.append("\nPrecio : $"+p1.getPrecio());
                    
                }
                break;
            case "Limpieza":
                if(Limpieza.getDescuento()!=0){
                    PP1.append("Descuento : "+Limpieza.getDescuento()+"%");
                    PP1.append("\nAntes : $"+p1.getPrecio());
                    PP1.append("\nAhora : $"+(p1.getPrecio()*(1-((float)Limpieza.getDescuento()/100))));
                    Main.productos.get(Main.indices.get(indice)).setPrecio(p1.getPrecio()*(1-((float)Limpieza.getDescuento()/100)));
                    

            }
                else{
                    PP1.append("\nPrecio : $"+p1.getPrecio());
                    
                }
                break;
            case "Alimentos":
                if(Alimentos.getDescuento()!=0){
                    PP1.append("Descuento : "+Alimentos.getDescuento()+"%");
                    PP1.append("\nAntes : $"+p1.getPrecio());
                    PP1.append("\nAhora : $"+(p1.getPrecio()*(1-((float)Alimentos.getDescuento()/100))));
                    Main.productos.get(Main.indices.get(indice)).setPrecio(p1.getPrecio()*(1-((float)Alimentos.getDescuento()/100)));
            }
                else{
                     PP1.append("\nPrecio : $"+p1.getPrecio());
                    
                }
                break;
        }
      }
      private void areadetextodescripcion(){
        //1era
        Descripcion1 = new JTextArea();
        Descripcion1.setBounds(10, 50,180,70);
        Descripcion1.setBackground(Color.WHITE);
        Descripcion1.setText(Main.productos.get(Main.indices.get(0)).descripcion);//Coloca y borra el anterior texto
        Descripcion1.setLineWrap(true); // Habilitar ajuste de línea
        Descripcion1.setWrapStyleWord(true); // Ajustar líneas por palabras
        Descripcion1.setEditable(false);//Hacer que no sea editable
        PP1 = new JTextArea();
        PP1.setBounds(10,130,180,65);
        PP1.setBackground(Color.WHITE);
        PP1.setEditable(false);
        descuento(0,PP1);
        accionescajadetexto(Descripcion1,etiquetaP1 ,etiquetaPa1);   
        accionescajadetexto(PP1,etiquetaP1 ,etiquetaPa1);   
        etiquetaPa1.add(Descripcion1);
        etiquetaPa1.add(PP1);
        //2
        Descripcion2 = new JTextArea();
        Descripcion2.setBounds(10, 50,180,70);
        Descripcion2.setBackground(Color.WHITE);
        Descripcion2.setText(Main.productos.get(Main.indices.get(0)).descripcion);//Coloca y borra el anterior texto
        Descripcion2.setLineWrap(true); // Habilitar ajuste de línea
        Descripcion2.setWrapStyleWord(true); // Ajustar líneas por palabras
        Descripcion2.setEditable(false);//Hacer que no sea editable
        PP2 = new JTextArea();
        PP2.setBounds(10,130,180,65);
        PP2.setBackground(Color.WHITE);
        PP2.setEditable(false);
        descuento(1,PP2);
        accionescajadetexto(Descripcion2,etiquetaP2 ,etiquetaPa2);   
        accionescajadetexto(PP2,etiquetaP2 ,etiquetaPa2);   
        etiquetaPa2.add(Descripcion2);
        etiquetaPa2.add(PP2);
        //3
        Descripcion3 = new JTextArea();
        Descripcion3.setBounds(10, 50,180,70);
        Descripcion3.setBackground(Color.WHITE);
        Descripcion3.setText(Main.productos.get(Main.indices.get(0)).descripcion);//Coloca y borra el anterior texto
        Descripcion3.setLineWrap(true); // Habilitar ajuste de línea
        Descripcion3.setWrapStyleWord(true); // Ajustar líneas por palabras
        Descripcion3.setEditable(false);//Hacer que no sea editable
        PP3 = new JTextArea();
        PP3.setBounds(10,130,180,65);
        PP3.setBackground(Color.WHITE);
        PP3.setEditable(false);
        descuento(2,PP3);
        accionescajadetexto(Descripcion3,etiquetaP3 ,etiquetaPa3);   
        accionescajadetexto(PP3,etiquetaP3 ,etiquetaPa3);   
        etiquetaPa3.add(Descripcion3);
        etiquetaPa3.add(PP3);
        //4
        Descripcion4 = new JTextArea();
        Descripcion4.setBounds(10, 50,180,70);
        Descripcion4.setBackground(Color.WHITE);
        Descripcion4.setText(Main.productos.get(Main.indices.get(0)).descripcion);//Coloca y borra el anterior texto
        Descripcion4.setLineWrap(true); // Habilitar ajuste de línea
        Descripcion4.setWrapStyleWord(true); // Ajustar líneas por palabras
        Descripcion4.setEditable(false);//Hacer que no sea editable
        PP4 = new JTextArea();
        PP4.setBounds(10,130,180,65);
        PP4.setBackground(Color.WHITE);
        PP4.setEditable(false);
        descuento(3,PP4);
        accionescajadetexto(Descripcion4,etiquetaP4 ,etiquetaPa4);   
        accionescajadetexto(PP4,etiquetaP4 ,etiquetaPa4);   
        etiquetaPa4.add(Descripcion4);
        etiquetaPa4.add(PP4);
        //5
        Descripcion5 = new JTextArea();
        Descripcion5.setBounds(10, 50,180,70);
        Descripcion5.setBackground(Color.WHITE);
        Descripcion5.setText(Main.productos.get(Main.indices.get(0)).descripcion);//Coloca y borra el anterior texto
        Descripcion5.setLineWrap(true); // Habilitar ajuste de línea
        Descripcion5.setWrapStyleWord(true); // Ajustar líneas por palabras
        Descripcion5.setEditable(false);//Hacer que no sea editable
        PP5 = new JTextArea();
        PP5.setBounds(10,130,180,65);
        PP5.setBackground(Color.WHITE);
        PP5.setEditable(false);
        descuento(4,PP5);
        accionescajadetexto(Descripcion5,etiquetaP5 ,etiquetaPa5);   
        accionescajadetexto(PP5,etiquetaP5 ,etiquetaPa5);   
        etiquetaPa5.add(Descripcion5);
        etiquetaPa5.add(PP5);
         //6
        Descripcion6 = new JTextArea();
        Descripcion6.setBounds(10, 50,180,70);
        Descripcion6.setBackground(Color.WHITE);
        Descripcion6.setText(Main.productos.get(Main.indices.get(0)).descripcion);//Coloca y borra el anterior texto
        Descripcion6.setLineWrap(true); // Habilitar ajuste de línea
        Descripcion6.setWrapStyleWord(true); // Ajustar líneas por palabras
        Descripcion6.setEditable(false);//Hacer que no sea editable
        PP6 = new JTextArea();
        PP6.setBounds(10,130,180,65);
        PP6.setBackground(Color.WHITE);
        PP6.setEditable(false);
        descuento(5,PP6);
        accionescajadetexto(Descripcion6,etiquetaP6 ,etiquetaPa6);   
        accionescajadetexto(PP6,etiquetaP6 ,etiquetaPa6);   
        etiquetaPa6.add(Descripcion6);
        etiquetaPa6.add(PP6);
        
        
          
          
      }
      
     
           
}

        





