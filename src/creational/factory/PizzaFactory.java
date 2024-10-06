package creational.factory;

//PizzaFactory.java
//PizzaTestDrive.java
public class PizzaFactory {
 public static void main(String[] args) {
     PizzaStore nyStore = new NYStore();
     PizzaStore chicagoStore = new ChicagoStore();

     System.out.println("Ordering a cheese pizza from NY Store:");
     nyStore.orderPizza("cheese");

     System.out.println("\nOrdering a cheese pizza from Chicago Store:");
     chicagoStore.orderPizza("cheese");
     
     System.out.println("\nOrdering a pepperoni pizza from NY Store:");
     nyStore.orderPizza("pepperoni");
 }
}


