package classit;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class Nappi extends JButton {

	public Nappi(String text) {
		super(text);
		addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e){
	        	
	        	
	        }
	    });
	}

	public Nappi(Action a) {
		super(a);
		addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e){
	        	
	        }
	    });
	}
}
