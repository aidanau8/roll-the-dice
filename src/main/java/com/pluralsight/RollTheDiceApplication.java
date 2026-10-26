package com.pluralsight;

public class RollTheDiceApplication {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {
            int roll1 = dice.roll();
            int roll2 = dice.roll();
            int sum = roll1 + roll2;


            System.out.printf(
                    "Roll %d: %d - %d Sum: %d%n",
                    i, roll1, roll2, sum
            );

            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Sum 2: " + twoCounter);
        System.out.println("Sum 4: " + fourCounter);
        System.out.println("Sum 6: " + sixCounter);
        System.out.println("Sum 7: " + sevenCounter);
    }
}