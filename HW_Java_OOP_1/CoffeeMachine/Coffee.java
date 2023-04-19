package HW_Java_OOP.HW_Java_OOP_1.VendingMachine.HW_Java_OOP_1.CoffeeMachine;

public abstract class  Coffee {
      public static int countCups = 0;
      protected String name;
      protected double price;
      protected double volume;
      protected double temperature;

      public Coffee(String name, double price, double volume, double temperature) {
            this.name = name;
            this.price = price;
            this.volume = volume;
            this.temperature = temperature;
      }

      public Coffee(String name, double price, double volume) {
            this(name, price, volume, 85.0);
      }
      public Coffee(String name, double price) {
            this(name, price, 1.0);
      }
      public String getName() {
            return name;
      }
      public double getPrice() {
            return price;
      }
      public double getVolume() {
            return volume;
      }
      public double getTemperature() {
            return temperature;
      }
      public void setVolume(double volume) {
            this.volume = volume;
      }
      public void setTemperature(double temperature) {
            this.temperature = temperature;
      }

      @Override
      public String toString() {
            return String.format("name: %-15s price: %s, volume: %s, temp: %s", getName(), getPrice(), getVolume(), getTemperature());
      }
}
