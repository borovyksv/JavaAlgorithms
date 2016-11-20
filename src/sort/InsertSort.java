package sort;

import java.util.Arrays;

/**
 * Created by user-pc on 15.11.2016.
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] toSort = {5, 6, 4, 3, 2, 1, 8, 9, 7};
//        int[] toSort = sort.RandomUtil.fillArray(10000);

        System.out.println(Arrays.toString(toSort));
        System.out.println("after sorting : ");
        System.out.println(Arrays.toString(sort(toSort)));
    }

    private static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {
                int tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
            }
        }
        return arr;
    }


}
