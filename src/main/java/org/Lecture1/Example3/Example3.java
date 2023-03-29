package org.Lecture1.Example3;

public class Example3 {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        System.out.println(a);
        Point2D b = new Point2D(0, 0);
        System.out.println(b);
        System.out.println(distance(a, b));
    }
    private static class Point2D {
        int x, y;
        public Point2D(int valueX, int valueY) {
            x = valueX;
            y = valueY;
        }
        private String getInfo() {
            return String.format("x: %d; y: %d", x, y);
        }
        @Override
        public String toString() {
            return getInfo();
        }
    }
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
