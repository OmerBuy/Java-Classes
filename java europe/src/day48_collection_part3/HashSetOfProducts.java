package day48_collection_part3;

import java.util.HashSet;
import java.util.Set;

import day25_arrays_part2.ForEachLoop;
import day46_collection_part1.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {

		Set<Product> sEt = new HashSet<>();
		sEt.add(new Product("book", 22));
		sEt.add(new Product("book", 19));
		sEt.add(new Product("magazine", 18.6));

		System.out.println("Before sorting");
		
		for (Product p : sEt) {
			System.out.println(p.getPrice());
		}

		sEt.forEach(x->System.out.println(x.getName()));
	}

}
