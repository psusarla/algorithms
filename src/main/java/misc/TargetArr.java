package misc;

import java.util.HashMap;
import java.util.Map;

public class TargetArr {

    public boolean findTarget(int[] inputArr, int target)
    {
        //check for empty or null

        Map<Integer, Integer> uniqueNumberMap = new HashMap();
        for (int i =0; i < inputArr.length; i++)
        {
            uniqueNumberMap.put(inputArr[i], inputArr[i]);
        }

        int[] subtractedArr = new int[inputArr.length];
        for (int i =0; i < inputArr.length; i++)
        {
            subtractedArr[i] = target - inputArr[i];
        }

        for (int i =0; i < inputArr.length; i++)
        {
            if (uniqueNumberMap.containsKey(subtractedArr[i])){
            return true;
        }
        }
        return false;
    }

    public static void main (String args[]) {

        int[] inputArr = { 1,2,3,4,5,6, 7};
        TargetArr targetArr = new TargetArr();
        boolean result = targetArr.findTarget(inputArr, 5);
        System.out.println("Result is " + result);

        result = targetArr.findTarget(inputArr, 20);
        System.out.println("Result is " + result);

        result = targetArr.findTarget(inputArr, 13);
        System.out.println("Result is " + result);

    }
}

