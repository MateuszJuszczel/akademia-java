package pl.devopsi.akademia;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int val_integer = 250;
        String val_string = "Akademia jest super!";
        Double val_double = 1.234555;

        System.out.println("Zmienna val_integer ma wartość: " + val_integer);
        System.out.println("Zmienna val_string ma wartość: " + val_string);
        System.out.println("Zmienna val_double ma wartość: " + val_double);

        System.out.println("-----------------------------------------------");
        int[] tableInt = new int[10];

        for (int i = 0 ; i<10 ; i++) {
            tableInt[i] = i + 1;
            if (i%2 == 0) {
                System.out.println("Liczba " + i + " jest parzysta");
            }else {
                System.out.println(i);
            }
        }

        System.out.println("------------------------------------------");
        int sum_of_numbers = 0;
        int index = 1;
        boolean x = true;

        while (x){

            if (index == 499){
                x = false;
            }
            index++;
            System.out.println("Index = "+ index);
            sum_of_numbers = index + index;
            System.out.println(sum_of_numbers);
        }

        System.out.println("-------------------------------------------");

        int[] grades = {3,4,5,3,4,3,3,2};

        for(int element: grades){
            if(element == 5){
                System.out.println("A");
            }else if (element == 4){
                System.out.println("B");
            }else if(element == 3){
                System.out.println("C");
            }else {
               System.out.println("D");
           }
        }

        int sum = 0;
        int len = grades.length;

        for(int element: grades) {
            sum = sum + element;
        }
        int avg = sum / len;
        System.out.println("Srednia ocen to: " + avg);

        switch (avg){
            case 5:
                System.out.println("A=Super");
                break;
            case 4:
                System.out.println("B=Srednio");
                break;
            case 3:
                System.out.println("C=Slabo");
                break;
            default:
                System.out.println("Domyslnie=coś nie tak...");
        }
        System.out.println("---------------------------------------------");

    }

    Dog lola = new Dog("Lola", 2012, "Golden", "Medium");
    Dog mieta = new Dog("Mieta", 2017,"Golden", "Medium");
    Snake blues = new Snake("Blues", 2015, 3.14);

    List<Speakable> animals = new ArrayList<>();

}