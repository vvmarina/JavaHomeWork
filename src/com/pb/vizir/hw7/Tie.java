package com.pb.vizir.hw7;

public class Tie  extends Clothes implements ManClothes {
    private String name;
    public Tie (String name, Size size, Double price, String color) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    @Override
    public void dressMan() {
        System.out.println(this.name +" . Цвет: "+ this.color +". Цена: "+ this.price + " евро");
    }

}