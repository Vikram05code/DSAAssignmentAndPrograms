package skill.vikram;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary number : ");
        int binary_num = sc.nextInt();

        int ans = 0;  //converted decimal number
        int pw = 1;   // 2 power 0 = 1

        while(binary_num > 0){
            int unit_digit = binary_num % 10;
            ans += (unit_digit * pw);
            pw *=2;
            binary_num /=10;

        }
        System.out.println(ans);

    }
}
