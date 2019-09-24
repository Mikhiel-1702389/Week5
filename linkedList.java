
public class linkedList {
	private Node head; 
	
	
	public linkedList() {
	}
	
	public linkedList(Node head) {	
	}
	
	boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}
	
	boolean isFull() {	
		//try to allocate memory 
		//if memory was successfully allocated
		//the address will be stored in temp
		Node temp = new Node(); 
		if (temp == null){
			return true; 
		}
		return false;	
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("List is empty.");
		} else {
			Node temp = head; 
			while (temp.getNext() != null) {
				temp.getData().display();
				temp = temp.getNext();
			}
		}
	}
	
	boolean addToBack(Outfit outfit) {
		if (isFull()) {
			System.out.println("The list is full. Unable to add"); 
		} else {
			Node nextItem = new Node(); 
			nextItem.setData(outfit);
			if(isEmpty()) {
				head = nextItem;
			} else {
				Node temp = head; 
				while (temp.getNext() != null) {
					temp = temp.getNext();
				}
				temp.setNext(nextItem);
			}

		}
		return false;
	}
}
