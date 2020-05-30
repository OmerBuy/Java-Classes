package day31_arrayList;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {

		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		System.out.println(shoppingList.size()+" items");
		
		System.out.println(shoppingList.toString());
		//print first and last item in single line
		System.out.println(shoppingList.get(0)+" and "+shoppingList.get(shoppingList.size()-1));
		
		System.out.println(shoppingList.remove("paper towel"));
		
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));
		
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
		//print each item
		for(String item : shoppingList) {
			System.out.println(item);
		}
		
		System.out.println(shoppingList);
		System.out.println(shoppingList);
		//remove all items at once
		shoppingList.clear();
		
		
		
		
		
		
		
		
		
		
		
	}

}
