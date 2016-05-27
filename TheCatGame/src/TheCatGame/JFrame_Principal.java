package TheCatGame;
import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JFrame_Principal {
	
	JButton [][]btn_Matriz = new JButton[3][3];//arreglo de botones
    JPanel JP_Tablero;
    JPanel JP_Opciones;
    
  //Obciones del juego y registro de jugador
  	JButton btn_Circulo, btn_Cruz, btn_Iniciar;
  	JTextArea txt_NombreJugador;
  	JLabel lbe_NomnreJugador, lbe_Resultado, lbl_Mensaje;
  	
 
    public JFrame_Principal(){//constructor de la clase
 
    	JFrame JF_VentanaPrincipal = new JFrame("Juego del GATO");
        JF_VentanaPrincipal.setLayout(new BorderLayout(10, 20));
        
        //JP_Opciones = new JLabel();//creacion jlabel que muestra el numero pulsado     
        //JP_Opciones.setText("Aquí ira el numero que se pulse");
 
        armarTablero();
        armarOpciones();
 
        JF_VentanaPrincipal.add(JP_Opciones, BorderLayout.LINE_END);
        JF_VentanaPrincipal.add(JP_Tablero, BorderLayout.CENTER);
       
 
        JF_VentanaPrincipal.setSize(400, 300);
        JF_VentanaPrincipal.setLocation(300, 200);
        JF_VentanaPrincipal.setVisible(true);
        JF_VentanaPrincipal.setResizable(false);
        JF_VentanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }

	public void armarTablero(){//metodo donde se encontrara el jpanel que contiene los botones
        JP_Tablero = new JPanel(new GridLayout(3, 3));
      
        for(int i=0; i<3; i++){//ciclo para crear, añadir, establecer propiedades a los botones
        	for(int j =0;j< 3;j++){
	            btn_Matriz[i][j] = new JButton(" ");
	            JP_Tablero.add(btn_Matriz[i][j]);
	            btn_Matriz[i][j].setMargin(new Insets(1, 1, 1, 1));
        	}
        }//fin ciclo
    }
	
	//Armamos el panel de opciones para el usuario
	public void armarOpciones(){
				
		JP_Opciones = new JPanel();
		btn_Circulo = new JButton("O");
		btn_Cruz = new JButton("X");
		btn_Iniciar = new JButton("Inicio");
		
		JP_Opciones.add(btn_Circulo,BorderLayout.BEFORE_FIRST_LINE);
		JP_Opciones.add(btn_Cruz,BorderLayout.CENTER);
		JP_Opciones.add(btn_Iniciar,BorderLayout.LINE_END);
		JP_Opciones.add(btn_Iniciar, BorderLayout.PAGE_END);
		
		
	}
	
}
