package VendingMachine;

public class VendingMachine {
    int balance = 0;

    public void deposit(int a){
        balance=+a;
    }

    public void buyProduct(int n){
        int m=n-1;
        if (m>=Product.listOfProducts.size()) {
            System.out.println("Are you kidding?");
        }
        else{
            if (Product.listOfProducts.get(m).price < balance){
                balance -= Product.listOfProducts.get(m).price;
                System.out.println("Get your " + Product.listOfProducts.get(m).name + ",  " + balance +" money left" );
            }
            else{
                System.out.println("Get out of here, you don't have enough money");
            }
        }

    }



}
