package pl.devopsi.akademia;

public class Snake extends Animal{
    private double howLongIs;

    public Snake(String name, int yearOfBirth, double howLongIs) {
        super(name, yearOfBirth);
        this.howLongIs = howLongIs;
    }

    public double getHowLongIs() {
        return howLongIs;
    }

    public void setHowLongIs(double howLongIs) {
        this.howLongIs = howLongIs;
    }

    @Override
    public void sound(){
        System.out.println("Sssssss!");
    }
}
