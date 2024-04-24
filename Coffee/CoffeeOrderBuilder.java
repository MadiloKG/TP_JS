package Coffee;

public class CoffeeOrderBuilder {
    private String type;
    private String milk;
    private String sugar;

    public CoffeeOrderBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public CoffeeOrderBuilder setMilk(String milk) {
        this.milk = milk;
        return this;
    }

    public CoffeeOrderBuilder setSugar(String sugar) {
        this.sugar = sugar;
        return this;
    }

    public CoffeeOrder build() {
        return new CoffeeOrder(type, milk, sugar);
    }
}
