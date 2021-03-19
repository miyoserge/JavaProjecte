package klassen.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFahrzeugAction implements ActionListener {
	
    public void actionPerformed(ActionEvent e) {
    	System.out.println(Thread.currentThread().getName()); //AWT-EventQueue-0 für den Knopf Hinzufügen
    // TODO
     System.out.println(e.getActionCommand() + " Wurde geklickt...");
     
    	
    }
    
    
}
