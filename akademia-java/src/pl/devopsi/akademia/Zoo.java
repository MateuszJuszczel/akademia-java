package pl.devopsi.akademia;

import java.util.List;

public class Zoo {
    private final String name;
    private final int yearOfEstablishment;
    private List<Animal> Animals;


    public Zoo(String name, int yearOfEstablishment, List<Animal> Animals) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.Animals = Animals;
    }

    public void addAnimal (Animal animal){

        Animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return Animals;
    }

    public void showAnimals() {
            System.out.println(Animals);
        }

    public int countAnimals() {
        return Animals.size();
    }

    public double aveAnimalAge() {
        double sumOfAges = 0;
        for (Animal animal : Animals) {
            sumOfAges = sumOfAges + animal.getAnimalAge();
        }
        return sumOfAges / Animals.size();
    }

    public void showInfo() {
        System.out.println("Nazwa ogordu: " + name + ", rok założenia: " + yearOfEstablishment + "średnia wieku zwierząt wynosi " +aveAnimalAge());
    }

}
