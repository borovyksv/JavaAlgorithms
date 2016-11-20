package sort;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by user-pc on 15.11.2016.
 */
public class RandomUtil {
    public static int[] fillArray(int size) {
        Set<Integer> ints = new LinkedHashSet<>();
        IntStream.range(1, size).forEach(value -> ints.add((int) (Math.random() * size)));
        int[] result = new int[ints.size()];
        int iterator = 0;
        for (Integer i : ints) {
            result[iterator++]=i;
        }
        return result;
    }
}
