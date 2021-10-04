package Fuente;

import Inicio.Inicio;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Escritura extends JPanel{
    public BufferedImage letra;
    public boolean b=false;
    public Color c;
    public int[]puntero={10,10};
    
    public Escritura() {
        cargar();
    }
    
    public void cargar(){
        try{
            letra=ImageIO.read(new File("src/c.bmp"));
        }catch(IOException e){
            System.out.println("Error");
        }
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i=0;i<Inicio.frase.length();i++){
            if(Inicio.frase.charAt(i)=='c' || Inicio.frase.charAt(i)=='C'){
                for(int j=0;j<letra.getWidth();j++){
                    for(int k=0;k<letra.getWidth();k++){
                       g.setColor(new Color(letra.getRGB(j, k)));
                       g.fillRect(puntero[0]+j, puntero[1]+k, 1, 1);
                    }
                }
               
            } 
            puntero[0]+=letra.getWidth()+1;
            if(puntero[0]>this.getWidth()){
                puntero[0]=10;
                puntero[1]+=letra.getHeight();
            }
        }
        puntero[0]=10;
        puntero[1]=10;
    }
}
