package arrays;

public class UniqueCharacters {

    public boolean hasUnique(char[] in) {
        for (int i = 0; i <in.length; i++) {
            char c = in[i];

            for (int j = i +1; j <in.length; j++) {
                if (c == in[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main (String[] args) {

        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        boolean result = uniqueCharacters.hasUnique("phani".toCharArray());
        System.out.println(result);

        result = uniqueCharacters.hasUnique("phanip".toCharArray());
        System.out.println(result);

    }
}
