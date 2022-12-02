package chrvk.javaelementary.hw3.task1;

public class Main {
    public static String replace(String line) {
        line = line.replaceAll("\\s|\\d|\\W|_", "");
        return line;
    }

    public static int countJewelsStones(String jewels, String stones) {
        jewels = replace(jewels);
        stones = replace(stones);
        int result = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String jewels = "aAb";
        String stones = "caсAcA";
        System.out.print(countJewelsStones(jewels, stones));
    }
}