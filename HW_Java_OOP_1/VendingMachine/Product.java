package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.VendingMachine;

public class Product {
    private final String name;
    private double price;

    /**
     * Конструктор Продукта
     * @param name наименование продукта
     * @param price стоимость продукта
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     *
     * @return Возвращает имя Продукта
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return Возвращает стоимость Продукта
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @param price  новая стоимость Продукта
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return Выводит в консоль характеристики продукта
     */
    @Override
    public String toString() {
        return String.format("Name: %s, Price: %.02f", name, price);
    }
}
