package org.cetys;

/**
 * Created by edwin on Apr, 2020
 */
public class Straight extends LineFigure {
    private Point startPoint;
    private Point endPoint;

    public Straight(Point origin, int dx, int dy) {
        super(origin);
        startPoint = new Point(0, 0);
        endPoint = new Point(dx, dy);
    }

    @Override
    void paintLine(String color) {
        this.lineColor = color;
        System.out.println("Painted Straight Line " + color);
    }

    @Override
    public String draw() {
        var origin = this.getOrigin();
        String drawing = "Draw Line Color " + getLineColor() +
                " in global position from (" + (origin.x + startPoint.x) + ", " + (origin.y + startPoint.y)  + ")" +
                " to (" + (origin.x + endPoint.x) + ", " + (origin.y + endPoint.y) + ")";

        return drawing;
    }
}
