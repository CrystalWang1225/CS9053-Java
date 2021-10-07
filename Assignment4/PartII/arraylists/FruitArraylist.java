package arraylists;
import java.util.ArrayList;

import fruit.*;

public class FruitArraylist {

	public static void main(String[] args) {
		
		// this ArrayList MUST be parameterized
		ArrayList<Fruit> fruitArrayList = new ArrayList<Fruit>();
		
		//Part a
		Fruit f1 = new Apple("sweet","crispy","red",false);
		Fruit f2 = new Apple("tart", "soft", "green", true);
		Fruit f3 = new Apple("tart", "soft", "green", true);
		Fruit f4 = new Lemon((int)(Math.random()*100), "sour", false);
		Fruit f5 = new Lemon((int)(Math.random()*100), "sour", false);
		Fruit f6 = new Lemon((int)(Math.random()*100), "sour", false);
		Fruit f7 = new Orange("mandarin", "sweet", true);
		Fruit f8 = new Orange("mandarin", "sweet", true);
		
		fruitArrayList.add (f1);
		fruitArrayList.add (f2);
		fruitArrayList.add (f3);
		fruitArrayList.add (f4);
		fruitArrayList.add (f5);
		fruitArrayList.add (f6);
		fruitArrayList.add (f7);
		fruitArrayList.add (f8);
		
		//Part b
		int lemonCount = 0;
		double sum = 0;
		for (int i = 0; i < fruitArrayList.size(); i++) {
			if (fruitArrayList.get(i) instanceof Lemon) {
				Lemon l = (Lemon)fruitArrayList.get(i);
				System.out.println(l.toString());
				lemonCount++;
				sum += l.getSourness();
			}
		}
		sum = sum/lemonCount;
		System.out.println("The average sourness of all the Lemon bojects in the Arraylist is " + sum);
		System.out.println();
		
		//Part c & part d
		// this is the variable you should retain to compare
		// to the other objects in the arraylist
		Apple rottenGreenApple1 = (Apple)f2;
		for (int i = fruitArrayList.size() - 1; i>=0 ; --i) {
			if (fruitArrayList.get(i) instanceof Apple) {
				Apple a = (Apple)fruitArrayList.get(i);
				if (a == rottenGreenApple1) {
					System.out.println("Apples that are the same object is : ");
					System.out.println(a.toString());
				}
				
				if (a.equals(rottenGreenApple1)) {
					System.out.println("Apples with equal value is : ");
					System.out.println(a.toString());
					fruitArrayList.remove(i);
				}
			}
		}
		for (int i = 0; i < fruitArrayList.size(); i++) {
			System.out.println(fruitArrayList.get(i));
		}
	}
}
