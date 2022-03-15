package pl.devopsi.akademia;

public class Fish extends Animal{
    private Boolean isSaltWater;
    private int howManyFins;

    public Fish(String name, int yearOfBirth, boolean isSaltWater, int howManyFins) {
        super(name, yearOfBirth);
        this.howManyFins = howManyFins;
        this.isSaltWater = isSaltWater;
    }

    public Boolean getSaltWater() {
        return isSaltWater;
    }

    public void setSaltWater(Boolean saltWater) {
        isSaltWater = saltWater;
    }

    public int getHowManyFins() {
        return howManyFins;
    }

    public void setHowManyFins(int howManyFins) {
        this.howManyFins = howManyFins;
    }

    @Override
    public void sound(){
        System.out.println("Bulbul!");
    }
}
