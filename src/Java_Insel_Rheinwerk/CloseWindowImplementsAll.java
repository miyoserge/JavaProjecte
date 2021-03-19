package Java_Insel_Rheinwerk;
 import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
public class CloseWindowImplementsAll extends JFrame implements WindowListener {
	
// Implement WindowListener
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}
	
	

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public CloseWindowImplementsAll() {
		setSize(400, 400) ;
		addWindowListener(this) ; //bei this das eigene Objekt als Listener.
		setVisible(true);
	}
	
public static void main(String[] args) {
	
	new CloseWindowImplementsAll();
  

    }
}
