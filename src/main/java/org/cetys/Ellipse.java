package org.cetys;

/**
 * Created by edwin on Apr, 2020
 */
public class Ellipse extends SolidFigure {
    private Point center;
    private int radioHorizontal;
    private int radioVertical;

    public Ellipse(Point origin, int dx, int dy) {
        super(origin);
        center = new Point(dx / 2 , dy / 2);
        radioHorizontal = dx / 2;
        radioVertical = dy / 2;
    }

    @Override
    public void paintFiller(String color) {
        this.fillerColor = color;
        System.out.println("Painted Ellipse Filler " + color);
    }

    @Override
    public void paintBorder(String color) {
        this.borderColor = color;
        System.out.println("Painted Ellipse Border " + color);
    }

    @Override
    public String draw() {
        var origin = this.getOrigin();
        String drawing = "Draw Ellipse Filled in " + getFillerColor() +
                " and Border in " + getBorderColor() +
                " in global position centered at (" + (origin.x + center.x) + ", " + (origin.y + center.y)  + ")" +
                " with height of " + (radioVertical * 2) + "and width of " + (radioHorizontal * 2);

        return drawing;
    }
}
