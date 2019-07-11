package lotto;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LottoGui extends JFrame implements ActionListener {

	private JLabel lliczba1, lliczba2, lliczba3, lliczba4, lliczba5, lliczba6, lliczba7, lliczba8, lliczba9, lliczba10,
			lliczba11, lliczba12,lpole,lwygrana;
	private JTextField lTliczba1, lTiczba2, lTiczba3, lTiczba4, lTiczba5, lTiczba6, lTiczba7, lTiczba8, lTiczba9,
			lTiczba10, lTiczba11, lTiczba12,tpole,twygrana;
	private Lotto opcja;
	private JButton bPrzelicz, bwyjscie, brestart,bwyjscievs;
	private String k="";

	LottoGui() {

		setSize(600, 600);
		setTitle("Lotto v1");
		setLayout(null);

		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		SwingUtilities.updateComponentTreeUI(this);

		lliczba1 = new JLabel("Podaj 1 liczbe ");
		lliczba1.setBounds(75, 20, 250, 20);
		add(lliczba1);
		lliczba1.setFont(new Font("Nazwa", Font.BOLD, 13));

		lTliczba1 = new JTextField("");
		lTliczba1.setBounds(75, 40, 80, 28);
		add(lTliczba1);

		lliczba2 = new JLabel("Podaj 2 liczbe ");
		lliczba2.setBounds(75, 80, 250, 20);
		add(lliczba2);
		lliczba2.setFont(new Font("Nazwa", Font.BOLD, 13));

		lTiczba2 = new JTextField("");
		lTiczba2.setBounds(75, 100, 80, 28);
		add(lTiczba2);

		lliczba3 = new JLabel("Podaj 3 liczbe ");
		lliczba3.setBounds(75, 140, 250, 20);
		add(lliczba3);
		lliczba3.setFont(new Font("Nazwa", Font.BOLD, 13));

		lTiczba3 = new JTextField("");
		lTiczba3.setBounds(75, 160, 80, 28);
		add(lTiczba3);

		lliczba4 = new JLabel("Podaj 4 liczbe ");
		lliczba4.setBounds(75, 200, 250, 20);
		add(lliczba4);
		lliczba4.setFont(new Font("Nazwa", Font.BOLD, 13));
		

		lTiczba4 = new JTextField("");
		lTiczba4.setBounds(75, 220, 80, 28);
		add(lTiczba4);
		
	
		lliczba5 = new JLabel("Podaj 5 liczbe ");
		lliczba5.setBounds(75, 260, 250, 20);
		add(lliczba5);
		lliczba5.setFont(new Font("Nazwa", Font.BOLD, 13));

		lTiczba5 = new JTextField("");
		lTiczba5.setBounds(75, 280, 80, 28);
		add(lTiczba5);

		lliczba6 = new JLabel("Podaj 6 liczbe ");
		lliczba6.setBounds(75, 320, 250, 20);
		add(lliczba6);
		lliczba6.setFont(new Font("Nazwa", Font.BOLD, 13));

		lTiczba6 = new JTextField("");
		lTiczba6.setBounds(75, 340, 80, 28);
		add(lTiczba6);

		lliczba7 = new JLabel("Wylosowana 1 liczba ");
		lliczba7.setBounds(250, 20, 250, 20);
		add(lliczba7);
		lliczba7.setFont(new Font("Nazwa", Font.BOLD, 13));

		lTiczba7 = new JTextField("");
		lTiczba7.setBounds(250, 40, 80, 28);
		add(lTiczba7);
		lTiczba7.setEnabled(false);

		lliczba8 = new JLabel("Wylosowana 2 liczba");
		lliczba8.setBounds(250, 80, 250, 20);
		add(lliczba8);
		lliczba8.setFont(new Font("Nazwa", Font.BOLD, 13));

		lTiczba8 = new JTextField("");
		lTiczba8.setBounds(250, 100, 80, 28);
		add(lTiczba8);
		lTiczba8.setEnabled(false);

		lliczba9 = new JLabel("Wylosowana 3 liczba ");
		lliczba9.setBounds(250, 140, 250, 20);
		add(lliczba9);
		lliczba9.setFont(new Font("Nazwa", Font.BOLD, 13));

		lTiczba9 = new JTextField("");
		lTiczba9.setBounds(250, 160, 80, 28);
		add(lTiczba9);
		lTiczba9.setEnabled(false);

		lliczba10 = new JLabel("Wylosowana 4 liczba ");
		lliczba10.setBounds(250, 200, 250, 20);
		add(lliczba10);
		lliczba10.setFont(new Font("Nazwa", Font.BOLD, 13));

		lTiczba10 = new JTextField("");
		lTiczba10.setBounds(250, 220, 80, 28);
		add(lTiczba10);
		lTiczba10.setEnabled(false);

		lliczba11 = new JLabel("Wylosowana 5 liczba ");
		lliczba11.setBounds(250, 260, 250, 20);
		add(lliczba11);
		lliczba11.setFont(new Font("Nazwa", Font.BOLD, 13));

		lTiczba11 = new JTextField("");
		lTiczba11.setBounds(250, 280, 80, 28);
		add(lTiczba11);
		lTiczba11.setEnabled(false);

		lliczba12 = new JLabel("Wylosowana 6 liczba ");
		lliczba12.setBounds(250, 320, 250, 20);
		add(lliczba12);
		lliczba12.setFont(new Font("Nazwa", Font.BOLD, 13));

		lTiczba12 = new JTextField("");
		lTiczba12.setBounds(250, 340, 80, 28);
		add(lTiczba12);
		lTiczba12.setEnabled(false);

		bPrzelicz = new JButton("przelicz");
		bPrzelicz.setBounds(50, 400, 100, 20);
		add(bPrzelicz);
		bPrzelicz.addActionListener(this);
		
		brestart = new JButton("od nowa");
		brestart.setBounds(150, 400, 100, 20);
		add(brestart);
		brestart.addActionListener(this);
		
		bwyjscievs = new JButton("wyjscie");
		bwyjscievs.setBounds(250, 400, 100, 20);
		add(bwyjscievs);
		bwyjscievs.addActionListener(this);

		
		tpole = new JTextField("");
		tpole.setBounds(50, 460, 250, 28);
		add(tpole);
		tpole.setEnabled(false);

		lpole = new JLabel("Podsumowanie ");
		lpole.setBounds(50, 440, 250, 20);
		add(lpole);
		lpole.setFont(new Font("Nazwa", Font.BOLD, 13));
		
		
		twygrana = new JTextField("");
		twygrana.setBounds(310, 460, 250, 28);
		add(twygrana);
		twygrana.setEnabled(false);

		lwygrana = new JLabel("Wygra³eœ ");
		lwygrana.setBounds(400, 440, 180, 20);
		add(lwygrana);
		lwygrana.setFont(new Font("Nazwa", Font.BOLD, 13));
		

		bwyjscie = new JButton("Powrót do Menu");
		bwyjscie.setBounds(350, 400, 200, 20);
		add(bwyjscie );
		bwyjscie.addActionListener(this);
	}

	public static void main(String[] args) {
		LottoGui apka = new LottoGui();
		apka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		apka.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object k = e.getSource();

		if (bPrzelicz == k) {
			opcja = new Lotto();
			int tabli[] = (int[]) opcja.Obliczenia();
			String l1 = Integer.toString(tabli[1]);
			String l2 = Integer.toString(tabli[2]);
			String l3 = Integer.toString(tabli[3]);
			String l4 = Integer.toString(tabli[4]);
			String l5 = Integer.toString(tabli[5]);
			String l6 = Integer.toString(tabli[6]);

					
			
			lTiczba7.setText(l1);
			lTiczba8.setText(l2);
			lTiczba9.setText(l3);
			lTiczba10.setText(l4);
			lTiczba11.setText(l5);
			lTiczba12.setText(l6);
			
			lTliczba1.setEnabled(false);
			lTiczba2.setEnabled(false);
			lTiczba3.setEnabled(false);
			lTiczba4.setEnabled(false);
			lTiczba5.setEnabled(false);
			lTiczba6.setEnabled(false);
			
			
			int a = Integer.parseInt(lTliczba1.getText());
			int b = Integer.parseInt(lTiczba2.getText());
			int c = Integer.parseInt(lTiczba3.getText());
			int d = Integer.parseInt(lTiczba4.getText());
			int g = Integer.parseInt(lTiczba5.getText());
			int f = Integer.parseInt(lTiczba6.getText());
			
		
			
			String sprawdzenie = opcja.Sprawdz(a,b,c,d,g,f);
			tpole.setText(sprawdzenie);
			
			String wygrana = opcja.Wygrana();
			twygrana.setText(wygrana);
			
			
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
			lTliczba1.setEnabled(true);
			lTiczba2.setEnabled(true);
			lTiczba3.setEnabled(true);
			lTiczba4.setEnabled(true);
			lTiczba5.setEnabled(true);
			lTiczba6.setEnabled(true);
			
			lTliczba1.setText("");
			lTiczba2.setText("");
			lTiczba3.setText("");
			lTiczba4.setText("");
			lTiczba5.setText("");
			lTiczba6.setText("");
			lTiczba7.setText("");
			lTiczba8.setText("");
			lTiczba9.setText("");
			lTiczba10.setText("");
			lTiczba11.setText("");
			lTiczba12.setText("");
			tpole.setText("");
			twygrana.setText("");
			opcja.Restart();
			
		}
		

	}

	

}

