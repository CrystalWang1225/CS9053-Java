package fruit;

public class Apple extends Fruit{
	private String taste;
	private String texture;
	
	public Apple() {
		
	}
	
	public Apple(String taste, String texture, String color, boolean rotten) {
		super(color, rotten);
		this.taste = taste;
		this.texture = texture;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}
	
	public String toString() {
		return "Apple[" + super.toString() + ", taste=" + this.taste + ", texture=" + this.texture + "]";
	}
	
	public boolean equals(Object o) {
		if (super.equals(o)) {
			if (o instanceof Apple) {
				Apple a1 = (Apple)o;
				
				if (this.taste.equals(a1.taste)) {
					if (this.texture.equals(a1.texture)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Apple apple1 = new Apple();
		System.out.println(apple1.toString());
		
		Apple apple2 = new Apple("sweet", "crispy", "red", false);
		System.out.println(apple2.toString());
		
		
	}
}
