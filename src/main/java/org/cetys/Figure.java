package org.cetys;

/**
 * Created by edwin on Apr, 2020
 */
public abstract class Figure {
    private Point origin;

    public Figure() {
        this.origin = new Point(0, 0);
    }

    public Figure(Point origin) {
        this.origin = origin;
    }

    public Point getOrigin() {
        return origin;
    }

    // delta x and delta y for movement
    public void move(int dx, int dy){
        origin.setX(origin.getX() + dx);
        origin.setY(origin.getY() + dy);
    }
    // paints the section (fill, line).
    abstract void paint(String section, String color);

    abstract public String draw();
}
