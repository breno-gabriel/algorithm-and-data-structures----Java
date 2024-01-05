import java.util.*;

class Sort {

    static void BubbleSort(int[] array) {

        boolean swapped;
        int temp;

        for (int i = 0; i < array.length - 1; i++) {

            swapped = false;

            for (int j = 0; j < array.length -1; j++) {

                if (array[j] > array[j + 1]) {

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;

                }

            }

            if (!swapped) break;

        }

    }

}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberElements = sc.nextInt();

        int[] numbers = new int[numberElements];

        for (int i = 0; i < numberElements; i++) numbers[i] = sc.nextInt();

        Sort.BubbleSort(numbers);

        for (int number: numbers) System.out.println(number);

    }

}