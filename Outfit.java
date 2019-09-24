
public class Outfit {
	private int id; 
	private String designer; 
	
	
	public Outfit (){
		this.id = 0;
		this.designer = ""; 
	}
	
	public Outfit (int id, String designer) {
		this.id = id; 
		this.designer = designer; 
	}

	public int getId() {
		return id;
	}
	
	public void setId() {
	}
	
	public String getDesigner() {
		return designer;
	}
	
	public void setDesigner() {
	}

	public void display() {
	}
}
