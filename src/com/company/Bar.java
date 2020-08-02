package com.company;

public class Bar {
    int bottles;
    public int getBottle(){
        if (this.bottles == 0) {
            System.out.println("Буытлок нет");
            return 0;
        }
        this.bottles-=1;
        System.out.println("Вы использовали 1 бутылку, осталось" + this.bottles + " бутылок");
        return 1;
    }


    public Bar(int bottles){
        this.bottles = bottles;
    }

}
