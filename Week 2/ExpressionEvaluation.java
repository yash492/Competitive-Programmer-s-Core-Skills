import java.util.*;
public class ExpressionEvaluation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String expression = in.nextLine();
        in.close();

        String[] numbers = expression.split("[+-]");
        String operations = expression.replaceAll("[0-9]+", "");
        
        long sum = Long.parseLong(numbers[0]);
        int index = 1;

        for (char operation: operations.toCharArray()) {
            if (operation == '+') {
                sum += Long.parseLong(numbers[index]);
                index++;
            }
            else {
                sum -= Long.parseLong(numbers[index]);
                index++;
            }
        }

        System.out.print(sum);



    }
    
}
