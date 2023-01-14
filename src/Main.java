
import java.util.Arrays;
import java.util.Random;
import java.util.*;
/*
creating third array that provides sum of the first two arrays
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {91, 1000, 80, 30, 40, 50, 75, 85, 95, 100};
        int [] secondNumbers = {1, 100, 70, 3, 4, 5, 7, 8, 9, 1};
        int [] thirdNumbers = new int [numbers.length];

        if (numbers.length == secondNumbers.length) {
            for (int i = 0, j = 0, k = 0; i < numbers.length; i++, j++, k++ )
                thirdNumbers [k] = numbers [i] + secondNumbers [j];
        }
        else {
            System.out.println("Array should be the same size");
        }
        System.out.println(Arrays.toString(thirdNumbers));
    }
}
