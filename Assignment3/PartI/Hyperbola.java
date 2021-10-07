
public class Hyperbola {
	private static int nextId = 0;
	private int id;
	private double vertex = 1.0;
	private double covertex = 1.0;
	
	public Hyperbola() {
		id = Hyperbola.nextId;
		Hyperbola.nextId++;
	}
	
	public Hyperbola(double vertex, double covertex) {
		this.vertex = vertex;
		this.covertex = covertex;
		id = Hyperbola.nextId;
		Hyperbola.nextId++;
	}
	
	
	public int getId() {
		return id;
	}

	public double getVertex() {
		return vertex;
	}

	public void setVertex(double vertex) {
		this.vertex = vertex;
	}

	public double getCovertex() {
		return covertex;
	}

	public void setCovertex(double covertex) {
		this.covertex = covertex;
	}
	
	public double getFocusSquared() {
		return (vertex * vertex) + (covertex * covertex);
	}
	
	//For debugging purposes
	public static void main(String[] args) {
		
		Hyperbola hype1 = new Hyperbola();
		System.out.println("Hyperbola1's vertex is " + hype1.vertex + "covertext is " + hype1.covertex);
		System.out.println("Focuse squared value: " + hype1.getFocusSquared());
		
		System.out.println();
		Hyperbola hype2 = new Hyperbola(2.0,3.0);
		System.out.println("Hyperbola2's vertex is " + hype2.vertex + "covertext is " + hype2.covertex);
		System.out.println("Focuse squared value: " + hype2.getFocusSquared());
	}
}
