package Java_Insel_Rheinwerk;
/*
 Notes To Remenber
 1. setSize(width, height );
 2. setBounds(x-cord, ycord, width, height);
 3. setLocation(x-cood, y cood);
 4. setTitle("message");
 5. setIconImage(Image image );
 
 */
import java.awt.Frame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Klasse_ImageIcon extends JFrame{
	
	 JFrame frame ;
	 String message = "My Frame" ;
	 ImageIcon icon;
	 
	 public void getFrame() {
		 
		 setVisible(true) ; //1
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;//2
		 setBounds(400,100,500,500) ;//3
		 setTitle(message) ;//4
		 icon = new ImageIcon("image/icon.jpg") ;//5
		 setIconImage(icon.getImage()) ; //5
	 }
	 
	public static void main(String[] args) {
		new Klasse_ImageIcon().getFrame();
	}
}
