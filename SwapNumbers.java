package skill.vikram;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int x = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int y = sc.nextInt();
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println(x);
        System.out.println(y);

    }
}
