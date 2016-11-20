package sort;

import java.util.Arrays;

/**
 * Created by user-pc on 15.11.2016.
 */
public class BubbleSort {

    public static void main(String[] args) {
//        int[] toSort = {5, 6, 4, 3, 2, 1, 8, 9, 7};
        int[] toSort = RandomUtil.fillArray(10000);

        System.out.println(Arrays.toString(toSort));
        System.out.println("after sorting : ");
        System.out.println(Arrays.toString(sort(toSort)));
    }

    private static int[] sort(int[] arr) {
        for (int i = arr.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {

                    //swap items
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = tmp;

                }
            }
        }
        return arr;
    }


}
