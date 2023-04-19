package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.VendingMachine;

public class Bread extends Cake {

    private String color;

    /**
     * Конструктор Продукта
     * @param name наименование
     * @param price стоимость
     * @param taste вкус
     * @param color цвет
     */
    public Bread(String name, double price, String taste, int candles, String color) {
        super(name, price, taste, candles);
        this.color = color;
        cakeCount = 1;
    }

    /**
     *
     * @return возвращает цвет продукта
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @return Выводит с консоль характеристики продукта
     */
    @Override
    public String toString() {
        return super.toString() + String.format(" Color: %s", color);
    }
}
