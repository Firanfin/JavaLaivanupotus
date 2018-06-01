package GUI;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;

public class Pelilauta2 {
    
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+
        SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Laivanupotus pelilauta");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Alue alue = new Alue();
        Nappi ammu = new Nappi();
        JTextField ammuKirjain = new JTextField();
        JTextField ammuNumero = new JTextField();
        JLabel labelA = new JLabel("A");
        JLabel labelB = new JLabel("B");
        JLabel labelC = new JLabel("C");
        JLabel labelD = new JLabel("D");
        JLabel labelE = new JLabel("E");
        JLabel labelF = new JLabel();
        JLabel labelG = new JLabel();
        JLabel labelH = new JLabel();
        JLabel labelI = new JLabel();
        JLabel labelJ = new JLabel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();
        JLabel label7 = new JLabel();
        JLabel label8 = new JLabel();
        JLabel label9 = new JLabel();
        JLabel label10 = new JLabel();
        f.add(alue);
        f.add(ammu);
        f.add(ammuKirjain);
        f.add(ammuNumero);
        f.add(labelA);
        f.add(labelB);
        f.add(labelC);
        f.add(labelD);
        f.add(labelE);
        f.add(labelF);
        f.add(labelG);
        f.add(labelH);
        f.add(labelI);
        f.add(labelJ);
        f.add(label1);
        f.add(label2);
        f.add(label3);
        f.add(label4);
        f.add(label5);
        f.add(label6);
        f.add(label7);
        f.add(label8);
        f.add(label9);
        f.add(label10);
        f.setSize(700,700);
        f.setVisible(true);
    } 

}

class Alue extends JPanel {

    /**
	 * 
	 */
	private Nelio[][] taulu;
    
    public Alue() {

        setBorder(BorderFactory.createLineBorder(Color.black));

        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
            	/* Testataan onko ruutu ammuttava, sen jälkeen mikä ruutu se on ja maalataan oikea väri.
            	 * Sitten vielä ruksitetaan.
            	 */
            	
            }
        });

    }

    public Dimension getPreferredSize() {
        return new Dimension(700,700);
    }  
}

class Nelio extends JPanel{

    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;

    private int xPos;
    private int yPos;
    
    public Nelio(int x, int y){
    	xPos = x;
    	yPos = y;
    }

    public void setX(int xPos){ 
        this.xPos = xPos;
    }

    public int getX(){
        return xPos;
    }

    public void setY(int yPos){
        this.yPos = yPos;
    }

    public int getY(){
        return yPos;
    }


    public void paintWSquare(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(xPos, yPos, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(xPos, yPos, WIDTH, HEIGHT);  
    }
    public void paintRSquare(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(xPos, yPos, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(xPos, yPos, WIDTH, HEIGHT);  
    }
    public void paintGSquare(Graphics g){
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(xPos, yPos, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(xPos, yPos, WIDTH, HEIGHT);  
    }
//    public void drawX(){
//    	Graphics g = getGraphics();
//    	g.drawLine(0, 0, xPos, yPos);
//    	g.drawLine(0, yPos, xPos, 0);
//    }
}
class Nappi extends JButton{
	
	public Nappi(){
		
		addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
            	
            	
            }
        });
	}
}
