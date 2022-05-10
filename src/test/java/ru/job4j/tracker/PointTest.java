package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;

public class PointTest {

    @Test
    public void when002to201then2dot23() {
        double expected = 2.23;
        Point a = new Point(0, 0, 2);
        Point b = new Point(2, 0, 1);
        double dist3 = a.distance3d(b);
        Assert.assertEquals(expected, dist3, 0.01);
    }

    @Test
    public void when346to122then4dot89() {
        double expected = 4.89;
        Point a = new Point(3, 4, 6);
        Point b = new Point(1, 2, 2);
        double dist3 = a.distance3d(b);
        Assert.assertEquals(expected, dist3, 0.01);
    }

    @Test
    public void when28to76then5dot38() {
        double expected = 5.38;
        Point a = new Point(2, 8);
        Point b = new Point(7, 6);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when99to33then8dot48() {
        double expected = 8.48;
        Point a = new Point(9, 9);
        Point b = new Point(3, 3);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}