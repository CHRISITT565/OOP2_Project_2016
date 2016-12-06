
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener{
	JMenu gameMenu;
	JLabel response,logo;
	JButton jb;
	public static void main(String args[]){
		MainWindow win = new MainWindow();
		win.setVisible(true);
	} 

    public MainWindow() {
    	// frame Properties
    		Container cPane;
    	
    		setTitle("OOP ARCADE");
			setSize(900,600);
			setResizable (false);
			setLocation(250,200);
			
			// shut down the program when the window is closed
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			cPane = getContentPane( );
			cPane.setBackground(new Color(252, 195, 37));
        	cPane.setLayout(new FlowLayout());
        	
        	//create menue bar and list
        	//createGameMenu();
        	
        	
        	JMenuBar menuBar = new JMenuBar();
        	setJMenuBar(menuBar);
        	menuBar.setBackground(Color.red);
        	gameMenu= new JMenu("Game");
        	gameMenu.addActionListener(this);
        	menuBar.add(gameMenu);
        	JMenuItem item = new JMenuItem("Dice");
        	item.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent event) {
        
            DiceButton db = new DiceButton();
            db.setVisible(true);
           setDefaultCloseOperation(EXIT_ON_CLOSE); 
        	}//end action performed 
        	});
        	gameMenu.add(item);
     		 item = new JMenuItem("Rock Paper Scissors");
        	item.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent event) {
        
            Rock_Paper_Scissors rps = new Rock_Paper_Scissors();
            rps.setVisible(true);
           setDefaultCloseOperation(EXIT_ON_CLOSE); 
        	}//end action performed 
        	});
        	gameMenu.add(item);
        	item = new JMenuItem("Quit");
        	item.addActionListener(this);
        	gameMenu.add(item);
        	
        	//jb = new JButton("Play Dice");
        	//jb.addActionListener(this);
        	//cPane.add(jb);
        	
        	logo = new JLabel();
			logo.setIcon(new ImageIcon("GAMEZONE.png"));
			logo.setBounds(20,100,500,400);
			cPane.add(logo);
        	
	} 
		public void actionPerformed(ActionEvent event) {
        String  menuName;
        String responce;
        menuName = event.getActionCommand(); // what's written on the item that was clicked
        // note the String comparison
        if (menuName.equals("Dice")) {
            DiceButton db = new DiceButton();
            db.setVisible(true);
           setDefaultCloseOperation(EXIT_ON_CLOSE); 
        } // end else 
        
       // else if (event.getSource()==jb) {
       //     DiceButton db = new DiceButton();
      //      db.setVisible(true);
      //  } // end else 
        
        
        else if (menuName.equals("Rock Paper Scissors")) {
           System.out.println("action Rock Paper Scissors");
        } // end else 
        
        if (menuName.equals("Quit")) {
           System.exit(0);
        }
    
        else  {
           System.exit(0);
        } // end else 
       
       // JOptionPane.showMessageDialog(null,response);
    } // end actionPerformend
		
}