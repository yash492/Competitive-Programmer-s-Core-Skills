import java.io.PrintWriter;
import java.util.Scanner;

public class ErasingMaximum {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();
        int[] a = new int[n];
        int max = -1;
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            max = Math.max(max, a[i]);
        }

        int[] result = new int[n - 1];

        // your code
        result = solve(a, result, max);

        for (int i = 0; i < result.length; ++i) {
            if (i != 0) out.print(' ');
            out.print(result[i]);
        }
        out.println();

        in.close();
        out.close();
    }

    public static int[] solve(int[] a, int[] result, int max) {
        int count = 0, i = 0, removeIndex = 0;
        for(int n: a) if (n == max) count++;
        if (count == 1) {
            int j = 0;
            for(int n: a) {
                if (n != max) {
                    result[j] = n;
                    j++;
                }
            }
        }
        else {
            for(int k=0; k<a.length; k++) {
                if (a[k] == max) i++;
                if (i == 3) {
                    removeIndex = k;
                    i++;
                }
            }
            int j = 0;
            for(int k=0; k<a.length; k++) {
                if (k != removeIndex) {
                    result[j] = a[k];
                    j++;
                }
            }
        }
        
        return result;
    }
}