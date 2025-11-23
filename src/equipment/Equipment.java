package equipment;

abstract class Equipment {
	private String name;
    private double price;
    private String description;
    private int intelligenceBoost;
    private int strengthBoost;

    public Equipment(String name, double price, String description, int intelligenceBoost, int strengthBoost) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.intelligenceBoost = intelligenceBoost;
        this.strengthBoost = strengthBoost;
    }

    public void displayInfo() {
        System.out.println("Equipment Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
    }

    public abstract void performFunction();

}
