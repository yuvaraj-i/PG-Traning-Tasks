package assignments;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
	private String name;
	private int rolNo;
	private int age;
	private float marks;
	
	Student (String name, int rolNo, int age, float marks) {
		this.name = name;
		this.rolNo = rolNo;
		this.age = age;
		this.marks = marks;	
	}

	public String getName() {
		return this.name;
	}

	public int getRolNo() {
		return this.rolNo;
	}

	public int getAge() {
		return this.age;
	}

	public float getMarks() {
		return this.marks;
	}
}

class FileExitsException extends Exception{
	
	public FileExitsException() {
		super();
	}
}

public class StudentFile {

	public static void main(String[] args) throws IOException{
		
		Student[] details = new Student[1];
		
		details[0] = new Student("Raj", 12, 10, 56);
		
		
		try {
			FileWriter f = new FileWriter("C:\\My Files\\Notes\\external.txt");
			File r = new File("C:\\My Files\\Notes\\external.txt");
			Scanner reader = new Scanner(r);
			
			for(Student s: details) {
				f.write("name: " + s.getName());
				f.write("\nrollNo: " + s.getRolNo());
				f.write("\nAge: " + s.getAge());
				f.write("\nMarks: " + s.getMarks());
			}
			
			f.close();
			while (reader.hasNextLine()) {
		        String data = reader.nextLine();
		        System.out.println(data);
		      }
			reader.close();
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
	}

}
