import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class setFrame {

	public static void main(String[] args) {
		
		//new an object of Actions 
		JFrame frame = new JFrame();
		
		JPanel ComputerVSPlayer = new ComputerVSPlayer();
		
		frame.setTitle("only play one time!!!!!");
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.add(ComputerVSPlayer);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false); 
		frame.setVisible(true);
	}
	
}
