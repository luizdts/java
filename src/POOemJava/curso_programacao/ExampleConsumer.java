package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import model.entities.Product;

public class ExampleConsumer {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1900.0));
		list.add(new Product("Tablet", 500.0));
		list.add(new Product("HD Case", 90.0));
		
		//list.forEach(new PriceUpdate()); // implementação da interface
		//list.forEach(Product::staticPriceUpdate); // metodo estatico
		//list.forEach(Product::nonStaticPriceUpdate); // metodo nao estatico
		
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * 1.1); // lambda declarada
		};
		list.forEach(cons);
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); // lambda inline
		
		list.forEach(System.out::println);

	}

}
