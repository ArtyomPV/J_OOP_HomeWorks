package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.CoffeeMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeMachine {
    private static double amountMoney = 0;
    private List<Coffee> coffeeDrinks = new ArrayList<>();
    private String name;
    private static int indexCoffeeMachine = 1;

    public CoffeeMachine(String name){
        indexCoffeeMachine ++;
        this.name = name;
    }
    public CoffeeMachine(){
        this(String.format("CoffeeMachine_%d", indexCoffeeMachine));

    }
    public CoffeeMachine addCoffee(Coffee coffee){
        coffeeDrinks.add(coffee);
        return this;
    }
    public CoffeeMachine showCoffee(){
        for(Coffee coffee: coffeeDrinks){
            System.out.println(coffee);
        }
        return this;
    }

    public Coffee findCoffeeDrink(String name){
        for(Coffee coffee: coffeeDrinks){
            if(coffee.getName().equals(name)){
                return coffee;
//                        String.format("Drink %s is found, price: %s", coffee.getName(), coffee.getPrice());
//                coffeeDrinks.remove(coffee);
            }
        }
        return null;
    }
    public Coffee sellCoffee(Coffee coffee) {
        try {
            Coffee foundCoffee = findCoffeeDrink(coffee.getName());
            coffeeDrinks.remove(coffee);
            amountMoney += coffee.getPrice();
            return foundCoffee;
        } catch (Exception e) {
            throw new NullPointerException("Товар не найден или закончился.");
        }
    }
    public String getName() {
        return name;
    }

    public static double getAmountMoney() {
        return amountMoney;
    }

    public static int getIndexCoffeeMachine() {
        return indexCoffeeMachine;
    }

    @Override
    public String toString() {
        return "CoffeeMachine: { " +
                "name='" + name + '\'' +
                " }";
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println(""" 
                Введите число: 
                1. Если хотите выбрать напиток
                2. Если хотите добавить напиток
                0. Если хотите выйти
                """);
        int optionNumber = sc.nextInt();
    }
}
