
public class Student {
	private String name;
	private int age;
	private String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	public static boolean hasSameMajor(String major1, String major2) {
		return major1.equals(major2);
	}
	
	public static double avgAge(Student[] students) {
		double sum = 0;
		for (int i=0; i < students.length; i++) {
			sum += students[i].age;
		}
		return sum/students.length;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		String result = name + ": "+ age + ", " + major;
		return result;
	}
	public static void main(String[] args) {
		
		Student[] students = new Student[5];
		students[0] = new Student("John", 20, "English");
		students[1] = new Student("Robert", 22, "Physics");
		
		//creating more Student object to show some of the functions I have created
		students[2] = new Student("Kevin", 25, "Computer Science");
		students[3] = new Student("Anna", 22, "Computer Science");
		students[4] = new Student("Lisa", 29, "Law");
		
		double avAge = Student.avgAge(students);
		System.out.println("The average age of this student batch is: " + avAge);
		
		System.out.println("Kevin and Anna has the same major? :" + Student.hasSameMajor(students[2].getMajor(), students[3].getMajor()));
		
		System.out.println("Kevin and Lisa has the same major? :" + Student.hasSameMajor(students[2].getMajor(), students[4].getMajor()));
		
	}
}
