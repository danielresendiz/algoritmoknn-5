package kmeans5d;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cartesiano extends JPanel implements Runnable{
    public Ventana v;
    public ArrayList<Punto> puntos;
    public ArrayList<Punto> centroides;
    
    public cartesiano(){
        puntos = new ArrayList();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        int ancho = this.getWidth();
        int alto = this.getHeight();
        Color[] colors = {Color.RED,Color.BLUE,Color.BLACK,Color.YELLOW,Color.CYAN,Color.GREEN,Color.ORANGE};
        
        g.setColor(Color.BLACK);
        g.drawLine(0, alto/2, ancho, alto/2);
        g.drawLine(ancho/2, 0, ancho/2, alto);
        
        for(int x=0; x<puntos.size(); x++){
            g.setColor(colors[puntos.get(x).getEtiqueta()]);
            g.fillOval((int) (ancho/2+puntos.get(x).get(0)),
                       (int) (alto/2-puntos.get(x).get(1)), 7, 7);
        }
        
         for(int y=0;y<=20;y++){
            g.drawLine((ancho/20)*y, (alto/2)-7, (ancho/20)*y, (alto/2)+7);
            g.drawLine((ancho/2)-7, (alto/20)*y, (ancho/2)+7, (alto/20)*y);
        
        }
         
        g.setColor(Color.BLACK);
        for(int x=0; x<centroides.size(); x++){
            
            g.fillOval((int) (ancho/2+centroides.get(x).get(0)),
                       (int) (alto/2-centroides.get(x).get(1)), 12, 12);
        }
        
    }

    @Override
    public void run() {
        int i=v.dimensiones.getSelectedIndex()+2;
        if(i==2){
            v.a.setVisible(true);
        }else{
            v.a.setVisible(false);
        }
        
        do{
            v.calcular();
            v.nuevoscentroides();
            /*System.out.println("ant:"+v.antescentroide);
            System.out.println("des:"+v.centroide);
            System.out.println("-----------------------------------------");
            */
            v.pintarResultados();
            this.repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }while(!v.isNotDiference());
        JOptionPane.showMessageDialog(this,"Se ha llegado a la solución");
        System.out.println("Fin");
    }
    
    
    
}
