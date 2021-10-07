package fruit;

public class Lemon extends Citrus {
	private int sourness;
	
	public Lemon() {
		super.setColor("yellow");
	}
	
	public Lemon(int sourness, String taste, boolean rotten) {
		super(taste, "yellow", rotten);
		this.sourness = sourness;
	}

	public int getSourness() {
		return sourness;
	}

	public void setSourness(int sourness) {
		this.sourness = sourness;
	}
	
	public String toString() {
		return "Lemon[" + super.toString() + ", sourness=" + this.sourness + "]";
	}
	
	public boolean equals(Object o) {
		if (super.equals(o)) {
			if (o instanceof Lemon) {
				Lemon l1 = (Lemon)o;			
				if (this.sourness == l1.sourness) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main (String[] args) {
		Lemon lemon1 = new Lemon(5, "bitter", true);
		System.out.println(lemon1.toString());
		
		Lemon lemon2 = new Lemon();
		System.out.println(lemon2.toString());
		lemon2.setSourness(10);
		lemon2.setTaste("sweet and sour");
		System.out.println(lemon2.toString());
	}
}
