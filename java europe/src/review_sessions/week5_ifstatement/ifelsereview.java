package review_sessions.week5_ifstatement;

public class ifelsereview {

	public static void main(String[] args) {
		//get student grade from user(create variable named score)
        //90-100 -"Grade is A"
        //80-89-"Grade is B"
        //70-79-"Grade is C"
        //60-69-"Grade is D"
        //less then 60 "Grade is F"
        
        // use only if statement to do this task 
        
        //int grade=92;
//      
//      if (grade>=90 && grade<=100) {
//          System.out.println("Grade is : A");
//      } 
//      if (grade>=80 && grade<=89) {
//          System.out.println("Grade is : B");
//      }
//      if (grade>=70 && grade<=79) {
//          System.out.println("Grade is : C");
//      }
//      if (grade>=60 && grade<=69) {
//          System.out.println("Grade is : D");
//      }
//      if (grade<60) {
//          System.out.println("Grade is : F");
//      }
        //same example with if else if 
        int grade=85;
        if(grade>=90 &&grade<=100) {
            System.out.println("Grade is : A");
        }else if(grade>=80) {
            System.out.println("Grade is : B");
        }else if(grade>=70) {
            System.out.println("Grade is : C");
        }else if(grade>=60) {
            System.out.println("Grade is : D");
        }else {
            System.out.println("Grade is : F");
        }
        
        

	}

}
