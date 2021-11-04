package com.pb.vizir.hw6;
import java.util.Objects;

public class Cat extends Animal {
        private String color;
        private int numberLegs;

        public Cat (){
            super("Кошка", "молоко", "печка");
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberLegs() {
        return numberLegs;
    }

    public void setNumberLegs(int numberLegs) {
        this.numberLegs = numberLegs;
    }

    @Override
        public void makeNoise () {
            super.makeNoise();
            System.out.println(", когда царапает ковер");
        }

        @Override
        public void eat () {
            super.eat();
            System.out.println(" или словленную хояином рыбку");
        }

        @Override
        public boolean equals(Object o) {
           if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
           Cat cat = (Cat) o;
           return numberLegs == cat.numberLegs &&Objects.equals(color, cat.color);
       }

        @Override
        public int hashCode() {
            return Objects.hash(color, numberLegs);
        }

        @Override
        public String toString() {
            return "Тип животного - " + getName()+
                    ", ест " + getFood() +
                    ", ее любимое место зимой - " + getLocation() ;
        }
}
