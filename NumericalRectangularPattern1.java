package skill.vikram;
import java.util.Scanner;

public class NumericalRectangularPattern1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter value of row r : ");
       int r = sc.nextInt();
       System.out.print("Enter value of column c : ");
       int c = sc.nextInt();

       for(int i=1; i<=r; i++){
           for(int j=1; j<=c; j++){
               System.out.print(j);
           }
           System.out.println();
       }
    }
}
