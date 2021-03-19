package Java_Insel_Rheinwerk;
import java.util.Date;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class Beispiel_Listing_19_2 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame() ;
		f.setSize(100, 100) ;
		f.setOpacity(0.5F);
		f.setShape(new Ellipse2D.Float(0.0F, 0.0F, 100.0F, 100.0F));
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
