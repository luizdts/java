package model.entities;

import java.util.Objects;

public class ProductToMap {
    private String name;
    private Double price;

    public ProductToMap(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductToMap that = (ProductToMap) o;
        return name.equals(that.name) && price.equals(that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
