public class Bag extends Product{

	private String type;
	
	public Bag() {
		this.type="";
	}

	
	public String getType() {
		return type;
	}

	
	public void setType(String type) {
		this.type = type;
	}

	
	
	public String toString() {
		return "Product code:" + getCode() +  System.lineSeparator()+ "Description:" + getDescription() + System.lineSeparator()+"Price:$" + getPrice() + System.lineSeparator()+"Type:" + type;
		
	}
	
}
