package com.pb.vizir.hw7;

public class Skirt extends Clothes implements WomenClothes {
    private String name;
    public Skirt(String name, Size size, Double price, String color) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressWomen (){
        System.out.println(this.name +" женская. Размер " + this.size + " . Цвет: "+ this.color +". Цена: "+ this.price + " евро");
    }

}