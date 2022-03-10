package com.pluralsight.conference.model;

public class RegistrationReport {

    private String name;
    private String courseName;
    private String curseDescription;

    public RegistrationReport(String name, String courseName, String curseDescription) {
        this.name = name;
        this.courseName = courseName;
        this.curseDescription = curseDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCurseDescription() {
        return curseDescription;
    }

    public void setCurseDescription(String curseDescription) {
        this.curseDescription = curseDescription;
    }
}
