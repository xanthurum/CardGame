
public class Node {

	private int num;
	private Node next;
	/**
	 * constructor for the Node class
	 * @param numb
	 * @param nex
	 */
	public Node(int numb, Node nex) 
	{
		num = numb;
		next = nex;
	}
	/**
	 * returns the integer data of the node
	 * @return int num
	 */
	public int getNum()
	{
		return num;
	}
	/**
	 * returns the next node
	 * @return Node next
	 */
	public Node getNext()
	{
		return next;
	}
	/**
	 * sets Node next
	 * @param nex
	 */
	public void setNext(Node nex)
	{
		next = nex;
	}
}
