package skill.vikram;
import java.util.Scanner;
public class OperatorQues1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println((x+8)/3 % 5 * 5);
    }
}
