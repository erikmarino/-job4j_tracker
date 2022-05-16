package ru.job4j.pojo;

import  java.util.Date;

public class Student {
    private String nameSoname;
    private String group;
    private Date admission;

    public String getNameSoname() {
        return nameSoname;
    }

    public void setNameSoname(String nameSoname) {
        this.nameSoname = nameSoname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getAdmission() {
        return admission;
    }

    public void setAdmission(Date admission) {
        this.admission = admission;
    }
}
