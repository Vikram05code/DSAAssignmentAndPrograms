package skill.vikram;
import java.util.Scanner;
public class InputString2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String s1 = sc.nextLine();
        System.out.println("Enter second String");
        String s2 = sc.nextLine();
        System.out.println(s1 + s2);
    }
}
