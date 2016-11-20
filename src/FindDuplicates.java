import java.util.HashSet;

/**
 * Created by user-pc on 16.11.2016.
 */
public class FindDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10};
        System.out.println(findDuplicates(arr));
    }

    public static boolean findDuplicates(int[] arr) {
        HashSet<Integer> list = new HashSet<>();
        for (int i : arr) {
            if (!list.add(i)) return true;
        }
        return false;
    }
}
