/**This is the dice mane class for my project.
 @author Christopher Tearle
 @version 1.0 */ 

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class DiceButton extends JFrame {
	JButton button;
	JLabel dice1,dice2,score;
	int win=0, loss=0, draw=0;
  	public DiceButton() {
  		

  			/** this is assigning this class to the main window which holds a command
	 		 this creats the new window and defines the format */
			super("Dice Button");
			Container cPane = getContentPane();
			//cPane.setLayout(new FlowLayout());
			cPane.setLayout(null);
			setTitle("Dice Roll");
			setSize(400,450);
			setResizable (false);
			setLocation(550,450);
			
			cPane.setBackground(Color.red);
        //	cPane.setLayout(new FlowLayout());
		
			button = new JButton("Roll");
				
			button.addActionListener(new ButtonListener());	
			//button.setSize(400,100);
			button.setBounds(125,10,150,60);
			cPane.add(button);			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			/** this is creating the button that shall hold the method for this game
	 		 this creats a button using the Jbutton method */
			 dice1 = new JLabel();
			dice1.setIcon(new ImageIcon("dice1.png"));
		
			dice1.setBounds(50,80,100,100);
		
			 dice2 = new JLabel();
			dice2.setIcon(new ImageIcon("dice2.png"));
		
			dice2.setBounds(250,80,100,100);
			cPane.add(dice1);
			cPane.add(dice2);
			
			
			score = new JLabel("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
			score.setBounds(125,200,200,200);
			cPane.add(score);
			cPane.validate();
		}
	
		
	private class ButtonListener implements ActionListener {
	  public void actionPerformed(ActionEvent e)
	  	{
	  		int roll1;
	  		int roll2;
	  		 //dice2 = new JLabel();
	  		 //dice1 = new JLabel();
	  		roll1= (int)(Math.random()*6+1);
	  		roll2= (int)(Math.random()*6+1);
	  		/** JOptionPane method to display the results of the game
	 		*@return the name and status of the student as a string */

	  		if (roll1 > roll2)
	  		{
	  		
	  		JOptionPane.showMessageDialog(null,"You rolled a: " + roll1 + " and Your Opponent rolled a " + roll2 + " \nCongradulations You Won");
	  		win++;
	  		//win output
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  				if(roll1==1)
	  				{
	  					dice1.setIcon(new ImageIcon("dice1.png"));	
	  					
	  				}
	  				else if(roll1==2)
	  				{
	  					dice1.setIcon(new ImageIcon("dice2.png"));	
	  					
	  				}
	  				if(roll1==3)
	  				{
	  					dice1.setIcon(new ImageIcon("dice3.png"));	
	  					
	  				}
	  				else if(roll1==4)
	  				{
	  					dice1.setIcon(new ImageIcon("dice4.png"));	
	  					
	  				}
	  				if(roll1==5)
	  				{
	  					dice1.setIcon(new ImageIcon("dice5.png"));	
	  					
	  				}
	  				else if(roll1==6)
	  				{
	  					dice1.setIcon(new ImageIcon("dice6.png"));	
	  					
	  				}
	  					if(roll2==1)
	  				{
	  					dice2.setIcon(new ImageIcon("dice1.png"));	
	  					
	  				}
	  				else if(roll2==2)
	  				{
	  					dice2.setIcon(new ImageIcon("dice2.png"));	
	  					
	  				}
	  				if(roll2==3)
	  				{
	  					dice2.setIcon(new ImageIcon("dice3.png"));	
	  					
	  				}
	  				else if(roll2==4)
	  				{
	  					dice2.setIcon(new ImageIcon("dice4.png"));	
	  					
	  				}
	  				if(roll2==5)
	  				{
	  					dice2.setIcon(new ImageIcon("dice5.png"));	
	  					
	  				}
	  				else if(roll2==6)
	  				{
	  					dice2.setIcon(new ImageIcon("dice6.png"));	
	  					
	  				}
	  		}//end win output
	  		
	  		else if (roll1<roll2)
	  		{
	  		
	  		JOptionPane.showMessageDialog(null,"You rolled a: " + roll1 + " and Your Opponent rolled a " + roll2 + " \nSorry You Lost");
	  		loss++;
	  		score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  	
	  		//loss output
	  			if(roll1==1)
	  				{
	  					dice1.setIcon(new ImageIcon("dice1.png"));	
	  					
	  				}
	  				else if(roll1==2)
	  				{
	  					dice1.setIcon(new ImageIcon("dice2.png"));	
	  					
	  				}
	  				if(roll1==3)
	  				{
	  					dice1.setIcon(new ImageIcon("dice3.png"));	
	  					
	  				}
	  				else if(roll1==4)
	  				{
	  					dice1.setIcon(new ImageIcon("dice4.png"));	
	  					
	  				}
	  				if(roll1==5)
	  				{
	  					dice1.setIcon(new ImageIcon("dice5.png"));	
	  					
	  				}
	  				else if(roll1==6)
	  				{
	  					dice1.setIcon(new ImageIcon("dice6.png"));	
	  					
	  				}
	  					if(roll2==1)
	  				{
	  					dice2.setIcon(new ImageIcon("dice1.png"));	
	  					
	  				}
	  				else if(roll2==2)
	  				{
	  					dice2.setIcon(new ImageIcon("dice2.png"));	
	  					
	  				}
	  				if(roll2==3)
	  				{
	  					dice2.setIcon(new ImageIcon("dice3.png"));	
	  					
	  				}
	  				else if(roll2==4)
	  				{
	  					dice2.setIcon(new ImageIcon("dice4.png"));	
	  					
	  				}
	  				if(roll2==5)
	  				{
	  					dice2.setIcon(new ImageIcon("dice5.png"));	
	  					
	  				}
	  				else if(roll2==6)
	  				{
	  					dice2.setIcon(new ImageIcon("dice6.png"));	
	  					
	  				}
	  		}//end win output
	  		else
	  		{
	  			JOptionPane.showMessageDialog(null,"You rolled a: " + roll1 + " and Your Opponent rolled a " + roll2 + " \nWould you look at that you Drew ");
	  			draw++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			//draw output
	  				if(roll1==1)
	  				{
	  					dice1.setIcon(new ImageIcon("dice1.png"));	
	  					
	  				}
	  				else if(roll1==2)
	  				{
	  					dice1.setIcon(new ImageIcon("dice2.png"));	
	  					
	  				}
	  				if(roll1==3)
	  				{
	  					dice1.setIcon(new ImageIcon("dice3.png"));	
	  					
	  				}
	  				else if(roll1==4)
	  				{
	  					dice1.setIcon(new ImageIcon("dice4.png"));	
	  					
	  				}
	  				if(roll1==5)
	  				{
	  					dice1.setIcon(new ImageIcon("dice5.png"));	
	  					
	  				}
	  				else if(roll1==6)
	  				{
	  					dice1.setIcon(new ImageIcon("dice6.png"));	
	  					
	  				}
	  					if(roll2==1)
	  				{
	  					dice2.setIcon(new ImageIcon("dice1.png"));	
	  					
	  				}
	  				else if(roll2==2)
	  				{
	  					dice2.setIcon(new ImageIcon("dice2.png"));	
	  					
	  				}
	  				if(roll2==3)
	  				{
	  					dice2.setIcon(new ImageIcon("dice3.png"));	
	  					
	  				}
	  				else if(roll2==4)
	  				{
	  					dice2.setIcon(new ImageIcon("dice4.png"));	
	  					
	  				}
	  				if(roll2==5)
	  				{
	  					dice2.setIcon(new ImageIcon("dice5.png"));	
	  					
	  				}
	  				else if(roll2==6)
	  				{
	  					dice2.setIcon(new ImageIcon("dice6.png"));	
	  					
	  				}
	  		}//end draw output
	  		
	  		
	  	}//end of listener
    }
    
  } 
  	
