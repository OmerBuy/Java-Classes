package day21_stringManipulation_part3;

public class ww {

	public static void main(String[] args) {
		int x1= get();
		int d=get(x1,"Cybertek");
		System.out.println(x1+d);
	}

	public static int get() {
		return 3;
	}
	public static int get(int x1,String x2) {
		return x1+x2.length()-2;
}public static int get(String str) {
	return 4;
}}
