package skill.vikram;
import java.util.Scanner;
public class AddNumWithDifferentBase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int decimal_num = sc.nextInt();
        System.out.println("Enter a binary number : ");
        int binary_num = sc.nextInt();
        int ans = 0;
        int newBinaryNum = 0;
        int pw = 1; // 2 power 0 = 1
        while(binary_num > 0){
            int last_digit = binary_num % 10;
            newBinaryNum += last_digit * pw;
            pw *= 2;
            binary_num /= 10;
        }
        ans = decimal_num + newBinaryNum;
        System.out.println("Addition of two numbers given in different base = " + ans);
    }
}
