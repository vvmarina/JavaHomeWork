package com.pb.vizir.hw6;
import java.util.Objects;

public class Horse extends Animal {
    private String purpose;
    private int maneLength;

    public Horse (){
        super("Лошадь", "овес", "конюшня");
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getManeLength() {
        return maneLength;
    }

    public void setManeLength(int maneLength) {
        this.maneLength = maneLength;
    }

    @Override
    public void makeNoise () {
        super.makeNoise();
        System.out.println(", когда скачет галопом");
    }

    @Override
    public void eat () {
        super.eat();
        System.out.println(" или свежую траву");
    }

   @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       Horse horse = (Horse) o;
       return maneLength == horse.maneLength && Objects.equals(purpose, horse.purpose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maneLength, purpose);
    }

    @Override
    public String toString() {
        return "Тип животного - " + getName()+
                ", ест " + getFood() +
                ", местоположение ее стойла - " + getLocation() ;
    }
}
