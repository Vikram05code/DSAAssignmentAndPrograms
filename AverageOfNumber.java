package skill.vikram;
import java.util.Scanner;

public class AverageOfNumber {

    static int average(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int result = average(x, y, z);
        System.out.println(result);
    }
}
