import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardGame extends JFrame implements KeyListener
{
	Deck deckA, deckB;
	private JTextField area;
	private JPanel panel;
	private JFrame frame;

	public CardGame() 
	{
		deckA = new Deck();
		deckB = new Deck();
		print();
		
		panel = new JPanel();
		frame = new JFrame();
		area = new JTextField(5);
		setVisible(true);
		setSize(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.add(area);
		add(panel);
		area.addKeyListener(this);			
	}

	public static void main(String[] args) 
	{
		new CardGame();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
		{
			play();
		}
		else if(e.getKeyCode() == KeyEvent.VK_WINDOWS)
		{
			while(true) play();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void play()
	{
		printF();
		
		if(deckA.firstNum() < deckB.firstNum())
		{
			deckA.add(deckA.firstNum());
			deckA.add(deckB.firstNum());
			deckA.delete();
			deckB.delete();
			ifGameOver();
			print();
		}
		else
		{
			deckB.add(deckA.firstNum());
			deckB.add(deckB.firstNum());
			deckA.delete();
			deckB.delete();
			ifGameOver();
			print();
		}
	}
	public void print()
	{
		System.out.print("deck A : ");
		deckA.print();
		System.out.print("deck B : ");
		deckB.print();
	}
	
	public void printF()
	{
		System.out.println("deck A : " + deckA.firstNum() + " versus " +"deck B : " + deckB.firstNum());
	}
	
	public void ifGameOver()
	{
		if(deckA.size() == 0 || deckB.size() == 0)
		{
			System.out.println("		GAME  OVER		");
			System.exit(0);
		}
	}

}
