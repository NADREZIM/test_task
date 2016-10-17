package figures.impl.entity;

import figures.api.Colors;
import figures.api.Figure;

/**
 * Created by User on 17.10.2016.
 */
public class Circle implements Figure {
    private String name;
    private double radius;
    private  String color;
    private double area;
    private static final int diapason = 20;
    private static final int colorDiapason = 8;


    @Override
    public  Figure  createFigure() {

        Circle circle = new Circle();
        circle.setName("circle");
        double randomCircleRadius = (int) (Math.random() * diapason );
        circle.setRadius(randomCircleRadius);
        int colorDigit = (int) (Math.random() * colorDiapason);
        circle.setColor(Colors.color[colorDigit]);
        circle.setArea(Math.PI*(circle.getRadius() * circle.getRadius()));
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
        return "Figure{" +
                "name='" + name + '\'' +
                ", radius=" + this.getRadius() +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
