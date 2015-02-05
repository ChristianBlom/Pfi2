import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.ArrayList;
import java.util.Random;

public class HouseGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Random random = new Random();
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
	
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 289, 445);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
//-------------------------- Hus Listor -------------------------------------------------//
	
		System.out.println("Uppgift 1.2");
		House hus1 = new House(34 ,1880);
		House hus2 = new House(54, 1996);
		House hus3 = new House(100, 2001);
		
		
		System.out.println("Detta huset är byggt " + hus1.yearBuilt + " och är " +hus1.size +" kvm stort." );
		System.out.println("Detta huset är byggt " + hus2.yearBuilt + " och är " +hus2.size +" kvm stort.");
		System.out.println("Detta huset är byggt " + hus3.yearBuilt + " och är " +hus3.size +" kvm stort.");
		textArea.append("Uppgift 1.2."+ "\n");
		textArea.append("Detta huset är byggt " + hus1.yearBuilt + " och är " +hus1.size +" kvm stort."+ "\n");
		textArea.append("Detta huset är byggt " + hus2.yearBuilt + " och är " +hus2.size +" kvm stort."+ "\n");
		textArea.append("Detta huset är byggt " + hus3.yearBuilt + " och är " +hus3.size +" kvm stort."+ "\n");
		
		// Deklarerar en array av hus
		textArea.append("Uppgift 1.3."+ "\n");
		House[] houseArray;
		houseArray = new House[10];
		houseArray[0] = new House(54,1987);
		houseArray[1] = new House(20,1999);
		houseArray[2] = new House(65,1935);
		houseArray[3] = new House(100,1936);
		houseArray[4] = new House(89,1840);
		houseArray[5] = new House(90,1890);
		houseArray[6] = new House(99,1990);
		houseArray[7] = new House(203,1954);
		houseArray[8] = new House(76,1923);
		houseArray[9] = new House(210,1963);
		
	    for (int i = 0; i < 10; i++) {
			
	    	    
				textArea.append("Detta huset är byggt " + houseArray[i].yearBuilt + " och är " +houseArray[i].size +" kvm stort."+ "\n");

	    }
	    //ArrayList
	    textArea.append("Uppgift 1.4"+"\n");
		ArrayList<House> house = new ArrayList<House>();
		
		for( int i = 0; i < 100; i++){
			int year = random.nextInt(215) + 1800;
			int size = random.nextInt(990) + 10;
			house.add (new House(size, year));
			
		}
		for( int i = 0; i < 100; i++){
			textArea.append("Detta huset är byggt " + house.get(i).yearBuilt + " och är " + house.get(i).size +" kvm stort."+ "\n");
		}
		
	}
	
}
