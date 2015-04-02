package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;

import se.mah.k3lara.skaneAPI.control.*;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.util.Calendar;

public class TrafficGUI extends JFrame {
	
	private Parser p = new Parser();
	TrafficGUI g = this;
	private JPanel contentPane;
	public JTextArea textLine;
	public JTextArea textDest;
	public JTextArea textDep;
	public JTextArea textRemark;
	public ArrayList<Station> searchGui = new ArrayList<Station>();
	
	Thread jT = new JourneysThread (p, this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrafficGUI frame = new TrafficGUI();
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
	public TrafficGUI() {
		Thread jT = new JourneysThread (p, g);
		jT.start();
		setTitle("Ub�tshallen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 784, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 79, 784, 182);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setBackground(new Color(51, 51, 51));
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 96, 182);
		panel_1.add(scrollPane_1);
		
		textLine = new JTextArea();
		textLine.setFont(new Font("Monospaced", Font.BOLD, 20));
		textLine.setForeground(Color.ORANGE);
		textLine.setBackground(new Color(51, 51, 51));
		textLine.setEditable(false);
		scrollPane_1.setViewportView(textLine);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(95, 0, 255, 182);
		panel_1.add(scrollPane_2);
		
		textDest = new JTextArea();
		textDest.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textDest.setForeground(Color.ORANGE);
		textDest.setBackground(new Color(51, 51, 51));
		textDest.setEditable(false);
		scrollPane_2.setViewportView(textDest);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(348, 1, 152, 181);
		panel_1.add(scrollPane_3);
		
		textDep = new JTextArea();
		textDep.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textDep.setForeground(Color.ORANGE);
		textDep.setBackground(new Color(51, 51, 51));
		textDep.setEditable(false);
		scrollPane_3.setViewportView(textDep);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(499, 1, 283, 179);
		panel_1.add(scrollPane_4);
		
		textRemark = new JTextArea();
		textRemark.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textRemark.setForeground(Color.ORANGE);
		textRemark.setBackground(new Color(51, 51, 51));
		scrollPane_4.setViewportView(textRemark);
		
		JLabel lblDestination = new JLabel("DESTINATION:");
		lblDestination.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblDestination.setForeground(new Color(255, 255, 255));
		lblDestination.setBounds(147, 37, 220, 42);
		panel.add(lblDestination);
		
		JLabel lblNewLabel = new JLabel("LINJE:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(21, 37, 77, 42);
		panel.add(lblNewLabel);
		
		JLabel lblAvgr = new JLabel("AVG\u00C5R:");
		lblAvgr.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblAvgr.setForeground(new Color(255, 255, 255));
		lblAvgr.setBounds(386, 37, 119, 42);
		panel.add(lblAvgr);
		
		JLabel lblForseningar = new JLabel("F\u00D6RSENINGAR:");
		lblForseningar.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblForseningar.setForeground(new Color(255, 255, 255));
		lblForseningar.setBounds(564, 47, 259, 23);
		panel.add(lblForseningar);
		
		JLabel lblUbtshallen = new JLabel("Ub\u00E5tshallen");
		lblUbtshallen.setFont(new Font("Dialog", Font.BOLD, 35));
		lblUbtshallen.setForeground(Color.WHITE);
		lblUbtshallen.setBounds(250, -5, 220, 49);
		panel.add(lblUbtshallen);
		
	
		
		
	}
}