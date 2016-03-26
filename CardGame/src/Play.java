
public class Play 
{
	private Deck deckA,deckB;
	
	public Play()
	{
		deckA = new Deck();
		deckB = new Deck();
		print();		
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
			deckB.add(deckB.firstNum());
			deckB.add(deckA.firstNum());
			deckA.delete();
			deckB.delete();
			ifGameOver();
			print();
		}
	}
	private void print()
	{
		System.out.print("deck A : ");
		deckA.print();
		System.out.print("deck B : ");
		deckB.print();
	}
	
	private void printF()
	{
		System.out.println("deck A : " + deckA.firstNum() + " versus " +"deck B : " + deckB.firstNum());
	}
	
	private void ifGameOver()
	{
		if(deckA.size() == 0 || deckB.size() == 0)
		{
			System.out.println("		GAME  OVER		");
			System.exit(0);
		}
	}

}
