import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardGame extends JFrame implements KeyListener
{
	Play game;
	private JTextField area;
	private JPanel panel;

	/**
	 * constructor for CardGame
	 * constructs a new game
	 * constructs a user interface with a key-listener
	 */
	public CardGame() 
	{
		game = new Play();
		
		panel = new JPanel();
		area = new JTextField(5);
		setVisible(true);
		setSize(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.add(area);
		add(panel);
		area.addKeyListener(this);			
	}

	/**
	 * main calls the CardGame constructor
	 * @param args
	 */
	public static void main(String[] args) 
	{
		new CardGame();
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		// TODO Auto-generated method stub	
	}

	/**
	 * waits for a key event
	 * "enter" key for manual playing
	 * "control" key for automatic playing
	 * @param e
	 */
	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
		{
			game.play();
		}
		else if(e.getKeyCode() == KeyEvent.VK_CONTROL)
		{
			while(true) game.play();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		// TODO Auto-generated method stub
	}
	
	
}
