import java.util.*;

class Solution {

    static void selectionSort(int[] array) {

        int minimum_index;
        int temp;

        for (int i = 0; i < array.length - 1; i++) {

            minimum_index = i;

            for (int j = i + 1; j < array.length - 1; j++) {

                if (array[minimum_index] > array[j]) {

                    minimum_index = j;

                }

            }

            temp = array[minimum_index];
            array[minimum_index] = array[i];
            array[i] = temp;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numElements = sc.nextInt();

        int[] numbers = new int[numElements];

        for (int i = 0; i < numElements; i ++) {

            numbers[i] = sc.nextInt();

        }

        selectionSort(numbers);

        for (int number: numbers) {

            System.out.println(number);

        }

    }

}