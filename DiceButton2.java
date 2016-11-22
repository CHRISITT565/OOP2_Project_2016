import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class DiceButton extends JFrame {
	JButton button;
  	public DiceButton() {
  		
  		
			super("Demonstrating a JButton inside a JFrame window");
			Container cPane = getContentPane();
			cPane.setLayout(new FlowLayout());
			setTitle("Dice Roll");
			setSize(500,400);
			setResizable (false);
			setLocation(550,450);
			
			cPane = getContentPane( );
			cPane.setBackground(Color.red);
        	cPane.setLayout(new FlowLayout());
		
			button = new JButton("Roll");
			cPane.add(button);	
			button.addActionListener(new ButtonListener());	
			setSize(275,170);			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	//public static void main(String args[]){
	//		DiceButton b = new DiceButton();
	//		b.setVisible(true);
	//	}
		
	private class ButtonListener implements ActionListener {
	  public void actionPerformed(ActionEvent e)
	  	{
	  		int roll1;
	  		int roll2;
	  		
	  		roll1= (int)(Math.random()*6+1);
	  		roll2= (int)(Math.random()*6+1);
	  		
	  		if (roll1 > roll2)
	  		{
	  		
	  		JOptionPane.showMessageDialog(null,"You rolled a: " + roll1 + " and Your Opponent rolled a " + roll2 + " \nCongradulations You Won");
	  		}
	  		
	  		else if (roll1<roll2)
	  		{
	  		
	  		JOptionPane.showMessageDialog(null,"You rolled a: " + roll1 + " and Your Opponent rolled a " + roll2 + " \nSorry You Lost");
	  		}
	  		else
	  		{
	  			JOptionPane.showMessageDialog(null,"You rolled a: " + roll1 + " and Your Opponent rolled a " + roll2 + " \nWould you look at that you Drew");
	  		}
	  	}
    }
    
  } 
