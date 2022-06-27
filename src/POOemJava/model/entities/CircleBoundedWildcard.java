package model.entities;

public class CircleBoundedWildcard implements ShapeInterface{
    private double radius;

    public CircleBoundedWildcard(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
