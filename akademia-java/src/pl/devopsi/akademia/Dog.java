package pl.devopsi.akademia;

public class Dog extends Animal{
    private String breed;
    private String size;

    public Dog(String name, int yearOfBirth, String breed, String size) {
        super(name, yearOfBirth);
        this.breed = breed;
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public void sound(){
        System.out.println("Hau!");
    }
}
