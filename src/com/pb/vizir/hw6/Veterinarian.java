package com.pb.vizir.hw6;

public class Veterinarian {
    public Veterinarian (){}

    public void treatAnimal(Animal animal) {
        System.out.print(animal.getName() + " ест " + animal.getFood()+", ее место проживания - " + animal.getLocation());
    }

}
