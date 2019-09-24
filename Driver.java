
public class Driver {

	public static void main(String[] args) {
		linkedList list = new linkedList(); 
		
		list.addToBack(new Outfit(1, "Gucci"));
		list.addToBack(new Outfit(2, "Nike"));
		list.addToBack(new Outfit(3, "Puma"));
		list.addToBack(new Outfit(4, "Adidas"));
		list.addToBack(new Outfit(5, "Vans"));
		list.display();

		
	}

}
