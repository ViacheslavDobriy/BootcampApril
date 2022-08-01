package Day4;

import java.util.Random;

public class Sort {

    public static void main(String[] args) {

        Random r = new Random();
        int max = 21;
        int[] data = new int[r.nextInt(2,max)];
        ShowArray(data);
        data = FillArray(data);
        ShowArray(data);

        int[] counter = new int[6];
        for (int item: data) {

            counter[item]+=1;

        }

        ShowArray(counter);
        System.out.println();
        int k = 0;
        int m = 0;

        for (int index: counter) {

            for (int i = 0; i < index;i++) {

                data[k] = m;
                k++;
            }
            m++;

        }
        ShowArray(data);

    }

    public static int[] FillArray(int[] emptyArray) {

        Random r = new Random();
        for (int i = 0; i < emptyArray.length; i++) {

            emptyArray[i] = r.nextInt(6);

        }
        return emptyArray;
    }

    public static void ShowArray(int[] arr) {

        for (int j : arr) {

            System.out.printf("%d ", j);

        }
        System.out.println();
    }
}
