package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import model.entities.Product;
import model.util.UpperCaseName;

public class ExampleFunction {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 500.0));
		list.add(new Product("HD Case", 80.0));
		
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); //Implementação da interface
		
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); // Método estático
		
//		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()); // Método não estático
//		Function<Product, String> func = p -> p.getName().toUpperCase(); // expressão lambda declarada
		
//		List<String> names = list.stream().map(func).collect(Collectors.toList());
		
//		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); // exp lambda inline
		
		names.forEach(System.out::println);
		
	}

}
