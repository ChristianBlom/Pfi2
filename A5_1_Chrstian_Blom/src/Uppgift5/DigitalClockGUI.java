package Uppgift5;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
public class DigitalClockGUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField clockH;
	private JTextField clockMin;
	public boolean alarmIsOn=false;
	public boolean alarmIsSet=false;
	
	final JLabel labelMessage = new JLabel("");
	ClockLogic clockLogic;
	JLabel labelTime = new JLabel("00:00:00");
	JLabel labelAlarmAt = new JLabel("");
	JLabel labelAlarmNotice = new JLabel("");
	private final JLabel label = new JLabel(":");
	private final JLabel label_1 = new JLabel("");
	private final JPanel panel = new JPanel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setType(Type.POPUP);
		setTitle("AlarmClock");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				DigitalClockGUI.class.getResource("/images/clock-icon3.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 215);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		clockLogic = new ClockLogic(this);
		labelTime.setHorizontalAlignment(SwingConstants.CENTER);
		labelTime.setForeground(Color.WHITE);
		labelTime.setFont(new Font("Adobe Caslon Pro Bold", Font.PLAIN, 55));
		labelTime.setBounds(78, 36, 255, 56);
		contentPane.add(labelTime);
		clockH = new JTextField();
		clockH.setText("00");
		clockH.setBounds(12, 105, 86, 20);
		contentPane.add(clockH);
		clockH.setColumns(10);
		clockMin = new JTextField();
		clockMin.setText("00");
		clockMin.setBounds(118, 105, 86, 20);
		contentPane.add(clockMin);
		clockMin.setColumns(10);
		labelMessage.setForeground(Color.RED);
		labelMessage.setFont(new Font("Arial", Font.BOLD, 14));
		labelMessage.setBounds(78, 102, 155, 23);
		contentPane.add(labelMessage);
		labelAlarmNotice.setForeground(Color.WHITE);
		labelAlarmNotice.setFont(new Font("Arial", Font.BOLD, 32));
		labelAlarmNotice.setBounds(40, 124, 155, 44);
		contentPane.add(labelAlarmNotice);
		JButton btnSetAlarm = new JButton("Set");
		btnSetAlarm.setFont(new Font("Arial", Font.BOLD, 11));
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelAlarmAt.setText(null);
				labelAlarmNotice.setText(null);
				int hourCheck = Integer.parseInt(clockH.getText());
				int minuteCheck = Integer.parseInt(clockMin.getText());
				if (hourCheck < 0 || hourCheck > 23 || minuteCheck < 0
						|| minuteCheck > 59) {
					labelMessage.setText("Not a valid time.");
				} else {
					String addZero = "";
					String addZero1 = "";
					if (hourCheck < 10) {
						addZero = "0";
					}
					if (minuteCheck < 10) {
						addZero1 = "0";
					}
					contentPane.setBackground(Color.LIGHT_GRAY);
					clockLogic.setAlarm(hourCheck, minuteCheck);
					labelAlarmAt.setText(addZero + hourCheck + ":" + addZero1
							+ minuteCheck);
					addZero = "";
					addZero1 = "";
					labelMessage.setText("");
					labelAlarmNotice.setText("");
				}
			}
		});
		btnSetAlarm.setBounds(12, 13, 68, 23);
		contentPane.add(btnSetAlarm);
		JLabel lblAlarmAt = new JLabel("Alarm at:");
		lblAlarmAt.setForeground(Color.WHITE);
		lblAlarmAt.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 18));
		lblAlarmAt.setBounds(92, 8, 97, 28);
		contentPane.add(lblAlarmAt);
		labelAlarmAt.setHorizontalAlignment(SwingConstants.RIGHT);
		labelAlarmAt.setForeground(Color.WHITE);
		labelAlarmAt.setFont(new Font("Adobe Caslon Pro Bold", Font.PLAIN, 18));
		labelAlarmAt.setBounds(159, 13, 62, 23);
		contentPane.add(labelAlarmAt);
		JButton btnClearAlarm = new JButton("Clear");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelAlarmAt.setText(null);
				labelAlarmNotice.setText(null);
				clockH.setText("00");
				clockMin.setText("00");
				contentPane.setBackground(Color.LIGHT_GRAY);
				labelAlarmAt.setText("00:01");
				clockLogic.clearAlarm();
			
				
			}
		});
		btnClearAlarm.setFont(new Font("Arial", Font.BOLD, 11));
		btnClearAlarm.setBounds(12, 52, 68, 25);
		contentPane.add(btnClearAlarm);
		label.setForeground(Color.WHITE);
		label.setBounds(103, 107, 12, 16);
		
		contentPane.add(label);
		panel.setBounds(312, 36, 80, 106);
		
		contentPane.add(panel);
		panel.setLayout(null);
		label_1.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/images/clock-icon3.png")));
		label_1.setBounds(0, -15, 86, 140);
		panel.add(label_1);
	}
	public void setTimeOnLabel(String time) {
		labelTime.setText(time);
	}
	public void alarm(boolean activate) {
		if (true) {
			labelAlarmNotice.setText("ALARM!");
			contentPane.setBackground(Color.MAGENTA);
		
		}
	}
}