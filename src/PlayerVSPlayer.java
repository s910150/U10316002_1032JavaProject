import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class PlayerVSPlayer extends JPanel{
	
	private ImageIcon pic1 = new ImageIcon("dice pic/1.jpg");
	private ImageIcon pic2 = new ImageIcon("dice pic/2.jpg");
	private ImageIcon pic3 = new ImageIcon("dice pic/3.jpg");
	private ImageIcon pic4 = new ImageIcon("dice pic/4.jpg");
	private ImageIcon pic5 = new ImageIcon("dice pic/5.jpg");
	private ImageIcon pic6 = new ImageIcon("dice pic/6.jpg");
	
	private JButton jbtRoll1Button = new JButton("roll");
	private JButton jbtRoll2Button = new JButton("roll");
	private JButton jbtNextButton = new JButton("next");
	
	
	Random randomNumbers = new Random();
	
	int n1 ;
	int n2 ;
	
	int sum1 ;
	int sum2;
	
	public PlayerVSPlayer() {
		
		jbtNextButton.setEnabled(false);
		
		setLayout(new GridBagLayout());
		
		//player1
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0;
        c1.gridy = 0;
        c1.gridwidth = 2;
        c1.gridheight = 1;
        c1.fill = GridBagConstraints.BOTH;
        c1.anchor = GridBagConstraints.CENTER;
        add(new JLabel("Player1:"), c1);
        
        
 
		//P1Roll
		GridBagConstraints cP = new GridBagConstraints();
		cP.gridx = 0;
		cP.gridy = 1;
		cP.gridwidth = 2;
		cP.gridheight = 1;
		cP.fill = GridBagConstraints.BOTH;
		cP.anchor = GridBagConstraints.CENTER;
		add(jbtRoll1Button,cP);		
		
		
		//P1Sum
		GridBagConstraints c4 = new GridBagConstraints();
		c4.gridx = 1;
		c4.gridy = 1;
		c4.gridwidth = 1;
		c4.gridheight = 1;
		c4.fill = GridBagConstraints.BOTH;
		c4.anchor = GridBagConstraints.CENTER;
		add(new JLabel("sum="),c4);
		
	
		//player2
		GridBagConstraints c6 = new GridBagConstraints();
		c6.gridx = 0;
		c6.gridy = 2;
		c6.gridwidth = 2;
		c6.gridheight = 1;
		c6.fill = GridBagConstraints.BOTH;
		c6.anchor = GridBagConstraints.CENTER;
		add(new JLabel("Player2:"),c6);
		
		//player2RollButton
		GridBagConstraints c7 = new GridBagConstraints();
		c7.gridx = 0;
		c7.gridy = 3;
		c7.gridwidth = 1;
		c7.gridheight = 1;
		c7.fill = GridBagConstraints.BOTH;
		c7.anchor = GridBagConstraints.CENTER;
		add(jbtRoll2Button,c7);
				
		//player2Sum
		GridBagConstraints c8 = new GridBagConstraints();
		c8.gridx = 1;
		c8.gridy = 3;
		c8.gridwidth = 1;
		c8.gridheight = 1;
		c8.fill = GridBagConstraints.BOTH;
		c8.anchor = GridBagConstraints.CENTER;
		add(new JLabel("sum="),c8);
		
		//nextButton
		GridBagConstraints c9 = new GridBagConstraints();
		c9.gridx = 3;
		c9.gridy = 3;
		c9.gridwidth = 1;
		c9.gridheight = 1;
		c9.fill = GridBagConstraints.BOTH;
		c9.anchor = GridBagConstraints.CENTER;
		add(jbtNextButton,c9);			
			
		jbtNextButton.addActionListener(new NextButtonListener());
	
		jbtRoll1Button.addActionListener(new Roll1ButtonListener());
		jbtRoll2Button.addActionListener(new Roll2ButtonListener());
	
	
	}
	private class Roll1ButtonListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			n1 = 1+randomNumbers.nextInt(6);
			n2 = 1+randomNumbers.nextInt(6);
			
			sum1 = n1+n2;
			
			//textP1Sum
			GridBagConstraints c5 = new GridBagConstraints();
			c5.gridx = 2;
			c5.gridy = 1;
			c5.gridwidth = 2;
			c5.gridheight = 1;
			c5.fill = GridBagConstraints.BOTH;
			c5.anchor = GridBagConstraints.CENTER;
			add(new JTextField(sum1),c5);
			
			//P1pic1
	        GridBagConstraints c2 = new GridBagConstraints();
			c2.gridx = 1;
	        c2.gridy = 0;
	        c2.gridwidth = 1;
	        c2.gridheight = 1;
	        c2.fill = GridBagConstraints.BOTH;
	        c2.anchor = GridBagConstraints.CENTER;
	        
	        
	        //P1pic2
	        GridBagConstraints c3 = new GridBagConstraints();
			c3.gridx = 2;
	        c3.gridy = 0;
	        c3.gridwidth = 1;
	        c3.gridheight = 1;
	        c3.fill = GridBagConstraints.BOTH;
	        c3.anchor = GridBagConstraints.CENTER;
			
				switch(n1){
				case 1:	
					add(new JLabel(pic1),c2);
					break;
				case 2:	
					add(new JLabel(pic2),c2);
					break;
				case 3:	
					add(new JLabel(pic3),c2);
					break;
				case 4:	
					add(new JLabel(pic4),c2);
					break;
				case 5:	
					add(new JLabel(pic5),c2);
					break;
				case 6:	
					add(new JLabel(pic6),c2);
					break;
				}
				switch(n2){
				case 1:
					add(new JLabel(pic1),c3);
					break;
				case 2:
					add(new JLabel(pic2),c3);
					break;
				case 3:
					add(new JLabel(pic3),c3);
					break;
				case 4:
					add(new JLabel(pic4),c3);
					break;
				case 5:
					add(new JLabel(pic5),c3);
					break;
				case 6:
					add(new JLabel(pic6),c3);
					break;
			}
			
		}
	}

	private class Roll2ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
		
			n1 = 1+randomNumbers.nextInt(6);
			n2 = 1+randomNumbers.nextInt(6);
			
			sum2 = n1+n2;
			//textP2Sum
			GridBagConstraints c1 = new GridBagConstraints();
			c1.gridx = 2;
			c1.gridy = 3;
			c1.gridwidth = 2;
			c1.gridheight = 1;
			c1.fill = GridBagConstraints.BOTH;
			c1.anchor = GridBagConstraints.CENTER;
			add(new JTextField(sum2),c1);
			
			
			//pic1
	        GridBagConstraints c2 = new GridBagConstraints();
			c2.gridx = 1;
	        c2.gridy = 2;
	        c2.gridwidth = 1;
	        c2.gridheight = 1;
	        c2.fill = GridBagConstraints.BOTH;
	        c2.anchor = GridBagConstraints.CENTER;
	        
	        
	        //pic2
	        GridBagConstraints c3 = new GridBagConstraints();
			c3.gridx = 2;
	        c3.gridy = 2;
	        c3.gridwidth = 1;
	        c3.gridheight = 1;
	        c3.fill = GridBagConstraints.BOTH;
	        c3.anchor = GridBagConstraints.CENTER;
			
			 
			switch(n1){
			case 1:	
				add(new JLabel(pic1),c2);
				break;
			case 2:	
				add(new JLabel(pic2),c2);
				break;
			case 3:	
				add(new JLabel(pic3),c2);
				break;
			case 4:	
				add(new JLabel(pic4),c2);
				break;
			case 5:	
				add(new JLabel(pic5),c2);
				break;
			case 6:	
				add(new JLabel(pic6),c2);
				break;
			}
			switch(n2){
			case 1:
				add(new JLabel(pic1),c3);
				break;
			case 2:
				add(new JLabel(pic2),c3);
				break;
			case 3:
				add(new JLabel(pic3),c3);
				break;
			case 4:
				add(new JLabel(pic4),c3);
				break;
			case 5:
				add(new JLabel(pic5),c3);
				break;
			case 6:
				add(new JLabel(pic6),c3);
				break;
			}
			
			if(sum1>sum2){
				
				GridBagConstraints c4 = new GridBagConstraints();
				c4.gridx = 3;
			    c4.gridy = 0;
			    c4.gridwidth = 1;
			    c4.gridheight = 1;
			    c4.fill = GridBagConstraints.BOTH;
			    c4.anchor = GridBagConstraints.CENTER;
				add(new JLabel("win"),c4);		
				
			}else if(sum1<sum2){
				
				GridBagConstraints c5 = new GridBagConstraints();
				c5.gridx = 3;
			    c5.gridy = 2;
			    c5.gridwidth = 1;
			    c5.gridheight = 1;
			    c5.fill = GridBagConstraints.BOTH;
			    c5.anchor = GridBagConstraints.CENTER;
				add(new JLabel("win"),c5);		
				
			}else if(sum1==sum2){
				
				GridBagConstraints c6 = new GridBagConstraints();
				c6.gridx = 3;
			    c6.gridy = 2;
			    c6.gridwidth = 1;
			    c6.gridheight = 1;
			    c6.fill = GridBagConstraints.BOTH;
			    c6.anchor = GridBagConstraints.CENTER;
				add(new JLabel("draw"),c6);		
				
				GridBagConstraints c7 = new GridBagConstraints();
				c7.gridx = 3;
			    c7.gridy = 0;
			    c7.gridwidth = 1;
			    c7.gridheight = 1;
			    c7.fill = GridBagConstraints.BOTH;
			    c7.anchor = GridBagConstraints.CENTER;
				add(new JLabel("draw"),c7);		
				
			}
		
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


