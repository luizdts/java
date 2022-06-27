package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.entities.Product;

public class ExamplePredicate {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1900.0));
		list.add(new Product("Tablet", 500.0));
		list.add(new Product("HD Case", 90.0));
		
		//list.removeIf(p -> p.getPrice() >= 100); expressão lambda inline
		//list.removeIf(new ProductPredicate()); // implementação da interface
		//list.removeIf(Product::staticProductPredicate); // metodo estatico
		//list.removeIf(Product::nonStaticProductPredicate); // metodo nao estatico
		Predicate<Product> pred = p -> p.getPrice() >= 100.0; // lambda declarado
		list.removeIf(pred);
		
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
