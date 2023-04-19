package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.CoffeeMachine;

public class Cappuccino extends Coffee{
static int countCappuccino = 0;


    public Cappuccino(String name, double price) {
        super(name, price);
        countCappuccino ++;
        countCups ++;
    }

}
