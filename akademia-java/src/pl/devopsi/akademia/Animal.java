package pl.devopsi.akademia;

import java.util.Objects;

public class Animal implements Speakable {
    private String name;
    private int yearOfBirth;

    @Override
    public void sound() {
        System.out.println("Roar");
    }

    private enum type {
        REPTILE, AMPHIBIAN,
    }

    public Animal(String name, int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return yearOfBirth == animal.yearOfBirth && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public int getAnimalAge() {
        int CURRENT_YEAR = 2022;
        int result = CURRENT_YEAR - yearOfBirth;
        return result;
    }


}

