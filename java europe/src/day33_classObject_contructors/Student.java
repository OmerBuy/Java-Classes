package day33_classObject_contructors;

public class Student {

	String name;
	int age;
	String gender;
	int year;
	String course;
	String university = "Cybertek";
	
	
	public Student(String name, int age, String gender, int year, String course) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}

	public void attendLecture() {
		System.out.println(name+ " is attending lecture");
	}
	public void submitAssingment() {
		System.out.println(name+ " is attending assignment");
	}
	public void attendLab() {
		System.out.println(name+ " is attending lab");
	}
}
