package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.CoffeeMachine;

public class Latte extends Coffee{
    static int countLatte = 0;


    public Latte(String name, double price) {
        super(name, price);
        countLatte ++;
        countCups ++;
    }
}
