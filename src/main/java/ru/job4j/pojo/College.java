package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNameSoname("Erik Marino Air ");
        student.setGroup("4327");
        student.setAdmission(new Date());

        System.out.println(student.getNameSoname() + "будет учиться в группе " + student.getGroup() + " начиная с " + student.getAdmission());
    }
}
