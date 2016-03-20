import java.util.Random;

public class Deck {

	private Node first, last;
	private int size;
	
	public Deck() 
	{
		fill();
	}

	private int random()
	{
		Random random = new Random();
		int ran = random.nextInt(13);
		return ran;
	}
	
	private void print(int[] array)
	{
		for(int i = 0; i < 13; i++)
		{
			System.out.print(" " + array[i]);
		}
	}
	
	
	
	public void fill()
	{
		int[] array = new int[13];
		int ran = 0;
		
		for(int i = 1; i < 14; i++)
		{
			ran = random();
			
			if(array[ran] == 0 && !check(i, array))
			{
				array[ran] = i;
			}
			else i--;
		}
		print(array);
	}
	
	private boolean check(int x,int[] array)
	{
		boolean result = false;
		for(int i = 0; i < 13; i++)
		{
			if(array[i] == x)
			{
				result = true;
			}
		}
		return result;		
	}
}