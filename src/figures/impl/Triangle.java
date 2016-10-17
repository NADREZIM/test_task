package figures.impl;

import figures.api.Colors;
import figures.api.Figure;

/**
 * Created by User on 17.10.2016.
 */
public class Triangle implements Figure {
    private String name;
    private double hypotenuse;
    private String color;
    private double area;

    @Override
    public Figure createFigure() {
        Triangle triangle = new Triangle();
        triangle.setName("Triangle");
        double randomCTriangleFirstCathetus = (int) (Math.random() * (11 - 2) + 1) + 1;
        double randomTriangleSecondCathetus = (int) (Math.random() * (12 - 1) + 1) + 1;
        triangle.setHypotenuse(Math.sqrt(Math.pow(randomCTriangleFirstCathetus,2) + Math.pow(randomTriangleSecondCathetus,2)));
        int colorDigit = (int) (Math.random() * 7 + 1);
        triangle.setColor(Colors.color[colorDigit]);
        triangle.setArea( 0.5 * (randomCTriangleFirstCathetus * randomTriangleSecondCathetus));
        return triangle;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }



    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", hypotenuse=" + this.getHypotenuse() +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
