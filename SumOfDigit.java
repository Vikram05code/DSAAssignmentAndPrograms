package skill.vikram;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            int temp = num % 10;
            sum+=temp;
            num = num/10;

        }
        System.out.println(sum);
    }

}
