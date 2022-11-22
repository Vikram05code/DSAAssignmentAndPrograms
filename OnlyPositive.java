package skill.vikram;
import java.util.Scanner;

public class OnlyPositive {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int num = sc.nextInt();
      if(num>=0){
         System.out.println("You entered a positive number : " + num);
      }
      else{
          System.out.println("You entered a negative number and is skipped");
      }
    }
}
