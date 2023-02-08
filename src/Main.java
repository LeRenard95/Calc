import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num1, num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the numbers");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();

        System.out.println("Choose operator");
        char operator = scan.next().charAt(0);
        double o = 0;
        switch (operator){
            case '+':
                o = num1 + num2;
                break;
            case '-':
                o = num1 - num2;
                break;
            case '*':
                o = num1 * num2;
                break;
            case '/':
                o = num1 / num2;
                break;
            default:
                System.out.println("You entered a wrong input");
        }
        System.out.println("The final result: ");
        System.out.println();
        System.out.println(num1 + "" + operator + "" + num2 + "=" + o);
    }
}