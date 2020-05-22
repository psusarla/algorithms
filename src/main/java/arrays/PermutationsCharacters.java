package arrays;

import java.util.HashMap;
import java.util.Map;

public class PermutationsCharacters {


    public boolean samePermutations(char[] in1, char[] in2) {
        if (in1.length != in2.length) {
            return false;
        }

        int[] arr =new int[128];
        for (int i =0; i <in1.length ;i++) {
        //    System.out.println(in1[i]);
         //   System.out.println(arr[(int) in1[i]]);
            arr[in1[i]]++;
        }

   /*     System.out.print("Before..");
        printArr(arr);
*/
        for (int i =0; i <in2.length ;i++) {
            arr[in2[i]]--;
            if (arr[in2[i]] < 0) {
                return false;
            }
        }

  /*      System.out.print("After..");
        printArr(arr);
*/
        return true;
    }

    private void printArr(char[] arr) {
        for (int i =0; i <arr.length ;i++) {
           System.out.print(arr[i] + " ");
        }
    }

    public boolean samePermutations2(char[] in1, char[] in2) {
        Map<Character, Integer> characterIntegerMap = new HashMap<Character, Integer>();
        for (int i =0; i <in1.length ;i++) {
            char c = in1[i];
            if (characterIntegerMap.containsKey(c)) {
                int count = characterIntegerMap.get(c);
                characterIntegerMap.put(c, ++count);
            } else {
                characterIntegerMap.put(c, 1);
            }
        }

        for (int i =0; i <in2.length ;i++) {
            char c = in2[i];
            if (characterIntegerMap.containsKey(c) == false) {
                return false;
            }

            int count = characterIntegerMap.get(c);
            if (count == 0) {
                return false;
            }

            characterIntegerMap.put(c, --count);
        }

        for (Integer i: characterIntegerMap.values()) {
            if (i > 0) {
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args) {

        PermutationsCharacters uniqueCharacters = new PermutationsCharacters();
        boolean result = uniqueCharacters.samePermutations("phani".toCharArray(), "phani".toCharArray());
        System.out.println(result);

        result = uniqueCharacters.samePermutations("phani".toCharArray(), "ianph".toCharArray());
        System.out.println(result);

        result = uniqueCharacters.samePermutations("phanik".toCharArray(), "ianph".toCharArray());
        System.out.println(result);

        result = uniqueCharacters.samePermutations("p".toCharArray(), "k".toCharArray());
        System.out.println(result);

    }
}
