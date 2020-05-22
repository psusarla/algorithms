package dynamicprogramming;

public class DenominationsNew {

    public static int total(int amount, int[] denominations, int dIndex) {
        if (amount < 0) {
            return 0;
        }
        if (amount == 0) {
            return 1; // This is what is getting added up
        }
        // means coins over and n>0 so no solution
        if (dIndex == denominations.length && amount > 0) {
            return 0;
        }

        return total(amount - denominations[dIndex], denominations, dIndex) + total(amount, denominations, dIndex + 1);
    }
    public static void main(String[] args) {
        int amount = 5;
        int[] v = { 1, 2, 3 };
        System.out.println("By Recursion: " + total(amount, v, 0));
    }
}
