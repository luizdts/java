package curso_programacao;

import model.entities.ClientHashCode;

public class ClientsHashCode {

	public static void main(String[] args) {

		ClientHashCode c1 = new ClientHashCode("Maria", "maria@gmail.com");
		ClientHashCode c2 = new ClientHashCode("Maria", "maria@gmail.com");
		
		String s1 = "test";
		String s2 = "test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		
		System.out.println(s1 == s2);
	}
}
