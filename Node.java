
public class Node extends Outfit {
	private Outfit data; 
	private Node next;
	
	
	public Node () {
		this.next = null;
	}
	
	public Node (Outfit data, Node next) {
		this.data = data; 
		this.next = null; 
	}
	
	
	//Accessors and Mutators
	public void setData(Outfit outfit) {
	}
	
	public Outfit getData() {
		return data;
	}
	
	public void setNext(Node nextItem) {
	}
	
	public Node getNext() {
		return next; 
	}
}
