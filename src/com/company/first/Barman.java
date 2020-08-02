package com.company;

public class Barman {
    public void giveBottle(Bar a){
        if (a.getBottle() == 1){
            System.out.println("Держи бутылочку");
        }
         else System.out.println("Нет бухла,вали!");
    }

}
