package figures.impl;

import figures.api.Colors;
import figures.api.Figure;

/**
 * Created by User on 17.10.2016.
 */
public class Trapeze implements Figure {
    private String name;
    private double diagonal;
    private String color;
    private double area;

    @Override
    public Figure createFigure() {
        Trapeze trapeze = new Trapeze();
        trapeze.setName("trapeze");
        double topBase = (int) (Math.random() * (30 - 1) + 1) + 1;
        double lowBase = (int) (Math.random() * (35 - 1) + 1) + 1;
        double side = (int) (Math.random() * (20 - 1) + 1) + 1;
        trapeze.setDiagonal(Math.sqrt(Math.pow(side,2) + topBase * lowBase));
        int colorDigit = (int) (Math.random() * 7 + 1);
        trapeze.setColor(Colors.color[colorDigit]);
        trapeze.setArea((lowBase + topBase)/2 * (Math.sqrt(Math.pow(side,2)-((Math.pow(lowBase,2)- Math.pow(topBase,2))/4))));
        return trapeze;
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

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Trapeze{" +
                "name='" + name + '\'' +
                ", diagonal=" + this.getDiagonal() +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
