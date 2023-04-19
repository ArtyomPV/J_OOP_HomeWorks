package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.VendingMachine;

public class Cake  extends Product {

     private String taste;
     private int candles;
     protected static int cakeCount = 0;

    /**
     * Конструктор Продукта
     * @param name наименование
     * @param price стоимость
     * @param taste вкус
     */
    public Cake(String name, double price, String taste, int candles) {
        super(name, price);
        this.taste = taste;
        this.candles = candles;
        cakeCount ++;
    }

    /**
     *
     * @return возвращает вкус Продукта
     */
    public String getTaste() {
        return taste;
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    /**
     *
     * @return Выводит в консоль характеристики продукта
     */
    @Override
    public String toString() {
        return super.toString() + String.format(" Taste: %s", taste);
    }
}
