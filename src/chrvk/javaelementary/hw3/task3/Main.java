package chrvk.javaelementary.hw3.task3;

/*
Дана строк состоящая из любых символов.
Не используя стандартный метод String.toLowerCase()
перевести все большие латинские буквы в маленькие.
Пример:
Input: "#1AmC"
Output: "#1amc"
 */

public class Main {
    public static void main(String[] args) {
        String line = "#1AmC";
        System.out.println(line);
        System.out.println(toLowerCase(line));
    }

    public static String toLowerCase(String line) {
        char[] chars = line.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if ((int) chars[i] >= 'A' && (int) chars[i] <= 'Z') {
                int diff = 'z' - 'Z';
                chars[i] += diff;
            }
        }
        return new String(chars);
    }
}