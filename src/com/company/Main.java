package com.company;

public class Main {

    public static void main(String[] args)
    {
        Point A = new Point(4, 0);
        Point B = new Point(2, 0);
        System.out.println(A);
        System.out.println(A.onXaxis());
        System.out.println(A.hasSameCoordinate(B));
        System.out.println(A.distance(B));
        System.out.println(A.midpoint(B));
        System.out.println(A.unitcircle());
    }
}
