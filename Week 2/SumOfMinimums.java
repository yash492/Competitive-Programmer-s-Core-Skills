import java.util.*;

public class SumOfMinimums {
    public static void main(String[] args) {

        // Input 
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] input = new int[size];
        for(int i=0; i<size; i++) input[i] = in.nextInt();

        int left = 0, right = size;
        long sum = 0;

        // Brute-Force O(n^3)
        // while (left < right) {
        //     int i = left;
        //     while (i < right) {
        //         int min = getMin(input, left, i);
        //         sum += min; i++;
        //     }
        //     left++;
        // }

        // Brute-Force O(n^2)
        while (left < right) {
            int min = input[left];
            int i = left;
            while (i >= 0) {
                min = Math.min(min, input[i]);
                sum += min;
                i--;
            }
            left++;
        }

        // Efficient Algorithm O(n)

        in.close();

        System.out.println(sum);
    }

    // Helper function for brute-force (O(n^3))
    // private static int getMin(int[] array, int start, int end) {
    //     int min = Integer.MAX_VALUE;
    //     for (int i=start; i<=end; i++) min = Math.min(min, array[i]);
    //     return min;
    // }
}