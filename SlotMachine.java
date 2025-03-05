import java.util.Random;

public class SlotMachine {
    private String[] symbols = {"Watermelon", "Apple", "Banana", "Horse", "Star", "Stick"};

    public void spin() {
        Random rand = new Random();
        String symbol1 = symbols[rand.nextInt(symbols.length)];
        String symbol2 = symbols[rand.nextInt(symbols.length)];
        String symbol3 = symbols[rand.nextInt(symbols.length)];

        System.out.println(symbol1 + " | " + symbol2 + " | " + symbol3);

        if (symbol1.equals(symbol2) && symbol2.equals(symbol3)) {
            System.out.println("You win!");
        } else {
            System.out.println("Try again.");
        }
    }

    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine();
        slotMachine.spin();
    }
}