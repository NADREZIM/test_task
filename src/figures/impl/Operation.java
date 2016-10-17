package figures.impl;

import figures.api.Figure;

/**
 * Created by User on 17.10.2016.
 */
public class Operation {
    public void go(){
        int arrayLength = (int) (Math.random() * 15 + 1);
        Figure[] figures = new Figure[arrayLength];
        System.out.println(figures.length);
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

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i]);
        }
    }
}
