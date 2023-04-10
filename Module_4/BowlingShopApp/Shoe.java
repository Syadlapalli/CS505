
public class Shoe extends Product{

	private double size;
	
	public Shoe() {
		this.size=0;
	}

	
	public double getSize() {
		return size;
	}

	
	public void setSize(double size) {
		this.size = size;
	}

	
	public String toString() {
		return "Product code:" + getCode() +  System.lineSeparator()+ "Description:" + getDescription() + System.lineSeparator()+"Price:$" + getPrice() + System.lineSeparator()+"Size:" + size;
		
	}
	
	
}
