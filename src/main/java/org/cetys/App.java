package org.cetys;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Canvas myCanvas = new Canvas();

        Figure myRectangle = new Rectangle(new Point(10, 15), 12, 20);
        myCanvas.addFigure(myRectangle);

        Figure myCurve = new Curve(new Point(50, 20), 70, 25, new Point(60, 50));
        myCanvas.addFigure(myCurve);

        myCanvas.refresh();

        myRectangle.move(20, 50);

        myCurve.paint("line", "red");

        myCanvas.refresh();
    }
}
