package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Denominations {

    public static void main (String args[]) {
        int arr[] = {5, 1};
        int ans = findDenominations(24, arr);
        System.out.print(ans);
    }

    public static int findDenominations(int val, int[] denominations) {
        if (val <= 0) {
            return 0;
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0 ; i < denominations.length; i ++) {
            if (val >= denominations[i]) {
                res = Math.min(res, 1+ findDenominations(val - denominations[i], denominations));
            }
        }
        return res;
    }


}
