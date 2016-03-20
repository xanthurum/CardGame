import java.util.Random;

public class Deck {

	private Node first, last;
	private int size;
	
	public Deck() 
	{
		last = new Node(0,null);
		fill();
	}

	private int random()
	{
		Random random = new Random();
		int ran = random.nextInt(13);
		return ran;
	}
	
	public void print()
	{
		Node temp = first;
		while(temp != null)
		{
			System.out.print(temp.getNum() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	private void fill()
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
		
		for(int i = 0; i < 13; i++)
		{
			//Node temp = null;
			
			if(i == 0) 
				{
					first = new Node(array[i], null);
					last = first;
					size++;
				}
			else
				{
					add(array[i]);
				}
		}
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
	
	public void add(int num)
	{
		Node temp = new Node(num, null);
		last.setNext(temp);
		last = temp;
		size++;
	}
	
	public void delete()
	{
		Node temp = first.getNext();
		first.setNext(null);
	    first = temp;
	    size--;
	}	
	
	public int firstNum()
	{
		return first.getNum();
	}

}