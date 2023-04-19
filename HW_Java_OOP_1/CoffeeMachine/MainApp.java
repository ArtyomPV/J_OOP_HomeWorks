package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.CoffeeMachine;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.addCoffee(new Cappuccino("Cappuccino1", 55.0))
                .addCoffee(new Americano("Americano1", 60.0))
                .addCoffee(new Latte("Latte1", 50.0))
                .addCoffee(new Espresso("Espresso", 55.0))
                .showCoffee();

        coffeeMachine.findCoffeeDrink("Espresso");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a coffee:\n");
        Coffee foundCoffeeDrink = coffeeMachine.findCoffeeDrink(sc.nextLine());
        sc.close();
        if(foundCoffeeDrink == null){
            System.out.println("No drink selected, come later...");
        } else {
            System.out.println("Ищем товар - : " + foundCoffeeDrink);
        }
        try {
            Coffee soldCoffeeDrink = coffeeMachine.sellCoffee(foundCoffeeDrink);
            System.out.println("Продали товар: " + soldCoffeeDrink);
            System.out.println("Money entered the machine: " + foundCoffeeDrink.getPrice());
            System.out.println("Total in the coffee machine: " + CoffeeMachine.getAmountMoney());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }



        coffeeMachine.showCoffee();
//        Coffee coffee1 = new Cappuccino();
//        Cappuccino coffee2 = new Cappuccino();
//        Cappuccino coffee3 = new Cappuccino();
//        Latte coffee4 = new Latte();
//        Cappuccino coffee5 = new Cappuccino();
//        Coffee coffee6 = new Latte();
//        System.out.println(Cappuccino.countCups);
//        System.out.println(Cappuccino.countCappuccino);
//        System.out.println(Latte.countLatte);
//        System.out.println(Latte.countCups);


    }
}
