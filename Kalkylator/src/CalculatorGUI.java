
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;


public class CalculatorGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Calculator cal;
	
	private JPanel contentPane;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_plus;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_minus;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_multi;
	private JButton button_12;
	private JButton button_13;
	private JButton button_likamed;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
	   
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		cal = new Calculator();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(43, 35, 334, 53);
		contentPane.add(textArea);
		
		button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.numberButtonPressed(1);
				textArea.append("1");
				
				
			}
		});
		button_1.setBounds(43, 132, 78, 59);
		contentPane.add(button_1);
		
		button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.numberButtonPressed(2);
				textArea.append("2");
				
				
			}
		});
		button_2.setBounds(128, 132, 78, 59);
		contentPane.add(button_2);
		
		button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cal.numberButtonPressed(3);
				textArea.append("3");
				
			}
		}
				);
		button_3.setBounds(214, 132, 78, 59);
		contentPane.add(button_3);
		
		button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.plus();
				textArea.append("+");
				
				
			}
		});
		button_plus.setBounds(299, 132, 78, 59);
		contentPane.add(button_plus);
		
		button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cal.numberButtonPressed(4);
				textArea.append("4");
				
			}
		}
				);
		button_4.setBounds(43, 199, 78, 59);
		contentPane.add(button_4);
		
		button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cal.numberButtonPressed(5);
				textArea.append("5");
				
			}
		}
				);
		button_5.setBounds(128, 199, 78, 59);
		contentPane.add(button_5);
		
		button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cal.numberButtonPressed(6);
				textArea.append("6");
				
			}
		}
				);
		button_6.setBounds(214, 199, 78, 59);
		contentPane.add(button_6);
		
		button_minus = new JButton("-");
		button_minus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cal.minus();
				textArea.append("-");
				
			}
		}
				);
		button_minus.setBounds(299, 199, 78, 59);
		contentPane.add(button_minus);
		
		button_8 = new JButton("7");
		button_8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cal.numberButtonPressed(7);
				textArea.append("7");
				
			}
		}
				);
		button_8.setBounds(43, 265, 78, 59);
		contentPane.add(button_8);
		
		button_9 = new JButton("8");
		button_9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cal.numberButtonPressed(8);
				textArea.append("8");
				
			}
		}
				);
		button_9.setBounds(128, 265, 78, 59);
		contentPane.add(button_9);
		
		button_10 = new JButton("9");
		button_10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cal.numberButtonPressed(9);
				textArea.append("9");
				
			}
		}
				);
		button_10.setBounds(214, 265, 78, 59);
		contentPane.add(button_10);
		
		button_multi = new JButton("*");
		button_multi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cal.mult();
				textArea.append("*");
				
			}
		}
				);
		button_multi.setBounds(299, 265, 78, 59);
		contentPane.add(button_multi);
		
		button_12 = new JButton("0");
		button_12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cal.numberButtonPressed(0);
				textArea.append("0");
				
			}
		}
				);
		button_12.setBounds(43, 331, 78, 59);
		contentPane.add(button_12);
		
		button_13 = new JButton("C");
		button_13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cal.clear();
				textArea.setText(String.valueOf(""));
				System.out.println("clear");
				
			}
		}
				);
		button_13.setBounds(128, 331, 78, 59);
		contentPane.add(button_13);
		
		button_likamed = new JButton("=");
		button_likamed.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cal.equals();
				int resultat = cal.getResult();
				textArea.setText(String.valueOf("= " +resultat));
				System.out.println("Result");
				
				
			}
		}
				);
		button_likamed.setBounds(214, 331, 78, 59);
		contentPane.add(button_likamed);
		
	}
}
