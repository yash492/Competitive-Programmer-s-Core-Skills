import java.io.PrintWriter;
import java.util.Scanner;


public class AdditionAndSubtraction {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x, y, z;
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();


        int result = -1;
        int i = 1;
        int temp = 0;
        boolean flag = true;

        if (z == 0) {
            flag = false;
        }
            
        else {
            while (true) {
                boolean even = (i % 2 == 0);
                if (even)
                    temp -= y;

                else if (!even)
                    temp += x;

                if (z == temp) break;

                if (i > 30000) {
                    i = -1;
                    break;
                }
                i++;
            }
        }
        result = i;

        if (!flag) 
            result = 0;
        out.println(result);

        in.close();
        out.close();
    }
}