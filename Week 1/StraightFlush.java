import java.util.HashSet;
import java.util.Scanner;

public class StraightFlush {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String hand = in.nextLine();
        in.close();

        if (isValidSuit(hand)) {

            HashSet<Integer> set = new HashSet<Integer>();

            for (int i=0; i<hand.length(); i+=3) {
                char ch = hand.charAt(i);
                if (Character.isDigit(ch)) set.add(ch - '0');

                else if (Character.isLetter(ch)) {
                  if ( ch == 'T') set.add(10);
                  else if ( ch == 'J') set.add(11);
                  else if ( ch == 'Q') set.add(12);
                  else if ( ch == 'K') set.add(13);
                }
            }
            for (int i=0; i<hand.length(); i+=3) {
                char ch = hand.charAt(i);
                if (ch == 'A') {
                    if(set.contains(2)) set.add(1);
                    else set.add(14);
                }
            }
            int min = 15;
            int max = 0;
            for(int i: set) {
                min = Math.min(i, min);
                max = Math.max(i, max);
            }

            boolean flag = true;
            for(int i=min; i<=max; i++) {
                if (!set.contains(i)) {
                    flag = false; break;
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }

        else System.out.println("NO");
    }

    public static boolean isValidSuit(String hand) {
        char suit = hand.charAt(1);
        for (int i=1; i<hand.length(); i+=3) 
            if (hand.charAt(i) != suit) return false;
        return true;
    }
}
