package Uppgift_4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class AnimalsGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textPane_human;
	private JTextField textPane_dog;
	private JTextField textPane_info;
	private JTextField textPane_error;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnHuman;
	private JButton btnDog;
	private JButton btnPrintInfo;

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
	static Human human;
	private JLabel lblHumansAndDogs;
	public AnimalsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 504, 288);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textPane_human = new JTextField();
		textPane_human.setBounds(12, 68, 143, 22);
		panel.add(textPane_human);
		textPane_human.setColumns(10);
		
		textPane_dog = new JTextField();
		textPane_dog.setBounds(12, 103, 143, 22);
		panel.add(textPane_dog);
		textPane_dog.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Info", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(26, 177, 440, 52);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textPane_info = new JTextField();
		textPane_info.setBounds(6, 18, 428, 27);
		panel_1.add(textPane_info);
		textPane_info.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Error Message", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(26, 235, 440, 47);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		textPane_error = new JTextField();
		textPane_error.setBounds(6, 18, 428, 22);
		panel_2.add(textPane_error);
		textPane_error.setColumns(10);
		
		btnHuman = new JButton("New Human");
		btnHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textPane_human.getText().length() < 3){
					textPane_error.setText(textPane_human.getText()+ "Är ett för kort namn");
				}else{
					human = new Human(textPane_human.getText());
					textPane_info.setText(human.getName());
					
				}
			}
		});
		btnHuman.setBounds(208, 67, 111, 25);
		panel.add(btnHuman);
		
		btnDog = new JButton("Buy dog");
		btnDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (human == null){
					textPane_error.setText("Finns ingen människa här");
				}
				else{
						Dog doggy = new Dog(textPane_dog.getText());
						human.buyDog(doggy);
						textPane_info.setText(doggy.getName());
				}
			}
		});
		btnDog.setBounds(208, 102, 111, 25);
		panel.add(btnDog);
		
		btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane_info.setText(human.getInfo());
			}
		});
		btnPrintInfo.setBounds(208, 139, 111, 25);
		panel.add(btnPrintInfo);
		
		lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHumansAndDogs.setBounds(180, 12, 176, 42);
		panel.add(lblHumansAndDogs);
	}

}
