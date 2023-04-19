package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.CoffeeMachine;

public class Americano extends Coffee{
    static int countAmericano = 0;


    public Americano(String name, double price) {
        super(name, price);
        countAmericano ++;
        countCups ++;
    }
}
