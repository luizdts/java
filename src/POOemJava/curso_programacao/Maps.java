package application;

import model.entities.ProductToMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args){
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "99771133");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());
        System.out.println("ALL COOKIES");

        for(String key: cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

        Map<ProductToMap, Double> stock = new HashMap<>();

        ProductToMap p1 = new ProductToMap("Tv", 900.00);
        ProductToMap p2 = new ProductToMap("Notebook", 1500.00);
        ProductToMap p3 = new ProductToMap("Tablet", 500.00);

        //Estoque dos produtos
        stock.put(p1, 1000.00);
        stock.put(p2, 1500.00);
        stock.put(p3, 700.00);

        ProductToMap ps = new ProductToMap("Tv", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
