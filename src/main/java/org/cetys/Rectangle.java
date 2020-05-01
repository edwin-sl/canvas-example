package org.cetys;

/**
 * Created by edwin on Apr, 2020
 */
public class Rectangle extends SolidFigure {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point origin, int dx, int dy) {
        super(origin);
        topLeft = new Point(0, 0);
        bottomRight = new Point(dx, dy);
    }

    @Override
    public void paintFiller(String color) {
        this.fillerColor = color;
        System.out.println("Painted Rectangle Filler " + color);
    }

    @Override
    public void paintBorder(String color) {
        this.borderColor = color;
        System.out.println("Painted Rectangle Border " + color);
    }

    @Override
    public String draw() {
        var origin = this.getOrigin();
        String drawing = "Draw Rectangle Filled in " + getFillerColor() +
                " and Border in " + getBorderColor() +
                " in global position from (" + (origin.x + topLeft.x) + ", " + (origin.y + topLeft.y)  + ")" +
                " to (" + (origin.x + bottomRight.x) + ", " + (origin.y + bottomRight.y) + ")";

        return drawing;
    }
}
