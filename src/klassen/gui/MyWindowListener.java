package klassen.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowListener  extends WindowAdapter {


	@Override
	public void windowClosing(WindowEvent e) { // Wird aufgerufen wenn man den Fenster schlieﬂen will
		// TODO Auto-generated method stub
		System.out.println("Wollen Sie wirklich beenden");
		System.exit(0);
	}

	

}
