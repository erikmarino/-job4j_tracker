package ru.job4j.tracker.tracker;

import org.junit.Test;
import ru.job4j.tracker.*;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.creatItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
}
