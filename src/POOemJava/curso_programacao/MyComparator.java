package application;

import model.entities.ProductstoGenerics;

import java.util.Comparator;


public class MyComparator implements Comparator<ProductstoGenerics> {

    @Override
    public int compare(ProductstoGenerics p1, ProductstoGenerics p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
