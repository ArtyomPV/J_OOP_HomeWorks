package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.VendingMachine;

public class Chocolate extends Product {
    private String kindChocolate;

    public Chocolate(String name, double price, String kindChocolate) {
        super(name, price);
        this.kindChocolate = kindChocolate;
    }
    public String getInfo(){
        return "Chocolate " + kindChocolate;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setKindChocolate(String kindChocolate) {
        this.kindChocolate = kindChocolate;
    }

    public String getKindChocolate() {
        return kindChocolate;
    }
}
