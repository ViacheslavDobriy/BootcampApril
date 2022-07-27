package Day2;

public class SortOfData {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,7,6,5,4,3};
        ShowArray(SortDescendingOrder(numbers));
        ShowArray(SortAscendingOrder(numbers));

    }

    /**
     * Function for sort array of numbers in descending order
     * @param noSorted - array of numbers which need to be sorted
     * @return - NEW array have already sorted
     */
    public static int[] SortDescendingOrder(int[] noSorted) {

        int[] tempArray = new int[noSorted.length];
        for (int i = 0; i < noSorted.length; i++) {

            tempArray[i] = noSorted[i];

        }

        for (int i = 0; i < tempArray.length; i++) {

            int max = tempArray[i];
            int temp = tempArray[i];
            int maxIndex = i;

            for (int j = i; j < tempArray.length; j++) {

                if (max < tempArray[j]) {

                    max = tempArray[j];
                    maxIndex = j;

                }
            }

            tempArray[i] = max;
            tempArray[maxIndex] = temp;

        }
        return tempArray;
    }

    /**
     * Method which sort array of numbers in ascending order
     * @param noSorted - array which will be sorted
     * @return - NEW array have already sorted
     */
    public static int[] SortAscendingOrder(int[] noSorted) {

        int[] tempArray = new int[noSorted.length];
        for (int i = 0; i < noSorted.length; i++) {

            tempArray[i] = noSorted[i];

        }

        for (int i = 0; i < tempArray.length; i++) {

            int min = tempArray[i];
            int temp = tempArray[i];
            int minIndex = i;

            for (int j = i; j < tempArray.length; j++) {

                if (min > tempArray[j]) {

                    min = tempArray[j];
                    minIndex = j;

                }
            }

            tempArray[i] = min;
            tempArray[minIndex] = temp;

        }
        return tempArray;
    }

    /**
     * Method for output array in the console
     * @param numbers - array, which will be showed
     */
    public static void ShowArray (int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            System.out.printf("%d ", numbers[i]);

        }

        System.out.println();
    }
}
