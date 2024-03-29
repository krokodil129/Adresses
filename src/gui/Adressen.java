package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.clAddress;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JTextPane;

public class Adressen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField VornameFeld;
	private JTextField NachnameFeld;
	private JTextField plzFeld;
	private JTextField OrtFeld;
	private JTextField StrasseFeld;
	ArrayList<clAddress> Addresses = new ArrayList<clAddress>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adressen frame = new Adressen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Adressen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Vorname = new JLabel("Vorname");
		Vorname.setBounds(33, 92, 46, 14);
		contentPane.add(Vorname);

		JLabel Nachname = new JLabel("Nachname");
		Nachname.setBounds(33, 146, 70, 14);
		contentPane.add(Nachname);

		JLabel PLZ = new JLabel("PLZ");
		PLZ.setBounds(33, 230, 46, 14);
		contentPane.add(PLZ);

		JLabel Ort = new JLabel("Ort");
		Ort.setBounds(33, 293, 46, 14);
		contentPane.add(Ort);

		JLabel Strasse = new JLabel("Strasse");
		Strasse.setBounds(33, 345, 46, 14);
		contentPane.add(Strasse);

		VornameFeld = new JTextField();
		VornameFeld.setBounds(89, 89, 86, 20);
		contentPane.add(VornameFeld);
		VornameFeld.setColumns(10);

		NachnameFeld = new JTextField();
		NachnameFeld.setBounds(89, 143, 86, 20);
		contentPane.add(NachnameFeld);
		NachnameFeld.setColumns(10);

		plzFeld = new JTextField();
		plzFeld.setBounds(89, 227, 86, 20);
		contentPane.add(plzFeld);
		plzFeld.setColumns(10);

		OrtFeld = new JTextField();
		OrtFeld.setBounds(89, 290, 86, 20);
		contentPane.add(OrtFeld);
		OrtFeld.setColumns(10);

		StrasseFeld = new JTextField();
		StrasseFeld.setBounds(89, 342, 86, 20);
		contentPane.add(StrasseFeld);
		StrasseFeld.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(267, 293, 347, 271);
		contentPane.add(textPane);

		JButton Speichern = new JButton("Speichern"); // BUTTONSPEICHERN
		Speichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clAddress address = new clAddress();
				address.setVorname(VornameFeld.getText());
				address.setNachname(NachnameFeld.getText());
				address.setOrt(OrtFeld.getText());
				address.setStrasse(StrasseFeld.getText());
				address.setPlz(Integer.parseInt(plzFeld.getText()));
				Addresses.add(address);
				VornameFeld.setText("");
				NachnameFeld.setText("");
				OrtFeld.setText("");
				StrasseFeld.setText("");
				plzFeld.setText("");
			}
		});
		Speichern.setBounds(314, 88, 89, 23);
		contentPane.add(Speichern);

		JButton Laden = new JButton("Laden");
		Laden.setBounds(314, 142, 89, 23);
		contentPane.add(Laden);

		JButton Schreiben = new JButton("Schreiben");
		Schreiben.setBounds(314, 176, 89, 23);
		contentPane.add(Schreiben);

		JButton ListeAusgeben = new JButton("Liste Ausgeben");
		ListeAusgeben.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("");
				for (int i = 0; i < Addresses.size(); i++) {
					textPane.setText(textPane.getText()+Addresses.get(i).getVorname()+" "+Addresses.get(i).getNachname()+", "+Addresses.get(i).getOrt()+" "+Integer.toString(Addresses.get(i).getPlz())+", "+Addresses.get(i).getStrasse()+"\r\n");
					System.out.print(Addresses.get(i).getVorname()+" "+Addresses.get(i).getNachname()+", "+Addresses.get(i).getOrt()+" "+Integer.toString(Addresses.get(i).getPlz())+", "+Addresses.get(i).getStrasse()+"\r\n");

				}
			}
		});
		ListeAusgeben.setBounds(314, 210, 89, 23);
		contentPane.add(ListeAusgeben);

		

	}

	public JTextField getVornameFeld() {
		return VornameFeld;
	}

	public JTextField getNachnameFeld() {
		return NachnameFeld;
	}

	public JTextField getPlzFeld() {
		return plzFeld;
	}

	public JTextField getOrtFeld() {
		return OrtFeld;
	}

	public JTextField getStrasseFeld() {
		return StrasseFeld;
	}
}
