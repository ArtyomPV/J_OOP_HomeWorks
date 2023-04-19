package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.VendingMachine;
public class Milk extends Product {
private String fatContent;
    public Milk(String name, double price, String fatContent) {
        super(name, price);
        this.fatContent = fatContent;
    }
    public String getFatContent() {
        return fatContent;
    }
    public void setFatContent(String fatContent) {
        this.fatContent = fatContent;
    }
}
