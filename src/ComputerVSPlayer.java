import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Random;

public class ComputerVSPlayer extends JPanel{
	
	private ImageIcon pic1 = new ImageIcon("dice pic/1.jpg");
	private ImageIcon pic2 = new ImageIcon("dice pic/2.jpg");
	private ImageIcon pic3 = new ImageIcon("dice pic/3.jpg");
	private ImageIcon pic4 = new ImageIcon("dice pic/4.jpg");
	private ImageIcon pic5 = new ImageIcon("dice pic/5.jpg");
	private ImageIcon pic6 = new ImageIcon("dice pic/6.jpg");
	
	private JLabel label1 = new JLabel();
	private JLabel label2 = new JLabel();
	private JLabel label3 = new JLabel();
	private JLabel label4 = new JLabel();
	
	private JButton jbtRollButton = new JButton("roll");
	private JButton jbtEndButton = new JButton("end");
	
	
	Random randomNumbers = new Random();
	
	int n1 = 1+randomNumbers.nextInt(6);
	int n2 = 1+randomNumbers.nextInt(6);
	
	int n3 = 1+randomNumbers.nextInt(6);
	int n4 = 1+randomNumbers.nextInt(6);
	
	
	int sum1 = n1+n2;
	int sum2 = n3+n4;
	
	public ComputerVSPlayer() {
		
		jbtEndButton.setEnabled(false);
		
		n1 = 1+randomNumbers.nextInt(6);
		n2 = 1+randomNumbers.nextInt(6);
		
		
		sum1 = n1+n2;
		String sum = Integer.toString(sum1);
		
		JLabel label5 = new JLabel(sum);
		
		setLayout(new GridBagLayout());
		
		//computer
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0;
        c1.gridy = 0;
        c1.gridwidth = 1;
        c1.gridheight = 1;
        c1.fill = GridBagConstraints.BOTH;
        c1.anchor = GridBagConstraints.CENTER;
        add(new JLabel("Computer:"), c1);
        
        
        //pic1
        GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 1;
        c2.gridy = 0;
        c2.gridwidth = 1;
        c2.gridheight = 1;
        c2.fill = GridBagConstraints.BOTH;
        c2.anchor = GridBagConstraints.CENTER;
        add(label3);
        
        //pic2
        GridBagConstraints c3 = new GridBagConstraints();
		c3.gridx = 2;
        c3.gridy = 0;
        c3.gridwidth = 1;
        c3.gridheight = 1;
        c3.fill = GridBagConstraints.BOTH;
        c3.anchor = GridBagConstraints.CENTER;
		add(label4);
        
        
			switch(n1){
			case 1:	
				 label3.setIcon(pic1);
				break;
			case 2:	
				 label3.setIcon(pic2);
				break;
			case 3:	
				 label3.setIcon(pic3);
				break;
			case 4:	
				 label3.setIcon(pic4);
				break;
			case 5:	
				 label3.setIcon(pic5);
				break;
			case 6:	
				 label3.setIcon(pic6);
				break;
			}
			switch(n2){
			case 1:
				 label4.setIcon(pic1);
				break;
			case 2:
				 label4.setIcon(pic2);
				break;
			case 3:
				 label4.setIcon(pic3);
				break;
			case 4:
				 label4.setIcon(pic4);
				break;
			case 5:
				 label4.setIcon(pic5);
				break;
			case 6:
				 label4.setIcon(pic6);
				break;
		}
		//ComSum
		GridBagConstraints cP = new GridBagConstraints();
		cP.gridx = 0;
		cP.gridy = 1;
		cP.gridwidth = 2;
		cP.gridheight = 1;
		cP.fill = GridBagConstraints.BOTH;
		cP.anchor = GridBagConstraints.CENTER;
		add(new JLabel(""),cP);	
		
		//pic1
        GridBagConstraints cP2 = new GridBagConstraints();
		cP2.gridx = 1;
        cP2.gridy = 2;
        cP2.gridwidth = 1;
        cP2.gridheight = 1;
        cP2.fill = GridBagConstraints.BOTH;
        cP2.anchor = GridBagConstraints.CENTER;
        add(label1,cP2);
        
        //pic2
        GridBagConstraints cP3 = new GridBagConstraints();
		cP3.gridx = 2;
        cP3.gridy = 2;
        cP3.gridwidth = 1;
        cP3.gridheight = 1;
        cP3.fill = GridBagConstraints.BOTH;
        cP3.anchor = GridBagConstraints.CENTER;
		add(label2,cP3);
		
		
		//ComSum
		GridBagConstraints c4 = new GridBagConstraints();
		c4.gridx = 1;
		c4.gridy = 1;
		c4.gridwidth = 1;
		c4.gridheight = 1;
		c4.fill = GridBagConstraints.BOTH;
		c4.anchor = GridBagConstraints.CENTER;
		add(new JLabel("sum="),c4);
		
		//textComSum
		GridBagConstraints c5 = new GridBagConstraints();
		c5.gridx = 2;
		c5.gridy = 1;
		c5.gridwidth = 1;
		c5.gridheight = 1;
		c5.fill = GridBagConstraints.BOTH;
		c5.anchor = GridBagConstraints.CENTER;
		add(label5,c5);
			
		//player
		GridBagConstraints c6 = new GridBagConstraints();
		c6.gridx = 0;
		c6.gridy = 2;
		c6.gridwidth = 2;
		c6.gridheight = 1;
		c6.fill = GridBagConstraints.BOTH;
		c6.anchor = GridBagConstraints.CENTER;
		add(new JLabel("Player:"),c6);
		
		//playerRollButton
		GridBagConstraints c7 = new GridBagConstraints();
		c7.gridx = 0;
		c7.gridy = 3;
		c7.gridwidth = 1;
		c7.gridheight = 1;
		c7.fill = GridBagConstraints.BOTH;
		c7.anchor = GridBagConstraints.CENTER;
		add(jbtRollButton,c7);
				
		//playerSum
		GridBagConstraints c8 = new GridBagConstraints();
		c8.gridx = 1;
		c8.gridy = 3;
		c8.gridwidth = 1;
		c8.gridheight = 1;
		c8.fill = GridBagConstraints.BOTH;
		c8.anchor = GridBagConstraints.CENTER;
		add(new JLabel("sum="),c8);
		
		//end button
		GridBagConstraints c9 = new GridBagConstraints();
		c9.gridx = 3;
		c9.gridy = 3;
		c9.gridwidth = 1;
		c9.gridheight = 1;
		c9.fill = GridBagConstraints.BOTH;
		c9.anchor = GridBagConstraints.CENTER;
		add(jbtEndButton,c9);
					
			
		jbtRollButton.addActionListener(new RollButtonListener());
		jbtEndButton.addActionListener(new EndButtonListener());
	
		repaint();
		
	}
	private class RollButtonListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			

