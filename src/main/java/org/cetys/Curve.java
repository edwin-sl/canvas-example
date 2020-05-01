package org.cetys;

/**
 * Created by edwin on Apr, 2020
 */
public class Curve extends LineFigure {
    private Point startPoint;
    private Point controlPoint;
    private Point endPoint;

    public Curve(Point origin, int dx, int dy, Point control) {
        super(origin);
        startPoint = new Point(0, 0);
        endPoint = new Point(dx, dy);
        controlPoint = new Point(control.x - origin.x, control.y - origin.y);
    }

    @Override
    void paintLine(String color) {
        this.lineColor = color;
        System.out.println("Painted Straight Line " + color);
    }

    @Override
    public String draw() {
        var origin = this.getOrigin();
        String drawing = "Draw Curve Color " + getLineColor() +
                " in global position from (" + (origin.x + startPoint.x) + ", " + (origin.y + startPoint.y)  + ")" +
                " to (" + (origin.x + endPoint.x) + ", " + (origin.y + endPoint.y)  + ")" +
                " pulled to " + (origin.x + controlPoint.x) + ", " + (origin.y + controlPoint.y) + ")";

        return drawing;
    }
}
