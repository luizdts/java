package model.entities;

public class RectangleBoundedWildcard implements ShapeInterface{
    private double width;
    private double height;

    public RectangleBoundedWildcard(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
