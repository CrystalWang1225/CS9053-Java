package fruit;

public class Orange extends Citrus{
	private String type;
	
	public Orange() {
		super.setColor("orange");
	}
	
	public Orange(String type, String taste, boolean rotten) {
		super(taste, "orange", rotten);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String toString() {
		return "Orange[" + super.toString() + ", type=" + this.type + "]";
	}
	
	public boolean equals(Object o) {
		if (super.equals(o)) {
			if (o instanceof Orange) {
				Orange c1 = (Orange)o;			
				if (this.type.equals(c1.type)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main (String[] args) {
		Orange orange1 = new Orange("mandarin", "bitter", true);
		System.out.println(orange1.toString());
		
		Orange orange2 = new Orange();
		System.out.println(orange2.toString());
		orange2.setType("tangerine");
		orange2.setTaste("sour");
		System.out.println(orange2.toString());
		
		Orange orange3 = new Orange();
		System.out.println(orange3.toString());
	}
}
