package equipment;

public class PC extends Equipment {

    public PC(String name, double price, String description, int intelligenceBoost, int strengthBoost) {
        super(name, price, description, intelligenceBoost, strengthBoost);
    }

    @Override
    public void performFunction() {
        System.out.println("Congrats! You have built a PC. Here is your boost:");
        System.out.println("Intelligence Boost: ");
        System.out.println("Strength Boost: " );
    }
}