import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Rock_Paper_Scissors  extends JFrame {
	JLabel Player1,Player1,score;
	int win=0, loss=0, draw=0;
	
    public Rock_Paper_Scissors() {
		super("Rock Paper Scissors game");
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		JButton Rockbutton = new JButton("Rock");
		cPane.add(Rockbutton);	
		Rockbutton.addActionListener(new ButtonListener1());	
		setSize(275,170);
		
		JButton Paperbutton = new JButton("Paper");
		cPane.add(Paperbutton);	
		Paperbutton.addActionListener(new ButtonListener2());		
		setSize(275,170);		
			
		JButton Scissorsbutton = new JButton("Scissors");
		cPane.add(Scissorsbutton);	
		Scissorsbutton.addActionListener(new ButtonListener3());	
		setSize(275,170);					
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		
		
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
			
			
			

		
	private class ButtonListener1 implements ActionListener {
	  public void actionPerformed(ActionEvent e)
	  	{
	  	    
	  		int opponent;
	  		opponent=(int)(Math.random()*3+1);
	  		
	  		if(opponent==1)
	  		{
	  			draw++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Rock and your opponent picked Rock \nWould you look at that you Drew");
	  		}
	  		else if(opponent==2)
	  		{
	  			loss++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Rock and your opponent picked Paper \nSorry You Lost");
	  		}
	  		if(opponent==3)
	  		{
	  			win++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Rock and your opponent picked Scissors \nCongradulations You Won");
	  		}
	  		
	  	}
	}
	 private class ButtonListener2 implements ActionListener {
	  public void actionPerformed(ActionEvent e)
	  	{
	  	    
	  		int opponent;
	  		opponent=(int)(Math.random()*3+1);
	  		
	  		if(opponent==1)
	  		{
	  			win++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Paper and your opponent picked Rock \nCongradulations You Won ");
	  			
	  		}
	  		else if(opponent==2)
	  		{
	  			draw++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Paper and your opponent picked Paper \nWould you look at that you Drew ");
	  		}
	  		if(opponent==3)
	  		{
	  			loss++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Paper and your opponent picked Scissors \nSorry You Lost ");
	  		}
	  	}
	 }
	  		
	  private class ButtonListener3 implements ActionListener {
	  public void actionPerformed(ActionEvent e)
	  	{
	  	    
	  		int opponent;
	  		opponent=(int)(Math.random()*3+1);
	  		
	  		if(opponent==1)
	  		{
	  			loss++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Scissors and your opponent picked Rock \nSorry You Lost");
	  		}
	  		else if(opponent==2)
	  		{
	  			win++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Scissors and your opponent picked Paper \nCongradulations You Won");
	  		}
	  		if(opponent==3)
	  		{
	  			draw++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Scissors and your opponent picked Scissors \nWould you look at that you Drew ");
	  		}
	  		
	  	}
	  		
	  }
    }
    
 



