class CoffeShop {
    public void pay(){};
    public void orderToken(){};
    public void orderServed(){};

    public void collectPayment(){};
    public void placeOrder(){};
    public void generatePaymentToken(){};

    public void getNextOrder(){};
    public void prepareCoffee(){};
    public void orderCompleted(){};
    public void generateOrderToken(){};

}
class Customer extends CoffeShop{
    public Customer(){
        System.out.println("customer created");
    }
    public void pay(){};
    public void orderToken(){};
    public void orderServed(){};
}
class Cashier extends CoffeShop{
    public Cashier(){
        System.out.println("Cashier created");
    }
    public void collectPayment(){};
    public void placeOrder(){};
    public void generatePaymentToken(){};
}
class Barista extends CoffeShop{
    public Barista(){
        System.out.println("Barista created");
    }
    public void getNextOrder(){};
    public void prepareCoffee(){};
    public void orderCompleted(){};
    public void generateOrderToken(){};
}
public class Q10 {
    public static void main(String[] args) {
        Customer cs = new Customer();
        Barista bs = new Barista();
        Cashier cas = new Cashier();
    }
}
