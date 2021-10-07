import java.io.*;
import java.util.ArrayList;

import shapes.*;

/* your tasks:
 * create a class called ShapeException
 * createShape should throw a ShapeException
 * in main(), you should catch the ShapeException
 * 
 */
public class ReadShapeFile {

	public static GeometricObject createShape(String shapeName) throws ShapeException{
		
		/* if shapeName is "Circle" return Circle();
		 * if shapeName is "Square" return Square();
		 * if shapeName is "Rectangle" return Rectangle();
		 * if it is not any one of these, it should throw
		 * a ShapeException
		 */
		if (shapeName.equals("Circle")) {
			return new Circle();
		} else if (shapeName.equals("Square")) {
			return new Square();
		} else if (shapeName.equals("Rectangle")) {
			return new Rectangle();
		}else {
			throw new ShapeException(shapeName);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<GeometricObject> shapeList = new ArrayList<GeometricObject>();
		File f = new File("shapes.txt");
		
		String inString = null;
		
		/* create a loop to read the file line-by-line */
		FileReader fr = null;
		try {
			fr = new FileReader(f);
			BufferedReader in = new BufferedReader(fr);
			String linea = null;
			linea = in.readLine();
			while (linea != null) {
				inString = linea;
				try {
					GeometricObject shape = createShape(inString);
					shapeList.add(shape);
				} catch (ShapeException e ) {
					System.err.println("Cannot create shape: " + inString);
					System.err.println("Caught ShapeException: " + e.getMessage());
				}
				finally {
					linea = in.readLine();
				}
			}
		} catch (FileNotFoundException fne) {
			System.out.println("File not found: "+ fne.getMessage());
		} catch (IOException e) {
			System.out.println("IO error reading file: " + e.getMessage());
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					System.out.println("error closing file : "+ e.getMessage());
				} 
			}
		}

		System.out.println(shapeList);
		
	}
}
