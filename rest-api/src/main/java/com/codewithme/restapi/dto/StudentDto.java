package com.codewithme.restapi.dto;

public class StudentDto {
    private String name;
    private int standard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                ", name='" + name + '\'' +
                ", standard=" + standard +
                '}';
    }
}
