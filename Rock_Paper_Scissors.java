import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Rock_Paper_Scissors  extends JFrame {
	JLabel player1,player2,player1text,player2text,score;
	int win=0, loss=0, draw=0;
	
    public Rock_Paper_Scissors() {
		super("Rock Paper Scissors game");
		Container cPane = getContentPane();
		cPane.setLayout(null);
			setTitle("Dice Roll");
			setSize(600,450);
			setResizable (false);
			setLocation(250,450);
			cPane.setBackground(Color.red);
		
		JButton Rockbutton = new JButton("Rock");
		Rockbutton.addActionListener(new ButtonListener1());	
		Rockbutton.setBounds(100,10,150,60);
		cPane.add(Rockbutton);			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton Paperbutton = new JButton("Paper");
		Paperbutton.addActionListener(new ButtonListener2());		
		Paperbutton.setBounds(250,10,150,60);
		cPane.add(Paperbutton);			
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
			
		JButton Scissorsbutton = new JButton("Scissors");
		Scissorsbutton.addActionListener(new ButtonListener3());
		Scissorsbutton.setBounds(400,10,150,60);
		cPane.add(Scissorsbutton);			
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
		
		 player1 = new JLabel();
			player1.setIcon(new ImageIcon("rock.jpg"));
			player1.setBounds(100,80,100,100);
			
		 player1text = new JLabel("Player1");
		 player1text.setBounds(100,150,100,100);
		
		 
		 player2text = new JLabel("Player2");
		 player2text.setBounds(450,150,100,100);
		
		
			player2 = new JLabel();
			player2.setIcon(new ImageIcon("rock.jpg"));
		
			player2.setBounds(450,80,100,100);
			cPane.add(player1text);
			cPane.add(player2text);
			cPane.add(player1);
			cPane.add(player2);
			
			
			score = new JLabel("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
			score.setBounds(200,200,200,200);
			cPane.add(score);
			
		}	
			
			

		
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
	  			player1.setIcon(new ImageIcon("rock.jpg"));
	  			player2.setIcon(new ImageIcon("rock.jpg"));
	  		}
	  		else if(opponent==2)
	  		{
	  			loss++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Rock and your opponent picked Paper \nSorry You Lost");
	  			player1.setIcon(new ImageIcon("rock.jpg"));
	  			player2.setIcon(new ImageIcon("paper.jpg"));
	  		}
	  		if(opponent==3)
	  		{
	  			win++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Rock and your opponent picked Scissors \nCongradulations You Won");
	  			player1.setIcon(new ImageIcon("rock.jpg"));
	  			player2.setIcon(new ImageIcon("scissors.png"));
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
	  			player1.setIcon(new ImageIcon("paper.jpg"));
	  			player2.setIcon(new ImageIcon("rock.jpg"));
	  			
	  		}
	  		else if(opponent==2)
	  		{
	  			draw++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Paper and your opponent picked Paper \nWould you look at that you Drew ");
	  			player1.setIcon(new ImageIcon("paper.jpg"));
	  			player2.setIcon(new ImageIcon("paper.jpg"));
	  		}
	  		if(opponent==3)
	  		{
	  			loss++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Paper and your opponent picked Scissors \nSorry You Lost ");
	  			player1.setIcon(new ImageIcon("paper.jpg"));
	  			player2.setIcon(new ImageIcon("scissors.png"));
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
	  			player1.setIcon(new ImageIcon("scissors.png"));
	  			player2.setIcon(new ImageIcon("rock.jpg"));
	  		}
	  		else if(opponent==2)
	  		{
	  			win++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Scissors and your opponent picked Paper \nCongradulations You Won");
	  			player1.setIcon(new ImageIcon("scissors.png"));
	  			player2.setIcon(new ImageIcon("paper.jpg"));
	  		}
	  		if(opponent==3)
	  		{
	  			draw++;
	  			score.setText("Score" + " Win: " + win + " Loss: " + loss + " Draw: " + draw);
	  			JOptionPane.showMessageDialog(null,"You picked: Scissors and your opponent picked Scissors \nWould you look at that you Drew ");
	  			player1.setIcon(new ImageIcon("scissors.png"));
	  			player2.setIcon(new ImageIcon("scissors.png"));
	  		}
	  		
	  	}
	  		
	  }
    }
    
 



