import javax.swing.*;


public class firstPanel extends JPanel{
	
	private JButton jbtComVsPlayerButton = new JButton("Computer vs. Player");
	private JButton jbtPlayerVsPlayerButton = new JButton("Player vs. Player");
	
	public firstPanel() {
		add(new JLabel("Welcome to the dice world."));
		add(jbtComVsPlayerButton);
		add(jbtPlayerVsPlayerButton);
	}
	
}
