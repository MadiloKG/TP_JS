package Coffee;

public class Main {
    public static void main(String[] args) {
        // Création de plusieurs exemples de commandes de café en utilisant le pattern

        CoffeeOrder order1 = new CoffeeOrderBuilder()
                .setType("Espresso")
                .build();

        CoffeeOrder order2 = new CoffeeOrderBuilder()
                .setType("Latte")
                .setMilk("Lait vanille")
                .setSugar("2 carré")
                .build();

        CoffeeOrder order3 = new CoffeeOrderBuilder()
                .setType("Cappuccino")
                .setMilk("lait vanille")
                .build();

        // Affichage des détails de chaque commande de café créée
        System.out.println("Order 1: " + order1);
        System.out.println("Order 2: " + order2);
        System.out.println("Order 3: " + order3);
    }
}
