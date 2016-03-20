
public class Node {

	private int num;
	private Node next;
	
	public Node(int numb, Node nex) 
	{
		num = numb;
		next = nex;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public void setNext(Node nex)
	{
		next = nex;
	}
}
