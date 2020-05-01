package org.cetys;

/**
 * Created by edwin on Apr, 2020
 */
abstract public class SolidFigure extends Figure {
    protected String fillerColor = "white";
    // Can't assume border is the same as LineFigure by LSP
    protected String borderColor = "black";

    public SolidFigure() {
    }

    public SolidFigure(Point origin) {
        super(origin);
    }

    public String getFillerColor() {
        return fillerColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    @Override
    void paint(String section, String color) {
        switch (section) {
            case "filler":
                paintFiller(color);
                break;
            case "line":
                paintBorder(color);
                break;
        }
    }

    abstract void paintFiller (String color);
    abstract void paintBorder (String color);
}
