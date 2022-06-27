package application;

import model.entities.ProductstoGenerics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class TestComparator {
    public static void main(String[] args){
        List<ProductstoGenerics> list = new ArrayList<>();

        list.add(new ProductstoGenerics("TV", 900.00));
        list.add(new ProductstoGenerics("Notebook", 1500.00));
        list.add(new ProductstoGenerics("Tablet", 400.00));

        // Utilizando função lambda
        // Comparator<ProductstoGenerics> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());


//        Utilizando funções anonimas
//        Comparator<ProductstoGenerics> comp = new Comparator<ProductstoGenerics>() {
//            @Override
//            public int compare(ProductstoGenerics p1, ProductstoGenerics p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };
        // Utilizando diretamente a função lambda no list.sort
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        // list.sort(new MyComparator());
        // list.sort(comp);

        for(ProductstoGenerics p : list){
            System.out.println(p);
        }

    }
}
