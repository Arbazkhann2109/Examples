package beans;

public class Student1 {

	private int id;
	private String name;
	public Student1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void show() {
		System.out.println("Student ID = "+id+" & Name is "+name);
		
	}

	
	
}