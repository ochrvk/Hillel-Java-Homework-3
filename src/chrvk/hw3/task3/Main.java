package chrvk.hw3.task3;

//Дана строк состоящая из любых символов.
//      Не используя стандартный метод String.toLowerCase()
//      перевести все большие латинские буквы в маленькие.
//      Пример:
//      Input: "#1AmC"
//      Output: "#1amc"

public class Main {
    public static void main(String[] args) {
        String line = "#1AmC";
        String alphabet1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet2 = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(line);
        for (int j = 0; j < alphabet1.length(); j++) {
            line = line.replace(alphabet1.charAt(j), alphabet2.charAt(j));
        }
        System.out.println(line);
    }
}