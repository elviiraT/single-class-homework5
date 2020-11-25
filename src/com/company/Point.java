package com.company;
import static java.lang.Math.*;

public class Point
{
    public Point (int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString ()
    {
        return "y-coordinate: " + y +" " + "x-coordinate: " + x;
    }
    public boolean onXaxis ()
    {
        if (y == 0)
            return true;
        else
            return false;
    }
    public boolean hasSameCoordinate(Point p2)
    {
        if ( y == p2.y && x == p2.x)
            return true;
        else
            return false;
    }
    public double distance(Point p2)
    {
        double D = sqrt((abs(x-p2.x)) * 2 + (abs(y-p2.y)) * 2);
        return D;
    }
    public boolean unitcircle ()
    {
        if (pow(x, 2) + pow(y, 2) == 1)
            return true;
        else
            return false;
    }
    public double midpoint (Point p2)
    {
        double D = sqrt((abs(x - p2.x)) * 2 + (abs(y - p2.y)) * 2);
        double midPoint = D / 2;
        return midPoint;
    }
    private int x;
    private int y;
}
