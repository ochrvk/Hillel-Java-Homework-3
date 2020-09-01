package chrvk.hw3.task2;

/*
Написать метод.
Входящий параметр: отсортированный массив типа int который содержит отрицательные и положительные значения.
Вернуть отсортированный массив который состоит из квадратов значений.
Не использовать при этом стандартный метод sort.
Пример:
Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
*/

public class Main {

    public static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] sortArray(int[] array) {
        int tmp;

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        return array;
    }

    public static int[] toSquare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 2);
        }

        sortArray(array);

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, -1, 10, 0, -4};

        sortArray(array);
        outputArray(array);
        toSquare(array);
        outputArray(array);
    }
}