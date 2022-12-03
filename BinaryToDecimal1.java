package skill.vikram;
import java.util.Scanner;

public class BinaryToDecimal1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int binary_num = sc.nextInt();
        int ans = 0;
        int pw = 0;
        while(binary_num > 0){
            int last_digit = binary_num % 10;
            ans += last_digit * Math.pow(2, pw);
            pw++;
            binary_num /= 10;

        }
        System.out.println(ans);
    }
}
