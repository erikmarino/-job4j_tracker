package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programLand;

    public Programmer(String programLand, int experience, boolean degree) {
        super(experience, degree);
        this.programLand = programLand;
    }
}
