package se.mah.k3lara.skaneAPI.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import se.mah.k3lara.skaneAPI.control.*;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;	
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
public class GUI extends JFrame {
	private JPanel contentPane;
	public JTextField textField;
	public JTextArea textArea;
	public JTextArea textAreaResa;
	public ArrayList<Station> guiSearch = new ArrayList<Station>();
	public JTextField txtFrn;
	public JTextField txtTill;
	GUI g = this;
	private Parser p = new Parser();
	Thread tJ = new JourneysThread (p, this);
	Thread tS = new StationsThread (p, this);
	private JLabel lblEnterStationAnd;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setTitle("Search a trip");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 536);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(-52, 0, 585, 489);
		contentPane.add(panel);
		panel.setLayout(null);
		textField = new JTextField();
		textField.setBounds(170, 40, 357, 32);
		panel.add(textField);
		textField.setColumns(10);
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread tS = new StationsThread (p, g);
				tS.start();
			}
		});
		btnSearch.setBounds(61, 44, 97, 25);
		panel.add(btnSearch);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(170, 85, 357, 166);
		panel.add(scrollPane);
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(170, 299, 357, 166);
		panel.add(scrollPane_1);
		textAreaResa = new JTextArea();
		scrollPane_1.setViewportView(textAreaResa);
		JButton btnSearch_1 = new JButton("Search");
		btnSearch_1.setBounds(61, 261, 97, 25);
		panel.add(btnSearch_1);
		txtFrn = new JTextField();
		txtFrn.setBounds(180, 264, 116, 22);
		panel.add(txtFrn);
		txtFrn.setText("From");
		txtFrn.setColumns(10);
		txtTill = new JTextField();
		txtTill.setBounds(374, 264, 116, 22);
		panel.add(txtTill);
		txtTill.setText("To");
		txtTill.setColumns(10);
		
		lblEnterStationAnd = new JLabel("Enter Station and Copy/paste the numbers below ( From/To)");
		lblEnterStationAnd.setBounds(170, 11, 357, 16);
		panel.add(lblEnterStationAnd);
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread tJ = new JourneysThread (p, g); 
				tJ.start();
			}
		});
	}
}