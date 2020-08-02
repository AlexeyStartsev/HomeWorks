package com.company;

public class Visitor {
    double alcoholPercentage = 0;
    public void drink(Barman b, Bar a){
     b.giveBottle(a);
     this.alcoholPercentage += 10;
    }

}
