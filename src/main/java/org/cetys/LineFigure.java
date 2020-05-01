package org.cetys;

/**
 * Created by edwin on Apr, 2020
 */
abstract public class LineFigure extends Figure {
    protected String lineColor = "black";

    public LineFigure() {
    }

    public LineFigure(Point origin) {
        super(origin);
    }

    public String getLineColor() {
        return lineColor;
    }

    @Override
    void paint(String section, String color) {
        switch (section) {
            case "line":
                paintLine(color);
                break;
        }
    }

    abstract void paintLine (String color);
}
