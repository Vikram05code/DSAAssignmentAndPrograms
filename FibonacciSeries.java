package skill.vikram;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n terms : ");
        int n = sc.nextInt();
        /*int a = 1;
        int b = 1;

        for(int i=1; i<=n; i++){
            System.out.print(a+", ");
            int sum = a+b;
            a=b;
            b=sum;

        }*/

// 2nd way to print

        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a +" " +b +" ");
        for(int i=2; i<n; i++){
            sum = a+b;
            System.out.print( sum+" ");
            a = b;
            b=sum;

        }
        

    }
}
