package skill.vikram;
import java.util.Scanner;

public class CheckCondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input Value : ");
        int num = sc.nextInt();
        if((num % 2 == 0) && (num % 3 == 0)){
            System.out.println(num);
        }else{
            System.out.println("Enter another number");
        }
    }
}
