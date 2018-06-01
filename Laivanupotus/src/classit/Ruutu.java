package classit;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/* Yht‰ kent‰n ruutua kuvaava luokka.
 * Ruudulla on numero ja kirjainkoordinaatti, tyyppi (laiva tai meri) sek‰
 * tila (osuttu, huti,ampumatta). Tyyppi ja tila ovat enum muuttujia RuutuTyyppi ja RuudunTila. 
 **/
public class Ruutu extends JPanel{
  
    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;
    
    protected RuutuTyyppi tyyppi;
    protected RuudunTila tila;
    private int xPos;
    private int yPos;
  
  
    public Ruutu(RuutuTyyppi tyyppi){
    	this.tyyppi = tyyppi;
    	tila = RuudunTila.AMPUMATTA;
    }
  
    public Ruutu(RuutuTyyppi tyyppi, RuudunTila tila){
    	this.tyyppi = tyyppi;
    	this.tila = tila;
    }
  //getterit ja setterit
  
    public void setTyyppi(RuutuTyyppi tyyppi){
  	this.tyyppi = tyyppi;
    }
    public RuutuTyyppi getTyyppi(){
    	return tyyppi;
    }
  
  
    public void setTila(RuudunTila tila){
    	this.tila= tila;
    }
    public RuudunTila getTila(){
    	return tila;
    }
    
    public void setX(int x){
    	xPos = x;
    }
    public int getX(){
    	return xPos;
    }
    
    public void setY(int y){
    	yPos = y;
    }
    public int getY(){
    	return yPos;
    }
    
    /* Maalausmetodit ruudun v‰ritt‰miseksi. Valkoista k‰ytet‰‰n kentt‰‰ tehdess‰,
     * muita ammuttaessa. Sininen ja harmaa piit‰v‰t myˆs ruksin ruudun p‰‰lle ammutuksi tulemisen
     * merkiksi.
     */
    public void maalaaValk(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(xPos, yPos, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(xPos, yPos, WIDTH, HEIGHT);  
    }
    public void maalaaSin(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(xPos, yPos, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(xPos, yPos, WIDTH, HEIGHT);
        g.drawLine(0, 0, WIDTH, HEIGHT);
        g.drawLine(0, HEIGHT, WIDTH, 0);
    }
    public void maalaaHar(Graphics g){
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(xPos, yPos, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(xPos, yPos, WIDTH, HEIGHT);  
        g.drawLine(0, 0, WIDTH, HEIGHT);
        g.drawLine(0, HEIGHT, WIDTH, 0);
    }
}