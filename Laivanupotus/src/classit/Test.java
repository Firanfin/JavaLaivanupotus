package classit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Test{
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
		f.setSize(800, 800);
		JButton nappi = new JButton ("AMMU!!");
		f.add(nappi);
		nappi.setSize(100, 20);
		nappi.setLocation(350, 700);
		JLabel label = new JLabel("A");
		f.add(label);
		label.setSize(20, 20);
		label.setLocation(50, 50);
		
		f.setVisible(true);
	}
}