import java.io.PrintWriter;
import java.util.Scanner;

class Increment {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String num = in.nextLine();
        int len = num.length();

        if (is99(num)) len++;

        out.print(len);
        
        in.close();
        out.close();
    }

    public static boolean is99(String num) {
        for(char c: num.toCharArray()) {
            if (c != '9')
                return false;
        }
        return true;
    }
}