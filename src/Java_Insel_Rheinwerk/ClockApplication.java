package Java_Insel_Rheinwerk;

import java.util.Date;
import javax.swing.*;
import javax.swing.JLabel ;

public class ClockApplication {
	public static void main(String[] args) {
		
JFrame f = new JFrame("Uhrzeit") ; // Setzt automatisch einen titel für das Fenster
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Setzen wir  einen Zustand, sodass die Anwendung mit einem Klick  auf das X sofort beendet wird
f.setSize(250, 100) ; //Die Methode setSize() setzt die Größe der fenster(FensterGröße) in Pixel.
f.add(new JLabel( String.format("%tT ", new Date())   ));//Programm erzeugt ein JLabel-Objekt und setzt es mit add() auf den JFrame.
f.setVisible(true);// Dienst zur Angabe des  fensters an 

/*
 * Void setDefaultCloseOperation(int operation) bestimmmt, was passieren soll, wenn der Benutzer das Fenster schließ 
 * 
 * Der JFrame bietet auch keine Methode setDefaultCloseOperation() an .
 * 
 * Wir müssten selbst Fensterereignisse abfangen.
 * 
 *  
 * Swing horcht der JFrame selbstständig auf ein WindowEvent
 * Es reagiert in der protected-Methode processWindowEvent() auf das WINDOW_CLOSING und kann das Fenster nach Wunsch auch ohne 
 * hinzugefügten Ereignisbehandler schließen.
 *
 * */
	
		
		
	}

}
