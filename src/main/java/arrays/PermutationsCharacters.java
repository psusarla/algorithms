package arrays;

import java.util.HashMap;
import java.util.Map;

public class PermutationsCharacters {

    public boolean checkUsingAsciiTable(char[] in1, char[] in2) {
        if (in1.length != in2.length) {
            return false;
        }

        int[] arr = new int[128];
        for (int i = 0; i < in1.length; i++) {
            arr[in1[i]]++;
        }

        for (int i = 0; i < in2.length; i++) {
            arr[in2[i]]--;
            if (arr[in2[i]] < 0) {
                return false;
            }
        }

        return true;
    }

    public boolean checkUsingHashtable(char[] in1, char[] in2) {
        Map<Character, Integer> characterIntegerMap = new HashMap<Character, Integer>();
        for (int i = 0; i < in1.length; i++) {
            char c = in1[i];
            if (characterIntegerMap.containsKey(c)) {
                int count = characterIntegerMap.get(c);
                characterIntegerMap.put(c, ++count);
            } else {
                characterIntegerMap.put(c, 1);
            }
        }

        for (int i = 0; i < in2.length; i++) {
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

        for (Integer i : characterIntegerMap.values()) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PermutationsCharacters uniqueCharacters = new PermutationsCharacters();
        boolean result = uniqueCharacters.checkUsingAsciiTable("phani".toCharArray(), "ianph".toCharArray());
        System.out.println(result);

        result = uniqueCharacters.checkUsingAsciiTable("phanik".toCharArray(), "ianph".toCharArray());
        System.out.println(result);

        result = uniqueCharacters.checkUsingHashtable("phani".toCharArray(), "ianph".toCharArray());
        System.out.println(result);

        result = uniqueCharacters.checkUsingHashtable("phanik".toCharArray(), "ianph".toCharArray());
        System.out.println(result);
    }
}
