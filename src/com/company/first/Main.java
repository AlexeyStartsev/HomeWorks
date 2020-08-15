package com.company.first;

public class Main {

    public static void main(String[] args) {
    Bar a = new Bar(10);
    Barman b = new Barman();
    Visitor c = new Visitor();
    c.drink(b, a);

	// write your code here
    }
}
