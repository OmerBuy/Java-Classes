package day44_oopPractice.shapes;

public class Diamond extends Shape {

	public Diamond() {
		type = "diamond";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a diamond");
	}
	
}
