package curso_programacao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Set<String> set2 = new TreeSet<>();
		
		set2.add("TV");
		set2.add("Notebook");
		set2.add("Tablet");
		
		set2.removeIf(x -> x.length() >= 3);
		
		for(String p : set2) {
			System.out.println(p);
		}
		
		System.out.println();
		Set<String> set3 = new LinkedHashSet<>();
		
		set3.add("TV");
		set3.add("Notebook");
		set3.add("Tablet");
		
		set3.remove("Notebook");
		
		for(String p : set3) {
			System.out.println(p);
		}

		// Operações com conjuntos
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//União
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		// Interseção
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// Remoção
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
