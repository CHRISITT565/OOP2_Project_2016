
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener{
	JMenu gameMenu;
	JLabel response;
	
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
        	item.addActionListener(this);
        	gameMenu.add(item);
     		 item = new JMenuItem("Rock Paper Scissors");
        	item.addActionListener(this);
        	gameMenu.add(item);
	} 
		public void actionPerformed(ActionEvent event) {
        String  menuName;
        String responce;
        menuName = event.getActionCommand(); // what's written on the item that was clicked
        // note the String comparison
        if (menuName.equals("Dice")) {
           System.out.println("action Dice");
        } // end else 
        
        else if (menuName.equals("Rock Paper Scissors")) {
           System.out.println("action Rock Paper Scissors");
        } // end else 
        
    
        else  {
           System.exit(0);
        } // end else 
       
        JOptionPane.showMessageDialog(null,response);
    } // end actionPerformend
		
}