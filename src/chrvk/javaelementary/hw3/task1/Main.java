package chrvk.javaelementary.hw3.task1;

/*
Написать метод numJewelsInStones который принимает 2 параметра:
- String jewels: строка, каждый символ который символизирует драгоценный камень, символы уникальны
- String stones: строка, каждый символ который символизирует камень.
Строки могут состоять только из символов a..zA..Z
Метод должен вернуть количество драгоценных камней в строке stones.
Пример:
jewels = "aAb"
stones = "caсAcA"
Output: 3
Explanation: в строке stones есть 3 драг. камня: a,A,A
*/

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