package fruit;

public class Citrus extends Fruit{
	private String taste;
	
	public Citrus() {
		
	}
	
	public Citrus(String taste, String color, boolean rotten) {
		super(color, rotten);
		this.taste = taste;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public String toString() {
		return "Citrus[" + super.toString() + ", taste=" + this.taste + "]";
	}
	
	public boolean equals(Object o) {
		if (super.equals(o)) {
			if (o instanceof Citrus) {
				Citrus c1 = (Citrus)o;
				
				if (this.taste.equals(c1.taste)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main (String[] args) {
		Citrus citrus1 = new Citrus("bitter", "brown", true);
		System.out.println(citrus1.toString());
	}
}
