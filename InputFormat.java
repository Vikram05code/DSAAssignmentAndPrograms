package skill.vikram;
import java.util.Scanner;
public class InputFormat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your roll Number");
        int rollNo = sc.nextInt();
        System.out.println("Enter your field of Interest");
        String fieldOfInterest = sc.next();
        System.out.print(name+" ");
        System.out.print(rollNo+" ");
        System.out.print(fieldOfInterest + " ");

    }
}
