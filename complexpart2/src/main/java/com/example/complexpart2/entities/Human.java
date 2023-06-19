package com.example.complexpart2.entities;

public class Human {
//    private String id;

    private String name;

    private String lastName;
    private String gender;
    private Integer age;

    public Human() {
    }

    public Human(//String id,
                 String name, String lastName, String gender, Integer age) {
//        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    public String getId() {
//        return id;
//    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
               // "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
