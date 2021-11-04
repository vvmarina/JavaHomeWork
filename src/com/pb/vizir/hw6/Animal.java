package com.pb.vizir.hw6;

public class Animal {
   private String food;
   private String location;
   private String name;

    public Animal (String name, String food, String location){
        this.name = name;
        this.food = food;
        this.location = location;
        }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // метод выводит информацию, какой шум производит животное
    public void makeNoise () {
        System.out.print(getName()+ " производит много шума");
    }

    // метод выводит информацию, какую еду ест животное
    public void eat () {
        System.out.print(getName()+" ест "+ getFood() );
    }

    // метод выводит информацию, где спит животное
    public void sleep () {
        System.out.println("Место, где спит животное, - " + getLocation());
    }
}
