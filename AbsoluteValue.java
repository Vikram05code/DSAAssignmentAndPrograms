package skill.vikram;
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        if(num<0){
            num = num*(-1);

        }
        System.out.println("The Absolute value is : " + num);
    }
}
