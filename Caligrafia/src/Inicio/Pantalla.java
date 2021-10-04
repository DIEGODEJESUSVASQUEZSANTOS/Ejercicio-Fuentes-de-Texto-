package Inicio;

import Fuente.Escritura;
import javax.swing.JFrame;

public class Pantalla extends JFrame{
    Escritura panel=new Escritura();
    public Pantalla(){
        setVisible(true);
	setSize(1300,700);
	setLocationRelativeTo(null);
	setResizable(false);
	setTitle("Mapa de BitMap");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componente();
    }
    
    private void componente(){
        setLayout(null);
        panel.setBounds(0, 0, getWidth(), getHeight());
        add(panel);
    }
}
