package dynamicprogramming;

public class Burglar {

    public static void main (String args[]) {
        int wt[] = {5, 1};
        int val[] = {20, 30};
        int ans = findItems(wt.length - 1, 4, wt, val);
        System.out.print(ans);
    }

    public static int findItems(int n, int weight, int[] wts, int[] vals) {
        if (weight < 0) {
            return Integer.MIN_VALUE;
        }

        if (n < 0 || weight == 0) {
            return 0;
        }

        int includeCur = vals[n] + findItems(n-1, weight - wts[n], wts, vals);
        int excludeCur = findItems(n-1, weight, wts, vals);
        return Math.max(includeCur, excludeCur);
    }
}
