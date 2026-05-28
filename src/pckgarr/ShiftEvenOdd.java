package pckgarr;
import java.util.*;

public class ShiftEvenOdd {
    public static void main(String[] args) {
        int[] a = {23, 54, 56, 57, 21, 86, 75, 51, 68};
        shiftEvenOdd(a);
        System.out.println("Array after shifting even and odd numbers: " + Arrays.toString(a));
    }

    public static void shiftEvenOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left pointer if element is EVEN
            while (left < right && arr[left] % 2 != 0) {
                left++;
            }

            // Move right pointer if element is ODD
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }

            // Correct condition: swap when left < right
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}