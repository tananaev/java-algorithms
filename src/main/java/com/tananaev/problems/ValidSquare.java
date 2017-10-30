package com.tananaev.problems;

import java.util.ArrayList;

public class ValidSquare {

    public static class Point {
        public int x;
        public int y;
        public Point(int x, int y) { this.x = x; this.y = y; }

        @Override
        public boolean equals(Object obj) {
            Point p = (Point) obj;
            return p.x == x && p.y == y;
        }
    }

    private double len2(Point p1, Point p2) {
        return Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2);
    }

    private boolean check(Point p, Point p1, Point p2) {
        return Math.abs(p1.x - p.x) == Math.abs(p2.y - p.y)
            && Math.abs(p1.y - p.y) == Math.abs(p2.x - p.x)
            && len2(p1, p2) == len2(p, p1) + len2(p, p2)
            && len2(p1, p2) > 0;
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(p1[0], p1[1]));
        points.add(new Point(p2[0], p2[1]));
        points.add(new Point(p3[0], p3[1]));
        points.add(new Point(p4[0], p4[1]));

        points.sort((o1, o2) -> (o1.x == o2.x) ? o1.y - o2.y : o1.x - o2.x);

        return check(points.get(0), points.get(1), points.get(2))
            && check(points.get(2), points.get(0), points.get(3))
            && check(points.get(3), points.get(1), points.get(2));
    }

}
