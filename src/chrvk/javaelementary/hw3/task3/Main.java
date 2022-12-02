package chrvk.javaelementary.hw3.task3;

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