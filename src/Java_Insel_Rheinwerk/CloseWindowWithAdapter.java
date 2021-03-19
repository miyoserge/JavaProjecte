package Java_Insel_Rheinwerk;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.*;

public class CloseWindowWithAdapter {
	public static void main(String[] args) {
		JFrame f = new JFrame() ;
		f.setSize(400, 400);
		f.setVisible(true);
		//f.addWindowListener(new WindowListener() );
		
	}

}
 
class closeWindowAction extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) { System.exit(0);  }
}