package com.pb.vizir.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    private String name;
    public Pants(String name, Size size, Double price, String color) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    @Override
    public void dressMan() {
        System.out.println(this.name +" мужские. Размер " + this.size + " . Цвет: "+ this.color +". Цена: "+ this.price + " евро");
    }

    @Override
    public void dressWomen (){
        System.out.println(this.name +" женские. Размер " + this.size + " . Цвет: "+ this.color +". Цена: "+ this.price + " евро");
    }

}