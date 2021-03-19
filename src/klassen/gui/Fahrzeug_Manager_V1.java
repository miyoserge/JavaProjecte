package klassen.gui;

import klassen.gui.FMFrame;
import javax.swing.JFrame;
import javax.swing.JLabel ;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton ;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JSpinner ;
import javax.swing.JComboBox;
// Hier ist die Programmierung mit GUI ohne Event( Event dienst für die Interaktion )
	public class Fahrzeug_Manager_V1  extends JFrame{ 
			
	private JLabel header;
	private JTable table;
	private JScrollPane scrollTable;
	private JProgressBar progBar ;
	private JButton btnInfo;//btn steht für Button
	private JButton btnAdd ;
	private  JLabel lblHersteller, lblLeistung, lblPreis, lblTyp, lblHeader; // lbl steht für Label
	private JTextField fldHersteller;
	private JSpinner spinLeistung, spinPreis ;
	private JComboBox boxTyp ;
	private JPanel pnlAdd ;


	 
		public Fahrzeug_Manager_V1() {
			 
			setTitle("Fahrzeug Manager");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			createWidgets() ;
			addWidgets() ;
			
			setSize(500, 500); 
			setLocation(900, 350);
				
			}
		
		private void addWidgets() {
			
		getContentPane().setLayout(null);
		getContentPane().add(lblHeader) ;
		getContentPane().add(progBar) ;
		getContentPane().add(scrollTable) ;
		getContentPane().add(btnInfo) ;
		
		pnlAdd.add(lblHersteller);
		pnlAdd.add(lblLeistung);
		pnlAdd.add(lblPreis) ;
		pnlAdd.add(lblTyp);
		
		
		pnlAdd.add(fldHersteller);
		pnlAdd.add(spinLeistung);
		pnlAdd.add(spinPreis) ;
		pnlAdd.add(boxTyp);
		pnlAdd.add(btnAdd) ;
		
		
		getContentPane().add(pnlAdd) ;
		
		}
		
		
		private void createWidgets() {
			lblHeader = new JLabel("Fahrzeug Manager") ;
			lblHeader.setFont(lblHeader.getFont().deriveFont(Font.BOLD + Font.ITALIC, 30));
			lblHeader.setForeground(Color.WHITE);
			lblHeader.setOpaque(true);
			lblHeader.setBackground(Color.BLACK);
			lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
			lblHeader.setBounds(0, 0, 500, 40);
			
			progBar = new JProgressBar(0, 100) ;
			progBar.setBounds(0, 445, 485, 20);
			
			table = new JTable(100, 4) ;	
			
			scrollTable = new JScrollPane(table) ;
			scrollTable.setBounds(170, 50, 310, 390);
			
			btnInfo = new JButton("Information........") ;
			btnInfo.setBounds(5, 415, 100, 25);
			
			pnlAdd = new JPanel () ;
			pnlAdd.setLayout(null);
			pnlAdd.setBounds(0, 50, 200, 300);
			
			lblHersteller = new JLabel("Hersteller");
			lblLeistung = new JLabel("Leistung") ;
			lblPreis = new JLabel("Preis") ;
			lblTyp = new JLabel("Typ");
			
			
			lblHersteller.setBounds(10, 0, 100, 25);
			lblLeistung.setBounds(10, 30, 100, 25);
			lblPreis.setBounds(10, 60, 100, 25);
			lblTyp.setBounds(10, 90, 100, 25);
			
			fldHersteller = new JTextField() ;
			spinLeistung = new JSpinner( new SpinnerNumberModel(100, 5, 1000, 10)) ;
			spinPreis =  new JSpinner( new SpinnerNumberModel(5000, 500, 100000, 100)) ;
			boxTyp = new JComboBox(new Object[] {"PKW", "LKW", "Motorrad" }) ;
			
			
			fldHersteller.setBounds(70, 0, 90, 25);
			spinLeistung.setBounds(70, 60, 90, 25);
			spinPreis.setBounds(70, 60, 90, 25);
			boxTyp.setBounds(70, 90, 90, 25);
			
			btnAdd = new JButton("Hinzufügen");
			btnAdd.setBounds(70, 120, 90, 25);
			
		  }
		
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
		




