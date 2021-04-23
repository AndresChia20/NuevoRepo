import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circulo extends JApplet{
  public void paint (Graphics g){
    g.drawString("+",100,100); //Centro
    g.drawString("+",100,125); //Abajo
    g.drawString("+",123,108);
    g.drawString("+",118,115);
    g.drawString("+",111,120);
    g.drawString("+",125,100); //Derecha
    g.drawString("+",109,79);
    g.drawString("+",115,85);
    g.drawString("+",120,91);
    g.drawString("+",100,75); //Arriba
    g.drawString("+",78,89);
    g.drawString("+",83,83);
    g.drawString("+",91,78);
    g.drawString("+",75,100); //Izquierda
    g.drawString("+",78,108);
    g.drawString("+",83,115);
    g.drawString("+",91,120);
  }

  public static void main (String[]args){
    JFrame frame=new JFrame ("Cargando JApplet");
    Circulo FigurasApplet=new
    Circulo();
    FigurasApplet.init();
    frame.getContentPane().add(FigurasApplet);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}