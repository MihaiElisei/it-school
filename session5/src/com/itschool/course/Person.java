package com.itschool.course;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private long cnp;

    public String getFirstName() {
        return firstName;
    }

    public Person(String firstName, String lastName, int age, long cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cnp = cnp;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getCnp() {
        return cnp;
    }

    public void setCnp(Long cnp) {
        this.cnp = cnp;
    }
}
