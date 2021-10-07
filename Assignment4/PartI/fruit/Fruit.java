package fruit;


public class Fruit {
	private String color;
	private boolean rotten;
	private static int next_id = 0;
	private int id;
	
	public Fruit() {
		this.id = next_id;
		next_id++;
	}
	
	public Fruit(String color, boolean rotten) {
		this();
		this.color = color;
		this.rotten = rotten;
		this.id = next_id;
		next_id++;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isRotten() {
		return rotten;
	}

	public void setRotten(boolean rotten) {
		this.rotten = rotten;
	}

	public int getId() {
		return id;
	}
	
	public String toString() {
		return "Fruit[id=" + this.id + ", color=" + this.color + ", rotten=" + this.rotten + "]";
	}
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} else {
		if (o instanceof Fruit) {
			Fruit f1 = (Fruit)o;
			if ((this.color == null && f1.color == null) || ((this.color != null) && (this.color.equals(f1.color)))){
				if (this.rotten == f1.rotten) {
					return true;
				}
			}
		}
	}
		return false;
	}
	
	
	public static void main (String[] args) {
	
		Fruit fruitTest1 = new Fruit();
		System.out.println(fruitTest1.toString());
		fruitTest1.setColor("red");
		fruitTest1.setRotten(false);
		System.out.println(fruitTest1.toString());
		System.out.println("fruitTest1 color is " + fruitTest1.getColor());
		System.out.println("fruitTest rotten is " + fruitTest1.isRotten());
		
		Fruit fruitTest2 = new Fruit("pink", true);
		System.out.println(fruitTest2.toString());
	}
	
}
