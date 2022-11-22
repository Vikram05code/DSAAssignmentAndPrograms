package skill.vikram;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int temp = n;
        int sumOfDigits = 0;
        while(temp>0){
            sumOfDigits += temp % 10;
            temp = temp/10;
        }
        System.out.println("Sum of digits of "+ n +" is "+ sumOfDigits);
    }
}
