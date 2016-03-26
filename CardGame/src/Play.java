
public class Play 
{
	private Deck deckA,deckB;
	/**
	 * constructor for the Play class
	 * includes a first print to the console as a start
	 */
	public Play()
	{
		deckA = new Deck();
		deckB = new Deck();
		print();		
	}
	/**
	 * compares both playing cards
	 * moves the cards to the loser
	 * uses at the start printF and at the end print()
	 */
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
			deckB.add(deckB.firstNum());
			deckB.add(deckA.firstNum());
			deckA.delete();
			deckB.delete();
			ifGameOver();
			print();
		}
	}
	/**
	 * prints both deck of cards
	 */
	private void print()
	{
		System.out.print("deck A : ");
		deckA.print();
		System.out.print("deck B : ");
		deckB.print();
	}
	/**
	 * prints the playing numbers
	 */
	private void printF()
	{
		System.out.println("deck A : " + deckA.firstNum() + " versus " +"deck B : " + deckB.firstNum());
	}
	/**
	 * testing if the game is over
	 * if so, the program is ended
	 */
	private void ifGameOver()
	{
		if(deckA.size() == 0 || deckB.size() == 0)
		{
			System.out.println("		GAME  OVER		");
			System.exit(0);
		}
	}

}
