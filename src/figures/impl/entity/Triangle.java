package figures.impl.entity;

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
    private static final int firstCathetusDiapason = 11;
    private static final int secondCathetusDiapason = 13;
    private static final int colorDiapason = 8;

    @Override
    public Figure createFigure() {
        Triangle triangle = new Triangle();
        triangle.setName("Triangle");
        double randomCTriangleFirstCathetus = (int) (Math.random() * firstCathetusDiapason);
        double randomTriangleSecondCathetus = (int) (Math.random() * secondCathetusDiapason);
        triangle.setHypotenuse(Math.sqrt(Math.pow(randomCTriangleFirstCathetus,2) + Math.pow(randomTriangleSecondCathetus,2)));
        int colorDigit = (int) (Math.random() * colorDiapason);
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
        return "Figure{" +
                "name='" + name + '\'' +
                ", hypotenuse=" + this.getHypotenuse() +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
