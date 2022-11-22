package skill.vikram;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        double num2 = sc.nextInt();
        double ans;
        System.out.print("Enter an operator : (+, -, *, or /) : ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+':
                ans = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + ans);
                break;
            case '-':
                ans = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + ans);
                break;
            case '*':
                ans = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + ans);
                break;
            case '/':
                ans = num1/num2;
                System.out.println(num1 + " / " + num2 + " = " + ans);
                break;
            default :
                System.out.println("Error! The operator is not correct");
                break;

        }
    }
}
