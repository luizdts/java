package curso_programacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import model.entities.ProductSets;

public class SetsTestMatchs {

	public static void main(String[] args) {

		Set<ProductSets> set = new HashSet<>();
		
		set.add(new ProductSets("TV", 900.0));
		set.add(new ProductSets("Notebook", 1200.0));
		set.add(new ProductSets("Tablet", 500.0));
		
		ProductSets prod = new ProductSets("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));
		
		//Comparando com TreeSet
		
		Set<ProductSets> set2 = new TreeSet<>();
		
		set2.add(new ProductSets("TV", 900.0));
		set2.add(new ProductSets("Notebook", 1200.0));
		set2.add(new ProductSets("Tablet", 500.0));
		
		for(ProductSets p : set2) {
			System.out.println(p);
		}
		
	}

}
