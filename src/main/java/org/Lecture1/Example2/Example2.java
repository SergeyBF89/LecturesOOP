package org.Lecture1.Example2;

public class Example2 {
    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.x = 0;
        a.y = 2;

        Point2D b = new Point2D();
        b.x = 0;
        b.y = 10;
        System.out.println(distance(a, b));
    }
    public static class Point2D {
        int x, y;
    }
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
