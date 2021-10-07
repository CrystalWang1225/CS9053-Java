package fruit;

public class Inheritance {

	public static void main(String[] args) {
		// Here's some scratch space to experiment/debug your Fruit objects
		Fruit fruitTest1 = new Fruit();
		System.out.println(fruitTest1.toString());
		fruitTest1.setColor("red");
		fruitTest1.setRotten(false);
		System.out.println(fruitTest1.toString());
		System.out.println("fruitTest1 color is " + fruitTest1.getColor());
		System.out.println("fruitTest rotten is " + fruitTest1.isRotten());
		
		Fruit fruitTest2 = new Fruit("pink", true);
		System.out.println(fruitTest2.toString());
		
		Apple apple1 = new Apple();
		System.out.println(apple1.toString());
		
		Apple apple2 = new Apple("sweet", "crispy", "red", false);
		System.out.println(apple2.toString());
		
		Citrus citrus1 = new Citrus("bitter", "brown", true);
		System.out.println(citrus1.toString());
		
		Orange orange1 = new Orange("mandarin", "bitter", true);
		System.out.println(orange1.toString());
		
		Orange orange2 = new Orange();
		System.out.println(orange2.toString());
		orange2.setType("tangerine");
		orange2.setTaste("sour");
		System.out.println(orange2.toString());
		
		Orange orange3 = new Orange();
		System.out.println(orange3.toString());
		
		Lemon lemon1 = new Lemon(5, "bitter", true);
		System.out.println(lemon1.toString());
		
		Lemon lemon2 = new Lemon();
		System.out.println(lemon2.toString());
		lemon2.setSourness(10);
		lemon2.setTaste("sweet and sour");
		System.out.println(lemon2.toString());
	}

}
