package figures.impl;

import figures.api.Colors;
import figures.api.Figure;

/**
 * Created by User on 17.10.2016.
 */
public class Circle implements Figure {
    private String name;
    private double radius;
    private String color;
    private double area;

    @Override
    public Figure createFigure() {

        Circle circle = new Circle();
        circle.setName("circle");
        double randomCircleRadius = (int) (Math.random() * (20 - 2) + 1) + 1;
        circle.setRadius(randomCircleRadius);
        int colorDigit = (int) (Math.random() * 7 + 1);
        circle.setColor(Colors.color[colorDigit]);
        circle.setArea(3.14*(circle.getRadius() * circle.getRadius()));
        return circle;

    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + this.getRadius() +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
