package VendingMachine;


public class Main {
    public static void main(String[] args) {

        Product cola = new Product("Cola", 100);

        Product water = new Product("Water", 30);

        Product cofee = new Product("Cofee",80);

        Product.getListOfProducts();

        VendingMachine a = new VendingMachine();
        a.deposit(140);
        a.buyProduct(1);
        a.buyProduct(1);

    }
}
