package lotto;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GuessGui extends JFrame implements ActionListener
{

private JLabel lNazwa, lPodaj, lPodejscie;
private JTextField tProb, tCLiczba, tPodejscie;
private Guess opcja;
private JButton bPrzelicz,bwyjscie,brestart,bwyjscievs;
	
GuessGui() 
{
	
	setSize(600, 600);
	setTitle("Gra v1");
	setLayout(null);
	
	try {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
			| UnsupportedLookAndFeelException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	SwingUtilities.updateComponentTreeUI(this);
	
	lNazwa = new JLabel("Liczba prób ");
	lNazwa.setBounds(75, 20, 250, 20);
	add(lNazwa);
	lNazwa.setFont(new Font("Nazwa",Font.BOLD, 13 ));
	
	tProb = new JTextField("");
	tProb.setBounds(75, 40, 80, 28);
	add(tProb);
	tProb.setEnabled(false);
	
	
	lPodaj = new JLabel("Podaj liczbe ");
	lPodaj.setBounds(170, 20, 250, 20);
	add(lPodaj);
	lPodaj.setFont(new Font("Nazwa",Font.BOLD, 13 ));
	
	tCLiczba = new JTextField("");
	tCLiczba.setBounds(170, 40, 80, 28);
	add(tCLiczba);
	tCLiczba.addActionListener(this);
	tCLiczba.setToolTipText("Podaj Twój strza³"); 
	
	bPrzelicz = new JButton("przelicz");
	bPrzelicz.setBounds(50, 120, 100, 20);
	add(bPrzelicz );
	bPrzelicz.addActionListener(this);
	
	lPodejscie = new JLabel(" Wskazówki ");
	lPodejscie.setBounds(350, 20, 250, 20);
	add(lPodejscie);
	lPodejscie.setFont(new Font("Nazwa",Font.BOLD, 13 ));
	
	tPodejscie = new JTextField("");
	tPodejscie.setBounds(270, 40, 250, 28);
	add(tPodejscie);
	tPodejscie.setEnabled(false);

	
	bwyjscievs = new JButton("Wyjscie");
	bwyjscievs.setBounds(150, 120, 100, 20);
	add(bwyjscievs );
	bwyjscievs.addActionListener(this);
	
	brestart = new JButton("Od nowa");
	brestart.setBounds(250, 120, 100, 20);
	add(brestart );
	brestart.addActionListener(this);

	
	bwyjscie = new JButton("Powrót do Menu");
	bwyjscie.setBounds(350, 120, 200, 20);
	add(bwyjscie );
	bwyjscie.addActionListener(this);
}
	
	
	
public static void main(String[] args)
{
	GuessGui apka = new GuessGui();
	apka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	apka.setVisible(true);
	
	
}
	

	
	
	
	@Override
	public void actionPerformed(ActionEvent e)
{
		Object k =  e.getSource();
		
		if(k==bPrzelicz || k==tCLiczba)
		{
			int strzal = Integer.parseInt(tCLiczba.getText());
			opcja = new Guess(strzal);
			String tabli[] = (String []) opcja.Oblicz();
	        String ile = tabli[0];
	        String wiado = tabli[1];
	     
	        
	        tProb.setText(ile);
	        tPodejscie.setText(wiado);
	        tCLiczba.setText("");

	        
			
		}
		else if(k==bwyjscie)
		{
			Together lott = new Together();
			lott.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			lott.setVisible(true);
			dispose();
		}
		else if(k==bwyjscievs)
		{
			dispose();
		}
		
		else if(k==brestart)
		{
			tProb.setText("");
	        tPodejscie.setText("");
	        tCLiczba.setText("");
	        opcja.Restart();
		}
		
		
		
}

}