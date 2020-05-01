package org.cetys;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edwin on Apr, 2020
 */
public class Canvas {
    private List<Figure> figures = new ArrayList<>();

    public Canvas() {
    }

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void refresh() {
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
