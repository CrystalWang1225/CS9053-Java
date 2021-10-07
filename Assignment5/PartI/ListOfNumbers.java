import java.io.*;
import java.util.List;
import java.util.ArrayList;
 
public class ListOfNumbers {
	
    private List<Integer> list;
    private String inFile;
 
    public ListOfNumbers () {
        list = new ArrayList<Integer>();
    }
    

    public ListOfNumbers (String inFile) {
    	this();
    	this.inFile = inFile;	
    }
    
    public void readList() {
    	File f= new File("numberfile.txt");
    	FileReader fr = null;
    	try {
    		fr = new FileReader(f);
    		BufferedReader in = new BufferedReader(fr);
    		String linea = null;
    		linea = in.readLine();
    		while (linea != null) {
    			// System.out.println(Integer.parseInt(linea));
    			this.list.add(Integer.parseInt(linea));
    			linea = in.readLine();
    		}
    		
    		System.out.println("done reading in data");
    		
    	}catch (FileNotFoundException fne) {
			System.out.println("File not found: "+ fne.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO error reading file: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("array index out of bounds");
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					System.out.println("error closing file : "+ e.getMessage());
				} 
			}
		}
				
    }
    
    public void writeList() {
        PrintWriter out = null;
        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("outFile.txt"));
            for (int i = 0; i < list.size(); i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
    
    public static void cat(String fileName) {
        RandomAccessFile input = null;
        String line = null;
        File file = new File(fileName);
        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException e) {
        	System.out.println("File not found: "+ e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
			e.printStackTrace();
			
		} finally {
            if (input != null) {
                try {
					input.close();
				} catch (IOException e) {
					System.err.println("Caught IOException: " + e.getMessage());
					e.printStackTrace();
				}
            }
        }
    }
    
    public static void main(String[] args) {
    	ListOfNumbers listOfNumbers = new ListOfNumbers("numberfile.txt");
    	ListOfNumbers.cat("numberfile.txt");
    	listOfNumbers.readList();
    	listOfNumbers.writeList();
    }

}
