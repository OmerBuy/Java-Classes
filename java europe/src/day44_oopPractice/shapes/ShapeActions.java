package day44_oopPractice.shapes;

import static day44_oopPractice.shapes.ShapeManager.*;

public class ShapeActions {

	public static void main(String[] args) {

//		Square mySquare = new Square();
//		drawSquare(mySquare);
//		
//		String type = "square";
//		
//		drawSquare(mySquare);
		drawSquare((Square)buildShape("square"));  //casting shape to square
		
		
	}

}
