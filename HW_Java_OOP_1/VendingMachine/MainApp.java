package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.VendingMachine;



import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
//
//        Product product1 = new Product("Any", 20);
//        System.out.println(product1);
//
//            product1.setPrice(25);
//
//        System.out.println(product1.getPrice());
//        Cake cake1 = new Cake("tort", 23, "sweet", 23);
//        Cake cake2 = new Cake("tort", 23, "sweet", 23);
//        Cake cake3 = new Cake("tort", 23, "sweet", 23);
//        System.out.println(Cake.cakeCount);
//        System.out.println(product);
        Product milk = new Product("Milk", 23.40);

        Product cake = new Cake("Cake", 114.56, "sweet", 18);

        VendingMachine vendingMachine = new VendingMachine();

        System.out.println("\nВ аппарате имеется: ");

        vendingMachine.addProduct(milk)
                      .addProduct(cake)
                      .addProduct(new Bread("Borodinskyy", 20.50, "sweet", 2, "dark"))
                      .addProduct(new Milk("GoodMilk", 50, "low fat"))
                      .showProducts();

        System.out.println("------------------------------");
        Chocolate chocolate = new Chocolate("Tobleron", 119, "dark");
        System.out.println(chocolate);
        System.out.println(chocolate.getInfo());;
        System.out.println("------------------------------");
        System.out.println("Какой товар желаете приобрести:\n");

        Scanner sc = new Scanner(System.in);

        Product founded = vendingMachine.findProduct(sc.next());
        sc.close();

        System.out.println("Ищем товар - : " + founded);

        System.out.println("В аппарате имеется денег: " + vendingMachine.getAmountMoney());
    try {
        Product soldProduct = vendingMachine.sellProduct(founded);
        System.out.println("Продали товар: " + soldProduct);
    } catch (RuntimeException e){
        System.out.println(e.getMessage());
    }



        System.out.println("В аппарате имеется денег: " + vendingMachine.getAmountMoney());
//

    }
}
