import java.util.Random;

public class Deck {

	private Node first, last;
	private int size;
	/**
	 * constructor for the Deck class
	 * which is a linked list
	 */
	public Deck() 
	{
		last = new Node(0,null);
		fill();
	}
	/**
	 * returns a random number between 0 and 12
	 * @return random number
	 */
	private int random()
	{
		Random random = new Random();
		int ran = random.nextInt(13);
		return ran;
	}
	/**
	 * prints the Deck with spaces and starts a new line
	 */
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
	/**
	 * makes a deck of cards while filling it randomly
	 * the used array is local so better use of memory
	 */
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
	/**
	 * this method prevents the double use of a random number
	 * @param x
	 * @param array
	 * @return boolean
	 */
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
	/**
	 * adds a Node at the rear of the list
	 * @param num
	 */
	public void add(int num)
	{
		Node temp = new Node(num, null);
		last.setNext(temp);
		last = temp;
		size++;
	}
	/**
	 * deletes a Node from the top of the list
	 */
	public void delete()
	{
		Node temp = first.getNext();
		first.setNext(null);
	    first = temp;
	    size--;
	}	
	/**
	 * returns the int data from the first Node in the list
	 * @return Node num
	 */
	public int firstNum()
	{
		return first.getNum();
	}
	/**
	 * returns the size of the list
	 * @return size
	 */
	public int size()
	{
		return size;
	}

}