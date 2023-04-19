package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products = new ArrayList<>();
    private double amountMoney = 0;

    /**
     * Показывает количество денет
     * @return количество денег, вырученное за продажу Продукта из апппарата
     */
    public double getAmountMoney() {
        return amountMoney;
    }

    /**
     * Добавляет товар в аппарат для продаж
     * @param product  объект товар, который ложим в аппарат для продаж
     * @return возвращает объект аппарат для продаж
     */
    public VendingMachine addProduct(Product product){
        products.add(product);
        return this;
    }

    /**
     *  Запрашиваем список Продукт
     * @return возвращает список Продуктов, которые хранятся в аппарате
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Выводит в консоль список названий Продуктов, которые находятся в аппарате
     */
    public void showProductsNames(){
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }

    /**
     * Выводит в консоль список названий Продуктов, которые находятся в аппарате
     * @return Возвращает аппарат с продуктами
     */
    public VendingMachine showProducts(){
        for (Product product : products) {
            System.out.println(product);
        }
        return this;
    }

    /**
     * Ищем продукт в списке продуктов аппарата для продажи
     * @param text Наименование Продукта который хотим найти в аппарате
     * @return если Продукт имеется в списке продуктов,
     * то возращаем Продукт, если его нет возвращаем null
     */
    public Product findProduct(String text){
        for (Product product : products) {
            if (product.getName().equals(text)) {
                return product;
            }
        }
        return null;
    }

    /**
     * Продаем Продукт из аппарата и получаем за него деньги
     * @param product Наименование Продукта который нужно продать
     * @return проданный товар
     */
    public Product sellProduct(Product product){
        try {
            Product foundedProduct = findProduct(product.getName());
            getProducts().remove(foundedProduct);
            amountMoney += product.getPrice();
            return foundedProduct;
        } catch (Exception e){
            throw new RuntimeException("Товар не найден или закончился.");
        }
    }
}
