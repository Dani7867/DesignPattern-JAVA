package creational.factory;

//NYStore.java
public class NYStore extends PizzaStore {
 @Override
 protected Pizza createPizza(String type) {
     if (type.equalsIgnoreCase("cheese")) {
         return new NYStyleCheesePizza();
     }
     else if (type.equalsIgnoreCase("pepperoni")){
    	 return new NYStylePepperoniPizza();
     }

     // You can add more types here (e.g., veggie)
     return null; // Or throw an exception for unsupported types
 }
}

