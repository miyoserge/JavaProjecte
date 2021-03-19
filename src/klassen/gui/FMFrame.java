package klassen.gui;
import klassen.gui.FMFrame;
import javax.swing.JFrame;
import javax.swing.JLabel ;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton ;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.JSpinner ;
import javax.swing.JComboBox;

// GUI( hier ist die Programmierung mit GUI ohne Event für die Interaktion )

public class FMFrame  extends JFrame{ 
		
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
private JPanel pnlLeft;


 
	public FMFrame() {
		 
		setTitle("Fahrzeug Manager");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		createWidgets() ;
		setupInteractions();
		addWidgets() ;
		
		pack();// anstatt setSize(500, 500) ruft man die Methode pack()[ die Methode Pack() berechnet die Größe der Fenster durch Widget und verwendet eine Layout-Manager
		setLocation(850, 200);
		
		class MyWindowListener extends WindowAdapter{
			public void windowClosing(WindowEvent e) {
				System.out.println("Wollen Sie wirklich beenden?");
				System.exit(0);
			}
			
		}
		
		addWindowListener(new MyWindowListener());
			
		}
	
	private void setupInteractions() {
		
		btnAdd.addActionListener(new AddFahrzeugAction());
		fldHersteller.addCaretListener(new HerstellerListener());
		
	}
	
	private void addWidgets() {
		
	getContentPane().setLayout(new BorderLayout(5,5));// wegen den Befehl [new BorderLayout(5,5)], macht man alle folgende setBounds Befehl weg lblHeader.setBounds(0, 0, 500, 40), progBar.setBounds(0, 445, 485, 20);  pnlAdd.setBounds(0, 50, 200, 300) , //scrollTable.setBounds(170, 50, 310, 390) , //btnInfo.setBounds(5, 415, 100, 25); 
	getContentPane().add(BorderLayout.PAGE_START,  lblHeader) ;
	getContentPane().add(BorderLayout.PAGE_END,  progBar) ;
	getContentPane().add(BorderLayout.CENTER,   scrollTable) ;
	getContentPane().add(BorderLayout.LINE_START, pnlLeft) ;
	//getContentPane().add(btnInfo) ;
	
	pnlAdd.add(lblHersteller);
	pnlAdd.add(fldHersteller);
	
	pnlAdd.add(lblLeistung);
	pnlAdd.add(spinLeistung);
	
	pnlAdd.add(lblPreis) ;
	pnlAdd.add(spinPreis) ;
	
	pnlAdd.add(lblTyp);
	pnlAdd.add(boxTyp);
	
    pnlAdd.add(Box.createHorizontalGlue());
	pnlAdd.add(btnAdd) ;
	
	pnlAdd.setMaximumSize(pnlAdd.getPreferredSize());
	pnlAdd.setAlignmentX(LEFT_ALIGNMENT);
	
	pnlLeft.add(pnlAdd) ;
	pnlLeft.add(Box.createVerticalGlue()) ;
	pnlLeft.add(btnInfo) ;
	
	pnlLeft.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
	
	
	//getContentPane().add(pnlAdd) ;
	
	}
	
	
	private void createWidgets() {
		lblHeader = new JLabel("Fahrzeug Manager") ;
		lblHeader.setFont(lblHeader.getFont().deriveFont(Font.BOLD + Font.ITALIC, 30));
		lblHeader.setForeground(Color.WHITE);
		lblHeader.setOpaque(true);
		lblHeader.setBackground(Color.BLACK);
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		//lblHeader.setBounds(0, 0, 500, 40);
		
		progBar = new JProgressBar(0, 100) ;
		progBar.setPreferredSize(new Dimension(0, 30));
		//progBar.setBounds(0, 445, 485, 20);
		
		table = new JTable(100, 4) ;	
		
		scrollTable = new JScrollPane(table) ;
		//scrollTable.setBounds(170, 50, 310, 390);
		
		btnInfo = new JButton("Information........") ;
		btnInfo.setAlignmentX(LEFT_ALIGNMENT);
		//btnInfo.setBounds(5, 415, 100, 25);
		
		pnlAdd = new JPanel () ;
		pnlAdd.setLayout(new GridLayout(0, 2, 5, 5));
		//pnlAdd.setBounds(0, 50, 200, 300);
		
		lblHersteller = new JLabel("Hersteller");
		lblLeistung = new JLabel("Leistung") ;
		lblPreis = new JLabel("Preis") ;
		lblTyp = new JLabel("Typ");
		
		
		
		
		fldHersteller = new JTextField() ;
		spinLeistung = new JSpinner( new SpinnerNumberModel(100, 5, 1000, 10)) ;
		spinPreis =  new JSpinner( new SpinnerNumberModel(5000, 500, 100000, 100)) ;
		boxTyp = new JComboBox(new Object[] {"PKW", "LKW", "Motorrad" }) ;
		
		
		
		
		btnAdd = new JButton("Hinzufügen");
		btnAdd.setEnabled(false);
		
		pnlLeft = new JPanel() ;
		pnlLeft.setLayout(new BoxLayout(pnlLeft,BoxLayout.PAGE_AXIS));
		
	  }
	
	
	// Klasse von HerstellerListener
	private class HerstellerListener implements CaretListener{

	
		
		@Override
		public void caretUpdate(CaretEvent e) {
			// TODO Auto-generated method stub
		JTextField fld = (JTextField)e.getSource() ;
		String text = fld.getText() ;
		btnAdd.setEnabled(!text.trim().isEmpty());
			
		}
		
		
		private class AddFahrzeugAction implements ActionListener {
			
		    public void actionPerformed(ActionEvent e) {
		    	
		    // TODO
		     System.out.println(e.getActionCommand() + " Wurde geklickt...");
		     
		    	
		    }
		    
		    
		}

	}
	
	
	public static void main(String[] args) {
		  
		//JFrame frame = new JFrame( );    // JFrame  ist die basis Klasse  für die Erstellung der GUI
		
		try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JFrame frame = new FMFrame() ;  // JFrame  ist die basis Klasse  für die Erstellung der GUI
		//frame.setResizable(false); // Damit lässt sich das Fenster nicht mehr vergrößern oder vekleinen
		frame.setVisible(true);
		// JLabel ist ein Text, der angezeigt wird.
		// JButton ist ein Button oder Knopft für multicore Prozesse oder für zwei Zustände( selektiert und unselektiert)
		// Ein JToggleButton ist ein Button der zwei Zustände hat.(selektiert und unselektiert)
		//JRadioButton ist auch ein Button der zwei Zustände hat. (selktiert und unselektiert)
		
		
		
	   }
	
		
	}
	

