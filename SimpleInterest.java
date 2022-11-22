package skill.vikram;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal amount : ");
        float p1 = sc.nextFloat();
        System.out.println("Enter Rate of Interest : ");
        float r1 = sc.nextFloat();
        System.out.println("Enter time : ");
        float t = sc.nextFloat();

        System.out.println("Principal amount : " + p1);
        System.out.println("Rate of Interest : " + r1);
        System.out.println("Time : "+ t);
        float s1 = (p1 * r1 * t)/100;
        System.out.println("Simple Interest is : " + s1);
    }
}
