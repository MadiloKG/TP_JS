package Coffee;

public class CoffeeOrder {
    // Attributs représentant une commande de café
    private String type;
    private String milk;
    private String sugar;

    public CoffeeOrder(String type, String milk, String sugar) {
        this.type = type;
        this.milk = milk;
        this.sugar = sugar;

    }

    // Getters et setters pour les attributs
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    /// Méthode pour afficher les détails de la commande de café
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Coffee: ").append(type);
        if (milk != null) {
            stringBuilder.append(", Milk: ").append(milk);
        }
        if (sugar != null) {
            stringBuilder.append(", Sugar: ").append(sugar);
        }
        // Ajoute les autres attributs et options si nécessaire
        return stringBuilder.toString();
    }

}
