package com.example.dataentry.model;

public class UserEntry {
    private String name;
    private Integer age;
    private String title;
    private String hometown;

    public UserEntry() {
    }

    public UserEntry(String name, Integer age, String title, String hometown) {
        this.name = name;
        this.age = age;
        this.title = title;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}