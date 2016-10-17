package figures.impl;

import figures.api.Colors;
import figures.api.Figure;

/**
 * Created by User on 17.10.2016.
 */
public class Square implements Figure {
    private String name;
    private double squareSide;
    private String color;
    private double area;

    @Override
    public Figure createFigure() {

        Square square = new Square();
        square.setName("square");
        double randomSquareSide = (int) (Math.random() * (15 - 1) + 1) + 1;
        square.setSquareSide(randomSquareSide);
        int colorDigit = (int) (Math.random() * 7 + 1);
        String randomColor = Colors.color[colorDigit];
        square.setColor(randomColor);
        square.setArea(square.getSquareSide()*square.getSquareSide());
        return square;

    }
    @Override
    public String getColor() {
        return color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setSquareSide(double squareSide) {
        this.squareSide = squareSide;
    }

    public double getSquareSide() {
        return squareSide;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", squareSide=" + this.getSquareSide() +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
