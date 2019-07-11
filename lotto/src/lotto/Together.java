package lotto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Together extends JFrame implements ActionListener {

	private JButton bLotto, bGra, bwyjscie;
	static Together apka;
	private JLabel tytul;

	public Together() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		SwingUtilities.updateComponentTreeUI(this);

		setTitle("Lotteria");
		setSize(600, 600);
		setLayout(null);

		bLotto = new JButton("Lotto");
		bLotto.setBounds(220, 100, 100, 50);
		add(bLotto);
		bLotto.addActionListener(this);

		bGra = new JButton("Traf w liczbne losow¹ od 1-100");
		bGra.setBounds(150, 150, 250, 50);
		add(bGra);
		bGra.addActionListener(this);

		bwyjscie = new JButton("Wyscie z aplikacji");
		bwyjscie.setBounds(150, 200, 250, 50);
		add(bwyjscie);
		bwyjscie.addActionListener(this);

		

	}

	public static void main(String[] args) {
		apka = new Together();
		apka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		apka.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object k = e.getSource();

		if (k == bLotto) {
			LottoGui lott = new LottoGui();
			lott.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			lott.setVisible(true);
			dispose();
		}

		if (k == bGra) {
			GuessGui lott = new GuessGui();
			lott.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			lott.setVisible(true);
			dispose();
		}
		if (k == bwyjscie) {

			dispose();
		}

	}
}
