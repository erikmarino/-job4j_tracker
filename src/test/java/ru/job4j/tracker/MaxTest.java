package ru.job4j.tracker;

        import org.junit.Assert;
        import org.junit.Test;
        import ru.job4j.oop.Max;

public class MaxTest {
    @Test
    public void whenMax2num() {
        int a = 2;
        int b = 3;
        int result = new Max().add(a, b);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3num() {
        int a = 2;
        int b = 3;
        int c = 5;
        int result = new Max().add(a, b, c);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4num() {
        int a = 2;
        int b = 3;
        int c = 5;
        int d = 9;
        int result = new Max().add(a, b, c, d);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}