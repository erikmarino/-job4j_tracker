package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when12to34then2dot82() {
        double expected = 2.82;
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
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