package com.pb.vizir.hw7;

public class Atelier {
    public static void main(String[] args) {

        Clothes[] clothes = new Clothes[6];
        clothes[0] = new Tshirt("Тенниска", Size.XXS, 20.0, "желтый");
        clothes[1] = new Tshirt("Футболка-поло", Size.S, 35.0, "белый");
        clothes[2] = new Tshirt("Безрукавка", Size.L, 28.0, "красный");
        clothes[3] = new Pants ("Брюки", Size.M, 40.0, "темно-синие");
        clothes[4] = new Skirt ("Юбка", Size.XS, 29.0, "серая");
        clothes[5] = new Tie ("Галстук", Size.M , 32.0, "зеленый");

        dressMan(clothes);
        System.out.println();
        dressWomen(clothes);

    }

        private  static void dressMan (Clothes[]clothes){
        System.out.println("Мужская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                ((ManClothes) clothe).dressMan();
            }
        }
    }

        private  static void dressWomen (Clothes[] clothes) {
            System.out.println("Женская одежда:");
            for (Clothes clothe : clothes) {
               if (clothe instanceof WomenClothes) {
                  ((WomenClothes) clothe).dressWomen();
                    }
                }


        //for(Clothes clothe: clothes) {
       //     ((ManClothes) clothe).dressMan();
     }

}
