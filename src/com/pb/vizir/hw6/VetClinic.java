package com.pb.vizir.hw6;

import java.lang.reflect.Constructor;
public class VetClinic {
    public static void main(String[] args) throws Exception{
        Animal[] animal = new Animal [3];
        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Horse();

        //Выводим всех животных
        System.out.println("На прием к ветеринару пришли:");
        for (int i = 0; i<3; i++){
            System.out.println(animal[i].getName());
        }
        System.out.println();

        Class VeterClazz = Class.forName("com.pb.vizir.hw6.Veterinarian");

        //создание объекта Ветеринар через рефлексию
        Constructor constr = VeterClazz.getConstructor(new Class[]{});
        Object obj = constr.newInstance();
        if (obj instanceof Veterinarian)
            for (int i = 0; i<3; i++){
                ((Veterinarian) obj).treatAnimal(animal[i]);
                System.out.println();
            }
    }


}