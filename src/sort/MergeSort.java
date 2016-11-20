package sort;

import java.util.Arrays;

/**
 * Created by user-pc on 15.11.2016.
 */
public class MergeSort {

    public static void main(String[] args) {
//        int[] toSort = {5, 6, 4, 3, 2, 1, 8, 9, 7, 0, 2};
        int[] toSort = RandomUtil.fillArray(10000);

        System.out.println(Arrays.toString(toSort));
        System.out.println("after sorting : ");
        System.out.println(Arrays.toString(sort(toSort)));
    }

    private static int[] sort(int[] toSort) {
        if (toSort.length<=1) return toSort;
        int[] arr1 = Arrays.copyOfRange(toSort, 0, toSort.length / 2);
        int[] arr2 = Arrays.copyOfRange(toSort, toSort.length/2, toSort.length);
        return merge(sort(arr1), sort(arr2));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int pos1 = 0;
        int pos2 = 0;
        int posM = 0;
        while (pos1 < arr1.length && pos2 < arr2.length) {
            if(arr1[pos1]<arr2[pos2])
                    result[posM++]=arr1[pos1++];
            else    result[posM++]=arr2[pos2++];
        }
        System.arraycopy(arr1, pos1, result, posM, arr1.length-pos1);
        System.arraycopy(arr2, pos2, result, posM, arr2.length-pos2);
        return result;
    }


}
