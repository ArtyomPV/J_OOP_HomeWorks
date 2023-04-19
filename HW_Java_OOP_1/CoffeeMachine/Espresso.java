package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.CoffeeMachine;

public class Espresso extends Coffee{
    static int countEspresso = 0;


    public Espresso(String name, double price) {
        super(name, price);
        countEspresso ++;
        countCups ++;
    }
}
