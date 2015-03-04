package Uppgift_4_del2;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class AnimalsGUI extends JFrame {
	private ArrayList<Animal> spaceZoo = new ArrayList<Animal>();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalsGUI frame = new AnimalsGUI();
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
	public AnimalsGUI() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 235);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "SpaceZoo Animal List", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(250, 235, 215)));
		panel.setBounds(12, 13, 671, 162);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 18, 642, 131);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setForeground(new Color(173, 216, 230));
		textArea.setBackground(Color.BLACK);
		
		spaceZoo.add(new Dog("Canis latrans", 4, true));
		spaceZoo.add(new Dog("Canis smarticus", 4, false, "Lassie"));
		spaceZoo.add(new Dog("Canis laticus", 4, true, "Dumdum"));
		spaceZoo.add(new Snake("Python regius", true));
		spaceZoo.add(new Snake("CornSnake", false));
		spaceZoo.add(new Cat("Lynx FullLifeus", 5 , 9));
		spaceZoo.add(new Cat("Lynx LowLifeus", 5 , 2));
		spaceZoo.add(new Dog("Canis latrans", 4, true));
		spaceZoo.add(new Dog("Canis smarticus", 4, false, "Lassie"));
		spaceZoo.add(new Dog("Canis laticus", 4, true, "Dumdum"));
		spaceZoo.add(new Snake("Python regius", true));
		spaceZoo.add(new Snake("CornSnake", false));
		spaceZoo.add(new Cat("Lynx FullLifeus", 5 , 9));
		spaceZoo.add(new Cat("Lynx LowLifeus", 5 , 2));
		spaceZoo.add(new Dog("Canis latrans", 4, true));
		spaceZoo.add(new Dog("Canis smarticus", 4, false, "Lassie"));
		spaceZoo.add(new Dog("Canis laticus", 4, true, "Dumdum"));
		spaceZoo.add(new Snake("Python regius", true));
		spaceZoo.add(new Snake("CornSnake", false));
		spaceZoo.add(new Cat("Lynx FullLifeus", 5 , 9));
		spaceZoo.add(new Cat("Lynx LowLifeus", 5 , 2));
		
		for(Animal animal : spaceZoo){
				textArea.append(animal.getInfo() + "\n");
		}
		
	}
}
