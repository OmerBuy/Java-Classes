package day16_classObjects;

public class Employee {
	
	String name;
	String jobTitle;
	double salary;

	public void work() {
		System.out.println(name + "is working hard...");
	}

	public void attendMeeting() {
		System.out.println(name+"is attending meeting...");
	}

	public void introduce() {
		System.out.println("Name:"+name+"JobTitle:"+jobTitle+"Salary:"+salary);
	}
}
