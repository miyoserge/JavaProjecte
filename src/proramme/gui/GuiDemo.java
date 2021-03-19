package proramme.gui;

import javax.swing.JFrame;
import javax.swing.UIManager;

import klassen.gui.FMFrame;

public class GuiDemo {
  public static void main(String[] args) {
	  
	//JFrame frame = new JFrame( );    // JFrame  ist die basis Klasse  für die Erstellung der GUI
	
	try {
	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	JFrame frame = new FMFrame() ;  // JFrame  ist die basis Klasse  für die Erstellung der GUI
	frame.setVisible(true);
	// JLabel ist ein Text, der angezeigt wird.
	// JButton ist ein Button oder Knopft für multicore Prozesse oder für zwei Zustände( selektiert und unselektiert)
	// Ein JToggleButton ist ein Button der zwei Zustände hat.(selektiert und unselektiert)
	//JRadioButton ist auch ein Button der zwei Zustände hat. (selktiert und unselektiert)
	
	
	
   }
}