			String sum = Integer.toString(sum2);
			
			JLabel label6 = new JLabel(sum);
			
			
			
			//textPlaySum
			GridBagConstraints c1 = new GridBagConstraints();
			c1.gridx = 2;
			c1.gridy = 3;
			c1.gridwidth = 2;
			c1.gridheight = 1;
			c1.fill = GridBagConstraints.BOTH;
			c1.anchor = GridBagConstraints.CENTER;
			add(label6,c1);
		
			 
			switch(n3){
			case 1:	
				 label1.setIcon(pic1);
				break;
			case 2:	
				label1.setIcon(pic2);
				break;
			case 3:	
				label1.setIcon(pic3);
				break;
			case 4:	
				label1.setIcon(pic4);
				break;
			case 5:	
				label1.setIcon(pic5);
				break;
			case 6:	
				label1.setIcon(pic6);
				break;
			}
			switch(n4){
			case 1:
				label2.setIcon(pic1);
				break;
			case 2:
				label2.setIcon(pic2);
				break;
			case 3:
				label2.setIcon(pic3);
				break;
			case 4:
				label2.setIcon(pic4);
				break;
			case 5:
				label2.setIcon(pic5);
				break;
			case 6:
				label2.setIcon(pic6);
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
			
			jbtRollButton.setEnabled(false);
			jbtEndButton.setEnabled(true);
			repaint();
		}
	}

	private class EndButtonListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			
			System.exit(0);
		}
	}
}
