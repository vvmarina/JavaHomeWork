package com.pb.vizir.hw6;
import java.util.Objects;

public class Dog extends Animal {
    private String breed;

    public Dog (){
        super("Собака", "собачий корм", "будка");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise () {
        super.makeNoise();
        System.out.println(", когда лает");
    }

    @Override
    public void eat () {
        super.eat();
        System.out.println(" или зарывает их в саду на черный день");
    }

    @Override
     public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Dog dog = (Dog) o;
      return Objects.equals(breed, dog.breed);
     }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }

    @Override
    public String toString() {
        return "Тип животного - " + getName()+
                ", ест " + getFood() +
                ", ее дом - " + getLocation() ;
    }

}
