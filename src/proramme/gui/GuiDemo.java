package proramme.gui;

import javax.swing.JFrame;
import javax.swing.UIManager;

import klassen.gui.FMFrame;

public class GuiDemo {
  public static void main(String[] args) {
	  
	//JFrame frame = new JFrame( );    // JFrame  ist die basis Klasse  f�r die Erstellung der GUI
	
	try {
	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	JFrame frame = new FMFrame() ;  // JFrame  ist die basis Klasse  f�r die Erstellung der GUI
	frame.setVisible(true);
	// JLabel ist ein Text, der angezeigt wird.
	// JButton ist ein Button oder Knopft f�r multicore Prozesse oder f�r zwei Zust�nde( selektiert und unselektiert)
	// Ein JToggleButton ist ein Button der zwei Zust�nde hat.(selektiert und unselektiert)
	//JRadioButton ist auch ein Button der zwei Zust�nde hat. (selktiert und unselektiert)
	
	
	
   }
}
