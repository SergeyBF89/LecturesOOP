package org.Lecture1.Example1;

import static java.awt.geom.Point2D.distance;

public class Example1 {
    public static void main(String[] args) {
        int ax = 2;
        int ay = 0;
        int bx = 4;
        int by = 0;
        System.out.println(distance(ax,ay, bx, by));
    }

    public static class PointMethod {
        double distance (int x1, int y1, int x2, int y2) {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
    }
}

