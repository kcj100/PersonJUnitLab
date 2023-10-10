package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testConstructorDefault() {
        Person person = new Person();
        assertNull(person.getName());
        assertEquals(0, person.getAge());
    }

    @Test
    void testConstructorName() {
        String name = "John";
        Person person = new Person(name);
        assertEquals(name, person.getName());
    }

    @Test
    void testConstructorAge() {
        int age = 20;
        Person person = new Person(age);
        assertEquals(age, person.getAge());
    }

    @Test
    void testConstructorNameAndAge() {
        String name = "John";
        int age = 20;
        Person person = new Person(name, age);
        assertEquals(name, person.getName());
        assertEquals(age, person.getAge());
    }

    @Test
    void setName() {
        String name = "Tim";
        Person person = new Person("John");
        person.setName(name);
        assertEquals(name, person.getName());
    }

    @Test
    void setAge() {
        int age = 20;
        Person person = new Person(30);
        person.setAge(age);
        assertEquals(age, person.getAge());
    }

    @Test
    void getName() {
        String name = "Jim";
        Person person = new Person(name);
        assertEquals(name, person.getName());
    }

    @Test
    void getAge() {
        int age = 30;
        Person person = new Person(age);
        assertEquals(age, person.getAge());
    }

    @Test
    void addName() {
        List<String> names = new ArrayList<>(
                Arrays.asList(new String[]{"John","Tim", "Jim"}));
        Person person = new Person("John", 25);
        person.addName("John");
        person.addName("Tim");
        person.addName("Jim");
        assertEquals(names, person.getListOfNames());
    }

    @Test
    void removeName() {
        List<String> names = new ArrayList<>(
                Arrays.asList(new String[]{"John","Tim", "Jim"}));
        names.remove("Tim");
        Person person = new Person("John", 25);
        person.addName("John");
        person.removeName("Tim");
        person.addName("Jim");
        assertEquals(names, person.getListOfNames());
    }

    @Test
    void getListOfNames() {
        List<String> names = new ArrayList<>(
                Arrays.asList(new String[]{"John","Tim", "Jim"}));
        Person person = new Person("John", 25);
        person.addName("John");
        person.addName("Tim");
        person.addName("Jim");
        assertEquals(names, person.getListOfNames());
    }

    @Test
    void getSizeOfList() {
        int expectedSize = 3;
        Person person = new Person("John", 25);
        person.addName("John");;
        person.addName("Tim");
        person.addName("Jim");
        int actualSize = person.getSizeOfList();
        assertEquals(expectedSize, actualSize);
    }
}