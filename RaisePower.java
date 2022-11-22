package skill.vikram;
import java.util.Scanner;

public class RaisePower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();
        int ans = 1;
        for(int i=1; i<=b; i++){
            ans *=a;
        }
        System.out.println(ans);
    }
}
