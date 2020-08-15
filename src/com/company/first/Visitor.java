package com.company.first;

import com.company.first.Bar;
import com.company.first.Barman;

public class Visitor {
    double alcoholPercentage = 0;
    public void drink(Barman b, Bar a){
     b.giveBottle(a);
     this.alcoholPercentage += 10;
    }

}
