package day10_controlFlowStatements_Part4;

public class task44 {

	public static void main(String[] args) {

		System.out.println("KPH\t\tMPH");
		System.out.println("--------------------");
		for(int kph=60;kph<=130;kph+=10) {
			System.out.println(kph+"\t\t"+kph*0.6214);
			
		}
	}
}
