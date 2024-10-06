package creational.factory;

//ChicagoStore.java
public class ChicagoStore extends PizzaStore {
 @Override
 protected Pizza createPizza(String type) {
     if (type.equalsIgnoreCase("cheese")) {
         return new ChicagoStyleCheesePizza();
     }
     // You can add more types here (e.g., veggie, pepperoni)
     return null; // Or throw an exception for unsupported types
 }
}

