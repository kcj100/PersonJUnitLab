package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private List<String> listOfNames = new ArrayList<>();

    public Person() {
    }


    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        //  Need Test Case
        return this.name;
    }

    public Integer getAge() {
        //  Need Test Case
        return this.age;
    }


    public void addName(String name){
        //  Need Test Case
        listOfNames.add(name);
    }

    public void removeName(String name){
        //  Need Test Case
        listOfNames.remove(name);
    }

    public List<String> getListOfNames() {
        return listOfNames;
    }

    public int getSizeOfList(){
        return listOfNames.size();
    }
}

