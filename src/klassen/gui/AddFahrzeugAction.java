package klassen.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFahrzeugAction implements ActionListener {
	
    public void actionPerformed(ActionEvent e) {
    	System.out.println(Thread.currentThread().getName()); //AWT-EventQueue-0 f�r den Knopf Hinzuf�gen
    // TODO
     System.out.println(e.getActionCommand() + " Wurde geklickt...");
     
    	
    }
    
    
}
