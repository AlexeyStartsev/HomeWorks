package VendingMachine;


import java.util.ArrayList;


public class Product {
    int price;
    String name;
    static int count = 0;
    int countProduct = count + 1;
    public static ArrayList<Product> listOfProducts= new ArrayList<Product>();


    public int getCount(){
        return this.countProduct;
    }

    public Product(String name, int price){
        this.price = price;
        this.name = name;
        count ++;
        listOfProducts.add(this);

    }
    public void getProduct(){
        System.out.println(this.countProduct);
        System.out.println("Product name: " + this.name + "      Price: " + this.price);
    }


    static void getListOfProducts(){
        System.out.println("Menu:");
        for(int i=0; i <(count);i++){
            (listOfProducts.get(i)).getProduct();
        }
        System.out.println("\nDo you want to buy some drinks?");
    }


}
