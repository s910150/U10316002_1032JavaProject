import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;




public class firstPanel extends JPanel{
	
	private JButton jbtComVsPlayerButton = new JButton("Computer vs. Player");
	private JButton jbtPlayerVsPlayerButton = new JButton("Player vs. Player");
	private JLabel lblWelcomeToThe = new JLabel("Let's throw the dice and compare them!");
	
	
	public firstPanel() {
		
		setLayout(new GridLayout(3,1));
		
		lblWelcomeToThe.setFont(new Font("Arial", Font.PLAIN, 20));
		
		add(lblWelcomeToThe);
		add(jbtComVsPlayerButton);
		add(jbtPlayerVsPlayerButton);

		jbtComVsPlayerButton.addActionListener(new ButtonListenerCVP());
		jbtPlayerVsPlayerButton.addActionListener(new ButtonListenerPVP());
		
	}

	private class ButtonListenerCVP implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			
			remove(lblWelcomeToThe);
			remove(jbtComVsPlayerButton);
			remove(jbtPlayerVsPlayerButton);
	
			
			
			setLayout(new GridLayout(4,4));
			
			ImageIcon pic1 = new ImageIcon("dice pic/1.jpg");
			ImageIcon pic2 = new ImageIcon("dice pic/2.jpg");
			ImageIcon pic3 = new ImageIcon("dice pic/3.jpg");
			ImageIcon pic4 = new ImageIcon("dice pic/4.jpg");
			ImageIcon pic5 = new ImageIcon("dice pic/5.jpg");
			ImageIcon pic6 = new ImageIcon("dice pic/6.jpg");
			
			JButton jbtRollButton = new JButton("roll");
			JButton jbtNextButton = new JButton("next");
			
			
			Random randomNumbers = new Random();
			
			int n1 ;
			int n2 ;
			
			int sum ;
			
			jbtNextButton.setEnabled(false);

			n1 = 1+randomNumbers.nextInt(6);
			n2 = 1+randomNumbers.nextInt(6);
			
			sum = n1+n2;
			
			
			add(new JLabel("Computer:"));
			 
				switch(n1){
				case 1:	
					add(new JLabel(pic1));
					break;
				case 2:	
					add(new JLabel(pic2));
					break;
				case 3:	
					add(new JLabel(pic3));
					break;
				case 4:	
					add(new JLabel(pic4));
					break;
				case 5:	
					add(new JLabel(pic5));
					break;
				case 6:	
					add(new JLabel(pic6));
					break;
				}
				switch(n2){
				case 1:
					add(new JLabel(pic1));
					break;
				case 2:
					add(new JLabel(pic2));
					break;
				case 3:
					add(new JLabel(pic3));
					break;
				case 4:
					add(new JLabel(pic4));
					break;
				case 5:
					add(new JLabel(pic5));
					break;
				case 6:
					add(new JLabel(pic6));
					break;
			}
			
				add(new JLabel(""));
				
				add(new JLabel(""));
				add(new JLabel("sum="));
				add(new JTextField(sum));
				add(new JLabel(""));
				
				
				n1 = 1+randomNumbers.nextInt(6);
				n2 = 1+randomNumbers.nextInt(6);
				
				sum = n1+n2;
				
				add(new JLabel("Player:"));
				 
				switch(n1){
				case 1:	
					add(new JLabel(pic1));
					break;
				case 2:	
					add(new JLabel(pic2));
					break;
				case 3:	
					add(new JLabel(pic3));
					break;
				case 4:	
					add(new JLabel(pic4));
					break;
				case 5:	
					add(new JLabel(pic5));
					break;
				case 6:	
					add(new JLabel(pic6));
					break;
				}
				switch(n2){
				case 1:
					add(new JLabel(pic1));
					break;
				case 2:
					add(new JLabel(pic2));
					break;
				case 3:
					add(new JLabel(pic3));
					break;
				case 4:
					add(new JLabel(pic4));
					break;
				case 5:
					add(new JLabel(pic5));
					break;
				case 6:
					add(new JLabel(pic6));
					break;
			}
			
				add(new JLabel(""));
				
				add(jbtRollButton);
				add(new JLabel("sum="));
				add(new JTextField(sum));
				add(jbtNextButton);
				
				jbtRollButton.addActionListener(new RollButtonListener());
				jbtNextButton.addActionListener(new NextButtonListener());
				
				repaint();
		}
		private class RollButtonListener implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e){
				
				removeAll();
				
				repaint();
			}
		}

		private class NextButtonListener implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e){
				
				removeAll();
				
				repaint();
			}
		}
	}

	private class ButtonListenerPVP implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			
			removeAll();
			
			repaint();
			
			
		}
	}
	
}
