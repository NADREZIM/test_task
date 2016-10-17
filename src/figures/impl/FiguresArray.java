package figures.impl;

import figures.api.Figure;
import figures.impl.entity.Circle;
import figures.impl.entity.Square;
import figures.impl.entity.Trapeze;
import figures.impl.entity.Triangle;

/**
 * Created by User on 17.10.2016.
 */
public class FiguresArray {
    public void go(){
        int arrayLength = (int) (Math.random() * 15 + 1);
        Figure[] figures = new Figure[arrayLength];
        for (int i = 0; i < figures.length; i++) {
            Figure figure;
            int randomNumber = (int) (Math.random() * (4 - 1) + 1) + 1;
            switch (randomNumber) {
                case 1:
                    figure = new Square().createFigure();
                    figures[i] = figure;
                    break;
                case 2:
                    figure = new Circle().createFigure();
                    figures[i] = figure;
                    break;
                case 3:
                    figure = new Triangle().createFigure();
                    figures[i] = figure;
                    break;

                case 4:
                    figure = new Trapeze().createFigure();
                    figures[i] = figure;
                    break;
            }
        }

        for (Figure figure : figures) {
           // System.out.println("Figure color: " + figure.getColor());
           // System.out.println("Figure area: " + figure.getArea());
            System.out.println(" All figure parameters:  " + figure);
        }
    }
}
