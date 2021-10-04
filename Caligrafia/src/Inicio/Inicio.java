
package Inicio;

import javax.swing.JOptionPane;

public class Inicio {
    public static String frase;
    public static void main(String[] args){
        
        frase=JOptionPane.showInputDialog(null, "Ingresa el texto");
        new Pantalla();
    }
}
