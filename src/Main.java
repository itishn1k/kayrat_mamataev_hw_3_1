import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double fifteens[] = {12, 23.5, -12.01, -3.53, 9.5, 0.5, -7.4, -3.4, -1.1, 4.5, -5.7, 2.0, 12.25, 8.0, -90.0};
        double positiveNumSum = 0;
        double positiveNumCount = 0;
        boolean negativeFirst = false;
        System.out.print("Positive nums list: ");
        for (double num : fifteens) {
            if (!negativeFirst) {
                if (num < 0) {
                    negativeFirst = true;
                }
            }
            if (negativeFirst) {
                if (num > 0) {
                    positiveNumSum += num;
                    positiveNumCount++;
                    System.out.print(num + "; ");
                }
            }
        }

        System.out.println("\n" + "Average of fifteens " + (positiveNumSum / positiveNumCount));

        int[] arr = {8, -2, -4, 2, 3, 6};
        System.out.println("\n"+Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int minNumIndex = getMinNumIndex(arr, i);
            int currentNum = arr[i];
            int minNum = arr[minNumIndex];
            arr[i] = minNum;
            arr[minNumIndex] = currentNum;

        }System.out.println(Arrays.toString(arr));
    }
    public static int getMinNumIndex(int[] arr, int pos) {
        int min = Integer.MAX_VALUE;
        int minNumIndex = -1;
        for (int i = pos; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minNumIndex = i;
            }
        }
        return minNumIndex;
    }
}